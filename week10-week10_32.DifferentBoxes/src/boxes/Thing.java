package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {

        this.name = name;
        this.weight = weight;

        if (this.weight < 0){
            throw new IllegalArgumentException("Weight is negative.");
        }
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Thing thing = (Thing) o;

        if (this.name != ((Thing) o).getName()) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result;
        return result;
    }
}
