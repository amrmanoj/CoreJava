import java.util.Scanner;

public class EvenOrOddNumbers
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Type");
        int x= Integer.parseInt(scanner.nextLine());
        if(x%2==0)
        {
            System.out.println("Even Value");
        }
        else
        {
            System.out.println("Not Even Value");
        }
    }
}
