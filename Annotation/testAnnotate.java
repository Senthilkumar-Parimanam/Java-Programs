package Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class testAnnotate {

public static void main(String arg[]){
		
		Class c = runTime.class;
	   Method[] allMethods =c.getMethods();
	   Annotation[] annotate = allMethods[0].getDeclaredAnnotations();
	   System.out.println("Annotation in Method '"
               + allMethods[0] + "' : " + annotate);
	   
}

}
