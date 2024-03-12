package t2_nested3;

public class Teat1Run {
	public static void main(String[] args) {
		System.out.println("이옷은 main메소드 입니다.");
		System.out.println();
		
		Test1 t1 = new Test1();
		System.out.println("Test1클래스안의 su : " + t1.su);
		System.out.println("===============");
		t1.modTest1();
		t1.modClass();
	}
}
