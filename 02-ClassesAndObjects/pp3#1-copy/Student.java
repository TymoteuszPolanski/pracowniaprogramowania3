public class Student {
    
    //wykaz atrybutów
    String imie;
    int wiek;
    String idCardNumber;
    boolean isValid;
    int semester;
    double average;
    
    
    //wykaz metod
    public void seyHello()
    {
        System.out.println("Hello");
    };
    public void displayName()
    {
        System.out.println("Moje imie to "+imie);
    };
    
    public void displayAge()
    {
        System.out.println("Mój wiek to "+wiek);
    };
    
    
    public void displayinfo()
    {
        System.out.println("Imie "+imie+",Numer semestru "+semester+"Średnia ocen "+average);
    };


        public void changestatus()
    {
        isValid= !isValid;
    
    };
    
            public void displaydata2()
    {
         System.out.println("Imie "+imie+", Czy ważna "
         +isValid+", Średnia ocen "+average);
         
    
    };



    public static void main(String[] args) {
        Student s1 = new Student();
        s1.imie="Tymek";
        s1.wiek=22;
        s1.idCardNumber="222733";
        s1.isValid=true;
        s1.semester=3;
        s1.average=4.06;
        
        s1.displaydata2();
        s1.changestatus();
        s1.displaydata2();
    };
}