import java.util.Scanner;

public class mencari_sebuah_angka {
 public static void main(String[] args) {
     int[] data = {
             82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

    Scanner scan = new Scanner(System.in);
    System.out.println("MASUKAN ANGKA : ");
    int angka = scan.nextInt();
     int jumlah = 0;
     for (int x : data) {
         if (x == angka) {
             jumlah += 1;
         }
     }
     if (jumlah == 0) {
         System.out.println("angka" + angka + "tidak ada");
     } else {
         System.out.println("angka" + angka + "ada sebanyak" + jumlah);
     }
 }
}
