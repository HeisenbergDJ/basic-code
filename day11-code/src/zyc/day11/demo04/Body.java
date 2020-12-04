package zyc.day11.demo04;

public class Body {

    public class Heart{
        public void methodHeart(){
            System.out.println("内部类的方法");
            System.out.println("内部类的" + name);

        }
    }

    private String name;

    public void methodBody(){
        System.out.println("外部类的方法");
        new Heart().methodHeart();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
