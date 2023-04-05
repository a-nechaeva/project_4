package Creatures;

import Creatures.Skills.Speakable;
import Creatures.Skills.Thinkable;
import Things.Thing;

public class Kenga extends Animal implements Thinkable {
    public Kenga(String name, int age) {
        super(name, age);
    }
    @Override
    public void say(String text) {
        System.out.println(this.getName() + " говорит: " + text);
    }
    @Override
    public void think(String somebody) {
        System.out.println("Кенга думает, что " + somebody + " нужно подкрепиться!");
    }

    public void get(Thing thing) {
        System.out.println(getName() + " забралала " + thing);
    }

}
