public class AplicatieSingleton {
    public static void main(String[] args) {
        NumarSingleton numarSingleton = NumarSingleton.getInstance();

        numarSingleton.setNumar(42);

        int numarValoare = numarSingleton.getNumar();
        System.out.println("Valoarea numarului este" + " " + numarValoare);;
    }
}
