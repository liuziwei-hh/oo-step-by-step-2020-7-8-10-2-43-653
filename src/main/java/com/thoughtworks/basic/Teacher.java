package com.thoughtworks.basic;

public class Teacher extends Person {

    public Teacher(String job) {
        this.job = job;
    }

    public Teacher(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    public Teacher(){}

    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String introduce(){
        return super.introduce()+"";
    }


}
