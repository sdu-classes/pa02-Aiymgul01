import java.util.Scanner;
public class Main3 {
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        String name = scan.next();
        String address = scan.next();
        String program = scan.next();
        int year = scan.nextInt();
        double fee = scan.nextDouble();
        String school = scan.next();
        double pay = scan.nextDouble();
        Person p = new Person(name,address);
        Student1 s = new Student1(name, address, program, year, fee);
        System.out.println(p);
        System.out.println(s);
        Staff st = new Staff(name, address, school, pay);
        System.out.println(st);

    }
}
