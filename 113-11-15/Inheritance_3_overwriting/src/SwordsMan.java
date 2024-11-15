public class SwordsMan extends Role {
    @Override  //名稱用錯會紅線提醒
    public void fight() {
        super.fight(); //繼承Role裡的副類別
        System.out.println("揮劍攻擊");
    }
}
