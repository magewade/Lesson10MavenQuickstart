package org.andersen.aqa;

public class Test {
    public static void main(String[] args) {
        String ch = "\uD83D\uDE3E";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println("All works");
    }
}


