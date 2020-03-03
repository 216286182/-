package Inheritance;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnderGradTest {

    private Student stud;

    @Before
    public void setUp() throws Exception {
        stud = new Student();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getId() {
        Assert.assertEquals(stud.getId(), "216286182");
    }

    @Test
    public void getName() {
        Assert.assertEquals(stud.getName(), "Avery");
    }

    @Test
    public void getYear() {
        Assert.assertEquals(stud.getYear(), 3);
    }
}