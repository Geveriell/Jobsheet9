package jobsheet9;

public class StackTugasMahasiswa07 {
    Mahasiswa07[] stack;
    int size;
    int top;

    public StackTugasMahasiswa07(int size) {
        this.size = size;
        stack = new Mahasiswa07[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa07 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Mahasiswa07 pop() {
        if (!isEmpty()) {
            Mahasiswa07 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Mahasiswa07 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Belum ada tugas.");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(
                        stack[i].nama + " - " +
                        stack[i].nim + " - " +
                        stack[i].kelas
                );
            }
        }
    }

    public Mahasiswa07 lihatTugasTerbawah() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public int jumlahTugas() {
        return top + 1;
    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi07 stackBiner = new StackKonversi07();

        while (nilai > 0) {
            int sisa = nilai % 2;
            stackBiner.push(sisa);
            nilai = nilai / 2;
        }

        String hasil = "";

        while (!stackBiner.isEmpty()) {
            hasil += stackBiner.pop();
        }

        return hasil;
    }
}