package com.enviro.assessment.grad001.Chuma_Nxazonke.Waster_Sorting_Mobile_App.WasteCategory;

import java.time.LocalTime;

public record WasteCategory(
        Integer category_id,

                            String category_name,
                            String category_description,
                            String category_type,
                            String categories_items,
                            LocalTime decomposition_time)


{

    public WasteCategory {
        if (category_id == null) {
            throw new CategoryNotFoundException();
        }
    }
}
