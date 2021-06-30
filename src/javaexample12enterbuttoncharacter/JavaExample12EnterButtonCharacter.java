package javaexample12enterbuttoncharacter;

import java.io.InputStreamReader;

public class JavaExample12EnterButtonCharacter {

    public static void main(String[] args) {

        System.out.print("Please enter one character: ");

        char a1 = ' ', enterButtonChar = ' ';

        try (InputStreamReader reader = new InputStreamReader(System.in);) {
            a1 = (char) reader.read();

            enterButtonChar = (char) reader.read();

            reader.read(); // can be deleted

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("The first character (unicode): " + (int) a1);
        System.out.println("The \"enter\" character (unicode): " + (int) enterButtonChar);
        System.out.println("--------------------------------------------");
        SomethingToKnow();

    }// end main

    private static void SomethingToKnow() {
        char CarriageReturnChar = '\r';
        char newLineChar = '\n';

        System.out.println("Carriage return character \'\\r\' as unicode: " + (int) CarriageReturnChar);
        System.out.println("New line or \"enter button caharacter\" character \'\\n\' as unicode: " + (int) newLineChar);

    }

}
