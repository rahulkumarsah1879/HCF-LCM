import java.util.Scanner;
class HcfTwoNumber {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= scan.nextInt();
        System.out.println("Enter the second number");
        int b= scan.nextInt();
        int hcf=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }
        }
        System.out.println("Hcf is "+hcf);
    }
}
