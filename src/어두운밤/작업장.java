package 어두운밤;

public class 작업장 extends 건물 {
	int 생산시간;
	int 생산량;
	String 생산물;
	String 사고종류 = "";
	int 장인의_수;
	작업장(){
		
	}

	public int 산업재해가_발생되다() {
		System.out.println(this.이름 + " 에서 "+this.사고종류+"사고가 발생하였다.\n");
		System.out.println("주민 "+this.인원수 + "명이 사고로 죽었다.\n");
		return this.인원수;
	}

	public int 작업물이_나온다(int 작업재료) {
		if(this.인원수 > 1) {
			this.생산량 += 인원수;
		}
		System.out.println(this.생산시간+ "초 가 지난후...");
		System.out.println(this.이름 + " 에서 " + 생산물 + "가 " + 생산량 + "만큼 나왔습니다.\n");
		return this.생산량;
	}
	
	public int 생산시간이_단축되다() {
		//장인의 수만큼 1초씩 단축
		this.생산시간 -= 장인의_수;
		return this.생산시간;
	}
	
	
}
