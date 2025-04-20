public abstract class Publikasi {
    protected String judul;
    protected String penulis;
    protected final int tahunTerbit;

    public Publikasi(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public final void tampilkanInfo() {
        System.out.println("Judul       : " + judul);
        System.out.println("Penulis     : " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        tampilkanSpesifik();
    }

    public abstract void tampilkanSpesifik();
}
