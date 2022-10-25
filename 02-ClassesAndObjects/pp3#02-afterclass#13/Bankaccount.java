
public class Bankaccount {
    
    //wykaz atrybutów
    String numerKonta;
    double saldo;
    String numerKarty;
    boolean isLocked;
    String wlasciciel;
    
    
    //wykaz metod
    public void addmonay()
    {
        saldo=saldo+10;
    };
    public void changelock()
    {
        isLocked = !isLocked;
    };
    
    
    public void displayinfo()
    {
        System.out.println("Właściciel "+wlasciciel+
        ",Numer konta "+numerKonta+
        "Saldo "+saldo+
        "Numer karty "+numerKarty+
        "Status karty "+isLocked);
    };


}