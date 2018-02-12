package com.personal.bean;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class InputToTest {

    private String name;
    private String color;

    public void setColor(String color){
        this.color = color.trim();
    }
}
