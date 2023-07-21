package abstraction;

public class EnglishCount extends Language {


    @Override
    int numberOfChars(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                count++;

            }

        }
        return count;
    }
}




