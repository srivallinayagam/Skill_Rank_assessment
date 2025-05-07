import java.util.Scanner;

class Swap{
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Two numbers to be swapped:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1 - num2;
        
        System.out.println("Swapped numbers are "+num1+" and "+num2);
    }
}
