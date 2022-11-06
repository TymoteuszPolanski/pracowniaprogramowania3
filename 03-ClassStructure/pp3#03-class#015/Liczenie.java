
class Liczenie
{
    static int numberOfItems(int x, int y){
        int sum=0;
        for (int i=x; i<y+1; i++){
            sum+=1;
        }
        return sum;
    }
    static int sumOfNumbers(int x, int y){
        int sum=0;
        for (int i=x; i<=y; i++){
            sum+=i;
        }
        return sum;
    }
    static double artmOfNumbers(int x, int y){
        double sum=0;
        for (int i=x; i<=y; i++){
            sum+=i;
        }
        double sum2=0;
        for (int i=x; i<y+1; i++){
            sum2+=1;
        }
        return sum/sum2;
    }
    public static void main(String[] args){
        System.out.println("=================");
        System.out.println(numberOfItems(5,10));
        System.out.println(sumOfNumbers(5,10));
        System.out.println(artmOfNumbers(5,10));
        System.out.println("=================");
    }
}