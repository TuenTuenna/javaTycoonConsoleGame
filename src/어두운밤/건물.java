package 어두운밤;

import java.util.ArrayList;

public class 건물 {
	int 나무개수;
	int 석재개수;
	int 건설시간;
	int 등급;
	String 종류;
	String 이름;
	int 인원수;
	int 건물수;
	protected ArrayList<주민> 실내주민들 = new ArrayList<>();
	
	건물() {
		this.이름 = "";
		this.이름 = this.이름 + (건물수+1);
		this.인원수 = 0;
		this.등급 = 0;
	}
	건물(String 이름) {
		this.이름 = 이름;
		this.이름 = this.이름 + (건물수+1);
	}
	
	public void 정보를_확인하다() {
		System.out.println("======================================");
		System.out.println(this.이름 +"의 건물정보입니다.");
		System.out.println("======================================");
		System.out.println("이름: " + this.이름);
		System.out.println("종류: " + this.종류);
		System.out.println("등급: " + this.등급);
		System.out.println("인원수: " + this.인원수);
	}
	
	public int 화재가_발생하다() {
		System.out.println("건물에 불이났습니다.\n");
		System.out.println("건물안에 있던 주민들이 불에 타죽었습니다.\n");
		return this.인원수;
	}
	public int 상급건물이_되다() {
		this.등급++;
		System.out.println("건물이 업그레이드 되었습니다.\n");
		return this.등급;
	}
	public int 건설시간이_단축되다(int 인원) {
		this.건설시간 -= 인원;
		System.out.println("건설시간이 "+인원+"초 단축되었습니다.\n");
		return this.건설시간;
	}
	
}
