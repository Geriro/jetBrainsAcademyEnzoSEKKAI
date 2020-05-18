import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.next();
        scanner.next();
        scanner.next();
        String cp = scanner.next();
        System.out.print("The form for " + name + " is completed. We will contact you");
        System.out.println(" if we need a chef that cooks " + cp + " dishes.");
    }
}