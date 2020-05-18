import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mot = scanner.next();
        int chif1 = scanner.nextInt();
        int chif2 = scanner.nextInt();
        System.out.println(mot.substring(chif1, chif2 + 1));
    }
}