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
        char a = ' ';
        String sorti = "";
        char[] charWord = str.toCharArray();
            for (int num :charWord){
                     a = (char) (num + 2);
                if ( num == 90) {
                     a = (char) ((num + 2)-26);
                }
                else if (122 == num) {
                     a = (char) ((num + 2)-26);
                }
                else if (32 == num) {
                    a = (char) num;
                }
                sorti += a;
            }
        return sorti;
    }


    public static String plateforme (String str) {
        String sorti = "";
        String[] array = str.split(" ");
        for (String word : array) {
            char[] charWord = word.toCharArray();
            for (int finishMe = charWord.length -1 ; finishMe < charWord.length ;finishMe--) {
                if (finishMe == 'e') {
                    continue;
                }
                if (finishMe == 'm') {

                }
            }


        }
        return sorti;
    }


    public static void main (String[] args) {
        System.out.print(gras("Mon peTit Oiseau"));
        System.out.print(cesar("Zza pris Zzsa volée"));
        System.out.print(cesar("priapisme camion mecanique"));
    }
}
