package LPU_java;
import java.lang.annotation.*;
import java.lang.reflect.*;

// 1. Define a Custom Annotation
@Retention(RetentionPolicy.RUNTIME) // Available at runtime
@Target(ElementType.METHOD) // Can be used on methods
@interface MyAnnotation {
    String value(); // Annotation element
}

// 2. Using Built-in and Custom Annotations
class Parent {
    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override // Built-in annotation to check method override
    void display() {
        System.out.println("Overridden method in Child class");
    }

    @Deprecated // Marks this method as outdated
    void oldMethod() {
        System.out.println("This is a deprecated method");
    }

    @SuppressWarnings("unchecked") // Suppresses warnings
    void warningExample() {
        System.out.println("SuppressWarnings example");
    }

    @MyAnnotation(value = "Custom Annotation Applied") // Custom annotation usage
    void customMethod() {
        System.out.println("Method with custom annotation");
    }
}

public class AnnotationExample {
    public static void main(String[] args) throws Exception {
        Child obj = new Child();
        obj.display();
        obj.oldMethod();
        obj.warningExample();
        obj.customMethod();

        // 3. Using Reflection to Read Custom Annotation
        Method method = obj.getClass().getMethod("customMethod");
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
        System.out.println("Annotation Value: " + annotation.value());
    }

}
