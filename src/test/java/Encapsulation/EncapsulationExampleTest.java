package Encapsulation;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncapsulationExampleTest {

    EncapsulationExample example;


    @BeforeEach
    void setUp() throws Exception {
        example = new EncapsulationExample();
        example.setName("Avery");
        example.setAge(23);
    }

    @AfterEach
    void tearDown() throws Exception{
    }

    @Test
    void getName() {
        Assert.assertEquals(example.getName(), "Avery");
    }

    @Test
    void getAge() {
        Assert.assertEquals(example.getAge(), 23);
    }


}