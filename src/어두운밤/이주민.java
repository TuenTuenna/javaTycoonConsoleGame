package 어두운밤;

import java.util.Random;

public class 이주민 extends 주민 {

	Random 무작위 = new Random();

	int 직업랜덤;

	int 나이랜덤 = 무작위.nextInt(20) + 15;

	이주민() {

		this.도구 = "맨손";
		String[] 직업군 = new String[10];
		직업군[0] = "백수";
		직업군[1] = "나무꾼";
		직업군[2] = "사냥꾼";
		직업군[3] = "건축가";
		직업군[4] = "대장장이";
		직업군[5] = "농부";
		직업군[6] = "목동";
		직업군[7] = "재단사";
		직업군[8] = "약초상";
		직업군[9] = "채굴꾼";

		this.나이 = 나이랜덤;
		int 랜덤 = 무작위.nextInt(100);
		this.건강수치 = 랜덤;
		if (this.건강수치 <= 20) {
			this.건강 = "매우 좋지않음";
		} else if (this.건강수치 > 20 && this.건강수치 <= 50) {
			this.건강 = "좋지않음";
		} else if (this.건강수치 > 50 && this.건강수치 <= 60) {
			this.건강 = "보통";
		} else if (this.건강수치 > 60 && this.건강수치 <= 90) {
			this.건강 = "양호";
		} else if (this.건강수치 > 90 && this.건강수치 <= 100) {
			this.건강 = "매우 양호";
		}

		
		

		int[] 직업숙련도배열 = new int[10];
		직업숙련도배열[0] = 0; // 백수;
		직업숙련도배열[1] = 0; // "나무꾼";
		직업숙련도배열[2] = 0; // "사냥꾼";
		직업숙련도배열[3] = 0; // "건축가";
		직업숙련도배열[4] = 0; // "대장장이";
		직업숙련도배열[5] = 0; // "농부";
		직업숙련도배열[6] = 0; // "목동";
		직업숙련도배열[7] = 0; // "재단사";
		직업숙련도배열[8] = 0; // "약초상";
		직업숙련도배열[9] = 0; // "채굴꾼";
		this.직업랜덤 = 무작위.nextInt(6);
		this.직업 = 직업군[this.직업랜덤];
		this.직업숙련도 = 무작위.nextInt(100);
		switch (this.직업랜덤) {
		case 0:
			직업숙련도배열[0] = this.직업숙련도;
//				마을.백수++;
			break;
		case 1:
			직업숙련도배열[1] = this.직업숙련도;
//			마을.나무꾼++;
			break;
		case 2:
			직업숙련도배열[2] = this.직업숙련도;
//			마을.사냥꾼++;
			break;
		case 3:
			직업숙련도배열[3] = this.직업숙련도;
//			마을.건축가++;
			break;
		case 4:
			직업숙련도배열[4] = this.직업숙련도;
//			마을.대장장이++;
			break;
		case 5:
			직업숙련도배열[5] = this.직업숙련도;
//			마을.농부++;
			break;
		case 6:
			직업숙련도배열[6] = this.직업숙련도;
//			마을.목동++;
			break;
		case 7:
			직업숙련도배열[7] = this.직업숙련도;
//			마을.재단사++;
			break;
		case 8:
			직업숙련도배열[8] = this.직업숙련도;
//			마을.약초상++;
			break;
		case 9:
			직업숙련도배열[9] = this.직업숙련도;
//			마을.채굴꾼++;
			break;
		}

		if (this.직업숙련도 >= 0 && this.직업숙련도 <= 10) {
			this.직업타이틀 = "수습";
		} else if (this.직업숙련도 > 10 && this.직업숙련도 <= 30) {
			this.직업타이틀 = "초급";
		} else if (this.직업숙련도 > 30 && this.직업숙련도 <= 60) {
			this.직업타이틀 = "중급";
		} else if (this.직업숙련도 > 60 && this.직업숙련도 <= 90) {
			this.직업타이틀 = "고급";
		} else if (this.직업숙련도 > 90 && this.직업숙련도 <= 100) {
			this.직업타이틀 = "장인";
		}
		if (this.나이 <= 3) {
			this.직업 = "없음";
			this.성인여부1 = "갓난아기";
			this.직업타이틀 = "";
			this.직업숙련도 = 0;
		} else if (this.나이 > 3 && this.나이 <= 14) {
			this.직업 = "없음";
			this.성인여부1 = "어린이";
			this.직업타이틀 = "";
			this.직업숙련도 = 0;
		} else if (this.나이 > 14 && this.나이 <= 17) {
			this.직업 = "없음";
			this.성인여부1 = "청소년";
			this.직업타이틀 = "";
			this.직업숙련도 = 0;
		} else if (this.나이 > 17 && this.나이 <= 100) {
			this.성인여부 = true;
			this.성인여부1 = "어른";
		}
		
		this.작업능률수치 = this.직업숙련도/3;
		if (this.작업능률수치 >= 0 && this.작업능률수치 <= 20) {
			this.작업능률 = "최하";
		} else if (this.작업능률수치 > 20 && this.작업능률수치 <= 40) {
			this.작업능률 = "하";
		} else if (this.작업능률수치 > 40 && this.작업능률수치 <= 60) {
			this.작업능률 = "보통";
		} else if (this.작업능률수치 > 60 && this.작업능률수치 <= 80) {
			this.작업능률 = "상";
		} else if (this.작업능률수치 > 80 && this.작업능률수치 <= 100){
			this.작업능률 = "최상";
		}
	}

	public int 마을에_들어오다() {
		int 인구증가랜덤 = 무작위.nextInt(마을.최대인구수 - 마을.인구수) + 1;
//		마을.인구수 += 인구증가랜덤;
		System.out.println("이주민 " + 인구증가랜덤 + " 명" + " 이 마을에 나타났습니다.");
		System.out.println("인구가 증가 하였습니다.");
		System.out.println("현재 인구수 : " + 마을.인구수);

		return 인구증가랜덤;
	}

}
