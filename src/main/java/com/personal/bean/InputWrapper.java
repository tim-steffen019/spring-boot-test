package com.personal.bean;

import lombok.Data;

import java.util.List;

@Data
public class InputWrapper {

    private List<InputToTest> inputToTest;
    private String title;

}

