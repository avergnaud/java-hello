package com.poc;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PojoTest {

    @Test
    public void setAndGet() {
        Pojo pojo = new Pojo();
        pojo.setVal(2);
        assertEquals(2, pojo.getVal());
    }
}