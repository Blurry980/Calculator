package Project1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Calculator {
    Scanner scnr = new Scanner(System.in);

    public void calculate() {
        System.out.println("What is the first number? ");
        float n1 = Float.valueOf(scnr.nextLine());
        boolean end = false;
        String go_again;
        ArrayList<String> operations = new ArrayList<>();
        operations.add("+");
        operations.add("-");
        operations.add("*");
        operations.add("/");

        while (!end) {
            System.out.println("What operation do you want to use next? ");
            String symbol = scnr.nextLine();
            System.out.println("What is the next number? ");
            float n2 = Float.valueOf(scnr.nextLine());
            //String calc_function = operations.get(symbol);
            float new_answer = calc_function(n1, n2, symbol);
            System.out.println(n1 + " " + symbol + " " + n2 + " = " + new_answer);
            System.out.println("Do you want to continue? Type 'y' or 'n'");
            go_again = scnr.nextLine();

            if (go_again.equals("n")) {
                end = true;
                calculate();
            } else if (go_again.equals("y")) {

                n1 = new_answer;
            } else {
                System.out.println("Please type either 'n' or 'y'.");
            }

        }
    }

    private float calc_function(float n1, float n2, String symbol) {
        float answer = 0;
        if (symbol.equals("+")) {
            answer = n1 + n2;
        }
        if (symbol.equals("*")) {
            answer = n1 * n2;
        }

        if (symbol.equals("-")) {
            answer = n1 - n2;
        }

        if (symbol.equals("/")) {
            answer = n1 / n2;
        }
        return answer;
    }
}
