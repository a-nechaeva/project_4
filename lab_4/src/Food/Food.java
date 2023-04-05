package Food;

import java.util.Objects;

public class Food {

    private String name;
    private int calorie;

    public Food(String name, int calorie) {
        setName(name);
        setCalorie(calorie);
    }

    public int getCalorie(){
        return this.calorie;
    }

    public void setCalorie(int calorie){
        if(calorie > 0){
            this.calorie = calorie;
        }
    }
    public void setName(String name ){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return getName() + " ";
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, calorie);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!obj.getClass().equals(this.getClass())) return false;
        Food one = (Food) obj;
        return name.equals(one.name) && calorie == one.calorie;
    }
    public static class FoodQuantityControl {

        public void isOver (String name) {
            System.out.println(name + " закончился ");
        }
    }

}

