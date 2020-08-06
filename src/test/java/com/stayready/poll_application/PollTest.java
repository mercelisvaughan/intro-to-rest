package com.stayready.poll_application;

import com.stayready.poll_application.domain.Option;
import com.stayready.poll_application.domain.Poll;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class PollTest {

    @Test
    public void getIdTest(){
        // Given
        Poll o = new Poll();
        // When
        long expected = 0000;
        o.setId((long) 0000);
        long actual = o.getId();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIdTest(){
        Poll o = new Poll();
        o.setId((long) 0001);
        long actual = o.getId();
        Assert.assertEquals(0001, actual);
    }

    @Test
    public void setQuestionTest(){
        Poll o = new Poll();
        o.setQuestion("Got milk?");
        String actual = o.getQuestion();
        Assert.assertEquals("Got milk?", actual);
    }

    @Test
    public void getQuestionTest(){
        Poll o = new Poll();
        o.setQuestion("Who you voting for?");
        String actual = o.getQuestion();
        Assert.assertEquals("Who you voting for?", actual);
    }

    @Test
    public void setOptionsTest(){
        // Given
        Poll p = new Poll();

        HashSet<Option> mySet = new HashSet<>();
        //mySet.add(p);


        // When
    }


}
