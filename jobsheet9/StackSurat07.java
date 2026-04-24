package jobsheet9;

public class StackSurat07 {
    Surat07[] stack;
    int top;
    int size;

    public StackSurat07(int size) {
        this.size = size;
        stack = new Surat07[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat07 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack surat penuh!");
        }
    }

    public Surat07 pop() {
        if (!isEmpty()) {
            Surat07 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Tidak ada surat yang diproses.");
            return null;
        }
    }

    public Surat07 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;

        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                System.out.println("ID Surat      : " + stack[i].idSurat);
                System.out.println("Nama Mahasiswa: " + stack[i].namaMahasiswa);
                System.out.println("Kelas         : " + stack[i].kelas);
                System.out.println("Jenis Izin    : " + stack[i].jenisIzin);
                System.out.println("Durasi        : " + stack[i].durasi + " hari");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Surat tidak ditemukan.");
        }
    }
}