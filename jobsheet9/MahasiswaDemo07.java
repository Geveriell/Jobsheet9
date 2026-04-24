package jobsheet9;

import java.util.Scanner;

public class MahasiswaDemo07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackTugasMahasiswa07 stack = new StackTugasMahasiswa07(5);

        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Jumlah Tugas");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();

                    System.out.print("NIM: ");
                    String nim = scan.nextLine();

                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();

                    Mahasiswa07 mhs = new Mahasiswa07(nama, nim, kelas);
                    stack.push(mhs);

                    System.out.println("Tugas berhasil dikumpulkan!");
                    break;

                case 2:
                    Mahasiswa07 dinilai = stack.pop();

                    if (dinilai != null) {
                        System.out.print("Masukkan nilai: ");
                        int nilai = scan.nextInt();

                        dinilai.tugasDinilai(nilai);

                        System.out.println("Nilai biner: " +
                                stack.konversiDesimalKeBiner(nilai));
                    }
                    break;

                case 3:
                    Mahasiswa07 atas = stack.peek();

                    if (atas != null) {
                        System.out.println(
                                "Tugas teratas milik: " + atas.nama
                        );
                    }
                    break;

                case 4:
                    stack.print();
                    break;

                case 5:
                    Mahasiswa07 bawah = stack.lihatTugasTerbawah();

                    if (bawah != null) {
                        System.out.println(
                                "Tugas pertama dikumpulkan oleh: " + bawah.nama
                        );
                    }
                    break;

                case 6:
                    System.out.println(
                            "Jumlah tugas saat ini: " + stack.jumlahTugas()
                    );
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);
    }
}