import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class BaldaForTwo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        var word = in.nextLine();

        var letters = new HashSet<Character>();
        var wordHistory1Player = new LinkedHashSet<String>();
        var wordHistory2Player = new LinkedHashSet<String>();

        for (int i = 0; i < word.length(); i++) {
            letters.add(word.charAt(i));
        }

        String wordNew = in.nextLine();
        int count = 1;

        while (true) {
            if (!wordNew.isEmpty()) {
                if (!(count % 2 == 0)) {
                    if (!(validateWord(wordNew.toCharArray(), letters))) {
                        System.err.println("Слово 1 игрока " + wordNew + " не подходит");
                        wordNew = in.nextLine();
                        continue;
                    }
                    if (wordHistory1Player.contains(wordNew) || wordHistory2Player.contains(wordNew)) {
                        System.err.println("Слово 1 игрока " + wordNew + " уже было");
                        wordNew = in.nextLine();
                        continue;
                    }
                    wordHistory1Player.add(wordNew);
                }
                if (count % 2 == 0) {

                    if (!(validateWord(wordNew.toCharArray(), letters))) {
                        System.err.println("Слово 2 игрока " + wordNew + " не подходит");
                        wordNew = in.nextLine();
                        continue;
                    }

                    if (wordHistory1Player.contains(wordNew) || wordHistory2Player.contains(wordNew)) {
                        System.err.println("Слово 2 игрока " + wordNew + " уже было");
                        wordNew = in.nextLine();
                        continue;
                    }
                    wordHistory2Player.add(wordNew);
                }
                wordNew = in.nextLine();
                count++;
            } else {
                wordNew = in.nextLine();
                if (wordNew.isEmpty()) {
                    break;
                }
                continue;
            }
        }

        if (wordHistory1Player.size() > wordHistory2Player.size()) {
            System.out.println("Первый игрок выиграл!");
            
        } else if (wordHistory1Player.size() < wordHistory2Player.size()) {
            System.out.println("Второй игрок выиграл!");
            
        } else {
            System.out.println("Ничья");
        }
        
        System.out.println("1 игрок составил " + wordHistory1Player.size() + " слов(а)");
        System.out.println("Слова: " + String.join(", ", wordHistory1Player));
        System.out.println("2 игрок составил " + wordHistory2Player.size() + " слов(а)");
        System.out.println("Слова: " + String.join(", ", wordHistory2Player));

    }

    public static boolean validateWord(char[] arr, HashSet<Character> lettersSet) {
        for (var letter : arr) {
            if (!(lettersSet.contains(letter)))
                return false;
        }
        return true;

    }
}

