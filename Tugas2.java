abstract class Pakaian{
    private String Merk;
    Pakaian(String Merk){
        this.Merk = Merk;
    }
    public String getMerk() {
        return Merk;
    }
    public void setMerk(String merk) {
        this.Merk = Merk;
    }
    public abstract void lemari();
    public abstract String getType();
    public void display(){
        System.out.print(getType() + " Merk " + this.Merk);
        lemari();
    }
}
class Baju extends Pakaian{
    private String Type;
    Baju(String Merk,String Type){
        super(Merk);
        this.Type = Type;
    }
    @Override
    public String getType(){
        return Type;
    }
    public void setType(){
        this.Type = Type;
    }
    public void lemari() {
        System.out.println (" di taruh lemari atas");
    }
}

class Celana extends Pakaian{
    private String Type;
    Celana(String Merk,String Type){
        super(Merk);
        this.Type = Type;
    }
    public String getType(){
        return Type;
    }
    public void setType(){
        this.Type = Type;
    }
    public void lemari() {
        System.out.println (" di taruh lemari bawah");
    }
}
public class Tugas2 {
    public static void main (String[] args){
        Baju Kaos = new Baju("Gucci","Kaos");
        Celana Panjang = new Celana("Chino","Panjang");

        Kaos.display();
        Panjang.display();
        System.gc();
    }
}