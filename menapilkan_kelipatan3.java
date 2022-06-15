public class menapilkan_kelipatan3 {
    public static void main(String[] args) {
        int array [] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println( " menampilkan angka-angka kelipatan 3  didalam array");
        System.out.println( "82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3");
        System.out.println("\n");

        for (int i = 0; i<= array.length-1; i++){

        }

        System.out.println( " angka-angka kelipatan 3 array adalah :");
        for(int i = 0; i< array.length; i++){
           if (array [i] % 3 == 0) {
               System.out.println( array[i] + "");
           }
        }

    }
}
