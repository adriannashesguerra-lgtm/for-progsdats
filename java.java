import java.util.Scanner;

public class java{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = input.nextLine();

        System.out.print("Age: ");
        int age = input.nextInt();
        
        System.out.print("\n---Summary---\n");
        System.out.print("Name:" + name + "\nAge: " + age);

        input.close();
    }
}