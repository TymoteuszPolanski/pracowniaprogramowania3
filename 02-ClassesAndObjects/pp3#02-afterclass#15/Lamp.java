public class Lamp {
    
    //wykaz atrybutów
    boolean isOn;

    
    
    public void displayinfo()
    {
        System.out.println(
        "Czy lampa jest włączona: "+isOn);
    };


        public void turnOn()
    {
        isOn= true;
    
    };
            public void turnOff()
    {
        isOn= false;
    
    };
    


    public static void main(String[] args) {
        Lamp l1 = new Lamp();
        l1.isOn=false;
        
        Lamp l2 = new Lamp();
        l2.isOn=true;
        
        l1.displayinfo();
        l1.turnOn();
        l1.displayinfo();
        l2.displayinfo();
        l2.turnOff();
        l2.displayinfo();
        
        
    
    };
}
