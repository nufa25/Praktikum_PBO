public class Buku {
    private String judul;
    private String penulis;
    private String isbn;
    
    public Buku(String judul, String penulis, String isbn) {
        this.judul = judul;
        this.penulis = penulis;
        this.isbn = isbn;
    }

    // Getter
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getIsbn() {
        return isbn;
    }

    // Setter
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void tampilkanInfo() {
        System.out.println("Judul Buku: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("ISBN: " + isbn);
    }
}
