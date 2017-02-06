public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public boolean equals(Object bird) {
        if (bird == null) {
            return false;
        }
        if (getClass() != bird.getClass()) {
            return false;
        }

        Bird compared = (Bird) bird;

        if (!this.latinName.equals(compared.latinName) || (this.ringingYear != compared.ringingYear)) {
            return false;
        }
        else return true;
    }



    @Override
    public int hashCode() {
        if (this.latinName == null) {
            return -99;
        }
        return this.latinName.hashCode();
    }
}


