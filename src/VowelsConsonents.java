//public class VowelsConsonents {
//    public static void main(String[] args) {
//        String s = "hello world";
//        int v=0, c=0;
//        for(char ch: s.toCharArray()){
//            if("aeiou".indexOf(character.toLowerCase(ch))!=-1)
//                v++;
//            else if(character.isLetter(ch))
//                c++;
//        }
//        System.out.println("vowles: " + v " consonents: " + c);
//    }
//}

public class VowelsConsonents {
    public static void main(String[] args) {
        String s = "hello world";
        int v = 0, c = 0;

        for (char ch : s.toCharArray()) {
            if ("aeiou".indexOf(Character.toLowerCase(ch)) != -1)
                v++;
            else if (Character.isLetter(ch))
                c++;
        }

        System.out.println("vowels: " + v + " consonants: " + c);
    }
}

