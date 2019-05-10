package 어두운밤;

public class 자원 {
	int 채집시간;
	String 종류;
	int 수량;
	int 등급;
	자원() {
		
	}
	
	public void 정보를_확인하다() {
		System.out.println("======================================");
		System.out.println(this.종류 +"의 정보입니다.");
		System.out.println("======================================");
		System.out.println("채집시간: " + this.채집시간);
		System.out.println("종류: " + this.종류);
		System.out.println("등급: " + this.등급);
		System.out.println("수량: " + this.수량);
	}
	
	
	
}
