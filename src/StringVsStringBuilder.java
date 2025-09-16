public class StringVsStringBuilder {
    public static void main(String[] args) {
//        String str = "hello";
//        str.concat("  world");
        StringBuilder sb = new StringBuilder("hello");
//        sb.append(" world");

        System.out.println(sb.reverse());
    }
}
