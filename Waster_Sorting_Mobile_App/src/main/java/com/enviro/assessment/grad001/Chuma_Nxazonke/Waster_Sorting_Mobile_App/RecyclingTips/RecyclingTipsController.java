package com.enviro.assessment.grad001.Chuma_Nxazonke.Waster_Sorting_Mobile_App.RecyclingTips;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/recycling")
@Validated
public class RecyclingTipsController {


    private final RecyclingTipsRepository recyclingTipsRepository;


   public RecyclingTipsController(RecyclingTipsRepository recyclingTipsRepository) {
       this.recyclingTipsRepository = recyclingTipsRepository;
   }

    @GetMapping("All")
    List<RecyclingTips> findAll() {
        return recyclingTipsRepository.findAll();
    }

    @GetMapping("/{id}")
    RecyclingTips findById (@PathVariable int id) {

        Optional<RecyclingTips> optional = recyclingTipsRepository.findById(id);
       if (optional.isPresent()) {
       throw new RecyclingTipsNotFoundException("Recycling tips id " + id + " not found");

       }
       return optional.get();
    }

    // Post
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("save")
    void createRecyclingTips (@Valid @RequestBody RecyclingTips recyclingTips) {
        recyclingTipsRepository.save(recyclingTips);
    }

    //Put
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/update{id}")
    void updateRecycling (@Valid @RequestBody RecyclingTips recyclingTips, @PathVariable int id) {
        recyclingTipsRepository.update(recyclingTips, id);
    }

    //Delete
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/delete{id}")
    void deleteRecycling (@PathVariable int id) {
       recyclingTipsRepository.delete(id);
    }



}
