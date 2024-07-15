package com.association.ecample2;

import java.util.List;

import com.association.Subject;

public class Teacher {

    private String name;
    private int noOfLecture;

    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    private List<Subject> subjects;
    

    public Teacher() {
    }

    public Teacher(String name, int noOfLecture) {
        this.name = name;
        this.noOfLecture = noOfLecture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfLecture() {
        return noOfLecture;
    }

    public void setNoOfLecture(int noOfLecture) {
        this.noOfLecture = noOfLecture;
    }



    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Teacher [name=" + name + ", noOfLecture=" + noOfLecture + ", department=" + department + ", subjects="
                + subjects + "]";
    }

    

}
