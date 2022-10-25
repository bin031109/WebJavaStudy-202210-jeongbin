package j02_변수상수;

/*변수 var = Variable*/
public class Variable {
    public static void main(String[] args) {

        // 논리자리형 변수
        boolean checkFlag = false;
        System.out.println(checkFlag);
        checkFlag = true;
        System.out.println(checkFlag);

        //문자 자료형 변수
        char name1 = '정';
        char name2 = '빈';
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(""+name1 + name2 );
        System.out.println('가' + 0);
        int a = '가' + 0 ;
        System.out.println(Integer.toHexString(a));

        //문자열 자료형 변수
        String name = "정빈";
        String name4 = "윤도영";
        String name5 = name + name4;
        System.out.println(name5);

        // 정수 자료형 변수
        int width = 100 ;
        int width2 = 200 ;

        String width3 = "300";
        String width4 = "400";

        int widthResult = width + width2;
        String widthResult2 =  width3 + width4;

        System.out.println(widthResult);
        System.out.println(widthResult2);

        long time = System.currentTimeMillis();
        System.out.println(time);

        long time2 = 1666178896024L;
        System.out.println(time2);

        // 실수 자료형 변수
        double  pi = 30000000000000.14526535999999999999;
        System.out.println(pi);

        final  String FILE_PATH = "C:/Users/jeongbin";
//        FILE_PATH = "D:/Users/jeongbin;
        System.out.println(FILE_PATH);


    }
}
