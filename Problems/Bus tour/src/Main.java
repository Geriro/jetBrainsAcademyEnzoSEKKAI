import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int numberBridges = scanner.nextInt();
        int bridgeH = 0;
        String out = "Will not crash";
        int i = 0;
        for (; i < numberBridges; i++) {

            bridgeH = scanner.nextInt();

            if (n >= bridgeH) {
                i += 1;
                out = "Will crash on bridge " + i;
                break;
            }
        }
        System.out.println(out);
    }
}