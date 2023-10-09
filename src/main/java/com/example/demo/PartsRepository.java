package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class PartsRepository {

    private ArrayList<Part> parts = new ArrayList<>();

    public PartsRepository(){
        parts.add(new Part("gear"));
        parts.add(new Part("wheel"));
        parts.add(new Part("chain"));
    }

    public ArrayList<Part> getParts(){
        return parts;
    }

    public void addPart(Part part){
        parts.add(part);
    }

    public void deletePart(Part part){
        parts.remove(part);
    }

}
