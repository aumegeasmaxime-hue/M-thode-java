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




    }

    public static void main (String[] args) {
        System.out.print(gras("Petit avion Si tu N'a pas"));
        System.out.print(cesar("Petit avion Si tu N'a pas"));
    }
}
