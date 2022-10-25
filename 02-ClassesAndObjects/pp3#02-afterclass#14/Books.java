
public class Books {
    
    String nazwa;
    String autor;
    double cena;
    String kategoria;
    boolean dostepnosc;
    
    
    public void displayinfo()
    {
        System.out.println("Nazwa książki:  "+nazwa+
        ",Autor : "+autor+
        ",cena : "+cena+
        ",kategoria : "+kategoria+
        ", dostępność : "+dostepnosc);
    };


        public void changestatus()
    {
        dostepnosc= !dostepnosc;
    
    };
    
            public void changepriceup()
    {
         cena = cena+1;
         
    
    };
    
                public void changepricedown()
    {
         cena = cena-1;
         
    
    };
    


    public static void main(String[] args) {
        Books b1 = new Books();
        b1.nazwa="Opowieści z Narnii";
        b1.autor="Kacper";
        b1.cena=12.99;
        b1.kategoria="fantastyka";
        b1.dostepnosc=true;
        
        b1.displayinfo();
        b1.changestatus();
        b1.changepriceup();
        b1.displayinfo();
        b1.changepricedown();
        b1.displayinfo();
    };
}