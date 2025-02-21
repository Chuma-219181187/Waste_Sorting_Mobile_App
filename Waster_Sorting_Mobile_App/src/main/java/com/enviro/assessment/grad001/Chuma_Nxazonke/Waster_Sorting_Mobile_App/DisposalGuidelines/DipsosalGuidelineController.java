package com.enviro.assessment.grad001.Chuma_Nxazonke.Waster_Sorting_Mobile_App.DisposalGuidelines;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/disposal")
@Validated
public class DipsosalGuidelineController {

private final DisposalGuidelineRepository disposalGuidelineRepository;

public DipsosalGuidelineController(DisposalGuidelineRepository disposalGuidelineRepository) {
this.disposalGuidelineRepository = disposalGuidelineRepository;

}


    @GetMapping("All")
    List<DisposalGuidelines> findAll() {
        return disposalGuidelineRepository.findAll();
    }

    @GetMapping("/{id}")
    DisposalGuidelines findById (@PathVariable int id) {

        Optional<DisposalGuidelines> optional = disposalGuidelineRepository.findById(id);
        if (optional.isPresent()) {
            throw new DisposalGuidelineNotFoundException("Disposal Guideline not found");

        }
        return optional.get();
    }

    // Post
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("save")
    void createDisposalGuideline (@Valid @RequestBody DisposalGuidelines disposalGuidelines1) {
        disposalGuidelineRepository.save(disposalGuidelines1);
    }

    //Put
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/update{id}")
    void updateDisposalGuidelines (@Valid @RequestBody DisposalGuidelines   disposalGuidelines2, @PathVariable int id) {
        disposalGuidelineRepository.update(disposalGuidelines2, id);
    }

    //Save


    //Delete
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/delete{id}")
    void deleteDisposalGuidelines (@PathVariable int id) {
        disposalGuidelineRepository.delete(id);
    }



}
