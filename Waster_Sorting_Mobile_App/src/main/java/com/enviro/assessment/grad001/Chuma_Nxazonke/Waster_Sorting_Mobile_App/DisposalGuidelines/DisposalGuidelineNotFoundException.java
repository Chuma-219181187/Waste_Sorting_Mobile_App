package com.enviro.assessment.grad001.Chuma_Nxazonke.Waster_Sorting_Mobile_App.DisposalGuidelines;

public class DisposalGuidelineNotFoundException extends RuntimeException {

    public DisposalGuidelineNotFoundException(String message) {

        super("Disposal Guideline not found: " + message);
    }
}
