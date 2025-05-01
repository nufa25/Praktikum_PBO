public class Draft extends Publikasi {
    private String status;

    public Draft(String judul, String penulis, int tahunTerbit, String status) {
        super(judul, penulis, tahunTerbit);
        this.status = status;
    }

    @Override
    public void tampilkanSpesifik() {
        System.out.println("Status Draft: " + status);
    }
}
