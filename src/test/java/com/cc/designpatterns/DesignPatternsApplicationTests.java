package com.cc.designpatterns;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DesignPatternsApplicationTests {
    DesignPatternsApplication designPatternsApplication = new DesignPatternsApplication();

    @Test
    public void helloSuccessTest() {
        String result = designPatternsApplication.hello();
        assertEquals("hello world", result);
    }

    @Test
    public void fooSuccessTest() {
        int result = designPatternsApplication.foo();
        assertEquals(23, result);
    }
}
