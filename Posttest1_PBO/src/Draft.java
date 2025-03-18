public class Draft {
    private String judul_draft;
    private String penulis_draft;
    private String status_draft;

    public Draft(String Judul, String Penulis, String Status) {
        this.judul_draft = Judul;
        this.penulis_draft = Penulis;
        this.status_draft = Status;
    }

    public String get_judul() {
        return judul_draft;
    }

    public void set_judul(String Judul) {
        this.judul_draft = Judul;
    }

    public String get_penulis() {
        return penulis_draft;
    }

    public void set_penulis (String Penulis) {
        this.penulis_draft = Penulis;
    }

    public String get_status() {
        return status_draft;
    }

    public void set_status(String Status) {
        this.status_draft = Status;
    }

    @Override
    public String toString() {
        return "Judul: " + judul_draft + ", Penulis: " + penulis_draft + ", Status: " + status_draft;
    }
}
