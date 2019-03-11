package adapter_pattern;

/**************************
 *
 *  Create by tawsif93 
 *  2019-02-27 on 12:52
 *
 **************************/


public class SquareAdapter {

    private final Square squarePeg;

    public SquareAdapter(double w) {
        squarePeg = new Square(w);
    }

    public void makeFit(RoundHole roundHole) {
        double amount = squarePeg.getWidth() - roundHole.getRadius() * Math.sqrt(2);
        System.out.println( "reducing SquarePeg " + squarePeg.getWidth() + " by " + ((amount < 0) ? 0 : amount) + " amount");
        if (amount > 0) {
            squarePeg.setWidth(squarePeg.getWidth() - amount);
            System.out.println("   width is now " + squarePeg.getWidth());
        }
    }
}
