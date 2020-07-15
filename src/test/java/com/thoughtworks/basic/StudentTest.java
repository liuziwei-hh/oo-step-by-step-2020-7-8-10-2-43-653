package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StudentTest {
    @Test
    public void introduce_test() {
        //given
        Klass klass=new Klass();
        Student student=new Student();

        //when
        student.setName("Tom");
        student.setAge(21);
        klass.setKlassNumber(2);
        String actual=student.introduce();
        //then
        assertEquals(actual, " My name is Tom. I am 21 years old. I am a Student of Class 2.");
    }
}
