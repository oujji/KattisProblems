import java.util.*;
public class RealChallenge
{
    public static void main(String[] args)
    {
        try {
            Scanner scanner = new Scanner(System.in);
            double area = scanner.nextDouble();
            double lengthOfSides = Math.sqrt(area);
            double perimeter = lengthOfSides * 4;
            System.out.println(perimeter);
            }
        
        catch (Exception e) 
        {
        }
    }
}
