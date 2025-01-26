package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int a = str.indexOf(key);
        System.out.println(a);
        int count = 0;
        while(a >= 0) {
            a = str.indexOf(key, a + 1);
        count++;
        }
        System.out.println("count: " + count);
    }
}
