package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class PartsRepository {

    private ArrayList<Part> partArrayList = new ArrayList<>();

    public PartsRepository(){
        partArrayList.add(new Part("gear"));
        partArrayList.add(new Part("wheel"));
        partArrayList.add(new Part("chain"));
    }

    public ArrayList<Part> getParts(){
        return partArrayList;
    }

    public void addPart(Part part){
        partArrayList.add(part);
    }

    public void deletePart(Part part){
        partArrayList.remove(part);
    }

}
