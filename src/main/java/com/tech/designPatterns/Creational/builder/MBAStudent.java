package com.tech.designPatterns.Creational.builder;

import java.util.ArrayList;
import java.util.List;

public class MBAStudent extends StudentBuilder{
    public StudentBuilder setSubjects(){
        List<String> mbaSubjectsList = new ArrayList<>();
        mbaSubjectsList.add("Micro Economics");
        mbaSubjectsList.add("Business Studies");
        mbaSubjectsList.add("Operations Management");
        mbaSubjectsList.add("Financial Management");
        this.subjects = mbaSubjectsList;
        return this;

    }
}
