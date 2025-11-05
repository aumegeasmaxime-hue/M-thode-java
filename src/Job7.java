public class Job7 {


    public static String gras (String str) {

        String sorti = "";
        String[] array = str.split(" ");
        for (String word : array) {
            char[] charWord = word.toCharArray();
            for (char upperCase : charWord) {
                if (Character.isUpperCase(upperCase)) {
                    sorti += ("*" + word + "*");
                    break;
                }
                sorti += word;
                break;
            }
            sorti += " ";
        }
        return sorti;
    }
    public static String cesar (String str){
        String sorti = "";
        char[] charWord = str.toCharArray();
            for (int num :charWord){
                char a = (char) (num + 2);
                sorti += a;
            }
        return sorti;
    }


    public static String plateforme (String str) {
        String sorti = "";



        return sorti;
    }


    public static void main (String[] args) {
        System.out.print(gras("Mon petit Oiseau"));
        System.out.print(cesar("a pris sa volée"));
        System.out.print(cesar("priapisme camion mecanique"));
    }
}
