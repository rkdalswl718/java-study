package pack1;

class A{}
class B extends A {}

public class Main {
    public static void main(String[] args) {
        A aa = new A();
        A ab = new B();

        System.out.println(ab instanceof A);
        System.out.println(aa instanceof A);

        System.out.println(aa instanceof B);
        System.out.println(ab instanceof B);

        if (aa instanceof B) {
            B b = (B) aa;
            System.out.println("aa를 B로 캐스팅함");
        }
        else {
            System.out.println("aa는 B타입으로 캐스팅 불가능!!");
        }

        if (ab instanceof  B) {
            B b = (B) aa;
            System.out.println("ab를 B로 캐스티앟ㅎㅁ");
        }
        else {
            System.out.println("ab는 B타입으로 캐스팅 불가능");
        }

        if ("안녕" instanceof String){
            System.out.println("\"안녕\"은 String 클래스입니다");
        }
    }
}
