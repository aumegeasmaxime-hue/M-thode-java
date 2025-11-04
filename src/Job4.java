public class Job4 {
    public static int calcule(int a,char c,int b) {
        if (c == '+') {
            int result;
            result = a + b;
            return result;
        } else if (c == '-') {
            int result;
            result = a - b;
            return result;
        } else if (c == '/') {
            int result;
            result = a / b;
            return result;
        } else if (c == '*') {
            int result;
            result = a * b;
            return result;
        } else if (c == '%') {
            int result;
            result = a % b;
            return result;
        }
        return 0;
    }

    public static void main(String[] args){
        System.out.println(calcule(1,'+',1));
    }
}
