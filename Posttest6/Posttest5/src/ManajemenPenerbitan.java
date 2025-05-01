import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenPenerbitan implements KelolaPublikasi {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    private ArrayList<Draft> daftarDraft = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    private static int totalPublikasi = 0;

    @Override
    public void tambah() {
        tambahBuku();
    }

    @Override
    public void lihat() {
        lihatBuku();
    }

    public void tambahBuku() {
        try {
            System.out.print("Masukkan Judul Buku: ");
            String judul = scanner.nextLine();
            System.out.print("Masukkan Penulis: ");
            String penulis = scanner.nextLine();
            System.out.print("Masukkan Tahun Terbit: ");
            int tahun = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Masukkan Jenis Buku (fiksi/nonfiksi): ");
            String jenis = scanner.nextLine();

            Buku buku = new Buku(judul, penulis, tahun, jenis);
            daftarBuku.add(buku);
            totalPublikasi++;
            System.out.println("Buku berhasil ditambahkan!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat menambahkan buku: " + e.getMessage());
            scanner.nextLine();
        }
    }

    public void tambahBuku(String judul, String penulis, int tahun, String jenis) {
        Buku buku = new Buku(judul, penulis, tahun, jenis);
        daftarBuku.add(buku);
        totalPublikasi++;
    }

    public void lihatBuku() {
        System.out.println("===== Daftar Buku =====");
        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada buku yang ditambahkan.");
        } else {
            for (int i = 0; i < daftarBuku.size(); i++) {
                System.out.println("\nBuku ke-" + (i + 1));
                daftarBuku.get(i).tampilkanInfo();
            }
        }
    }

    public void editBuku() {
        try {
            System.out.print("Pilih nomor buku yang ingin diedit: ");
            int indeks = scanner.nextInt();
            scanner.nextLine();
            if (indeks <= 0 || indeks > daftarBuku.size()) {
                System.out.println("Nomor tidak valid.");
                return;
            }

            System.out.print("Masukkan Judul Baru: ");
            String judul = scanner.nextLine();
            System.out.print("Masukkan Penulis Baru: ");
            String penulis = scanner.nextLine();
            System.out.print("Masukkan Tahun Terbit Baru: ");
            int tahun = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Masukkan Jenis Baru: ");
            String jenis = scanner.nextLine();

            daftarBuku.set(indeks - 1, new Buku(judul, penulis, tahun, jenis));
            System.out.println("Buku berhasil diperbarui!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat mengedit buku: " + e.getMessage());
            scanner.nextLine();
        }
    }

    public void hapusBuku() {
        try {
            System.out.print("Pilih nomor buku yang ingin dihapus: ");
            int indeks = scanner.nextInt();
            scanner.nextLine();
            if (indeks <= 0 || indeks > daftarBuku.size()) {
                System.out.println("Nomor tidak valid.");
                return;
            }
            daftarBuku.remove(indeks - 1);
            totalPublikasi--;
            System.out.println("Buku berhasil dihapus!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat menghapus buku: " + e.getMessage());
            scanner.nextLine();
        }
    }

    public void tambahDraft() {
        try {
            System.out.print("Masukkan Judul Draft: ");
            String judul = scanner.nextLine();
            System.out.print("Masukkan Penulis: ");
            String penulis = scanner.nextLine();
            System.out.print("Masukkan Tahun Pengajuan: ");
            int tahun = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Masukkan Status Draft: ");
            String status = scanner.nextLine();

            Draft draft = new Draft(judul, penulis, tahun, status);
            daftarDraft.add(draft);
            totalPublikasi++;
            System.out.println("Draft berhasil ditambahkan!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat menambahkan draft: " + e.getMessage());
            scanner.nextLine();
        }
    }

    public void tambahDraft(String judul, String penulis, int tahun, String status) {
        Draft draft = new Draft(judul, penulis, tahun, status);
        daftarDraft.add(draft);
        totalPublikasi++;
    }

    public void lihatDraft() {
        System.out.println("===== Daftar Draft =====");
        if (daftarDraft.isEmpty()) {
            System.out.println("Belum ada draft yang ditambahkan.");
        } else {
            for (int i = 0; i < daftarDraft.size(); i++) {
                System.out.println("\nDraft ke-" + (i + 1));
                daftarDraft.get(i).tampilkanInfo();
            }
        }
    }

    public void editDraft() {
        try {
            System.out.print("Pilih nomor draft yang ingin diedit: ");
            int indeks = scanner.nextInt();
            scanner.nextLine();
            if (indeks <= 0 || indeks > daftarDraft.size()) {
                System.out.println("Nomor tidak valid.");
                return;
            }

            System.out.print("Masukkan Judul Baru: ");
            String judul = scanner.nextLine();
            System.out.print("Masukkan Penulis Baru: ");
            String penulis = scanner.nextLine();
            System.out.print("Masukkan Tahun Pengajuan Baru: ");
            int tahun = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Masukkan Status Baru: ");
            String status = scanner.nextLine();

            daftarDraft.set(indeks - 1, new Draft(judul, penulis, tahun, status));
            System.out.println("Draft berhasil diperbarui!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat mengedit draft: " + e.getMessage());
            scanner.nextLine();
        }
    }

    public void hapusDraft() {
        try {
            System.out.print("Pilih nomor draft yang ingin dihapus: ");
            int indeks = scanner.nextInt();
            scanner.nextLine();
            if (indeks <= 0 || indeks > daftarDraft.size()) {
                System.out.println("Nomor tidak valid.");
                return;
            }
            daftarDraft.remove(indeks - 1);
            totalPublikasi--;
            System.out.println("Draft berhasil dihapus!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat menghapus draft: " + e.getMessage());
            scanner.nextLine();
        }
    }

    public static void tampilkanTotalPublikasi() {
        System.out.println("Total publikasi (Buku + Draft) saat ini: " + totalPublikasi);
    }
}
