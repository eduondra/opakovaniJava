import java.util.Scanner;

public class Cara {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cislo = sc.nextInt();

        for(int i = 0; i < cislo; i++) {
            System.out.print('.');
        }
    }
}
