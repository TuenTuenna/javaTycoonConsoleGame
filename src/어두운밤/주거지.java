package 어두운밤;

public class 주거지 extends 건물 {
	int 수용인원 = 4;
	int 등급;
	String 타이틀;
	String 주거지이름 = "오두막";
	주거지(){
		
	}
	public void 주거지를_짓는다(int 나무) {
		if(나무 < 50) {
			System.out.println("나무가 부족합니다.\n");
		} else {
			마을.나무보유량 -= 50;
			System.out.println("일꾼이 바삐 움직이기 시작한다. \n");
		}
	}
	
	
	public void 주거지를_1단계_업그레이드한다(int 나무) {
	
	}
	
	
}
