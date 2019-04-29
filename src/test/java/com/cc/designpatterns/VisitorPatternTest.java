package com.cc.designpatterns;

import static org.junit.Assert.assertEquals;

import com.cc.designpatterns.visitorpattern.DrawVisitor;
import com.cc.designpatterns.visitorpattern.ElementA;
import com.cc.designpatterns.visitorpattern.ElementB;
import com.cc.designpatterns.visitorpattern.ElementC;
import com.cc.designpatterns.visitorpattern.PrintVisitor;

import org.junit.Test;

public class VisitorPatternTest {
    @Test
    public void visitorTest() {
        ElementA elementA = new ElementA();
        ElementB elementB = new ElementB();
        ElementC elementC = new ElementC();
        DrawVisitor drawVisitor = new DrawVisitor();
        PrintVisitor printVisitor = new PrintVisitor();
        assertEquals("DrawVisitor::ElementA", drawVisitor.visit(elementA));
        assertEquals("DrawVisitor::ElementB", drawVisitor.visit(elementB));
        assertEquals("DrawVisitor::ElementC", drawVisitor.visit(elementC));
        assertEquals("PrintVisitor::ElementA", printVisitor.visit(elementA));
        assertEquals("PrintVisitor::ElementB", printVisitor.visit(elementB));
        assertEquals("PrintVisitor::ElementC", printVisitor.visit(elementC));
    }
}