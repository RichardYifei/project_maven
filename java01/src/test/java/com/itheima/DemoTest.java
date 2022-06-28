package com.itheima;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
    @Test
    public void testSay() {
        Demo d = new Demo();
        String s = d.say(" World");
        Assert.assertEquals("Hello World", s);
    }
}
