import java.util.Scanner;

public class SLLmain07 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // singleLinkedKist07 sll = new singleLinkedKist07();

        // System.out.print("Masukkan jumlah mahasiswa: ");
        // int n = sc.nextInt();
        // sc.nextLine(); // konsumsi newline

        // for (int i = 0; i < n; i++) {
        //     System.out.println("Data Mahasiswa ke-" + (i + 1));
        //     System.out.print("NIM: ");
        //     String nim = sc.nextLine();
        //     System.out.print("Nama: ");
        //     String nama = sc.nextLine();
        //     System.out.print("Kelas: ");
        //     String kelas = sc.nextLine();
        //     System.out.print("IPK: ");
        //     double ipk = sc.nextDouble();
        //     sc.nextLine();

        //     mahasiswa07 mhs = new mahasiswa07(nim, nama, kelas, ipk);
        //     sll.addLast(mhs);
        // }

        // sll.print();

        singleLinkedKist07 sll = new singleLinkedKist07();
        mahasiswa07 mhs1 = new mahasiswa07("123", "Jon", "1A", 3.5);
        mahasiswa07 mhs2 = new mahasiswa07("456", "Nathan", "2B", 3.8);
        mahasiswa07 mhs3 = new mahasiswa07("789", "Dwi", "2C", 3.2);
        mahasiswa07 mhs4 = new mahasiswa07("101", "Pangestu", "1D", 3.9);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Diana", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Nathan"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
