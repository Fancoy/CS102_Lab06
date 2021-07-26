import java.util.*;

public class Lab06 {

    private static int recCalc(String str){
        if(str.equals("")){
            return 0;
        }
        else {

            return recCalc(str.substring(1)) + 1;
        }
    }
    public static void main(String[] args){

        String str = "CS102 is the best";

        System.out.println(recCalc(str));
    }

}
