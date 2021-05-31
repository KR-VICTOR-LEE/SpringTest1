package com.example.studyone.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SearchParam {
    private String acconut;
    private String email;
    private int page;
}
