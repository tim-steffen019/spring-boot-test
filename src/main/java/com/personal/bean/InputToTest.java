package com.personal.bean;

import lombok.Data;

@Data
public class InputToTest {

    private String name;
    private String color;

    public void setColor(String color){
        this.color = color.trim();
    }
}
