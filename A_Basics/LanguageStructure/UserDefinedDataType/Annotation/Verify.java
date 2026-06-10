package A_Basics.LanguageStructure.UserDefinedDataType.Annotation;

import A_Basics.LanguageStructure.UserDefinedDataType.Interface.InterfaceType;
import Annotation.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Verify {
}
