package com.stayready.poll_application;

import com.stayready.poll_application.domain.Vote;
import org.junit.Assert;
import org.junit.Test;

public class VoteTest {

    @Test
    public void getIdTest(){
        // Given
        Vote o = new Vote();
        // When
        long expected = 0000;
        o.setId((long) 0000);
        long actual = o.getId();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setIdTest(){
        Vote o = new Vote();

        o.setId((long) 0001);

        long actual = o.getId();

        Assert.assertEquals(0001, actual);
    }

}
