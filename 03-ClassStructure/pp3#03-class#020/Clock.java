public class Clock
{
    int hour;
    int minute;
    
    
    Clock(){
        this.hour=0;
        this.minute=0;
    }
    
    Clock(int hour, int minute){
        this.hour=hour;
        this.minute=minute;
    }
    
    void setClock(int hour, int minute){
        this.hour=hour;
        this.minute=minute;
    }
    
    void setClock(){
        this.hour=0;
        this.minute=0;
    }
    
    void displayTime(){
        String tHour= Integer.toString(this.hour);
        String tMinute = Integer.toString(this.minute);
        
        if (this.hour <10){
            tHour="0"+tHour;
        }
        if (this.minute <10){
            tMinute="0"+tMinute;
        }
        System.out.println(tHour+":"+tMinute);
    }
    
    void addOneMinute(){
        this.minute+=1;
        if (this.minute>59){
            this.minute=0;
            this.hour+=1;
            if(this.hour>23){
                this.hour=0;
            }
        }
    }
    
    public static void main(String[] args){
        Clock c1 = new Clock(12,47);
        c1.displayTime();
        c1.setClock(18,14);
        c1.displayTime();
        c1.setClock(9,3);
        c1.displayTime();
        c1.setClock(23,58);
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
        
        
        
    }







}
