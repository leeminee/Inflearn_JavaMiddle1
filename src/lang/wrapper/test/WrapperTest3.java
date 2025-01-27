package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        // String -> Integer
        Integer i = Integer.valueOf(str);
        System.out.println("Integer : "+ i);

        // Integer -> int // 언박싱
        int j = i.intValue();
        System.out.println("int : "+ j);

        // int -> Integer // 박싱
        Integer k = Integer.valueOf(j);
        System.out.println("Integer : "+ k);
    }
}
