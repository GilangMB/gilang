/*
Catatan : Jika didownload dan dijalankan, (1) pada nama file dihapus agar bisa dijalankan
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] knight = { 2, 1, 8, 5 };
        int[] dragon = { 7, 2 };
        Arrays.sort(knight);
        Arrays.sort(dragon);
        int indeksDragon = 0;
        int power = 0;
        for (int x : knight) {
            if (indeksDragon < dragon.length) {
                if (x >= dragon[indeksDragon]) {
                    power += x;
                    indeksDragon++;
                }
            }
        }
        if (indeksDragon == dragon.length) {
            System.out.println("Minimum Power : " + power);
        } else {
            System.out.println("Knight Fall");
        }
    }
}