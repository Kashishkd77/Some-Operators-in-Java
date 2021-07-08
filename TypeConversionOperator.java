// Illustration of Type Conversion operator
class Cat
{   
    public static void displayCat() 
    {
        System.out.println("Cat Class");    
    }
}

class Animal
{   
    public static void displayAnimal() 
    {
        System.out.println("Animal Class");    
    }
}

public class TypeConversionOperator
{
    public static void main(String[] args) 
    {  
        Cat c = new Cat();
        Animal a= new Animal();
        if(a instanceof Animal)
        {
            System.out.println("a is instance of Animal()");
        }
        
        // error: incompatible types: Cat cannot be converted to Animal
        // if(c instanceof Animal)      
        // {
        //     System.out.println("c is instance of Animal()");
        // }
    }       
}
