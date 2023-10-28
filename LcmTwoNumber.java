//LCM OF TWO NUMBER
import java.util.Scanner;
class LcmTwoNumber {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= scan.nextInt();
        System.out.println("Enter the second number");
        int b= scan.nextInt();
        for(int i=1;true;i++)
        {
            if(i%a==0 && i%b==0)
            {
                System.out.println(i);
                break;
            }

        }    }
}
