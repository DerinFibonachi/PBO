abstract class pakaian{
    public abstract void lemari();
}
class Baju extends pakaian{
    @Override
    public void lemari() {
        System.out.println ("Baju di taruh lemari atas");
    }
}

class Celana extends pakaian{
    @Override
    public void lemari() {
        System.out.println ("Celana di taruh lemari bawah");
    }
}
public class tugas1 {
    public static void main (String[] args){
        Baju dika = new Baju();
        Celana jaka = new Celana();

        dika.lemari();
        jaka.lemari();
    }
}