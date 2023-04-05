package Place;

import Exceptions.Unchecked.NoLocationException;

import java.util.Objects;

public class Place {
    private Location location;

    public Place(Location location) throws NoLocationException {
        if(location != null)
            this.location = location;
    }

    public String getLocation(){
        return toString();
    }

    @Override
    public String toString() {
        String house;
        switch (this.location) {
            case KENGAHOUSE -> house = "доме Кенги";
            case TIGRAHOUSE -> house = "доме Тигры";
            default -> house = "на улице";
        }
        return "в " + house;
    }
    @Override
    public int hashCode() {
        return Objects.hash(location);
    }

    @Override
    public boolean equals(Object place) {
        if (this == place) return true;
        if (place == null) return false;
        if (!place.getClass().equals(this.getClass())) return false;
        Place one = (Place) place;
        return location.equals(one.location);
    }

}

