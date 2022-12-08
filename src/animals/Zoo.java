package animals;

import static animals.ValidateUtils.*;

public class Zoo {
    public static void main(String[] args) {

        Herbivore rabbit = new Herbivore("rabbit", 5, "forest", 50, "grass" );
                Herbivore elephant = new Herbivore("elephant", 2, "tropics", 55, "grass");
        System.out.println(rabbit);
                rabbit.eat();
                rabbit.go();
                rabbit.pastiche();
                rabbit.sleep();
    }
}
