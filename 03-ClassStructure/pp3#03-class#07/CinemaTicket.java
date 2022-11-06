public class CinemaTicket {
    
    //wykaz atrybutów
    static String cinemaName="Multikino";
    String filmTitle;
    String row;
    String seat;
    double price;
    
    
    //wykaz metod
            public void displaydata()
    {
         System.out.println("Nazwa kina "+cinemaName+
         ", Tytuł filmu "+filmTitle+
         ", rząd "+row+
         ", siedzenie "+seat+
         ", cena "+price);
         
    
    };



    public static void main(String[] args) {
        CinemaTicket t1 = new CinemaTicket();
        t1.filmTitle="Film1";
        t1.row="22";
        t1.seat="3";
        t1.price=19.99;
        
        CinemaTicket t2 = new CinemaTicket();
        t2.filmTitle="Film2";
        t2.row="21";
        t2.seat="2";
        t2.price=29.99;
        
        
        
        t1.displaydata();
        t2.displaydata();
        
    };
}