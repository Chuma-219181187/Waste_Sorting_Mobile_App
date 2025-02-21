package com.enviro.assessment.grad001.Chuma_Nxazonke.Waster_Sorting_Mobile_App.WasteCategory;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CategoryNotFoundException extends RuntimeException {
public CategoryNotFoundException() {
    super("Category not found");
}



}
