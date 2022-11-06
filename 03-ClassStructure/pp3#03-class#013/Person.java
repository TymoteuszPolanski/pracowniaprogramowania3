public class Person {
    
    String name;
    int weight;
    int height;
    float BMI;
    
    
    Person(String name) {
        this.name=name;
    }
    
    Person(String name,int weight, int height){
        this.name=name;
        this.weight=weight;
        this.height=height;
    }
    
    public void setWeightAndHeight(int weight, int height) {
        this.weight=weight;
        this.height=height;
    }
    
    public void calculateBMI(){
        this.BMI = this.weight/((this.height/100.0f)*(this.height/100.0f));
    }
    
    public void displayRecord(){
        System.out.println(this.name);
        System.out.println(this.weight);
        System.out.println(this.height);
        System.out.println(this.BMI);
        if (this.BMI < 18.5){
            System.out.println("BMI too low!");
        }
        else if (this.BMI > 24.9){
            System.out.println("BMI too high!");
        }
        else {
            System.out.println("BMI perfect!");
        }
        System.out.println("===================");
        
        
    }
    
    
    public static void main(String[] args){
        Person p1 = new Person("Tymek", 86,190);
        Person p2 = new Person("Tomek", 50,190);
        Person p3 = new Person("Teoś", 86,140);
        
        p1.calculateBMI();
        p2.calculateBMI();
        p3.calculateBMI();
        
        p1.displayRecord();
        p2.displayRecord();
        p3.displayRecord();
    }
    
    
    
    
}
    
