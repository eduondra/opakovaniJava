import java.util.Scanner;

public class CiselnyVzor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cislo = sc.nextLine();

        for (int i = 0; i < cislo.length(); i++) {
            System.out.println(cislo.substring(0, cislo.length() - i));
        }
    }
}
