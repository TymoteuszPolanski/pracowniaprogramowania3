public class Smartphone {
    
    //wykaz atrybutów
    String model;
    String marka;
    int memory;
    String phoneNumber;
    boolean isOn;
    
    
    //wykaz metod
    public void changepower()
    {
        isOn = !isOn;
    };
    public void displaymemory()
    {
        System.out.println("Pojemność pamięci telefonu to "+memory);
    };
    
    
    public void displayinfo()
    {
        System.out.println("Model "+model+",Marka "
        +marka+",Numer telefonu "+phoneNumber+ ",Czy włączony "+isOn);
    };


}
