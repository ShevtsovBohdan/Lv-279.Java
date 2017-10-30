package zadachi.tasks;

import zadachi.Command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task243 implements Command {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static int number;

    private ArrayList<String> ex_243(int number) {
            ArrayList<String> list = new ArrayList<>();
            int x = 1;
            int y;
            do {
                y = (int) Math.sqrt(number - Math.pow(x, 2));
                if (Math.pow(y, 2) + Math.pow(x, 2) == number && y != 0) {
                    list.add(x + " and " + y);
                }
                x++;
            } while (x <= y);

            return list;
    }


    private boolean canRepresent(int number) {
        return number % 4 == 1;
    }

    @Override
    public void execute() {
        int pick = 0;
        try {
            System.out.println("Please enter the number: ");
            number = Integer.parseInt(bf.readLine());

            if (!canRepresent(number)) {
                System.err.println(number + " can't represent as a sum of two squares");
                return;
            }


            System.out.println("Pick what u wont: ");
            System.out.println("1) Only one pair of squares");
            System.out.println("2) All possible pair of squares");
            pick = Integer.parseInt(bf.readLine());

        } catch (IOException e) {
            System.err.println("Wrong input");
        }

            switch (pick) {
                case 1:
                    System.out.println(ex_243(number).get(0));
                    break;
                case 2:
                    System.out.println(ex_243(number));
                    break;
                default:
                    System.out.println("Wrong input");
            }

    }
}

