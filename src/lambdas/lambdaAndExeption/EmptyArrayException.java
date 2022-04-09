package lambdas.lambdaAndExeption;

public class EmptyArrayException extends Exception {

    EmptyArrayException(){
        super("array is empty");
    }
}
