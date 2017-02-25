package ch18.ex2;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class SortedDirList {
    private String filePath;
    private File file;
    public SortedDirList(String filePath) {
        this.filePath = filePath;
        file = new File(filePath);
    }
    String[] list(){
        return file.list();
    }

    String[] list(String regex) {
        return file.list(new FilenameFilter() {

            private Pattern pattern = Pattern.compile(regex);

            @Override
            public boolean accept(File file, String s) {


                return pattern.matcher(s).find();
            }
        });
    }

    public static void main(String[] args) {
        SortedDirList sortedDirList = new SortedDirList("/home/alexey/java/Ekkel/src/test");
        System.out.println(Arrays.toString(sortedDirList.list()));
        System.out.println(Arrays.toString(sortedDirList.list("Child*")));
    }
}
