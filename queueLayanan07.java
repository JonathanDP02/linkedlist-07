public class queueLayanan07 {
    private nodeSLL07 front, rear;
    private int size;
    private int maxSize;

    public queueLayanan07(int maxSize) {
        this.front = this.rear = null;
        this.size = 0;
        this.maxSize = maxSize;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public void enqueue(queueMhs07 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        nodeSLL07 newNode = new nodeSLL07(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.print("Memanggil: ");
        front.data.tampil();
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Antrian terdepan: ");
            front.data.tampil();
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Antrian paling akhir: ");
            rear.data.tampil();
        }
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Tidak ada mahasiswa dalam antrian.");
            return;
        }
        nodeSLL07 temp = front;
        System.out.println("Daftar antrian:");
        while (temp != null) {
            temp.data.tampil();
            temp = temp.next;
        }
        System.out.println("Total: " + size + " mahasiswa");
    }

    public int getSize() {
        return size;
    }
}
