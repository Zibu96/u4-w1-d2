package Es1;

public class Es1 {
    public static void main(String[] args) {


        System.out.println("la stringa è pari: " + stringaPariDispari("ciao"));
        System.out.println("quest'anno è bisestile: " + annoBisestile(2000));
    }


    public static boolean stringaPariDispari(String str1) {

        if (str1.length() % 2 == 0) {
            return true;
        } else return false;
    }

    public static boolean annoBisestile(int anno) {

        if (anno % 4 == 0 || anno % 100 == 0 && anno % 400 == 0) {

            return true;
        } else return false;
    }
}
