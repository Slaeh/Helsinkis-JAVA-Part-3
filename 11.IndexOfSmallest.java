import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int input = Integer.parseInt(scanner.nextLine());
            if(input == 9999){
                break;
            }else{
                list.add(input);
            }
        }
        int smallest =list.get(0);
        for(int i :list){
            if(i < smallest){
                smallest = i;
            }
        }
        System.out.println("Smallest number: "+ smallest);
        for(int i= 0; i<= list.size()-1; i++){
            if(list.get(i)== smallest){
                System.out.println("Found at index: "+ i);
            }
        }

        // implement here a program that reads user input
        // until the user enters 9999

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times


    }
}
