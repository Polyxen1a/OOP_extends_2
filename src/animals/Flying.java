package animals;

public class Flying extends Bird {
    public Flying(String name, int age, String livingEnvironment, String typeMovement) {
        super(name, age, livingEnvironment, typeMovement);
    }


    @Override
    public void hunting() {
        System.out.println("Охотится на мелких животных");

    }

    @Override
    public void eat() {
        System.out.println("Кушает мелких животных");
    }

    @Override
    public void sleep() {
        System.out.println("Спит в гнезде");
    }

    @Override
    public void go() {
        System.out.println("Летает");
    }


    @Override
    public void toFly() {
        System.out.println("Летающая птица");
    }

    @Override
    public String toString() {
        return "Flying{" +
                "name= " + getName() +
                ", age=" + getAge() +
                "livingEnvironment=" +
                getLivingEnvironment() +
                ", typeArea=" + getTypeArea() +
                super.toString();
    }
}


