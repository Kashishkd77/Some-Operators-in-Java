// Illustration of Ternary operator
public class TernaryOperator
{
    public static void main(String[] args) 
    {   
        // Example 1
        String name="Kay";
        String result= (name.equals("Kay")) ? "Her name is Kay" : "Her name is "+name;
        System.out.println(result);

        // Example 2
        int a=7;
        System.out.println(a==0 ? "The number is zero" : (a>0) ? "The number is positive " : "The number is negative");
    }       
}
