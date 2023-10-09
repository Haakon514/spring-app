package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parts")
public class PartsController {

    @Autowired
    private PartsService partsService;

    @Value("${jason.word}")
    private String word;


    @GetMapping()
    public List<Part> getParts(){
        System.out.println(word);
        return partsService.getParts();
    }

    @PostMapping()
    public void addParts(@RequestBody Part part){
        partsService.addPart(part);
    }

    @DeleteMapping()
    public void deletePart(@RequestBody Part part){
        partsService.deletePart(part);
    }

}
