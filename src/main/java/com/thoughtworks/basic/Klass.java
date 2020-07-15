package com.thoughtworks.basic;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    public Klass(){}

    private int klassNumber;
    private Teacher teacher;
    private int num;
    private List<Student> student = new ArrayList<>();

    public int getKlassNumber() {
        return klassNumber;
    }

    public void setKlassNumber(int klassNumber) {
        this.klassNumber = klassNumber;
    }

    public Klass(int klassNumber) {
        this.klassNumber = klassNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public void addStudent(Student student) {
        this.student.add(student);
        student.setKlass(this);
    }


}
