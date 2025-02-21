package com.enviro.assessment.grad001.Chuma_Nxazonke.Waster_Sorting_Mobile_App.DisposalGuidelines;

public record DisposalGuidelines(
        Integer disposal_id,
        String waste_type,
        String description,
        String disposal_method,
        String collection_schedule


) {

    public DisposalGuidelines {
        if (disposal_id == null) {
throw new DisposalGuidelineNotFoundException("Disposal Guideline not found");
        }
    }
}
