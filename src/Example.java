public class Example {
    public static void main(String[] args) {
//        String s = "hello world";
//        int v = 0, c = 0;
//
//        for( char ch : s.toCharArray()){
//            if("aeiou".indexOf(Character.toLowerCase(ch))!= -1){
//                v++;
//            } else if (Character.isLetter(ch)) {
//                c++;
//            }
//            System.out.println("vowels: " + v + ", consonents: " + c);
//        }
//        String s = "hello";
//        StringBuilder sb = new StringBuilder("java");
//        System.out.println(sb.reverse());
//        char[] arr = s.toCharArray();
//        System.out.println(arr[0]);
//        String newStr = new String(arr);
//        System.out.println(arr); // back to string

        String str = "I Love Java";
        String[] words = str.split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1; i >= 0; i--){
            sb.append(words[i]).append(" ");
        }
        System.out.print(sb.toString().trim());
    }
}
