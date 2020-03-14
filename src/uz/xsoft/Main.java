package uz.xsoft;

import jdk.nashorn.internal.ir.SplitNode;

public class Main {

    public static void main(String[] args) {
        Information i = new Information();
        i.message = "Hello world!";
        i.show();
    }
}


class Information {
    protected String message;

    protected void show() {
        System.out.println(message);
    }
}

