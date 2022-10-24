package LAB5.Task3;

public class Lab5Task3 {
    public static String wordReplace(String text, String replacingWord, String wordForReplace){
        if (text.length()>=replacingWord.length()) {
            char[] symbols = text.toCharArray();
            char[] foundSymbols = replacingWord.toCharArray();
            StringBuilder sb = new StringBuilder();
            StringBuilder sbt = new StringBuilder();
            int j;
            int index;
            int i=0;
            while (i < symbols.length) {
                if (foundSymbols[0] == symbols[i] && i<symbols.length - foundSymbols.length+1)  {
                    sbt.delete(0,sbt.length());
                    sbt.append(symbols[i]);
                    j = 1;
                    while (j < foundSymbols.length) {
                        if (foundSymbols[j] != symbols[i + j]){
                            sb.append(sbt);
                            break;
                        }
                        sbt.append(symbols[i+j]);
                        if (j==foundSymbols.length-1){
                           sb.append(wordForReplace);

                           i=i+j;
                        }
                        j++;
                    }
                }
                else {
                    sb.append(symbols[i]);
                }
                i++;
            }
            text=sb.toString();
        }
        return text;
    }
    public static void main(String[] args) {
        String text = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?";
        System.out.println(wordReplace(text,"tur","XXX"));
    }
}
