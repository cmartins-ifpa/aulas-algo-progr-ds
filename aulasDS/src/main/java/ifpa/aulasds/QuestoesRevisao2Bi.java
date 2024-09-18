package ifpa.aulasds;

public class QuestoesRevisao2Bi {

    public static void main(String[] args) {
        // qArrayDef();
// q07();
        qComBreak();
    }

    static void q07() {

        int m = 0, n = 2;
        do {
            m = ++m;
            n--;

        } while (n > 0);
        System.out.println(m);

    }

    private static void qArrayDef() {
        int[] array;
        array = new int[2];

        array[0] = 11;
        array[1] = 21;
        array[2] = 32;
    }

    private static void qComBreak() {
        int x = 1, i = 10;
        while ( x < i ) {
            if (i / x == 0) {
                break;
            }
            
            
            System.out.print(x + ",");
            x++; i--;
        }
    }
}
