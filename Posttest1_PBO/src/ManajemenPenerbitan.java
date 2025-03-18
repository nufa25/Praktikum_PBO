import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenPenerbitan {
    private ArrayList<Buku> daftarBuku;
    private ArrayList<Draft> daftarDraft;
    private Scanner scanner;

    public ManajemenPenerbitan() {
        this.daftarBuku = new ArrayList<>();
        this.daftarDraft = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void tambahBuku() {
        System.out.print("Masukkan Judul Buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan Penulis: ");
        String penulis = scanner.nextLine();
        System.out.print("Masukkan ISBN: ");
        String isbn = scanner.nextLine();

        daftarBuku.add(new Buku(judul, penulis, isbn));
        System.out.println("Buku berhasil ditambahkan!");
    }

    public void lihatBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("List Buku Kosong.");
            return;
        }
        System.out.println("\n===== Daftar Buku =====");
        for (int i = 0; i < daftarBuku.size(); i++) {
            System.out.println((i + 1) + ". " + daftarBuku.get(i));
        }
    }

    public void editBuku() {
        lihatBuku();
        if (daftarBuku.isEmpty()) return;

        System.out.print("Pilih nomor buku yang ingin diedit: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 1 || index > daftarBuku.size()) {
            System.out.println("Nomor buku tidak valid!");
            return;
        }

        Buku buku = daftarBuku.get(index - 1);
        System.out.print("Masukkan Judul Baru: ");
        buku.setJudul(scanner.nextLine());
        System.out.print("Masukkan Penulis Baru: ");
        buku.setPenulis(scanner.nextLine());
        System.out.print("Masukkan ISBN Baru: ");
        buku.setIsbn(scanner.nextLine());

        System.out.println("Buku berhasil diperbarui!");
    }

    public void hapusBuku() {
        lihatBuku();
        if (daftarBuku.isEmpty()) return;

        System.out.print("Pilih nomor buku yang ingin dihapus: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 1 || index > daftarBuku.size()) {
            System.out.println("Nomor buku tidak valid!");
            return;
        }

        daftarBuku.remove(index - 1);
        System.out.println("Buku berhasil dihapus!");
    }

    public void tambahDraft() {
        System.out.print("Masukkan Judul Draft: ");
        String judul_draft = scanner.nextLine();
        System.out.print("Masukkan Nama Penulis: ");
        String penulis_draft = scanner.nextLine();
        System.out.print("Masukkan Status Draft: ");
        String status_draft = scanner.nextLine();

        daftarDraft.add(new Draft(judul_draft, penulis_draft, status_draft));
        System.out.println("Draft berhasil ditambahkan!");
    }

    public void lihatDraft() {
        if (daftarDraft.isEmpty()) {
            System.out.println("List Draft Kosong.");
            return;
        }
        System.out.println("\n===== Daftar Draft =====");
        for (int i = 0; i <  daftarDraft.size(); i++) {
            System.out.println((i + 1) + ". " +  daftarDraft.get(i));
        }
    }

    public void editDraft() {
        lihatDraft();
        if (daftarDraft.isEmpty()) return;

        System.out.print("Pilih nomor draft yang ingin diedit: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 1 || index > daftarDraft.size()) {
            System.out.println("Nomor draft tidak valid!");
            return;
        }

        Draft draft = daftarDraft.get(index - 1);
        System.out.print("Masukkan Judul Baru: ");
        draft.set_judul(scanner.nextLine());
        System.out.print("Masukkan Penulis Baru: ");
        draft.set_penulis(scanner.nextLine());
        System.out.print("Masukkan Status Baru: ");
        draft.set_status(scanner.nextLine());

        System.out.println("Draft berhasil diperbarui!");
    }

    public void hapusDraft() {
        lihatDraft();
        if (daftarDraft.isEmpty()) return;

        System.out.print("Pilih nomor draft yang ingin dihapus: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 1 || index > daftarDraft.size()) {
            System.out.println("Nomor draft tidak valid!");
            return;
        }

        daftarDraft.remove(index - 1);
        System.out.println("draft berhasil dihapus!");
    }
}
