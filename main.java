import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello Lata!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your favorite hobby: ");
        String hobby = scanner.nextLine();

        System.out.println();
        System.out.println("Nice to meet you, " + name + "!");
        System.out.println("Your favorite hobby is " + hobby + ".");
        System.out.println("Java memory is coming back slowly 😭");

        scanner.close();
    }
}