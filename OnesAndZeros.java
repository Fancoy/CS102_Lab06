
import java.lang.*;

public class OnesAndZeros {

    public static String toString(char [] a){
        String str = new String(a);
        return str;
    }

    public static void printer(int i, char [] a, int j){
        if(i == j){
            System.out.println(toString(a) + " ");
            return; // Return here later

        }
        if(a[j - 1] == '0'){
            a[j] = '0';
            printer(i, a, j + 1);
            a[j] = '1';
            printer(i, a, j + 1);
        }

        if(a[j - 1] == '1'){
            a[j] = '0';
            printer(i, a, j + 1);
        }
    }
    public static void create(int i){
        if(i <= 0){
            return;

        }

            char[] c = new char[i];
            c[0] = '0';
            printer(i, c, 1);
            c[0] = '1';
            printer(i, c, 1);

    }
    public static void main(String[] args){
        create(3);
        create(4);
    }
}
