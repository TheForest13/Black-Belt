package lambda_expressions;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("private"));
    }

    public static void main(String[] args) {
        int i = 10;
        def((s) -> s.length());
        def((s) -> s.length() + i);

    }
}

interface I {
    int abc(String s);
}