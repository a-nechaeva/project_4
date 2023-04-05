package Creatures;

import Creatures.Skills.*;

public class Rabbit extends Animal implements Busy, Checkable, Cleanable, Organisable, Writable {
    public Rabbit (String name, int age) {
        super(name, age);
    }
    @Override
    public void say(String text) {
        System.out.println(this.getName() + " говорит: " + text);
    }
    @Override
    public void beBusy(String add){
        System.out.println(getName() + " очень занят " + add);
    }
    @Override
    public void writeLetter() {
        System.out.println(getName() + " напишет письмо ");
    }
    @Override
    public void getClear(String add) {
        System.out.println(getName() + " разъяснит " + add);
    }
    @Override
    public void makeClear(String add) {
        System.out.println(getName() + " объяснит " + add);
    }
    @Override
    public void check(String add) {
        System.out.println(getName() + " проверит " + add);
    }
    @Override
    public void organise(String add) {
        System.out.println(getName() + " организует " + add);
    }

}
