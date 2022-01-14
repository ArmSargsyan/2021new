package interfaces.random;

public class AskMe implements SharedConstants{
    static void answer(int result){
        switch (result){
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
            case MAYBE:
                System.out.println("Maybe vozmojno");
            case LATER:
                System.out.println("Later  pozdnee");
            case SOON:
                System.out.println("Soon vskore");
            case NEVER:
                System.out.println("never");
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
