import java.util.Scanner;

public class tugas213 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
        
        System.out.println("DAFTAR MENU: ");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
        
        System.out.print("\nCari menu makanan/minuman: ");
        String cariMenu = input.nextLine();
        boolean ditemukan = false;
        int hargaCari = 0;
        
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                ditemukan = true;
                hargaCari = harga[i];
                break;
            }
        }
        
        if (ditemukan) {
            System.out.println("Menu \"" + cariMenu + "\" tersedia dengan harga Rp " + hargaCari);
        } else {
            System.out.println("Mohon maaf, menu \"" + cariMenu + "\" tidak tersedia.");
        }
        
        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jmlPesanan = input.nextInt();
        input.nextLine(); 
        
        String[] pesanan = new String[jmlPesanan];
        int[] hargaPesanan = new int[jmlPesanan];
        int totalBiaya = 0;
        
        for (int i = 0; i < jmlPesanan; i++) {
            boolean valid = false;
            while (!valid) {
                System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
                String namaPesanan = input.nextLine();
                
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaPesanan)) {
                        pesanan[i] = menu[j];
                        hargaPesanan[i] = harga[j];
                        totalBiaya += harga[j];
                        valid = true;
                        break;
                    }
                }
                
                if (!valid) {
                    System.out.println("Menu tidak valid/tidak ada di daftar. Silakan masukkan ulang.");
                }
            }
        }
        
        System.out.println("\nDaftar Pesanan Anda:");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + " \t- Rp " + hargaPesanan[i]);
        }
        System.out.println("\nTotal Biaya Keseluruhan : Rp " + totalBiaya);
        
        input.close();
    }
}
