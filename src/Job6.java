public class Job6 {

    public static String leetSpeak(String str) {
        char[] charStr = str.toCharArray();
        String sorti = "";
        for (char chars : charStr) {

            if (chars == 'A') {
                chars = '4';
            }
            else if (chars == 'B') {
                chars = '8';
            }
            else if (chars == 'E') {
                chars = '3';
            }
            else if (chars == 'G') {
                chars = '6';
            }
            else if (chars == 'L') {
                chars = '1';
            }
            else if (chars == 'S') {
                chars = '5';
            }
            else if (chars == 'T') {
                chars = '7';
            }
            sorti += chars;
        }
      return sorti;
    }

    public static void main(String[] args){
        System.out.print(leetSpeak("MARSUPILAMI"));

    }
}
