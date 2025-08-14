import java.util.Scanner;

class MyScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int firstInt = input.nextInt();
        input.nextLine();

        System.out.println("Enter another integer:");
        int secInt = input.nextInt();
        input.nextLine();

        double div = (double)firstInt / secInt;
        System.out.println(div);
    }
}
