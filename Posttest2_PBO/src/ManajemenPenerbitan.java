import java.util.ArrayList;
import java.util.Scanner;

class Buku {
    private String judul;
    private String penulis;
    private String isbn;

    public Buku(String judul, String penulis, String isbn) {
        this.judul = judul;
        this.penulis = penulis;
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return String.format("| %-20s | %-20s | %-12s |", judul, penulis, isbn);
    }
}

class Draft {
    private String judul;
    private String penulis;
    private String status;

    public Draft(String judul, String penulis, String status) {
        this.judul = judul;
        this.penulis = penulis;
        this.status = status;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("| %-20s | %-20s | %-10s |", judul, penulis, status);
    }
}

class ManajemenPenerbitan {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    private ArrayList<Draft> daftarDraft = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

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
            System.out.println("Tidak ada buku dalam daftar.");
            return;
        }
        System.out.println("\n===== Daftar Buku =====");
        System.out.println("--------------------------------------------------------------");
        System.out.println("| Judul Buku           | Penulis              | ISBN         |");
        System.out.println("--------------------------------------------------------------");
        for (Buku buku : daftarBuku) {
            System.out.println(buku);
        }
        System.out.println("--------------------------------------------------------------");
    }

    public void editBuku() {
        System.out.print("Masukkan ISBN buku yang ingin diedit: ");
        String isbn = scanner.nextLine();
        for (Buku buku : daftarBuku) {
            if (buku.getIsbn().equalsIgnoreCase(isbn)) {
                System.out.print("Masukkan judul baru: ");
                buku.setJudul(scanner.nextLine());
                System.out.print("Masukkan penulis baru: ");
                buku.setPenulis(scanner.nextLine());
                System.out.println("Buku berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan!");
    }

    public void hapusBuku() {
        System.out.print("Masukkan judul buku yang ingin dihapus: ");
        String judul = scanner.nextLine();
        daftarBuku.removeIf(buku -> buku.getJudul().equalsIgnoreCase(judul));
        System.out.println("Buku berhasil dihapus!");
    }

    public void tambahDraft() {
        System.out.print("Masukkan Judul Draft: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan Penulis Draft: ");
        String penulis = scanner.nextLine();
        System.out.print("Masukkan Status Draft: ");
        String status = scanner.nextLine();
        
        daftarDraft.add(new Draft(judul, penulis, status));
        System.out.println("Draft berhasil ditambahkan!");
    }

    public void lihatDraft() {
        if (daftarDraft.isEmpty()) {
            System.out.println("Tidak ada draft dalam daftar.");
            return;
        }
        System.out.println("\n===== Daftar Draft =====");
        System.out.println("--------------------------------------------------------");
        System.out.println("| Judul Draft         | Penulis              | Status    |");
        System.out.println("--------------------------------------------------------");
        for (Draft draft : daftarDraft) {
            System.out.println(draft);
        }
        System.out.println("--------------------------------------------------------");
    }

    public void editDraft() {
        System.out.print("Masukkan judul draft yang ingin diedit: ");
        String judul = scanner.nextLine();
        for (Draft draft : daftarDraft) {
            if (draft.getJudul().equalsIgnoreCase(judul)) {
                System.out.print("Masukkan penulis baru: ");
                draft.setPenulis(scanner.nextLine());
                System.out.print("Masukkan status baru: ");
                draft.setStatus(scanner.nextLine());
                System.out.println("Draft berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Draft tidak ditemukan!");
    }

    public void hapusDraft() {
        System.out.print("Masukkan judul draft yang ingin dihapus: ");
        String judul = scanner.nextLine();
        daftarDraft.removeIf(draft -> draft.getJudul().equalsIgnoreCase(judul));
        System.out.println("Draft berhasil dihapus!");
    }
}