package com.enviro.assessment.grad001.Chuma_Nxazonke.Waster_Sorting_Mobile_App.WasteCategory;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/guideline")
@Validated
public class WasteCategoryController {

    private final WasteCategoryRepository wasteCategoryRepository;


public WasteCategoryController(WasteCategoryRepository wasteCategoryRepository) {

    this.wasteCategoryRepository = wasteCategoryRepository;
}

@GetMapping("All")
List<WasteCategory> findAll() {
    return wasteCategoryRepository.findAll();
}

@GetMapping("/{id}")
WasteCategory findById (@PathVariable int id) {

    Optional<WasteCategory> wasteCategory = wasteCategoryRepository.findById(id);
    if (wasteCategory.isPresent()) {
        throw
    new CategoryNotFoundException();
    }
    return wasteCategory.get();
}

// Post
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("save")
    void createWasteCategory (@Valid @RequestBody WasteCategory wasteCategory) {
    wasteCategoryRepository.create(wasteCategory);
    }

//Put
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/update{id}")
    void updateWasteCategory (@Valid @RequestBody WasteCategory wasteCategory, @PathVariable int id) {
    wasteCategoryRepository.update(wasteCategory, id);
    }

    //Delete
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/delete{id}")
    void deleteWasteCategory (@PathVariable int id) {
    wasteCategoryRepository.delete(id);
    }





}
