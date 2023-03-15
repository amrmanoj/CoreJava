import java.util.Scanner;

public class PrimeOrRealNumber
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Type");
        int x= Integer.parseInt(scanner.nextLine());
        int flag=0;
        for(int i=2; i<=x-1;i++)
            if(x%i==0)
            {
                flag=1;
            break;
            }
if (flag==0)
        {
            System.out.println("Prime Value");
        }
        else
        {
            System.out.println("Not Prime Value");
        }
    }
}
