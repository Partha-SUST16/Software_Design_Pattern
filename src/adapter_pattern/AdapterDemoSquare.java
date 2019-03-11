package adapter_pattern;

/**************************
 *
 *  Create by tawsif93 
 *  2019-02-27 on 12:53
 *
 **************************/


public class AdapterDemoSquare {
    public static void main( String[] args ) {
        RoundHole roundHole = new RoundHole( 5 );
        SquareAdapter squarePegAdapter;
        for (int i = 6; i < 10; i++) {
            squarePegAdapter = new SquareAdapter((double)i);
            squarePegAdapter.makeFit(roundHole);
        }
    }
}
