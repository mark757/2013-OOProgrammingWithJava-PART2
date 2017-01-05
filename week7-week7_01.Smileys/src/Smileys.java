public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Mark");
        printWithSmileys("Cunanan");
    }

    private static void printWithSmileys(String characterString) {
        printLines(characterString);
        System.out.println();
        System.out.print(":) ");
        stringCheck(characterString);
        System.out.print(" :)");
        System.out.println();
        printLines(characterString);
        System.out.println();

    }

    private static void stringCheck(String characterString) {
        if (characterString.length() % 2 == 1) {
            System.out.print(characterString + " ");

        } else {
            System.out.print(characterString);
        }
    }

    private static void printLines(String characterString) {
        int i = 0;
        int smileLength = (characterString.length() + 6) / 2;

        if (!boolCheck(characterString)) {
            while (i < smileLength) {
                System.out.print(":)");
                i++;
            }
        } else {
            while (i < smileLength + 1) {
                System.out.print(":)");
                i++;
            }
        }
    }

    private static boolean boolCheck(String characterString) {
        if (characterString.length() % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}

/*
1. find out how long the string is
2. print a : or a ) and how many times depending if it's odd or even. if odd, add an extra space to the right side of the character string
3.
 */