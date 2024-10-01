abstract class Vehicle{
    int no_of_tires;
    String type;
    abstract void runsOn();
}
class P_V extends Vehicle{
    float mile_age;
    float Power_output;
    public void runsOn(){
        System.out.println("Runs on Petrol");
    }
}
class E_V extends Vehicle{
    int charging_time;
    float mile_age;
    public void runsOn(){
        System.out.println("Runs on Electricity");
    }
}

class Main{
    public static void main(String [] args){
        P_V v1 =new P_V();
        v1.runsOn();
        Vehicle v2=new E_V();
        v2.runsOn();

    }
}