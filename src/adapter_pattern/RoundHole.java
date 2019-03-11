package adapter_pattern;

/**************************
 *
 *  Create by tawsif93 
 *  2019-02-27 on 12:51
 *
 **************************/


public class RoundHole {
    private final int radius;

    public RoundHole(int radius) {
        this.radius = radius;
        System.out.println("RoundHole: max SquarePeg is " + radius * Math.sqrt(2));
    }

    public int getRadius() {
        return radius;
    }
}
