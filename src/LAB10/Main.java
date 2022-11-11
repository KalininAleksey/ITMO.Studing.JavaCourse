package LAB10;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static List<String> textFileRead(String filePath) {
        File file = new File(filePath);
        List<String> stringList = new ArrayList<>();
        String input;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((input = reader.readLine()) != null) {
                stringList.add(input);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return stringList;
    }

    public static void textFileWrite(String data, String filePath, boolean isAppend) {
        File file = new File(filePath);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, isAppend))) {
            writer.write(data + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void textFilesMerge(String file1Path, String file2Path, String file3Path) {
        List<String> stringList = new ArrayList<>();
        stringList.addAll(textFileRead(file1Path));
        stringList.addAll(textFileRead(file2Path));
        stringListToFile(stringList,file3Path);
    }

    public static void stringListToFile(List<String> stringList, String filePath) {
        boolean isAppend=false;
        for (int i = 0; i < stringList.size(); i++
        ) {
            if (i!=0) {
                isAppend=true;
            }
            textFileWrite(stringList.toArray()[i].toString(), filePath, isAppend);
        }
    }

    public static void textFileSymbolReplaceBy$(String filePath) {
        List<String> stringList = new ArrayList<>(textFileRead(filePath));
        String newString;
        for (String string : stringList
        ) {
            newString = string.replaceAll("[^A-Za-zА-Яа-я0-9]", "\\$");
            Collections.replaceAll(stringList, string, newString);
        }
        stringListToFile(stringList,filePath);


    }

    public static void main(String[] args) {
        List<String> stringList = textFileRead("files/test.txt");
        for (String string : stringList
        ) {
            System.out.println(string);
        }
        textFileWrite(stringList.toArray()[stringList.size() - 1].toString(), "files/test2.txt", true);
        textFilesMerge("files/test.txt", "files/test2.txt", "files/test3.txt");
        textFileSymbolReplaceBy$("files/test.txt");
    }
}
