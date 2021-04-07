package cl.falabell.test.products.controllers;

public class customExecption extends RuntimeException {

    public customExecption() {
    }

    public customExecption(String message) {
        super("Errror");
    }


}
