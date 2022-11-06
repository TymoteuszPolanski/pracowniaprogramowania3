public class  SurfaceArea{
    
    public static double rectanglesurface(int rectangleSide1, int rectangleSide2)
    {
        return rectangleSide1*rectangleSide2;

    }
    public static double circlesurface(int radius)
    {
        return 3.14*(radius*radius);
        
 
    

    }
    public static double trianglesurface(int triangleBase,int triangleHeight)
    {
        return (triangleBase*triangleHeight)/2;
 
    

    }
    public static void main(String[] args) {
        double rectanglesur = rectanglesurface(4,5);
        double trianglesur = trianglesurface(3,4);
        double circlesur = circlesurface(3);
        
        
        
        System.out.println("kwadratu "+rectanglesur+
        "trójkąta "+trianglesur+"koła "+circlesur);
        
        
    };
}