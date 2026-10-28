import java.util.Scanner;

public class Tugas1_14{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai n = ");
        int n = sc.nextInt();

        int totalAngkaTercetak = 0;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
                totalAngkaTercetak++;
            }
            System.out.println();
        }
        
        System.out.println("Total angka tercetak : " + totalAngkaTercetak);

        sc.close();
    }
}