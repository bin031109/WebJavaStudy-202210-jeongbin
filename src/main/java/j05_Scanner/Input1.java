package j05_Scanner;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {



        String name = "정빈";

        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        String s2 = scanner.next();
        String s3 = scanner.next();

        System.out.println("입력 받은 값1:" +s);
        System.out.println("입력 받은 값2:" +s2);
        System.out.println("입력 받은 값2:" + s3);

//        /**
//         * 문자열 입력.
//         * next ()   -> 띄어쓰기 포함 x
//         * nexLine() -> 띄어쓰기 포함 o

    }
}
