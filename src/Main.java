public class Main {
    public static void main(String[] args) {
        Student student = new Student("Mihai", 21);
        Adresa adresa = new Adresa("Bucuresti", "Strada Vlaicu Voda");

        System.out.println("Informatii despre student:");
        student.AfiseazaInformatii();

        student.setNume("Mihaela");
        student.setVarsta(20);

        System.out.println("\nInformatii actualizate despre student:");
        adresa.AfiseazaInformatii();



    }
}
