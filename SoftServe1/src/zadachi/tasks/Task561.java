package zadachi.tasks;

import zadachi.Command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task561 implements Command {

    @Override
    public void execute() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        try {
            number = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(findAutomorphicNumbers(number));

    }

    private static ArrayList<Long> findAutomorphicNumbers(Integer number) {
        List<Long> automorphicNumbersList = new ArrayList<>();
        List<Long> resultList = new ArrayList<>();
        automorphicNumbersList.add(0l);
        automorphicNumbersList.add(1l);
        automorphicNumbersList.add(5l);
        automorphicNumbersList.add(6l);
        if (automorphicNumbersList.get(automorphicNumbersList.size() - 1) >= number) {
            int i = 0;
            while (automorphicNumbersList.get(i) <= number) {
                resultList.add(automorphicNumbersList.get(i++));
            }
            return (ArrayList<Long>) resultList;
        } else {
            int k = 2;
            label:
            while (automorphicNumbersList.get(automorphicNumbersList.size() - 1) < number) {
                for (int i = 1; i < 10; i++) {
                    StringBuilder builder = new StringBuilder();
                    builder.append(i);
                    builder.append(automorphicNumbersList.get(k));
                    Long testNumber = Long.parseLong(builder.toString());
                    String square = Long.toString(testNumber * testNumber);
                    if (square.endsWith(builder.toString())) {
                        automorphicNumbersList.add(Long.parseLong(builder.toString()));
                    }
                }

                for(int i = 1; i < 10; i++){
                    StringBuilder builder = new StringBuilder();
                    builder.append(i);
                    builder.append(0);
                    builder.append(automorphicNumbersList.get(k));
                    Long testNumber = Long.parseLong(builder.toString());
                    String square = Long.toString(testNumber * testNumber);
                    if (square.endsWith(builder.toString())) {
                        automorphicNumbersList.add(Long.parseLong(builder.toString()));
                    }
                }

                automorphicNumbersList.sort(new ResultListComparator());
                k++;
            }

        }
        automorphicNumbersList.remove(automorphicNumbersList.size() - 1);

        return (ArrayList<Long>) automorphicNumbersList;
    }

}
