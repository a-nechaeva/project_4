package Creatures;

import Creatures.Skills.Emotion;
import Creatures.Skills.Speakable;
import Creatures.Skills.Thinkable;
import Things.Thing;

public class Tigra extends Animal implements Speakable, Thinkable {

    public Tigra(String name, int age) {
        super(name, age);
    }
    @Override
    public void say(String text) {
        System.out.println(getName() + " говорит: " + text);
    }
    @Override
    public void think(String text) {
        System.out.println(text);
    }

    public void licks() {
        System.out.println(getName() + " облизывается.");
    }
    public void search(boolean found, Thing thing) {
        if (found) {
            System.out.println(this.getName() + " нашел " + thing);
        } else {
            System.out.println(this.getName() + " ищет " + thing);
        }
    }

}

