/*
Nomor 1
*/
import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Masukkan angka:");
            int angka = input.nextInt();
            boolean Main = true;

            for (int index = 2; index <= angka / 2; index++) {
                if (angka % index == 0) {
                    Main = false;
                    break;

                }
            }

            if (Main && ((angka > 0) && (angka != 1)))
                System.out.println(angka + " adalah bilangan prima");
            else
                System.out.println(angka + " bukan bilangan prima");

            input.close();

        }
    }
}



