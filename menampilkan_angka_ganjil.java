public class menampilkan_angka_ganjil {
    public static void main(String[] ars) {
        int angka[]  = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("\t Tentukan bilangan ganjil & genap data Array \n\n");
        System.out.println("\n Bilangan genap : ");
        for ( int i = 0; i < 14; i++){
            if (angka[i] % 2 == 0) {
                System.out.print(angka[i] + ",");

            }
        }
        System.out.println("\n bilangan ganjil : ");
        for (int j = 0; j< 14; j++){
            if (angka [j] % 2 != 0){
                System.out.println( angka[j] + ",");
            }
        }

    }
}
