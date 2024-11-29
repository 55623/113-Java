public class Main {
    public static void main(String[] args){
        Greeting greeting1 = new Greeting() { //直接宣告介面物件，直接將方法實作起來就可以
            @Override
            public void sayHello() {
                System.out.println("Hello Java!");
            }
        };
        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello Anonymous Inner Class!");
            }
        };
        greeting1.sayHello();
        greeting2.sayHello();
    }
}
