import java.util.Scanner;
public class Pdemo001 {
    Scanner sc = new Scanner(System.in);
    String customerName() {
        System.out.println("Enter your name: ");
        String name = sc.next();
        return name;
    }
    String accno() {
        System.out.println("Enter your accno: ");
        String accno = sc.next();
        return accno;
    }
    String balance() {
        System.out.println("Balance: ");
        String bal = sc.next();
        return bal;
    }

    public static void main(String[] args) {
        Pdemo001 obj = new Pdemo001();
        String name = obj.customerName();
        String accno = obj.accno();
        String bal = obj.balance();
        System.out.println("The name of the customer is: "+name);
        System.out.println("The accno provided: "+accno);
        System.out.println("The balance amount: "+bal);
    }
}