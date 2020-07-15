package com.thoughtworks.basic;

public class Student extends Person {

    private Klass klass;

    public Student(){}

    public Student(Klass klass) {
        this.klass = klass;
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce(){
        return super.introduce()+" I am a Student of Class "+klass.getKlassNumber()+".";
    }
    public void changeName(String name) {
        super.setName(name);
        String notice = "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student of Class " + klass.getNum() + " now.";
        klass.getStudent().forEach(e -> {
            if (!this.equals(e)) {
                e.notice(notice);
            }
        });
        klass.getTeacher().notice(notice);
    }

    public void changeClazz(Klass klass) {
        String notice = "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student of Class " + klass.getNum() + " now.";
        this.klass.getStudent().remove(this);
        this.klass.getStudent().forEach( e -> {
            e.notice(notice);
        });
        this.klass.getTeacher().notice(notice);
        klass.getStudent().forEach(e -> {
            e.notice(notice);
        });
        klass.getStudent().add(this);
        klass.getTeacher().notice(notice);
    }
}
