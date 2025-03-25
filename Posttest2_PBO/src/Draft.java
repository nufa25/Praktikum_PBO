public class Draft {
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

    public String getPenulis() {
        return penulis;
    }

    public String getStatus() {
        return status;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void tampilkanInfo() {
        System.out.println("Judul Draft: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Status: " + status);
    }
}
