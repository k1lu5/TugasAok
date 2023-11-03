package tugasaok;
import java.util.*;
import java.lang.*;
import java.text.*;
public class TugasAok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00000000");
        while(true){
        System.out.println("=".repeat(43));
        System.out.println("Ini adalah program untuk mengkonversi angka");
        System.out.println("1. Biner ke Desimal");
        System.out.println("2. Desimal ke Biner");
        System.out.println("3. Biner ke Hexa");
        System.out.println("4. Hexa ke Biner");
        System.out.println("5. Desimal ke Hexa");
        System.out.println("6. Hexa ke Desimal");
        System.out.println("9. Exit");
        System.out.print("Masukkan pilihan anda: ");
        int pilihan = sc.nextInt();
            if(pilihan==1){
                System.out.print("Masukkan angka (Biner): ");
                int biner = sc.nextInt();
                int desimal = 0;
                int satu = 1;
                while (biner > 0) {
                int nilai = biner % 10;
                desimal += nilai * satu;
                satu *= 2;
                biner /= 10;
                }
            System.out.println("Hasil konversi ke desimal: " + desimal);
            }
            else if(pilihan==2){
                System.out.print("Masukkan angka (Desimal): ");
                int desimal = sc.nextInt();
                String biner = Integer.toBinaryString(desimal);
                System.out.println("Hasil: "+biner);

            }
            else if(pilihan==3){
                System.out.print("Masukkan angka (Biner): ");
                String biner =sc.next();
                int desimal = Integer.parseInt(biner);
                String heksadesimal = Integer.toHexString(desimal).toUpperCase();
                System.out.println("Hasil konversi ke heksadesimal: " +heksadesimal);
                
        } 
            else if(pilihan==4){
                System.out.print("Masukkan angka (Hexa): ");
                String heksa = sc.next();
                try {
                // Mengonversi heksadesimal ke bilangan bulat
                int decimal = Integer.parseInt(heksa, 16);
                // Mengonversi bilangan bulat ke biner
                String biner = Integer.toBinaryString(decimal);
                System.out.println("Hasil konversi: " + biner);
                }   
                catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Pastikan Anda memasukkan angka heksadesimal yang benar.");
        }
    }
            else if(pilihan==5){
                System.out.print("Masukkan angka (Desimal): ");
                int desimal = sc.nextInt();
                String heksa = Integer.toHexString(desimal);
                System.out.println("Hasil konversi: "+heksa.toUpperCase());
            }
            else if(pilihan==6){
                System.out.print("Masukkan angka (HeksaDesimal): ");
                String heksa = sc.next();
                int desimal = Integer.parseInt(heksa,16);
                System.out.println("Hasil konversi: "+desimal);
            }
            else if(pilihan==9){
                break;
            } 
            else if(pilihan!=1||pilihan!=2||pilihan!=3||pilihan!=4||pilihan!=5||pilihan!=6||pilihan!=9){
                System.out.println("PILIHAN TIDAK TERSEDIA");
            }                
}
        System.out.println("=".repeat(43));
}
}
  
