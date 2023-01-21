package Project1;

import java.util.HashMap;
import java.util.Scanner;

public class Calculator {
Scanner scnr = new Scanner(System.in);
    public void calculate() {
        System.out.println("What is the first number? ");
        float n1 = Float.valueOf(scnr.nextLine());
        boolean end = false;
        HashMap<String, String> operations = new HashMap<>();
        operations.put("+", "add");
        // Populate commands map
        //operations.put("+", () -> add());
        //operations.put('t', () -> System.out.println("Teleport"));
        //operations.put('h', () -> System.out.println("Help"));
        //operations.put('t', () -> System.out.println("Teleport"));
//        ArrayList<String>operations = new ArrayList<>();
//        operations.add("+");
//        operations.add("-");
//        operations.add("*");
//        operations.add("/");


        // Invoke some command
        //String cmd = "+";
        //operations.get(cmd).run();   // Prints "Teleport"

        while (!end) {
            System.out.println("What operation do you want to use next? ");
            String symbol = scnr.nextLine();
            System.out.println("What is the next number? ");
            float n2 = Float.valueOf(scnr.nextLine());
            //String calc_function = operations.get(symbol);
            float new_answer = calc_function(n1, n2, symbol);
            System.out.println(n1 + " " + symbol + " " + n2 + "=" + new_answer);
//            go_again = input("Do you want to continue adding to the equation? ")
//
//            if (go_again == 'n'):
//
//            end = True
//            calculator()
//
//            elif(go_again == 'y'):
//
//            n1 = new_answer
//
//    else:
//            print("Please type either 'n' or 'y'.")
//        }
//        print(logo)
//        calculator()
//    }




        }
    }

    private float calc_function(float n1, float n2, String symbol) {
            float answer = 0;
            if (symbol.equals("+")) {
                answer = n1 + n2;
            }
            return answer;

    }
}
