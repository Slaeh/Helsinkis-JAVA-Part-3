import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        double average =0.0;
        int sum =0;
        int counter =0;
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int i = Integer.parseInt(scanner.nextLine());
            if(i == -1){
                break;
            }else{
            list.add(i);
            counter++;
            }

        }
        for(int i : list){
            sum+=i;
        }
        average = (double)sum/counter;
        System.out.println("Average: "+average);
    }
}
