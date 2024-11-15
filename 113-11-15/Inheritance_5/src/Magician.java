public class Magician extends Role {
    @Override  //名稱用錯會紅線提醒
    public void fight() {
        super.fight(); //繼承Role裡的副類別
        System.out.println("魔法攻擊");
    }
    public void cure() {

        System.out.println("魔法治療");
    }

    @Override
    public String toString(){
        return String.format("魔法師：%s", super.toString());
    }
}
