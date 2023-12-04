package user.igor.progect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String poem = "У Лукоморья дуб зелёный" +
            "Златая цепь на дубе том:\n" +
            "И днём и ночью кот учёный\n" +
            "Всё ходит по цепи кругом;\n" +
            "Идёт направо — песнь заводит,\n" +
            "Налево — сказку говорит.\n" +
            "Там чудеса: там леший бродит,\n" +
            "Русалка на ветвях сидит;\n" +
            "Там на неведомых дорожках\n" +
            "Следы невиданных зверей;\n" +
            "Избушка там на курьих ножках\n" +
            "Стоит без окон, без дверей;\n" +
            "Там лес и дол видений полны;\n" +
            "Там о заре прихлынут волны\n" +
            "На брег песчаный и пустой,\n" +
            "И тридцать витязей прекрасных\n" +
            "Чредой из вод выходят ясных,\n" +
            "И с ними дядька их морской;\n" +
            "Там королевич мимоходом\n" +
            "Пленяет грозного царя;\n" +
            "Там в облаках перед народом\n" +
            "Через леса, через моря\n" +
            "Колдун несёт богатыря;\n" +
            "В темнице там царевна тужит,\n" +
            "А бурый волк ей верно служит;\n" +
            "Там ступа с Бабою Ягой\n" +
            "Идёт, бредёт сама собой,\n" +
            "Там царь Кащей над златом чахнет;\n" +
            "Там русский дух… там Русью пахнет!\n" +
            "И там я был, и мёд я пил;\n" +
            "У моря видел дуб зелёный;\n" +
            "Под ним сидел, и кот учёный\n" +
            "Свои мне сказки говорил."; // строка стихотворения

    private TextView manyMonthOut; // поле вывода результатов анализа строки

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manyMonthOut = findViewById(R.id.manyMonthOut); // поле вывода результатов анализа строки

        int charCount = countCharacters(poem);
        int wordCount = countWords(poem);
        int letterLCount = countLetterL(poem);
        String fiveLetterWords = findFiveLetterWords(poem);
        String wordsStartingWithA = findWordsStartingWithA(poem);

        String result = "Character count: " + charCount + "\n" +
                "Word count: " + wordCount + "\n" +
                "Letter 'л' count: " + letterLCount + "\n" +
                "Five letter words: " + fiveLetterWords + "\n" +
                "Words starting with 'a': " + wordsStartingWithA;

        manyMonthOut.setText(result);
    }

    public int countCharacters(String poem) {
        return poem.length();
    }

    public int countWords(String poem) {
        String[] words = poem.split(" ");
        return words.length;
    }

    public int countLetterL(String poem) {
        int count = 0;
        for (int i = 0; i < poem.length(); i++) {
            if (poem.charAt(i) == 'л'  || poem.charAt(i) == 'Л') {
                count++;
            }
        }
        return count;
    }

    public String findFiveLetterWords(String poem) {
        String[] words = poem.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() == 5) {
                result.append(word).append(" ");
            }
        }
        return result.toString();
    }

    public String findWordsStartingWithA(String poem) {
        String[] words = poem.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.startsWith("а") || word.startsWith("А")) {
                result.append(word).append(" ");
            }
        }
        return result.toString();
    }
}
