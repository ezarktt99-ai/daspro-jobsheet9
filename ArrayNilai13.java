import java.util.Scanner;

public class ArrayNilai13 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        int jmllulus = 0;
        int jmlTidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
                jmllulus++;
            } else {
                System.out.println("mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (TIDAK LULUS)");
                jmlTidakLulus++;
            }
        }

        System.out.println("Jumlah mahasiswa yang lulus     : " + jmllulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jmlTidakLulus);

        input.close();
    }
}