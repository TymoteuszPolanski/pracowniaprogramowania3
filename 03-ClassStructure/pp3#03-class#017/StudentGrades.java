import java.util.Arrays;
public class StudentGrades {
    
    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
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
        StudentGrades s1 = new StudentGrades("Amanda",new double[] {3.5,4.5,4.0,2.0,5.0,3.5,3.5});
        StudentGrades s2 = new StudentGrades("James",new double[] {2.0,3.0,2.0,4.5,4.5});
        s1.displayRecord();
        s2.displayRecord();
    }
}
