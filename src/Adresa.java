public final class Adresa {
    private final String oras;
    private final String strada;

    public Adresa(String oras, String strada) {
        this.oras = oras;
        this.strada = strada;
    }

    public String getOras() {
        return oras;
    }

    public String getStrada() {
        return strada;
    }

    public void AfiseazaInformatii(){
        System.out.println("Adresa:" + strada + ", " + oras);
    }

}
