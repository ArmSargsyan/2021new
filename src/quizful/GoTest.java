package quizful;

public class GoTest {
    public static void main(String[] args) {
        Sente a = new Sente(); a.go();
        Goban b = new Goban(); b.go();
        Stone c = new Stone(); c.go();
    }
}
