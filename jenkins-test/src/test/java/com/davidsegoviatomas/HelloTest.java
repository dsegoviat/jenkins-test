package com.davidsegoviatomas;

import com.davidsegoviatomas.controllers.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)
public class HelloTest {

    @Test
    public void helloTest() throws Exception {
        assertEquals(true, true);
    }

}
