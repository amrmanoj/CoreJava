import java.util.Scanner;

public class CountOfPrimeNumbers
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lower Number");
        int x= Integer.parseInt(scanner.nextLine());
        System.out.println("Upper Number");
        int y= Integer.parseInt(scanner.nextLine());
        int count=0;
        for(long j=x; j<=y;j++)
        {
        int flag=0;
        for(int i=2; i<=x-1;i++)
            if(j%i==0)
            {
                flag=1;
            break;
            }
if (flag==0)
        {
            System.out.println(count+"Prime Value");
        count++;
        }
        else
        {
            System.out.println(count+"Not Prime Value");
        }
    }
        System.out.println(count);
}
}
