package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class PersonTest {
    @Test
    public void introduce_test() {
        //given
        Person person =new Person();
        //when
        person.setName("Tom");
        person.setAge(21);
        String actual=person.introduce();
        //then
        assertEquals(actual, " My name is Tom. I am 21 years old.");
    }
}
