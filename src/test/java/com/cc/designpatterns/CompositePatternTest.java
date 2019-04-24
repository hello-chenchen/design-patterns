package com.cc.designpatterns;

import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.compositepattern.*;

import org.junit.Test;

public class CompositePatternTest {

    private Composite composite = null;
    @Test
    public void leafTest() {
        composite = new Leaf();
        assertEquals("Leaf::operate", composite.operate());
    }

    @Test
    public void subCompositeTest() {
        composite = new SubComposite();
        assertEquals("SubComposite::operate", composite.operate());
    }

    @Test
    public void compositeTest() {
        composite = new SubComposite();
        composite.addComposite(new Leaf());

        assertEquals("SubComposite::operate Leaf::operate", composite.operate());

        composite.addComposite(new Leaf());
        assertEquals("SubComposite::operate Leaf::operate Leaf::operate", composite.operate());

        composite.addComposite(new SubComposite());
        assertEquals("SubComposite::operate Leaf::operate Leaf::operate SubComposite::operate", composite.operate());

        SubComposite sub = new SubComposite();
        sub.addComposite(new Leaf());
        composite.addComposite(sub);
        assertEquals("SubComposite::operate Leaf::operate Leaf::operate SubComposite::operate SubComposite::operate Leaf::operate", composite.operate());

        Leaf leaf = new Leaf();
        leaf.addComposite(new Leaf());
        leaf.addComposite(new SubComposite());
        composite.addComposite(leaf);
        assertEquals("SubComposite::operate Leaf::operate Leaf::operate SubComposite::operate SubComposite::operate Leaf::operate Leaf::operate", composite.operate());
    }
}