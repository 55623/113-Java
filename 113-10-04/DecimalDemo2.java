

import java.math.BigDecimal;

public class DecimalDemo2 {
    public static void main(String[] args) {
        var op1 = new BigDecimal("0.1");
        var op2 = new BigDecimal("0.1");
        var op3 = new BigDecimal("0.1");
        var result = new BigDecimal("0.3");
        //若要比較浮點數，用BigDecimal
        
        if(op1.add(op2).add(op3).equals(result)) { //參考型態不要用 == ，用.equals`
            System.out.println("等於 0.3");
        }
        else {
            System.out.println("不等於 0.3");
        }

        if(op1.add(op2).add(op3).compareTo(result) == 0) { //參考型態不要用 == ，用.equals`
            System.out.println("等於 0.3");
        }
        else {
            System.out.println("不等於 0.3");
        }
    }
} 
