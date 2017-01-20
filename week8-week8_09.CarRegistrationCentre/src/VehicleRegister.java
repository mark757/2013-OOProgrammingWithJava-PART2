import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Mark on 1/20/2017.
 */
public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.containsKey(plate)) {
            return false;
        } else {
            owners.put(plate, owner);
            return true;
        }
    }

    public String get(RegistrationPlate plate) {
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (owners.keySet().contains(plate)) {
            owners.remove(plate);
            return true;
        } else {
            return false;
        }
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> s = new ArrayList<>();

        for (RegistrationPlate plate : owners.keySet()) {
            if (!s.contains(owners.get(plate))) {
                s.add(owners.get(plate));

            }
        }
        for (String r : s) {
            System.out.println(r);
        }
    }
}
/*
    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        VehicleRegister compared = (VehicleRegister) object;
        if (this.owner != compared.owner) {
            return false;
        }
        if (this.owner == null || !this.owner.equals(compared.owner)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.owner == null) {
            return 13;
        }
        return owner.hashCode();
    }*/


