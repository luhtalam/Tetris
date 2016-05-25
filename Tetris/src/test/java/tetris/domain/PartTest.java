/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tetris.domain.Part;

/**
 *
 * @author luhtalam
 */
public class PartTest {
     private Part part;

    @Test
    public void testConstructorXCoordIsRight() {
        int x = 3;
        this.part = new Part(x,2,10);
        assertEquals(x, part.getXCoord());
    }
    
    @Test
    public void testConstructorYCoordIsRight() {
        int y = 2;
        this.part = new Part(3,y,10);
        assertEquals(y, part.getYCoord());
    }
    
    @Test
    public void testConstructorWidthIsRight() {
        int w = 14;
        this.part = new Part(1,2, w);
        assertEquals(w, part.getWidth());
    }
    
    @Test
    public void testMoveDxIsZero() {
        int x = 2;
        int dx = 0;
        part = new Part(x,2,10);
        part.move(dx, 0);
        assertEquals(x, part.getXCoord());
    }
    
    @Test
    public void testMoveDxIsPositive() {
        int x = 2;
        int dx = 5;
        part = new Part(x, 3,10);
        part.move(dx, 0);
        assertEquals(x + dx, part.getXCoord());
    }
    
    @Test
    public void testMoveDxIsNegative() {
        int x = 2;
        int dx = -3;
        part = new Part(x, 3, 10);
        part.move(dx, 0);
        assertEquals(x + dx, part.getXCoord());
    }
    
    @Test
    public void testMoveDyIsZero() {
        int y = 2;
        int dy = 0;
        part = new Part(1, y, 10);
        part.move(0, dy);
        assertEquals(y, part.getYCoord());
    }
    
    @Test
    public void testMoveDyIsPositive() {
        int y = 2;
        int dy = 3;
        part = new Part(1, y, 10);
        part.move(0, dy);
        assertEquals(y + dy, part.getYCoord());
    }
    
    @Test
    public void testMoveDyIsNegative() {
        int y = 2;
        int dy = -3;
        part = new Part(1, y, 10);
        part.move(0, dy);
        assertEquals(y + dy, part.getYCoord());
    }
    
    @Test
    public void testNewCoordinatesXIsRight() {
        int x = 4;
        part = new Part(2, 3, 10);
        part.newCoordinates(x, 0);
        assertEquals(x, part.getXCoord());
    }
    
    @Test
    public void testNewCoordinatesYIsRight() {
        int y = 3;
        part = new Part(2, 3, 10);
        part.newCoordinates(0, y);
        assertEquals(y, part.getYCoord());
    }
}
