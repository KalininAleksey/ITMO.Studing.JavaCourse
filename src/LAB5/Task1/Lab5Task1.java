package LAB5.Task1;

//Написать метод для поиска самого длинного слова в тексте.
public class Lab5Task1 {
    public static String findLongestWord(String text){
        text=text.replaceAll("\\p{P}", "");
        String[] word = text.trim().split(" ");
        String longestWord = "";
        for (String w : word) {
            if (w.length()>longestWord.length()){
                longestWord=w;
            }
            //System.out.println(w+" "+w.length());
        }
        return longestWord;
    }

    public static void main(String[] args) {
        String text = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?";
        System.out.println(text);
        String longestWord=findLongestWord(text);
        System.out.println(longestWord);
    }
}
