public class Job5 {
    public static int occurrences (String str , char lettre){
        char[] tchars = str.toCharArray();
        int occ = 0;
        for (int a : tchars) {
            if (a == lettre) {
               occ++;
            }
        }
        return occ;
    }

    public static void main(String[] args){
        System.out.println(occurrences("le port des createurs" , 'e'));



    }
}
