package zyc.day11.demo08;

public class DemoMain {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");

        //实现类
//        hero.setSkill(new SkillImpl());
//        hero.attack();


        //匿名内部类
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("匿名内部类Biu~biu");
            }
        };
        hero.setSkill(skill);
        hero.attack();


        //同时使用匿名内部类和匿名对象
//        hero.setSkill(new Skill() {
//            @Override
//            public void use() {
//                System.out.println("匿名内部类Biu");
//            }
//        });
//        hero.attack();
    }
}
