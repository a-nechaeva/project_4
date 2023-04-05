package Creatures;

import Creatures.Skills.Emotion;
import Creatures.Skills.Speakable;
import Food.*;
import Place.Place;

import java.util.Objects;

public abstract class Creature implements Speakable {
    public Creature (String name, int age) {
        setName(name);
        setAge(age);
    }
    private String name;
    private Integer age;
    protected Emotion emotion;
    protected Food food;
    protected Place place;

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.age + " лет.";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object creature) {
        if (this == creature) return true;
        if (creature == null) return false;
        if (!creature.getClass().equals(this.getClass())) return false;
        Creature one = (Creature) creature;
        return name.equals(one.name) && age == one.age;
    }

    public void toEat(Food food, TimeToEat... timeToEat) {
        //local class
        class NameOfFoodCorrector {
            private String inName = food.toString().toLowerCase();
            public String correctLast() {
                String string = inName;
                String lastLetter = string.substring(string.length()-2);
                if (lastLetter.equals("а "))
                    lastLetter = "у ";
                string = string.substring(0, string.length() - 2);
                string = string.concat(lastLetter);
                return string;
            }
        }
        NameOfFoodCorrector nameOfFoodCorrector = new NameOfFoodCorrector();
        String time = "";
        for (int i = 0; i <  timeToEat.length; i++) {
            if (i < timeToEat.length - 1)
                time += timeToEat[i].toString() + ", ";
            else
                time += timeToEat[i].toString();
        }
        System.out.println(getName() + " ест " + nameOfFoodCorrector.correctLast() + time);
    }
    public void canEat(boolean can, Food food) {
        if (can) {
            System.out.println(this.getName() + " может есть " + food);
        } else {
            System.out.println(this.getName() + " не может есть " + food);
        }
    }
    public void stand(String by) {
        System.out.println(getName() + " стоял " + by);
    }
    public void walk(String str) {
        System.out.println(getName() + " идет " + str);
    }
    //inner class
    public class Eyes {
        public void openClose(boolean isOpen) {
            if (isOpen)
                System.out.println(Creature.this.getName() + " открыл глаза!");
            else
                System.out.println(Creature.this.getName() + " закрыл глаза.");
        }
        public void lookAt(String at) {
            System.out.println(Creature.this.getName() + " посмотрел на " + at);
        }
    }

    public void setEmotion(Emotion emotion) {
        this.emotion = emotion;
    }

    public String expressEmotion() {
        String action;
        switch (emotion) {
            case SAD -> action = " грустит!";
            case SMILE -> action = " улыбается!";
            case SURPRISED -> action = " удивлен!";
            case NOTSURPRISED -> action = " не удивлен!";
            case LAUGH -> action = " смеется!";
            default -> action = " испытывает неопределенные эмоции:))::(";
        }
        return getName() + action;
    }

    public String toLive(Place place) {
        this.place = place;
        return getName() + " живет " + place;
    }

    public void say(String text) {
        System.out.println(this.getName() + " говорят: " + text);
    }

}
