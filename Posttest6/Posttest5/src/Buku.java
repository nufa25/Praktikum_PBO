public class Buku extends Publikasi { 
    private String jenis;

    public Buku(String judul, String penulis, int tahunTerbit, String jenis) {
        super(judul, penulis, tahunTerbit);
        this.jenis = jenis;
    }

    @Override
    public void tampilkanSpesifik() {
        System.out.println("Jenis Buku  : " + jenis);
    }
}
