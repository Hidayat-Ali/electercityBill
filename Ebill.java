import java.util.Scanner;

public class Ebill {

    public static void main(String args[]) {
        CustomerData cd = new CustomerData();
        cd.getData();
        cd.calc();
        cd.display();

    }
}

class CustomerData {
    int units, cn, current, previous;

    double tbill;
    String cname, type;
    Scanner sc = new Scanner(System.in);
    Scanner scs = new Scanner(System.in);

    void getData() {
        System.out.println("Enter the consumer number ");
        cn = sc.nextInt();
        System.out.println("Enter the consumer name ");
        cname = scs.nextLine();
        System.out.println("Enter the consumer type *** D for domestic AND C for commercial ");
        type = scs.nextLine();
        System.out.println("enter the current Month reading");
        current = sc.nextInt();
        System.out.println("Enter the previous month Reading  ");
        previous = sc.nextInt();

    }

    void calc() {
        if (type.equals("D")) {
            units = current - previous;
            if (units <= 100) {
                tbill = 2 * units;

            } else if (units >= 100 && units <= 200) {
                tbill = 4 * units;

            } else {
                tbill = 6 * units;
            }
        } else {
            if (units <= 100) {
                tbill = 3 * units;
            } else if (units >= 100 && units <= 200) {
                tbill = 5 * units;

            } else {
                tbill = 7 * units;
            }

        }

    }

    void display(){
        System.out.println("**************** Electercity Bill ***************");
        System.out.println("consumer Number : " + cn);
        System.out.println("consumer name : " + cname);
        System.out.println("previous month reading" + previous);
        System.out.println("current month reading" + current);
        System.out.println("Total Bill is : " + tbill);




    }

}
