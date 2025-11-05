public class Job6 {

    public static String leetSpeak(String str) {
        char[] charStr = str.toCharArray();
        String sorti = "";
        for (char chars : charStr) {
            if ((chars == 'A') || (chars == 'a')) {
                chars = '4';
            }
            else if ((chars == 'B') || (chars == 'b'))  {
                chars = '8';
            }
            else if ((chars == 'E') || (chars == 'e')) {
                chars = '3';
            }
            else if ((chars == 'G') || (chars == 'g')) {
                chars = '6';
            }
            else if ((chars == 'L') || (chars == 'l')) {
                chars = '1';
            }
            else if ((chars == 'S') || (chars == 's')) {
                chars = '5';
            }
            else if ((chars == 'T') || (chars == 't')) {
                chars = '7';
            }
            sorti += chars;
        }
      return sorti;
    }

    public static void main(String[] args){
        System.out.print(leetSpeak("Marsupilami"));

    }
}
