package JavaReflection;
public class Eagle{

    private Eagle(){
        
    }

    public String breed;
    private boolean canSwim;
    
    public void fly(){
        System.out.println("Eagle is flying high!");
    }

    private void hunt(){
        System.out.println("Eagle is hunting for prey!");
    }
}