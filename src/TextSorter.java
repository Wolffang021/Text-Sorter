import java.util.*;

public class TextSorter {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> texts = new ArrayList<>();

        String input = "";

        System.out.println("Enter the texts\n[Press Enter when you're done]:");

        while (input != null) {
            input = scanner.nextLine();

            if (input.equals("")) {
                input = null;
            }

            texts.add(input);
        }
        texts.remove(texts.size() - 1);

        scanner.close();

        Collections.sort(texts);

        System.out.println("Sorted Texts :");
        for (String temp : texts) {
            System.out.println(temp);
        }
    }
}