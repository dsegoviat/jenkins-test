package com.davidsegoviatomas;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)
public class HelloTest {

    @Test
    public void helloTest() throws Exception {
        // test
        assertEquals(true, true);
    }

}
