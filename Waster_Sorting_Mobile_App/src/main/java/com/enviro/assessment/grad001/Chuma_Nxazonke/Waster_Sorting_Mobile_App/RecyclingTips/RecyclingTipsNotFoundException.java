package com.enviro.assessment.grad001.Chuma_Nxazonke.Waster_Sorting_Mobile_App.RecyclingTips;

public class RecyclingTipsNotFoundException extends RuntimeException {


    public RecyclingTipsNotFoundException(String message) {
        super("Recycling tips id cannot be empty: ");
    }
}
