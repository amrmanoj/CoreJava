import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lower Number");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Upper Number");
        int y = Integer.parseInt(scanner.nextLine());
        for (int j = x; j <= y; j++) {
            for (int i = 1; i <= 10; i++) {

                System.out.printf("%d X %d = %d \n", j, i, j * i);
        }
    }
}
}