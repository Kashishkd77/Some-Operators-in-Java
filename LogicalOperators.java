// Illustration of Logical operator
public class LogicalOperators 
{
    public static void main(String[] args) 
    {
        int a=5;
        int b=10;
        int c=3;
        int d=3;
        
        // AND Operator
        if (a>b && c==d)            
        {
            System.out.println("AND Operator : True");
        }   
        else 
        {
            System.out.println("AND Operator : False");
        }  

        // OR Operator
        if (a>100 || b>5)
        {
            System.out.println("OR Operator : True");
        }
        else
        {
            System.out.println("OR Operator : False");
        }
        
        // Exclusive OR operator
        if (a>100 ^ b>5)
        {
            System.out.println("Exclusive OR operator : True");
        }    
        else
        {
            System.out.println("Exclusive OR operator : False");
        }

        // NOT operator
        if (a!=5)
        {
            System.out.println("NOT operator : True");
        }    
        else
        {
            System.out.println("NOT operator : False");
        }
    }   
}