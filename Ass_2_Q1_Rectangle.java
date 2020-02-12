
public class Rectangle {
    private double len;
    private double wid;
    
    
    public Rectangle(){
        this(1.0,1.0);
    }
    public Rectangle(double l, double w){
        set_len(l);
        set_wid(w);
    }
    
    
    public void set_len(double L){
        if((L>0.0)&&(L<=20.0)){
            this.len= L;
        }       
        else{
            throw new IllegalArgumentException("The value must be between 0 and 20");
        }
    }
    
    public void set_wid(double W){
        if((W>0.0) && (W<=20.0)){
            this.wid= W;
        }
        else{
            throw new IllegalArgumentException("The value must be between 0 and 20");
        }
    }
    
    public double get_len(){
        return this.len;
    }
    
    public double get_wid(){
        return this.wid;
    }
    
    public double area(){
           return ((this.len)*(this.wid));
    }
    
    public double perimeter(){
         return (2*((this.len)+(this.wid)));
    }
    
}
