package com.personal.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by tim on 6/28/17.
 */
@RestController
public class AaSample {
    @Autowired
    ServletContext servletContext;

    @RequestMapping(value = "/hi")
    public String index(){
        return "<!DOCTYPE html>\n" +
                "<PASTE HERE>";
    }
    @RequestMapping("/photo2")
    public ResponseEntity<byte[]> testphoto() throws IOException {
        File file = new File("/home/tim/Downloads/nasa.jpg");
        InputStream targetStream = new FileInputStream(file);

        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG);

        return new ResponseEntity<byte[]>(IOUtils.toByteArray(targetStream), headers, HttpStatus.CREATED);
    }
}
