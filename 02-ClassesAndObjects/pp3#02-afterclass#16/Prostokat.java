public class Prostokat {
    
    //wykaz atrybutów
    int wysokosc;
    int szerokosc;
        
    
    //wykaz metod

    public void displayinfo()
    {
        System.out.println("Wymiary: "+wysokosc+"/"+szerokosc+
        " ,Obwód:  "+(wysokosc+szerokosc)+
        " ,Pole "+(wysokosc*szerokosc));
    };



    public static void main(String[] args) {
        Prostokat p1 = new Prostokat();
        p1.wysokosc=3;
        p1.szerokosc=4;
        
        Prostokat p2 = new Prostokat();
        p2.wysokosc=2;
        p2.szerokosc=7;
        
        p1.displayinfo();
        p2.displayinfo();
    };
}