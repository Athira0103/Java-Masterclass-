import java.sql.SQLOutput;
import java.util.Scanner;
public class Pattern
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of lines in pattern ");
        int n = s.nextInt();
        for(int i=1;i<=(n+1)/2;i++)
        {
            for(int j=1;j<=(n+1)/2-i;j++)
            System.out.print(" ");
            for(int k=1;k<=i;k++){
                char a = (char)(64+k);
                System.out.print(a);
            }
            for(int k=i-1;k>=1;k--)
            {
                char a = (char)(64+i-k);
                System.out.print(a);
            }
            System.out.println();
        }
        for(int i=n/2;i>=1;i--)
        {
            if(n%2!=0)
            System.out.print(" ");
            for(int j=1;j<=n/2-i;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++){
                char a = (char)(64+k);
                System.out.print(a);
            }
            for(int k=i-1;k>=1;k--)
            {
                char a = (char)(64+i-k);
                System.out.print(a);
            }
            System.out.println();
        }


    }
}
