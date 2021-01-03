package reflection_examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException
            , NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("reflection_examples.Employee");
//        Class employee2 = Employee.class;
//        Employee emp = new Employee();
//        Class employee3 = emp.getClass();

        Field someField = employeeClass.getField("id");
        System.out.println("Type of id field = " + someField.getType());
        System.out.println("*********************************************************");

        Field[] fields = employeeClass.getFields();
        for (Field f : fields) {
            System.out.println("Type of = " + f.getName() + " = " + f.getType());
        }
        System.out.println("*********************************************************");


        Field[] fieldsAll = employeeClass.getDeclaredFields();
        for (Field f : fieldsAll) {
            System.out.println("Type of = " + f.getName() + " = " + f.getType());
        }
        System.out.println("*********************************************************");


        Method someMethod = employeeClass.getMethod("increaseSalary");
        System.out.println("return type of method increaseSalary = " +
                someMethod.getReturnType() + ", parameter types = " +
                Arrays.toString(someMethod.getParameterTypes()));
        System.out.println("*****");

        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("return type of method increaseSalary = " +
                someMethod2.getReturnType() + ", parameter types = " +
                Arrays.toString(someMethod2.getParameterTypes()));
        System.out.println("*****");

        Method[] methods = employeeClass.getMethods();
        for (Method method : methods) {
            System.out.println("Name of method " + method.getName() +
                    ", return type = " + method.getReturnType() +
                    ", parameter types = " + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("*****");

        Method[] methodsAll = employeeClass.getDeclaredMethods();
        for (Method method : methodsAll) {
            System.out.println("Name of method " + method.getName() +
                    ", return type = " + method.getReturnType() +
                    ", parameter types = " + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("*****");

        Method[] methodsAll2 = employeeClass.getDeclaredMethods();
        for (Method method : methodsAll) {
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println("Name of method " + method.getName() +
                        ", return type = " + method.getReturnType() +
                        ", parameter types = " + Arrays.toString(method.getParameterTypes()));
            }
        }
        System.out.println("*********************************************************");

        Constructor constructor1 = employeeClass.getConstructor();
        System.out.println("Constructor has " + constructor1.getParameterCount() +
                " parameters, their types are: " +
                Arrays.toString(constructor1.getParameterTypes()));
        System.out.println("*****");

        Constructor constructor2 = employeeClass.getConstructor(int.class
                , String.class, String.class);
        System.out.println("Constructor has " + constructor2.getParameterCount() +
                " parameters, their types are: " +
                Arrays.toString(constructor2.getParameterTypes()));
        System.out.println("*****");

        Constructor[] constructors = employeeClass.getConstructors();

        for(Constructor constructor: constructors) {
            System.out.println("Constructor " + constructor.getName() +
                    ", has " + constructor.getParameterCount() +
                    " parameters, their types are: " +
                    Arrays.toString(constructor.getParameterTypes()));
        }



    }
}
