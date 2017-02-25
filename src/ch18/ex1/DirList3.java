package ch18.ex1;//: io/DirList3.java
// Building the anonymous inner class "in-place."
// {Args: "D.*\.java"}

import java.util.regex.*;
import java.io.*;
import java.util.*;
import net.mindview.util.TextFile;

public class DirList3 {
    public static void main(final String[] args) {
        File path = new File("/home/alexey/java/Ekkel/src/test/");
        String[] list;
        if (args.length == 0)
            list = path.list();
        else
            list = path.list(new FilenameFilter() {
                private Pattern pattern = Pattern.compile(args[0]);

                public boolean accept(File dir, String name) {
                    String file = TextFile.read(dir.getAbsolutePath() +"/" + name);
                    //System.out.println(file);
                    return pattern.matcher(file).find();

                }
            });
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list)
            System.out.println(dirItem);
    }
} /* Output:
DirectoryDemo.java
DirList.java
DirList2.java
DirList3.java
*///:~
