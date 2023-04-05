package Things;

import java.util.Objects;

public class Thing {
    private String name;
    public Thing (String name) {
        setName(name);
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
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!obj.getClass().equals(this.getClass())) return false;
        Thing one = (Thing) obj;
        return name.equals(one.name);
    }
}
