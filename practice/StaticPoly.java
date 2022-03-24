package practice;

class Make {
    void company(String name, String model){
        System.out.println(name + " makes " + model);
    }
    
    void company(String name){
        System.out.println(name + " makes buses");
    }
}
public class StaticPoly{
    
    public static void main(String[] args){        
        Make type = new Make();
        type.company("tata");
        type.company("honda", "car");
    }
}
