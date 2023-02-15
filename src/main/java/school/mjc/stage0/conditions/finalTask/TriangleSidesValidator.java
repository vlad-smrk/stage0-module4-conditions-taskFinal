package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean validTriangle = firstSide > 0 && secondSide > 0 && thirdSide > 0 &&
                (firstSide + secondSide) > thirdSide &&
                (secondSide + thirdSide) > firstSide &&
                (firstSide + thirdSide) > secondSide;
        System.out.println(validTriangle ? "this is a valid triangle" : "it's not a triangle");
    }
}
