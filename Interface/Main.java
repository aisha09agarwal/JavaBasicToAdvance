package Interface;

public class Main {

    public static void main(String[] args) {
        Bird eagleObject = new Eagle();
        Bird henObject = new Hen();

        eagleObject.fly();
        henObject.fly();
    }
}
