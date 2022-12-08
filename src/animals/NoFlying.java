package animals;

import static animals.ValidateUtils.*;

public class NoFlying extends Bird {
    public NoFlying(String name, int age, String livingEnvironment, String typeMovement) {
        super(name, age, livingEnvironment, typeMovement);
    }
    public void walk() {
        System.out.println("Ходит пешком");
    }
    @Override
    public void eat() {
        System.out.println("Кушает насекомых");
    }
        @Override
    public void sleep() {
            System.out.println("Спит в гнезде");
        }
        @Override
    public void go() {
            System.out.println("Перемещается по земле");
        }
        @Override
    public void hunting() {
            System.out.println("Охотится на насекомых");
        }
        @Override
        public String toString() {
            return "NoFlying{" +
                    "name= " + getName() +
                    ", age=" + getAge() +
                    "livingEnvironment=" +
                    getLivingEnvironment() +
                    ", typeArea=" + getTypeArea();
        }
}
