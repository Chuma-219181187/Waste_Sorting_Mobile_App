package com.enviro.assessment.grad001.Chuma_Nxazonke.Waster_Sorting_Mobile_App.RecyclingTips;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RecyclingTipsRepository {
    private final List<RecyclingTips> recyclingTips = new ArrayList<RecyclingTips>();

    List<RecyclingTips> findAll() {
        return recyclingTips;
    }

    Optional<RecyclingTips> findById(Integer recyclingTipsId) {
        return recyclingTips.stream().filter(recyclingTips1 -> recyclingTips1.tipId()
                        .equals(recyclingTipsId))
                .findFirst();
    }

    void create(RecyclingTips recyclingTip) {
        recyclingTips.add(recyclingTip);
    }

    void update(RecyclingTips recyclingTip, Integer recyclingTipsId) {

        Optional<RecyclingTips> recyclingExist = findById(recyclingTipsId);
        if (recyclingExist.isPresent()) {
            recyclingTips.set(recyclingTips.indexOf(recyclingExist.get()), recyclingTip );
        }
    }

    void save(RecyclingTips recyclingTip) {
        recyclingTips.add(recyclingTip);
    }


    void delete(Integer recyclingTipsId) {
        recyclingTips.removeIf(recyclingTips1 -> recyclingTips1.tipId()
                .equals(recyclingTipsId));
    }



}
