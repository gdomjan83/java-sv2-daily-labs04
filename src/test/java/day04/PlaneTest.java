package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaneTest {

    Plane plane = new Plane(5);

    @Test
    void testAddingPassangers() {
        assertEquals(true, plane.addPassanger(new Passanger("Domján Gábor", "FKIK-485", 2)));
        assertEquals(true, plane.addPassanger(new Passanger("Keller Tamás", "FKIK-152", 1)));
        assertEquals(true, plane.addPassanger(new Passanger("Zaránd Alina", "FKIK-86", 0)));
        assertEquals(true, plane.addPassanger(new Passanger("Bodnár Gabriella", "FKIK-010", 1)));
        assertEquals(true, plane.addPassanger(new Passanger("Kandó Kata", "FKIK-987", 2)));
        assertEquals(false, plane.addPassanger(new Passanger("Simon Gina", "FKIK-841", 3)));

        assertEquals(6, plane.numberOfPackages());
    }
}
