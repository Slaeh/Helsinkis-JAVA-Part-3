import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
        String first = scanner.nextLine();
        String[] firstIndex = first.split(" ");
        System.out.println(firstIndex[0]);

        }
    }
}
