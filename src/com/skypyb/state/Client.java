package com.skypyb.state;


public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(Context.FREE_STATE);
        context.free();
        context.booked();
        context.free();
        context.checkedin();
        context.booked();
        context.checkedin();
        context.free();
    }

}
