package Creatures;

import Creatures.Skills.Curious;
import Things.Thing;

public class Animal extends Creature {
    public Animal (String name, int age) {
        super(name, age);
    }

    public void climbInto(Thing object) {
//anonymous classes
        Curious putPaw = new Curious() {
            @Override
            public void putInto(Thing object) {
                System.out.println(Animal.this.getName() + " сует лапу в " + object);
            }
        };
        Curious putNose = new Curious() {
            @Override
            public void putInto(Thing object) {
                System.out.println(Animal.this.getName() + " сует нос в " + object);
            }
        };
        putPaw.putInto(object);
        putNose.putInto(object);
    }

}

