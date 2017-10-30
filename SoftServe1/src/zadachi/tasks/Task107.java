package zadachi.tasks;

import zadachi.Command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task107 implements Command {

    private int ex_107() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number: ");
        int m = Integer.parseInt(bf.readLine());

        if (m < 1) {
            System.err.println(("Input value is < 1, please enter a higher value."));
        }

        int k = 1;
        while (Math.pow(4, k) <= m) {
            k++;
        }
        return --k;
    }


    @Override
    public void execute() {
        try {
            System.out.println(ex_107());
        } catch (IOException e) {
            System.err.println("Bad input");
            e.printStackTrace();
        }
    }
}
