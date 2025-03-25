import java.util.Scanner;

public class Main {
    private static final String PASSWORD = "Nufa066";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajemenPenerbitan sistem = new ManajemenPenerbitan();

        System.out.println("===== Selamat Datang di Sistem Manajemen Penerbitan Buku InPublisher =====");
        while (true) {
            System.out.print("Masukkan Password: ");
            String inputPassword = scanner.nextLine();
            if (inputPassword.equals(PASSWORD)) {
                System.out.println("Login Berhasil!\n");
                break;
            } else {
                System.out.println("Password salah! Coba lagi.\n");
            }
        }

        while (true) {
            System.out.println("\n===== Menu Utama =====");
            System.out.println("1. Manajemen Buku");
            System.out.println("2. Manajemen Draft");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                menuBuku(sistem, scanner);
            } else if (pilihan == 2) {
                menuDraft(sistem, scanner);
            } else if (pilihan == 3) {
                System.out.println("Terima kasih telah menggunakan Sistem InPublisher!");
                scanner.close();
                return;
            } else {
                System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
    }

    private static void menuBuku(ManajemenPenerbitan sistem, Scanner scanner) {
        while (true) {
            System.out.println("\n===== Manajemen Buku =====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Daftar Buku");
            System.out.println("3. Edit Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                sistem.tambahBuku();
            } else if (pilihan == 2) {
                sistem.lihatBuku();
            } else if (pilihan == 3) {
                sistem.lihatBuku();
                sistem.editBuku();
            } else if (pilihan == 4) {
                sistem.lihatBuku();
                sistem.hapusBuku();
            } else if (pilihan == 5) {
                return;
            } else {
                System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
    }

    private static void menuDraft(ManajemenPenerbitan sistem, Scanner scanner) {
        while (true) {
            System.out.println("\n===== Manajemen Draft =====");
            System.out.println("1. Tambah Draft");
            System.out.println("2. Lihat Daftar Draft");
            System.out.println("3. Edit Draft");
            System.out.println("4. Hapus Draft");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                sistem.tambahDraft();
            } else if (pilihan == 2) {
                sistem.lihatDraft();
            } else if (pilihan == 3) {
                sistem.lihatDraft();
                sistem.editDraft();
            } else if (pilihan == 4) {
                sistem.lihatDraft();
                sistem.hapusDraft();
            } else if (pilihan == 5) {
                return;
            } else {
                System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
    }
}