package com.stayready.poll_application;

import com.stayready.poll_application.domain.Option;
import org.junit.Assert;
import org.junit.Test;

public class OptionTest {


    @Test
    public void getIdTest(){
        // Given
        Option o = new Option();
        // When
        long expected = 0000;
        o.setId((long) 0000);
        long actual = o.getId();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIdTest(){
        Option o = new Option();

        o.setId((long) 0001);

        long actual = o.getId();

        Assert.assertEquals(0001, actual);
    }

    @Test
    public void setValueTest(){
        Option o = new Option();
        o.setValue("Value");
        String actual = o.getValue();
        Assert.assertEquals("Value", actual);
    }

    @Test
    public void getValueTest(){
        Option o = new Option();
        o.setValue("Word");
        String actual = o.getValue();
        Assert.assertEquals("Word", actual);
    }

}
