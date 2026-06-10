package Reflection;

import java.lang.reflect.Field;

public class FieldExample2 {

    public int intField = 10;
    public String stringField = "test";



    public static void main(String[] args) {
        FieldExample2 fieldExample = new FieldExample2();

        Class<? extends FieldExample2> fieldExampleClass = fieldExample.getClass();
        try {
            Field strField = fieldExampleClass.getField("stringField");
            String value = (String) strField.get(fieldExample);
            System.out.println(" Value is "+ value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}
