/*
* Skriv et program i Java, som kan indlæse tal i en uendelig løkke, og vise gennemsnittet af alle de indlæste tal efter hver indlæsning. Programmet skal producere følgende output:

Hej med dig!
Indtast et tal: 5
Indtast endnu et tal: 3
Gennemsnittet af de indtastede tal er 4.
Indtast endnu et tal: 10
Gennemsnittet af de indtastede tal er 6.
Indtast endnu et tal: ...

//TODO Ekstraopgave: Den skal holde op med at indlæse tal, når man indtaster Q eller q. Andre bogstaver skal give fejlbesked, men programmet skal fortsætte.
*
* */

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hej med dig!");

        System.out.println("Indtast et tal: ");
        int number1 = scanner.nextInt();
        System.out.println("Indtast endnu et tal: ");
        int number2 = scanner.nextInt();

        int numberOfNumbers = 2;
        int sumOfNumbers = number1+number2;
        int result = sumOfNumbers/numberOfNumbers;
        System.out.println("Gennemsnittet af de to numre er: " + result);

        while(!scanner.equals("q") || !scanner.equals("Q")){

/*            if(scanner.equals("q") || scanner.equals("Q")) {
                System.out.println("q or Q was pressed. Programme ended.");
               // break;
            }*/

            System.out.println("Indtast et nyt tal: ");
            number2 = scanner.nextInt();
            sumOfNumbers = sumOfNumbers + number2;
            result = sumOfNumbers/++numberOfNumbers;
            System.out.println("Gennemsnittet af de forrige numre er: " + result);
        }
    }
}
