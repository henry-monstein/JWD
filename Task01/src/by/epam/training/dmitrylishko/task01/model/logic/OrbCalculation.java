package by.epam.training.dmitrylishko.task01.model.logic;

import by.epam.training.dmitrylishko.task01.model.entity.Orb;

public class OrbCalculation {
    public static final double PI = Math.PI;

    public static double surfaceArea(Orb orb) {
        return 4 * orb.getRadius() * orb.getRadius() * PI;
    }

    public static double volume(Orb orb) {
        return (4 * orb.getRadius() * orb.getRadius() * orb.getRadius() * PI) / 3D;
    }

    public static double[] volumeRatio(Orb orb, double a, double b, double c, double d) {
        if (distanceToPlane(orb, a, b, c, d) < orb.getRadius()) {
            double high = orb.getRadius() - distanceToPlane(orb, a, b, c, d);
            double volumeCut = PI * high * high * (orb.getRadius() - (high / 3D));
            double volumeLeft = volume(orb) - volumeCut;
            return new double[]{1, volumeLeft / volumeCut};
        } else {
            return new double[]{0, 1};
        }
    }

    public static boolean isOrb(Orb orb) {
        return isOrb(orb.getRadius());
    }

    public static boolean isOrb(double radius) {
        if (!(radius > 0)) {
            return false;
        }
        return true;
    }

    public static boolean isOrbCrossCoordinatePlane(Orb orb) {
        if (distanceToPlane(orb, 2, 2, 0, 0) < orb.getRadius() &&
                distanceToPlane(orb, 2, 0, 2, 0) < orb.getRadius() &&
                distanceToPlane(orb, 0, 2, 2, 0) < orb.getRadius()) {
            return true;
        } else {
            return false;
        }
    }

    private static double distanceToPlane(Orb orb, double a, double b, double c, double d) {
        return Math.abs(a * orb.getX() + b * orb.getY() + c * orb.getZ() + d) / Math.sqrt(a * a + b * b + c * c);
    }
}
