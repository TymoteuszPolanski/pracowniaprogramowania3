public class Counter {
    
    //wykaz atrybutów
    int wartosc;
    
    

        public void changeup1()
    {
        wartosc+=1;
    
    };
            public void changedown1()
    {
        wartosc-=1;
    
    };
            public void changeup10()
    {
        wartosc+=10;
    
    };
            public void changedown10()
    {
        wartosc-=10;
    
    };
            public void reset()
    {
        wartosc=0;
    
    };
            public void show()
    {
        System.out.println("Wartość: "+wartosc);
    
    };






    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.wartosc=0;
        
        c1.changeup10();
        c1.changeup10();
        c1.changeup1();
        c1.changeup1();
        c1.changeup1();
        c1.show();
        c1.reset();
        c1.show();
        
        Counter c2 = new Counter();
        c2.wartosc=0;
        c2.changedown10();
        c2.changedown10();
        c2.changedown10();
        c2.changedown10();
        c2.changedown10();
        c2.changeup1();
        c2.changeup1();
        c2.changeup1();
        c2.show();
        c2.reset();
        c2.show();
        
    };
}