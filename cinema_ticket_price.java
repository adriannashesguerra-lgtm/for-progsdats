/*
Start
    Input Age;
    Input Student;
    Input Weekend;

    If Age > 5
        Price = 0;
    Elsee if age >= 12
        Price = 100;
    Else if age <= 59;
        Price = 200
        If Student == 'Y'
            Price -= 30;
    Else
        Price = 120;

    If Weekend == 'Y' && Price > 0
        Price += 50;

    Display Price
    
End
*/



import java.util.Scanner;

public class cinema_ticket_price {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        
        int age, price = 0;
        String student, weekend;

        System.out.print("Age: ");
        age = in.nextInt();
        in.nextLine();
        
        System.out.print("Student? (y/n): ");
        student = in.next().charAt(0);

        System.out.print("Weekend? (y/n): ");
        weekend = in.next().charAt(0);  
        
        if (age < 5) {
            price = 0;
        } else if (age <= 12) {
            price = 100;
        } else if (age <= 59) {
            price = 200;
            if (student.equalsIgnoreCase("y")) {
                price -= 30;
            }
        } else {
            price = 120;
        }

        if (weekend.equalsIgnoreCase("y")) {
            if (price > 0) {
                price += 50;
            }
        }

        System.out.println ("Price: Php" + price);

        in.close();


    }
}