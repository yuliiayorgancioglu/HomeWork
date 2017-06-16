package yuliia.practice.module_31;

/* Implement a custom exception and and throw it in case of error*/

public class MyException extends Exception {

    @Override
    public String getMessage() {
        return "Illegal character, null cannot be resolved ";
    }
}
