import java.util.*;

/**
 * Created by Mark Cunanan on 2/3/2017.
 */
public class Information {
    private Map<String, List<String>> nameAndNumbers;
    private Map<String, List<String>> nameAddressCity;

    public Information() {
        this.nameAndNumbers = new HashMap<>();
        this.nameAddressCity = new HashMap<>();
    }

    public void addNumber(String person, String number) {
        if (!nameAndNumbers.containsKey(person)) {   //if hashmap doesn't contain key (person)
            this.nameAndNumbers.put(person, new ArrayList<>()); //then create a new one w/ arraylist
        }
        List<String> numList = this.nameAndNumbers.get(person); //else add the number to the address arraylist
        numList.add(number);
    }

    public void searchNumberByPerson(String person) {
        List<String> info = this.nameAndNumbers.get(person);
        if (nameAndNumbers.containsKey(person)) {
            for (String i : info) {
                System.out.println("  " + i);
            }
        } else {
            System.out.println(" not found");
        }
        /* List<String> search = this.nameAndNumbers.get(person); //retrieve list reference of person
        if (!nameAndNumbers.containsKey(person)) { // //return null if person not found
            return null;
        }
        return search; //return list of numbers*/
    }

    public void searchPersonByNumber(String number) { //output single number
        System.out.println(getNumber(number));
    }

    public String getNumber(String number) { //search through keyset and return number
        for (String i : nameAndNumbers.keySet()) {
            if (nameAndNumbers.get(i).contains(number)) {
                return " " + i;
            }
        }
        return " not found";
    }

    public void addAddress(String person, String address, String city) {
        if (!nameAddressCity.containsKey(person)) {
            this.nameAddressCity.put(person, new ArrayList<>());
        }
        List<String> addList = this.nameAddressCity.get(person); //else add the number to the address arraylist
        addList.add(address);
        addList.add(city);
    }

    public void searchInformation(String person) {
        if (nameAndNumbers.containsKey(person) || nameAddressCity.containsKey(person)) {
            List<String> info = this.nameAndNumbers.get(person);
            List<String> address = this.nameAddressCity.get(person);
            if (!nameAndNumbers.containsKey(person)) {
                System.out.println(" address: ");
                for (String e : address) {
                    System.out.print(e);
                }
                System.out.println();
                System.out.print(" phone number not found ");
                System.out.println();
            } else if (!nameAddressCity.containsKey(person)) {
                System.out.println(" address unknown ");
                System.out.println(" phone numbers: ");
                for (String i : info) {
                    System.out.println("  " + i);
                }
            } else {
                System.out.print(" address: ");
                for (String e : address) {
                    System.out.print(e);
                }
                System.out.println();
                System.out.println(" phone numbers: ");
                for (String i : info) {
                    System.out.println("  " + i);
                }
            }
        } else {
            System.out.println(" not found");
        }
    }

    public void deleteInformation(String keyword) {
        for (Map.Entry<String, List<String>> value : nameAddressCity.entrySet()) {
            String key = value.getKey();
            List<String> val = value.getValue();
            if (key.contains(keyword) || val.contains(keyword)) {
                nameAddressCity.remove(key);
                nameAndNumbers.remove(key);
            } else {
                System.out.println("keyword not found");
            }
        }
    }

    public void filter(String keyword) {
        if (filterAddress(keyword)) {
        } else {
            filterLocation(keyword);
        }
    }

    public void filterLocation(String keyword) {
        boolean found = false;
        Map<String, List<String>> reverseMap = new TreeMap<>();
        reverseMap.putAll(nameAndNumbers);

        for (Map.Entry<String, List<String>> value : reverseMap.entrySet()) {
            String key = value.getKey();
            List<String> val = value.getValue();

            if (key.contains(keyword) || val.contains(keyword)) {
                found = true;
                System.out.println(key);
                searchInformation(key);
            }
        }
        if (found == false) System.out.println(" not found");
    }

    public boolean filterAddress(String keyword) {
        for (String i : nameAddressCity.keySet()) {
            if (nameAddressCity.get(i).contains(keyword)) {
                System.out.println(i);
                searchInformation(i);
                return true;
            }
        }
        return false;
    }
}

