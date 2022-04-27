package patterns.structural.adapter;

public class TestAdapter {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if (roundHole.fits(roundPeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallPeg = new SquarePeg(2);
        SquarePeg largePeg = new SquarePeg(20);

        SquarePegAdapter smallPegAdapter = new SquarePegAdapter(smallPeg);
        SquarePegAdapter largePegAdapter = new SquarePegAdapter(largePeg);
        if (roundHole.fits(smallPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!roundHole.fits(largePegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
