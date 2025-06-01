import java.util.Scanner;

public class main07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queueLayanan07 antrian = new queueLayanan07(10);
        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN LAYANAN MAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Cek Antrian Penuh");
            System.out.println("5. Lihat Antrian Terdepan");
            System.out.println("6. Lihat Antrian Terakhir");
            System.out.println("7. Tampilkan Semua Antrian");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    antrian.enqueue(new queueMhs07(nim, nama));
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                    }
                    break;
                case 4:
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh.");
                    } else {
                        System.out.println("Antrian belum penuh.");
                    }
                    break;
                case 5:
                    antrian.peekFront();
                    break;
                case 6:
                    antrian.peekRear();
                    break;
                case 7:
                    antrian.displayQueue();
                    break;
                case 8:
                    antrian.clear();
                    break;
                case 9:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 9);
    }
}
