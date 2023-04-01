package tasks;

//Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
//        String s1 = "hello";
//        String s2 = "hello";
//        String s3 = s1;
//        String s4 = "h" + "e" + "l" + "l" + "o";
//        String s5 = new String("hello");
//        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

public class Task0 {
    public static void runCompare(){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.printf("s1 == s2: %b\n", s1 == s2);
        System.out.printf("s1.equals(s2): %b\n", s1.equals(s2));
        System.out.printf("s1 == s3: %b\n", s1 == s3);
        System.out.printf("s1.equals(s3): %b\n", s1.equals(s3));
        System.out.printf("s1 == s4: %b\n", s1 == s4);
        System.out.printf("s1.equals(s4): %b\n", s1.equals(s4));
        System.out.printf("s1 == s5: %b\n", s1 == s5);
        System.out.printf("s1.equals(s5): %b\n", s1.equals(s5));
        System.out.printf("s1 == s6: %b\n", s1 == s6);
        System.out.printf("s1.equals(s6): %b\n", s1.equals(s6));

    }
}
