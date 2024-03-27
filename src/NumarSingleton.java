public class NumarSingleton {
    private static NumarSingleton instance;
    private int numar;

    private NumarSingleton() {
        numar = 0;

    }

    public static NumarSingleton getInstance() {
        if(instance == null) {
            instance = new NumarSingleton();
        }
        return instance;
    }

    public void setNumar(int numar){
        this.numar = numar;
    }

    public int getNumar(){
        return numar;
    }



}

