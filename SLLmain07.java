public class SLLmain07 {
    public static void main(String[] args) {
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
    }
}
