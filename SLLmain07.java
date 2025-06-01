import java.util.Scanner;

public class SLLmain07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        singleLinkedKist07 sll = new singleLinkedKist07();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine(); // konsumsi newline

        for (int i = 0; i < n; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            mahasiswa07 mhs = new mahasiswa07(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }

        sll.print();
    }
}
