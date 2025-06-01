public class mahasiswa07 {

    String nim;
    String nama;
    String kelas;
    double ipk;

    mahasiswa07(){}

    mahasiswa07(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println(nama + " " + nim + " " + kelas + " " + ipk);
    }
}