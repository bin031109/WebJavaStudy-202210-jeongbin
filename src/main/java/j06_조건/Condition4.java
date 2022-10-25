package j06_조건;

import java.util.Scanner;

public class Condition4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String selected = null;

        System.out.println("[ 선택 프로그램 ]");
        System.out.println("a. 메뉴1");
        System.out.println("b. 메뉴2");
        System.out.println("c. 메뉴3");
        System.out.println("d. 메뉴4");
        System.out.println("e. 메뉴5");
        System.out.print("실행할 명령을 선택하세요.");
        selected = scanner.nextLine();

        switch (selected) {
            case "a":
                System.out.println("메뉴 1을 선택하셨습니다.");
                break;
            case "b":
                System.out.println("메뉴 2을 선택하셨습니다.");
            case "c":
                System.out.println("메뉴 3을 선택하셨습니다.");
                break;
            case "d":
                System.out.println("메뉴 4을 선택하셨습니다.");
                break;
            case "e":
                System.out.println("메뉴 5을 선택하셨습니다.");
        }

    }
}
