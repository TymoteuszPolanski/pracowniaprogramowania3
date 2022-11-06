public class Clock
{
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;
    
    
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
        if (this.minute==this.alarmMinute && this.hour==this.alarmHour){
            runAlarm();

        }
    }
    
    void setAlarm(int hour, int minute){
        this.alarmHour=hour;
        this.alarmMinute=minute;
    }
    
    void runAlarm(){
        System.out.println("beep-beep-beep-beep-beep !!");
    }
    
    
    public static void main(String[] args){
        Clock c1 = new Clock(12,47);
        c1.displayTime();
        c1.setAlarm(12,49);
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
        
        
        
    }







}