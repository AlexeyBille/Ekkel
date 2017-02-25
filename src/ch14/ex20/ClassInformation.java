package ch14.ex20;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ClassInformation {
    public static void main(String[] args) {
        if (args.length >= 1) {
            try {
                String out = "";
                Class c = Class.forName(args[0]);
                Method[] methods = c.getMethods();
                Constructor[] constructors = c.getConstructors();
                out += "Methods:\n";
                Pattern p = Pattern.compile("[A-Za-z0-9]+\\.");
                for(Method m:methods){
                    out += p.matcher(m.toString()).replaceAll("") + "\n";
                }
                out += "Constructors:\n";
                for(Constructor cnstr : constructors){
                    out += p.matcher(cnstr.toString()).replaceAll("") + "\n";
                }
                Field[] fields = c.getFields();
                out +="Fields:\n";
                for(Field f:fields){
                    out += f + "\n";
                }
                System.out.println(out);
            } catch (ClassNotFoundException e) {
                System.out.println("Hello");
                e.printStackTrace();
            }


        }
    }
}
