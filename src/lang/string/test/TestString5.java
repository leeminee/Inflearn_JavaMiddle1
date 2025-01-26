package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int indexInt = str.indexOf(ext);
        String fileName = str.substring(0, indexInt);
        String extname = str.substring(indexInt);
        System.out.println("fileName: " + fileName);
        System.out.println("extname: " + extname);
    }

}
