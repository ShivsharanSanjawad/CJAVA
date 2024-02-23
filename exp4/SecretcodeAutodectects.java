import java.io.*;
import java.util.*;

class Secret {
    private ArrayList<String> dictionary;

    Secret(ArrayList<String> dictionary) {
        this.dictionary = dictionary;
    }

    private boolean containsEnglishWords(String s) {
        String[] words = s.split("\\s+");
        for (String word : words) {
            if (dictionary.contains(word.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    private String decryptWithKey(String s, int key) {
        char[] h = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c <= 126 && c >= 32 + key) {
                h[i] = (char) (c - key);
            } else {
                h[i] = (char) (c + 95 - key);
            }
        }
        return new String(h);
    }

    void decode(String s, int min, int max) {
        for (int key = min; key < max; key++) {
            String decrypted = decryptWithKey(s, key);
            if (containsEnglishWords(decrypted)) {
                System.out.println("Key " + key + ": " + decrypted);
            }
        }
    }

    void encode(String s, int key) {
        char[] h = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c + key > 126) {
                h[i] = (char) (c + key - 95);
            } else {
                h[i] = (char) (c + key);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.print(h[i]);
        }
    }
}

public class SecretcodeAutodectects {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> dictionary = loadDictionaryFromFile("english_words.txt");
        Secret sc = new Secret(dictionary);

        int opt;
        do {
            System.out.println("1.encode\n2.decode\n3.exit");
            opt = in.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Enter the sentence");
                    in.nextLine();
                    String s1 = in.nextLine();
                    System.out.println("Enter the key if you want to get a random key then enter -1");
                    int key = in.nextInt();
                    if (key == -1) {
                        Random r = new Random();
                        key = r.nextInt(100000) + 1;
                    }
                    sc.encode(s1, key);
                    System.out.println("\nKey is " + key);
                    break;
                case 2:
                    System.out.println("Enter the coded string");
                    in.nextLine();
                    String s2 = in.nextLine();
                    System.out.println("Enter the minimum value of the key");
                    int min = in.nextInt();
                    System.out.println("Enter the maximum value of the key");
                    int max = in.nextInt();
                    sc.decode(s2, min, max);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Enter a valid number");
            }
        } while (opt != 3);
    }

    private static ArrayList<String> loadDictionaryFromFile(String filename) {
        ArrayList<String> dictionary = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                dictionary.add(line.trim().toLowerCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dictionary;
    }
}
