package nested_class;

public class Test {
    static class A {}   // Статичный класс
    class B {}          // Внутренний класс
    void method() {
        class C{}       // Локальный класс
    }
}
