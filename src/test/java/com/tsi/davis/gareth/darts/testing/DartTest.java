package com.tsi.davis.gareth.darts.testing;

import com.tsi.davis.gareth.darts.Dart;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DartTest {

    @Test
    public void test_set_weight(){
        Dart testDart = new Dart();
        testDart.setWeight(100);
        assertEquals(100,testDart.getWeight(),"The expected weight of the dart was wrong");
    }
}
