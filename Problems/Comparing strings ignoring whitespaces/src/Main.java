import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mot1 = scanner.nextLine().trim();
        String mot2 = scanner.nextLine().trim();

        //mot1 = first.replaceAll(" ", "");
        //mot2 = second.replaceAll(" ", "");
        //System.out.println(mot1.equals(mot2));

        String mot3 = sansespace(mot1);
        String mot4 = sansespace(mot2);



        System.out.println(mot3.equals(mot4));
    }
    public static String sansespace(String mot) {
        String motfi = "";
        for (int i = 0; i < mot.length(); i++) {
            if (mot.charAt(i) != ' ') {
                motfi += mot.charAt(i);
            }
        }

        return motfi;
    }
}