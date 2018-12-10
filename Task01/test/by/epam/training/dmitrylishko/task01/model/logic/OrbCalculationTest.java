package by.epam.training.dmitrylishko.task01.model.logic;

import static org.testng.Assert.*;

import by.epam.training.dmitrylishko.task01.model.entity.Orb;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class OrbCalculationTest {
    private static Orb orb;

    private static final double EPS = 1E-5;
    private static double x = 4;
    private static double y = 6;
    private static double z = 1;
    private static double radius = 3;

    @BeforeClass
    public void setUpOrb() {
        orb = new Orb(x, y, z, radius);
    }

    @AfterClass
    public void tearDown() {
        orb = null;
    }

    @Test
    public void testSurfaceArea() {
        double area = 36 * OrbCalculation.PI;
        assertEquals(OrbCalculation.surfaceArea(orb), area, EPS);
    }

    @Test
    public void testVolume() {
        double volume = 36 * OrbCalculation.PI;
        assertEquals(OrbCalculation.volume(orb), volume, EPS);
    }

    @Test
    public void testVolumeRatio() {
        fail();
    }

    @Test
    public void testIsOrbByObj() {
        fail();

    }

    @Test
    public void testIsOrbByRad() {
        fail();

    }

    @Test
    public void testIsOrbCrossCoordinatePlane() {
        fail();

    }
}
