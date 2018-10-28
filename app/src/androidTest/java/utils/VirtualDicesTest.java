package utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VirtualDicesTest {

    private VirtualDices dices;
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getDicesDropped() {

        dices = new VirtualDices(4,4);

        assertEquals(dices.getDicesDropped().length, 4);
    }

}