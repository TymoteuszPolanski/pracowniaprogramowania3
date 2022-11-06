public class CinemaTicket {
    
    //wykaz atrybutów
    static String cinemaName="Multikino";
    String filmTitle;
    String row;
    String seat;
    double price;
    
    
    //wykaz metod
    public CinemaTicket(String t,String r,String s)
    {
        filmTitle =t;
        row = r;
        seat = s;
        if(Integer.parseInt(r)<=2){
            price = 10;
        } else {
            price = 25;
        }
        
    }
    
    
    public void ticketData()
    {
         System.out.println("Kino "+cinemaName);
         System.out.println("Film "+filmTitle);
         System.out.println("Rzad "+row);
         System.out.println("Siedzenie "+seat);
         System.out.println("Cena "+price);
         System.out.println("");
         
         
    
    }



    public static void main(String[] args) {
        CinemaTicket t1 = new CinemaTicket("Gladiator","2","F");

        
        CinemaTicket t2 = new CinemaTicket("Gladiator","7","A");
    
        
        
        
        t1.ticketData();
        t2.ticketData();
        
    }
}