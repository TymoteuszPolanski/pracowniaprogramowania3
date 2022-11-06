class InternetDevice {
    String deviceName;
    boolean connected=false;
    static int connectedDevices;
    
    InternetDevice(String name){
        this.deviceName = name;
    }
    
    void connect(){
        this.connected=true;
        InternetDevice.connectedDevices += 1;
    }
    
    void disconnect(){
        this.connected=false;
        InternetDevice.connectedDevices -= 1;
    }
    
    boolean isConnected(){
        return this.connected;
    }

    void displayStatus(){
        System.out.println("name : "+ this.deviceName);
        System.out.println("connection status : "+ this.connected);
        System.out.println("==================");
        
    }
    
    static void DisplayConnections(){
        System.out.println("Devices connected : "+ connectedDevices);
    }
    
    public static void main (String[] args){
        InternetDevice d1 = new InternetDevice("Smartphone");
        InternetDevice d2 = new InternetDevice("TV");
        InternetDevice d3 = new InternetDevice("PlayStation");
        InternetDevice d4 = new InternetDevice("Speaker");
        InternetDevice d5 = new InternetDevice("Laptop");
        
        d1.connect();
        d3.connect();
        d5.connect();
        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
        d4.displayStatus();
        d5.displayStatus();
        InternetDevice.DisplayConnections();
        d1.disconnect();
        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
        d4.displayStatus();
        d5.displayStatus();
        InternetDevice.DisplayConnections();
        
    }
    
    











}
