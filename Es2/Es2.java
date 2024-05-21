package Es2;

public class Es2 {
    public static void main(String[] args) {

        System.out.println(switchEx(5));
    }

    public static String switchEx(int num) {

        switch (num) {
            case 0: {
                return "zero";

            }
            case 1: {
                return "uno";

            }
            case 2: {
                return "due";

            }
            case 3: {
                return "tre";

            }
            default: {
                return "errore";
            }
        }

    }

}
