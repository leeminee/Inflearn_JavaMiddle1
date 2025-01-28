package nested.test;

public class OuterClass3 {
    public void myMethod() {
    // 여기에 지역클래스 LocalClass 를 구현하고고 hello() 메서드를 호출.
        class LocalClass {
            public void hello() {
                System.out.println("LocalClass.hello");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.hello();
    }

}
