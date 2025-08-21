import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        wordNum();
        changeWord();
        spaceCut();
        mapping();
    }

    public static void wordNum() {
        System.out.print("Put sentence to calculate words number: ");
        String string = scanner.nextLine();
        String[] words = string.split(" ");
        System.out.println("words num: " + words.length);
    }

    public static void spaceCut() {
        System.out.print("Put sentence to be space cut: ");
        String string = scanner.nextLine();
        System.out.println(string.trim());
    }

    public static void changeWord() {
        System.out.print("Put sentence to be change word: ");
        String string = scanner.nextLine();
        System.out.println(string.replace("a", " - "));
    }

    public static void mapping() {
        Map<String, Integer> map = new HashMap<>();
        map.put("giorgi", 16);
        map.put("vaja", 20);
        map.put("merabi", 30);
        map.put("nuca", -21);
        map.put("nika", 25);

        System.out.println(map.get("vaja") + " - wlis aris vaja");
        System.out.println("mapis zoma aris - " + map.size());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Remove negative ages
        map.entrySet().removeIf(e -> e.getValue() < 0);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("new map: " + entry.getKey() + " - " + entry.getValue());
        }
    }
}
