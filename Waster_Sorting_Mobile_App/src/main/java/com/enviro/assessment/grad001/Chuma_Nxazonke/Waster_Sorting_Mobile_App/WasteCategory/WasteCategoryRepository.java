package com.enviro.assessment.grad001.Chuma_Nxazonke.Waster_Sorting_Mobile_App.WasteCategory;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class WasteCategoryRepository {

private final List<WasteCategory> wasteCategories = new ArrayList<WasteCategory>();

List<WasteCategory> findAll() {
    return wasteCategories;
}

Optional<WasteCategory> findById(Integer categoryId) {
    return wasteCategories.stream().filter(wasteCategory -> wasteCategory.category_id()
            .equals(categoryId))
            .findFirst();
}

void create(WasteCategory wasteCategory) {
    wasteCategories.add(wasteCategory);
}

void update(WasteCategory wasteCategory, Integer categoryId) {

    Optional<WasteCategory> existingCategory = findById(categoryId);
    if (existingCategory.isPresent()) {
        wasteCategories.set(wasteCategories.indexOf(existingCategory.get()), wasteCategory );
    }
}

    void save(WasteCategory wasteCategory) {
    wasteCategories.add(wasteCategory);
    }


void delete(Integer categoryId) {
    wasteCategories.removeIf(wasteCategory -> wasteCategory.category_id().equals(categoryId));
}


}