public class StringTest {
    public static void main(String[] args) {
//        String sub = "Tao la con";
//        String subFather = sub.concat("La bo no");
//        System.out.println("In ra doi tuong con" + ":" + sub);
//        System.out.println("In ra doi tuong cha" + ":" + subFather);
//        StringBuffer testStringBuffer = new StringBuffer();
//        testStringBuffer.append(sub);
//        System.out.println("testString buffer" + ":" + testStringBuffer);
//        String test = "A";
//        String test1 = "A";
//        boolean b = test1 == test;
//        System.out.println(b);
        String testTing="apple";
        String banana="apple";
        boolean check=
        testTing.matches(banana);
        boolean checkRegx= "apple banana ".matches("apple.*");
        System.out.println(check);
        System.out.println(checkRegx);
        boolean a = "Java is fun".matches("Java.*");
        boolean b = "Java is cool".matches("Java.*");
        boolean c = "Java is powerful".matches("Java.*");

        System.out.println("a:" +  a);
        System.out.println("b:" +  b);
        System.out.println("c:" +  c);
    }


}
