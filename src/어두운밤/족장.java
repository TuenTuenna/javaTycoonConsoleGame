package 어두운밤;

public class 족장 extends 주민 {

	족장(String 이름, int 나이, String 성별) {
		this.이름 = 이름;
		this.직업 = "ઊ(´罒｀) 족장";
		this.나이 = 나이;
		this.성별 = 성별;
		this.도구 = "지팡이";
		
		if(this.나이 < 17) {
			this.직업 = "없음";
			this.성인여부1 = "어린이";
		} else {
			this.성인여부 = false;
			this.성인여부1 = "어른";
		}
	}

	public void 정보를_확인하다() {

		System.out.println("======================================");
		System.out.println("족장 "+ this.이름 + "의 개인정보");
		System.out.println("직업: " + this.직업 );
		System.out.println("나이: " + this.나이 + "세");
		System.out.println("성별: " + this.성별 );
		System.out.println("======================================");
	}

	public static void 건물을_짓는다() {
		System.out.println("건물이 지어졌다.\n");
	}
	public static void 건물을_철거한다() {
		System.out.println("건물이 철거되었다.\n");
	}

	public void 불을_뗀다() {
		System.out.println("불이 활활타오른다.\n");
	}
	
	//고용관련
	public static void 고용하다(int 직업,int 인원) {
		String 직업이름 = "";
		switch (직업) {
		case 1: 직업이름 = "나무꾼";
		if(마을.최대인구수-마을.인구수 > 인원) {
			마을.나무꾼 += 인원;
			System.out.println("나무꾼 "+인원+"명을 고용한다.\n");
		} else {
			System.out.println("사람이 부족합니다..\n");
		}
		break;
		
		case 2: 직업이름 = "사냥꾼";
		if(마을.최대인구수-마을.인구수 > 인원) {
			마을.사냥꾼 += 인원;
			System.out.println("사냥꾼 "+인원+"명을 고용한다.\n");
		} else {
			System.out.println("사람이 부족합니다..\n");
		}
		break;
		
		case 3: 직업이름 = "건축가";
		if(마을.최대인구수-마을.인구수 > 인원) {
			마을.건축가 += 인원;
			System.out.println("건축가 "+인원+"명을 고용한다.\n");
		} else {
			System.out.println("사람이 부족합니다..\n");
		}
		break;
		
		case 4: 직업이름 = "대장장이";
		if(마을.최대인구수-마을.인구수 > 인원) {
			마을.대장장이 += 인원;
			System.out.println("대장장이"+인원+"명을 고용한다.\n");
		} else {
			System.out.println("사람이 부족합니다..\n");
		}
		break;
		
		case 5: 직업이름 = "농부";
		if(마을.최대인구수-마을.인구수 > 인원) {
			마을.농부 += 인원;
			System.out.println("농부"+인원+"명을 고용한다.\n");
		} else {
			System.out.println("사람이 부족합니다..\n");
		}
		break;
		
		case 6: 직업이름 = "목동";
		if(마을.최대인구수-마을.인구수 > 인원) {
			마을.목동 += 인원;
			System.out.println("목동"+인원+"명을 고용한다.\n");
		} else {
			System.out.println("사람이 부족합니다..\n");
		}
		break;
		
		case 7: 직업이름 = "재단사";
		if(마을.최대인구수-마을.인구수 > 인원) {
			마을.재단사 += 인원;
			System.out.println("재단사"+인원+"명을 고용한다.\n");
		} else {
			System.out.println("사람이 부족합니다..\n");
		}
		break;
		
		case 8: 직업이름 = "약초상";
		if(마을.최대인구수-마을.인구수 > 인원) {
			마을.약초상 += 인원;
			System.out.println("약초상"+인원+"명을 고용한다.\n");
		} else {
			System.out.println("사람이 부족합니다..\n");
		}
		break;
		
		case 9: 직업이름 = "채굴꾼";
		if(마을.최대인구수-마을.인구수 > 인원) {
			마을.채굴꾼 += 인원;
			System.out.println("채굴꾼"+인원+"명을 고용한다.\n");
		} else {
			System.out.println("사람이 부족합니다..\n");
		}
		break;
		
		}//switch문
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
