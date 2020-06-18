
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>(); 
        String longest ="";
        int sum =0;
        int counter =0;
        double average = 0;
        
        while(true){
            String value = scanner.nextLine();
            if(value.equals("")){
                break;
            }
            String[] words = value.split(",");
            list.add(words[0]);
            sum+= Integer.valueOf(words[1]);
            counter++;
            
        }
        for(String i : list){
            if(i.length() >longest.length()){
                longest = i;
            }
        }
        average = (double)sum/counter;
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + average);
    }
}
