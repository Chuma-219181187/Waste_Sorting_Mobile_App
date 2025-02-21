package com.enviro.assessment.grad001.Chuma_Nxazonke.Waster_Sorting_Mobile_App.RecyclingTips;

public record RecyclingTips(
Integer tipId,
String category,
String description,
String important_level,
String Hazardous_warning



) {
    public RecyclingTips {
        if (tipId == null) {
            throw new RecyclingTipsNotFoundException("Tip id cannot be null");
        }
    }
}


