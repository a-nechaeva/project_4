package Food;

import java.util.Objects;
public class TimeToEat {

    public TimeToEat(Times time){
        if(time != null) {
            this.time = time;
        }
    }
    protected Times time;

    public String getTime(){
        return toString();
    }

    @Override
    public String toString() {
        String time;
        switch (this.time) {
            case BREAKFAST -> time = "на завтрак";
            case LUNCH -> time = "на обед";
            case DINNER -> time = "на ужин";
            default -> time = "иногда";
        }
        return time;
    }
    @Override
    public int hashCode() {
        return Objects.hash(time);
    }

    @Override
    public boolean equals(Object timeToEat) {
        if (this == timeToEat) return true;
        if (timeToEat == null) return false;
        if (!timeToEat.getClass().equals(this.getClass())) return false;
        TimeToEat one = (TimeToEat) timeToEat;
        return time.equals(one.time);
    }
}

