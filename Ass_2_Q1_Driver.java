/*
 */
public class Driver {
    public static void main(String []args){
        //Scanner scan=new Scanner(System.in);
        
       
        Rectangle r1=new Rectangle();
        System.out.println("Area: "+r1.area());
        System.out.println("Perimeter: "+r1.perimeter());
        
        
        Rectangle r=new Rectangle(10.0,12.0);
        System.out.println("\nArea: "+ r.area());
        
        r.set_wid(14.0);
        
        System.out.println("Perimeter: "+r.perimeter());
        
        
        try{
        Rectangle r2=new Rectangle(0.0,19.45);
        }catch (IllegalArgumentException a){
            System.out.println(a.getMessage());   
        }
    }
}
