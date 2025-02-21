package com.enviro.assessment.grad001.Chuma_Nxazonke.Waster_Sorting_Mobile_App.DisposalGuidelines;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class DisposalGuidelineRepository {

    private final List<DisposalGuidelines> disposalGuidelines = new ArrayList<>();

    List<DisposalGuidelines> findAll() {
        return disposalGuidelines;
    }

    Optional<DisposalGuidelines> findById(Integer disposalGuidelineId) {
        return disposalGuidelines.stream().filter(disposalGuidelines1 -> disposalGuidelines1.disposal_id()
                .equals(disposalGuidelineId))
                .findFirst();


    }

    void create(DisposalGuidelines disposalGuidelines1) {
        disposalGuidelines.add(disposalGuidelines1);
    }

    void update(DisposalGuidelines disposalGuidelines1, Integer disposalGuidelineId) {

       Optional<DisposalGuidelines> disposalGuidelines2 = findById(disposalGuidelineId);
        if (disposalGuidelines2.isPresent()) {
            disposalGuidelines.set(disposalGuidelines.indexOf(disposalGuidelines2.get()), disposalGuidelines1 );
        }
    }

    void save(DisposalGuidelines disposalGuidelines1) {
        disposalGuidelines.add(disposalGuidelines1);
    }


    void delete(Integer disposalGuidelineId) {
        disposalGuidelines.removeIf(disposalGuidelines1 -> disposalGuidelines1.disposal_id()
                .equals(disposalGuidelineId));


    }






}
