public class SwimPlayer extends Human implements Swimmer {
    //繼承Human實作Swimmer
    public SwimPlayer(String name) {
        super(name);
    }
    
    @Override
    public void swim() {
        System.out.printf("游泳選手 %s 游泳%n", name);
    }   
}
