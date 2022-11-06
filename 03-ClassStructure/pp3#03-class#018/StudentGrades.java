import java.util.Arrays;
public class StudentGrades {
    
    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
    StudentGrades(String name, int numberOfGrades){
        this.studentName = name;
        this.grades = new double[numberOfGrades];
        for (int index=0;index < numberOfGrades;index ++){
            this.grades[index] = Math.round(Math.random() * (5.5 - 2.0) + 2.0);
        }
        
    }
    double lowestGrade(){
        double low[]=this.grades;
        
        Arrays.sort(low);
        
        return low[0];
    }
    
    double highestGrade(){
        double high[]=this.grades;
        Arrays.sort(high);
        
        return high[high.length -1];
    }
    
    int numberOfGrades(){
        return this.grades.length;
    }
    
    double gradeAverage(){
        double sum=0;
        for (double grade : this.grades){
            sum +=grade;
        }
        
        return sum / numberOfGrades();
    }
    
    void displayRecord(){
        System.out.println("Student Name : "+this.studentName);
        System.out.println("Number of grades : "+numberOfGrades());
        System.out.println("Lowest grade : "+lowestGrade());
        System.out.println("highest grade : "+highestGrade());
        System.out.println("Average : "+gradeAverage());
        System.out.println("======================");
    }
    
    public static void main(String[] args){
        StudentGrades s1 = new StudentGrades("Amanda",4);
        StudentGrades s2 = new StudentGrades("James",6);
        s1.displayRecord();
        s2.displayRecord();
    }
}
