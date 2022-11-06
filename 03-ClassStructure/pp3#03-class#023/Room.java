public class Room
{
    int number;
    int beds;
    boolean occupied=false;
    String guestName;
    
    Room(int number){
        this.number=number;
        this.beds=2;  
    }
    
    Room(int number, int beds){
        this.number=number;
        this.beds=beds;
    }
    
    void checkin(String guestName){
        this.guestName=guestName;
        this.occupied=true;
    }
    
    void checkout(){
        this.occupied=false;
    }
    
    boolean isOccupied(){
        return this.occupied;
    }
    
    public String toString(){
        return
            "Room number : "+this.number+
            ", Number of beds : "+this.beds+
            ", Occupied status : "+this.occupied+
            ", Guest name : "+this.guestName;
    }
    
    void displayStatus(){
        System.out.println("Room number : "+this.number);
        System.out.println("Number of beds : "+this.beds);
        System.out.println("Occupied status : "+this.occupied);
        System.out.println("Guest name : "+this.guestName);
    }
    
    public static void main(String[] args){
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Room r3 = new Room(3);
        Room r4 = new Room(4,3);
        Room r5 = new Room(5,3);
        Room r6 = new Room(6,4);
        
        Room[] rooms={r1,r2,r3,r4,r5,r6};
        
        System.out.println(r6.toString());
        System.out.println("==========================");
        
        for(Room room : rooms){
            System.out.println(room.toString());
        }
        
        System.out.println("==========================");
        
        for (Room room : rooms){
            if (room.beds==2){
                System.out.println(room.toString());
            }
        }
        
        System.out.println("==========================");
            
        int occupied=0;
        int vacant=0;
        for (Room room : rooms){
                if (room.occupied==true){
                    occupied+=1;
                }
                else if (room.occupied==false){
                    vacant+=1;
                }
            }
        System.out.println("Vacant rooms : "+vacant+"   Occupied rooms : "+occupied);
                
        
        System.out.println("==========================");
        int freeBeds=0;
        for (Room room : rooms){
                if (room.occupied==false){
                    freeBeds+=room.beds;
                }
            }
        System.out.println("All vacant beds : "+freeBeds);
                
        
        
    }
    
}
