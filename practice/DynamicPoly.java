package practice;

class Vehicle {
    void make(){
        System.out.println("They make vehicles");
    }
}

class Honda extends Vehicle{
    void make(){
        System.out.println("Honda make cars");
    }
}

class Tata extends Vehicle{
    void make(){
        System.out.println("Tata make buses");
    }
}

public class DynamicPoly{
    
    public static void main(String[] args){
        Vehicle type;
        type = new Honda();
        type.make();
        type = new Tata();
        type.make();
    }
}