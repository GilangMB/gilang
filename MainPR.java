/*
Catatan : Jika didownload dan dijalankan, (PR) pada nama file dihapus agar bisa dijalankan
*/

class kost {
 String alamat_kost ;
 String properti_kost ;
 int biaya_kost ;

 void setKost(String newAlamatKost, String newPropertiKost, int newBiayaKost ) {
 this.alamat_kost = newAlamatKost;
 this.properti_kost = newPropertiKost ;
 this.biaya_kost = newBiayaKost;
 }

 String getAlamat(){
 return alamat_kost ;
 }
 String getProperti(){
 return properti_kost;
 }
 int getBiaya(){
 return biaya_kost;
 }
 void disewa (int lamaDisewa) {
 this.biaya_kost = biaya_kost * lamaDisewa ;
 }

}
class penyewa {
 String identitas_penyewa ;
 int dana_penyewa ; 

 void setPenyewa(String newIdentitasPenyewa, int newDanaPenyewa){
 this.identitas_penyewa = newIdentitasPenyewa ;
 this.dana_penyewa = newDanaPenyewa;

 }

 String getPenyewa() {
 return identitas_penyewa;
 }
 int getDanaPenyewa(){
 return dana_penyewa;
 }
 void SewaKost (String Alamat) {
 System.out.println(this.identitas_penyewa+" menyewa kamar kost di "+Alamat);

 }
}
public class Main {
 public static void main(String[] args) {
 kost kost1 = new kost();
 kost1.setKost("Jl. Jawa 7", "Kamar mandi dalam,kasur,tv, ac", 2000000);


 penyewa penyewa1 = new penyewa();
 penyewa1.setPenyewa("Gilang", 2000000);

 System.out.println("=====Data kost adalah=====");
 System.out.println("Alamat kost: "+kost1.getAlamat());
 System.out.println("Properti kost: "+kost1.getProperti());
 System.out.println("Biaya sewa: "+kost1.getBiaya());

 System.out.println("=====Identitas Penyewa=====");
 System.out.println("Nama Penyewa: "+penyewa1.getPenyewa());
 System.out.println("Dana Penyewa: "+penyewa1.getDanaPenyewa());

 penyewa1.SewaKost(kost1.getAlamat());
 kost1.disewa(3);

 System.out.println("Biaya yang harus dibayar: "+kost1.getBiaya());

 }
 }
