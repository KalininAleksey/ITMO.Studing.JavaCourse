package LAB5.Task4;
//Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.
public class Lab5Task4 {
    public static int wordCounter(String text, String foundWord){
        int res=0;
        if (text.length()>=foundWord.length()) {
            char[] symbols = text.toCharArray();
            char[] foundSymbols = foundWord.toCharArray();
            int j;
            int i=0;
            while (i < symbols.length) {
                if (foundSymbols[0] == symbols[i] && i<symbols.length - foundSymbols.length+1)  {
                    j = 1;
                    while (j < foundSymbols.length) {
                        if (foundSymbols[j] != symbols[i + j]){
                            break;
                        }
                        if (j==foundSymbols.length-1){
                            res++;
                            i=i+j;
                        }
                        j++;
                    }
                }
                i++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String text = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?";
        System.out.println(wordCounter(text,"tur"));
    }
}