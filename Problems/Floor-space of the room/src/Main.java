import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String form = scanner.nextLine();

        switch (form) {
            case "rectangle":
                double ar = scanner.nextDouble();
                double br = scanner.nextDouble();
                System.out.println(ar * br);
                break;

            case "triangle":
                double at = scanner.nextDouble();
                double bt = scanner.nextDouble();
                double ct = scanner.nextDouble();
                double p = (at + bt + ct) / 2;
                System.out.println(Math.sqrt(p * (p - at) * (p - bt) * (p - ct)));
                break;

            case "circle":
                double r = scanner.nextDouble();
                System.out.println(Math.pow(r, 2) * 3.14);
                break;

            default:
                System.out.println("Unknown form");
        }
    }
}