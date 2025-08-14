import java.util.Scanner;

class MyScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter movie rating:");
        double movie = input.nextDouble();
        input.nextLine();

        int finalRating = (int)(movie + 0.5);
        System.out.println("Rating rounded: " + finalRating);
    }
}
