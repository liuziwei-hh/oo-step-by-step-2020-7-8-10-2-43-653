package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class TeacherTest {
    @Test
    public void introduce_test() {
        //given
        Teacher teacher=new Teacher(klass);
        Klass klass=new Klass();
        //when
        teacher.setName("Matt");
        teacher.setAge(30);
        teacher.setJob("Teacher");
        String actual=teacher.introduce();
        //then
        assertEquals(actual, " My name is Matt. I am 30 years old. I am a Teacher.");
    }
}
