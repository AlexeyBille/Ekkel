package ch14.ex25.pkcg2;

import ch14.ex25.pkcg1.ClassWithPrivate;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTestClass {
    public static void main(String[] args) {

        Class aClass = ClassWithPrivate.class;
        ClassWithPrivate classWithPrivate = new ClassWithPrivate();
        try {
            Method method = aClass.getDeclaredMethod("method1");
            method.setAccessible(true);
            method.invoke(classWithPrivate);
            Method method2 = aClass.getDeclaredMethod("method2");
            method2.setAccessible(true);
            method2.invoke(classWithPrivate);
            Method method3 = aClass.getDeclaredMethod("method3");
            method3.setAccessible(true);
            method3.invoke(classWithPrivate);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
