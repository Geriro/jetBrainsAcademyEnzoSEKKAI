import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mot = scanner.next();
        String motFinal = "";
        for (int i = 0; i < mot.length(); i++) {
            if (mot.charAt(i) == 'a') {
                motFinal += 'b';
            } else {
                motFinal += mot.charAt(i);
            }
        }
        System.out.println(motFinal);
    }
}