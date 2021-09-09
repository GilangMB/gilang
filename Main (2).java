/*
Catatan : Jika file didownload, (2) pada nama file dihapus dahulu
*/

public class Main {
    public static void main(String[] args) {
        int angka[] = { 1, 2, 5, 7, 8, 9, 12 };
        int kunci = 9;
        int index = angka.length / 2;
        boolean ditemukan = false;
        int tengah = index;

        while (index >= 0 && index < angka.length && ditemukan == false) {
            if (kunci == angka[index]) {
                System.out.println("Data ditemukan pada index ke-" + index);
                ditemukan = true;
            } else {
                if (kunci < angka[tengah]) {
                    index--;
                } else {
                    index++;
                }
            }
        }
        if (ditemukan == false) {
            System.out.println("Data tidak ditemukan");
        }
    }
}