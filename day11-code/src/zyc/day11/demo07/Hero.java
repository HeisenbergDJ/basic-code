package zyc.day11.demo07;
/*
一个类作为成员变量类型
游戏当中的英雄角色类
 */
public class Hero {
    private String name;// 英雄名称
    private int age;
    private Weapon weapon;//武器

    public Hero() {
    }

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(){
        System.out.println("年龄为：" + age + " 的" + name +
                "用" + weapon.getCode() + "攻击敌方。");
    }
}
