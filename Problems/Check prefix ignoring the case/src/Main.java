import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mot = scanner.nextLine();
        System.out.println(mot.substring(0, 1).equalsIgnoreCase("j"));
    }
}