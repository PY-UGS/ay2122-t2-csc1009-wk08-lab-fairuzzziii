package OOPG.Week8;

import java.util.Scanner;

public class CircleWithException {
    double radius = 0;
    private static final double Pi = 3.141529;

    void setRadius(double newRadius) throws IllegalArgumentException {  
        if (newRadius <= 0){
            throw new IllegalArgumentException("Radius has to be a positive number greater than 0.");

        } 
        else{
            radius = newRadius;   
        }
    }   

    double getRadius() {   
        return radius;   
    }

    double getArea() throws Exception{   
        double area = radius * radius * Pi;
        if (area>1000){
            throw new Exception("Area of circle is greater than 1000.");
        }   
        else {
            return area;
        }
    }   

    double getDiameter() {   
        return radius*2;   
    }  

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        CircleWithException circle1 = new CircleWithException();
        System.out.println("Please input radius of circle in cm: ");
        double radius = input.nextDouble();

        try {
            circle1.setRadius(radius);
            System.out.println("Radius of circle is : " + circle1.getRadius() );
            System.out.println("Area of circle is : " + circle1.getArea() );
            System.out.println("Diameter of circle is : " + circle1.getDiameter() );
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("ERROR: "+e.getMessage());
        }
        catch(Exception e){
            System.out.println("ERROR: "+ e.getMessage());
        }  
        }
        

        
    }


    
