import java.util.Scanner;

public class Bin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("zadej cislo");
        int a = sc.nextInt();

        System.out.println(Integer.toString(a, 2));

        }
    }

