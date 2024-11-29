import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nbr, average = 0, x = 0;

        System.out.print("Sayı giriniz => ");
        nbr = scan.nextInt();

        int i;
        for (i = 1; i <= nbr; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                average += i;
                x++;
            }
        }

        System.out.println(average/x);

    }
}
