import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String last = scanner.nextLine();
            String[] lastIndex = last.split(" ");
            System.out.println(lastIndex[lastIndex.length-1]);
        }
    }
}
