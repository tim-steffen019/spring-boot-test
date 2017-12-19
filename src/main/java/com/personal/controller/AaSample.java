package com.personal.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.personal.bean.InputWrapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by tim on 6/28/17.
 */
@RestController
public class AaSample {

    @RequestMapping(value = "/post", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public void postTest(@RequestBody InputWrapper inputToTest) throws IOException {



        String testing = "{\"title\" : \"hi\",\n" +
                "\"inputToTest\":[\n" +
                "{\"name\":\"Tim\",\n" +
                "\"color\": \"  the proof  \"},\n" +
                "{\"name\":\"Joe\",\n" +
                "\"color\": \" Red  dfa  \"}\n" +
                "\t]\n" +
                "}";

        ObjectMapper mapper = new ObjectMapper();
       InputWrapper iw =  mapper.readValue(testing, InputWrapper.class);
       iw.getInputToTest().stream().forEach(input ->
               System.out.println(
                       "Name :" + input.getName() + ": Color :" + input.getColor() + ":"));

    }

}
