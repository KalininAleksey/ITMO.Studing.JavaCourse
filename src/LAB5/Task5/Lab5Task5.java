package LAB5.Task5;

//Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.
//Sample Output:
//The given string is: This is a test string
//The string reversed word by word is:
//sihT si a tset gnirts

public class Lab5Task5 {
    public static String wordReverseInString(String text) {
        if (text.length() >= 1) {
            String[] word = text.trim().split(" ");
            StringBuilder sb = new StringBuilder();
            for (String w : word) {
                char[] symbols = w.toCharArray();
                for (int i = 0; i < symbols.length; i++) {
                    sb.append(symbols[symbols.length -1- i]);
                }
                sb.append(" ");
            }
            text= sb.toString();
        }
        return text;
    }

    public static void main(String[] args) {
        String text = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?";
        System.out.println(wordReverseInString(text));
    }
}