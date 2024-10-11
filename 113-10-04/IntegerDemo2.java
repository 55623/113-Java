

public class IntegerDemo2 {
    public static void main(String[] args) {
        int data1 = 200;
        Integer wrapper1 = data1;  //自動裝箱
        Integer wrapper2 = 200;
        int data2 = wrapper2;  //自動拆箱
        
        if(wrapper1 == wrapper2){ 
            //wrapper1 、wrapper2 為資料型態，所指定的200是不同的
            //如果指定的值是在-128 ~ 127 之間，會指定給同個值
            System.out.println("wrapper1 == wrapper2 ");
        }else{
            System.out.println("wrapper1 != wrapper2 ");
        }
    }
}
