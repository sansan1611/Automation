public class Validation {
    public void isContain(String a, String b, int result) {
        String keyword1 = a.toLowerCase();
        String keyword2 = b.toLowerCase();
        if (keyword1.contains(keyword2)) {
//            System.out.println("Matched");
            result = 1;
        } else
            result = 0;
    }
//    public static boolean ValidateContain(String a, String b) {
//        if (!isContain(a, b)) {
//            System.out.println("Record not match");
//            return false;
//        }
//        else return true;
//    };

    public void isMatch(String a, String b, int result){
        if (a.equals(b)) {
            result = 1;
        } else
            result = 0;
    };
}
