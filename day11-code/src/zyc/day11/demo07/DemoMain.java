package zyc.day11.demo07;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();

        hero.setName("盖伦");
        hero.setAge(20);

        //创建一个武器对象
        Weapon weapon = new Weapon("多兰剑");
        //为英雄配备武器
        hero.setWeapon(weapon);
        hero.attack();

    }
}
