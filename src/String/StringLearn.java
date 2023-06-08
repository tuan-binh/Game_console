package String;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StringLearn {
    public static void main(String[] args) {
//        khai báo một chuỗi String
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(checkValidate(str));


    }

    public static boolean checkValidate(String str) {
        String regexEmail = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
//        return Pattern.matches(regexEmail,str);
        return str.matches(regexEmail);
    }

}
