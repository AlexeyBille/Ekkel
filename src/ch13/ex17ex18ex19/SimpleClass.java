package ch13.ex17ex18ex19;
//Hello
/*
* HELLLLLLLLSDFASDOOOOO
* */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleClass {
    public static void main(String[] args) {
        System.out.println("Input file:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filePath = "";
        try {
            filePath = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String fileContent = "";
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(filePath));
            String temp = fileReader.readLine();
            while(temp != null){
                fileContent += temp+"\n";
                temp = fileReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuilder stringBuilder = new StringBuilder(fileContent);
        Matcher matcherOfComments = Pattern.compile("/\\*[*A-Za-z0-9 \n]*\\*/|//[*A-Za-z0-9 ]*\n")
                .matcher(fileContent);
        ArrayList<String> listOfComments = new ArrayList<>();
        System.out.println(fileContent);
        while(matcherOfComments.find()){

            listOfComments.add(matcherOfComments.group());
        }

        Matcher matcherOfLiterals = Pattern.compile("[A-Za-z]+[0-9]*")
                .matcher(fileContent);
        ArrayList<String> listOfLiterals = new ArrayList<>();
        while(matcherOfLiterals.find()){

            listOfLiterals.add(matcherOfLiterals.group());
        }
        Matcher matcherOfClasses = Pattern.compile("class [A-Za-z]+[0-9]*")
                .matcher(fileContent);
        ArrayList<String> listOfClasses = new ArrayList<>();
        while(matcherOfClasses.find()){

            listOfClasses.add(matcherOfClasses.group());
        }

        System.out.println("List of comments: ");
        for(String s:listOfComments){
            System.out.println(s);
        }
        System.out.println("List of literals: ");
        for(String s:listOfLiterals){
            System.out.println(s);
        }
        System.out.println("List of classes: ");
        for(String s:listOfClasses){
            System.out.println(s.substring(6));
        }

    }
}
class megaClass{

}
class superClass{

}
class omgwtfClass{

}
