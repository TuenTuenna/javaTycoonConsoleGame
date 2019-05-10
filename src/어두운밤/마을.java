package 어두운밤;

import java.util.ArrayList;
import java.util.Random;

public class 마을 {
	static int 인구수 = 0;
	static int 최대인구수 = 8;
	int 사건기록번호 = 0;
	static int 나무보유량 = 4;
	static int 고기보유량 = 4;
	static int 모피보유량 = 0;
	static int 가죽보유량 = 0;
	static int 훈제고기보유량 = 0;
	static int 훈제연어보유량 = 0;
	static String 타이틀;
	static int 성인;
	static int 아이;
	static String 플레이어이름;
	public ArrayList<주민> 주민들 = new ArrayList<>();

	// 주민들 직업정보
	static int 백수 = 0;
	static int 사냥꾼 = 0;
	static int 농부 = 0;
	static int 건축가 = 0;
	static int 재단사 = 0;
	static int 목동 = 0;
	static int 나무꾼 = 0;
	static int 대장장이 = 0;
	static int 약초상 = 0;
	static int 채굴꾼 = 0;

	마을(String 이름) {
		// 마을에 들어오는 이주민들
		this.플레이어이름 = 이름; 
		// 주민들 목록

		String 사건목록[] = new String[6];
		사건목록[0] = "밖에는 찬바람이 쌩쌩분다..";
		사건목록[1] = "빈 수레를 끌고 떠돌이가 나타난다..";
		사건목록[2] = "..";
		사건목록[3] = "토끼가 잡혔다..";
		사건목록[4] = "일꾼들이 분주히 움직인다..";
		사건목록[5] = "어망에서 무언가 발견하였다..";

	}

	public void 정보를_확인하다() {
		if (마을.인구수 >= 0 && 마을.인구수 <= 10) {
			마을.타이틀 = "인적이 드문";
		} else if (마을.인구수 > 10 && 마을.인구수 <= 20) {
			마을.타이틀 = "작은";
		} else if (마을.인구수 > 20 && 마을.인구수 <= 40) {
			마을.타이틀 = "보통";
		} else if (마을.인구수 > 40 && 마을.인구수 <= 60) {
			마을.타이틀 = "시끌벅적한";
		} else if (마을.인구수 > 60 && 마을.인구수 <= 90) {
			마을.타이틀 = "큰";
		} else if (마을.인구수 > 90 && 마을.인구수 < 120) {
			마을.타이틀 = "아주 큰";
		}

		System.out.println("======================================");

		System.out.println(마을.타이틀 +" " + this.플레이어이름 + "의 마을");
		System.out.println("======================================");
		System.out.println("인구수: " + 마을.인구수 + " / " + 마을.최대인구수);
		System.out.println("나무: " + 마을.나무보유량);
		System.out.println("고기: " + 마을.고기보유량);
//		System.out.println("모피: " + 마을.모피보유량);
//		System.out.println("가죽: " + 마을.가죽보유량); 
//		System.out.println("훈제고기: " + 마을.훈제고기보유량);
//		
//

		System.out.println("======================================");
		System.out.println("주민 직업정보 / (어른: " + 마을.성인 + "명 / 아이: " + 마을.아이 + "명)");
		System.out.println("======================================");
		System.out.println("백수: " + 마을.백수 + "명"); // 기본
		System.out.println("나무꾼: " + 마을.나무꾼 + "명"); // 기본
		System.out.println("사냥꾼: " + 마을.사냥꾼 + "명"); // 기본
		System.out.println("건축가: " + 마을.건축가 + "명"); // 기본

		System.out.println("대장장이: " + 마을.대장장이 + "명");

		System.out.println("농부: " + 마을.농부 + "명");
		System.out.println("목동: " + 마을.목동 + "명");

		System.out.println("재단사: " + 마을.재단사 + "명");

		System.out.println("약초상: " + 마을.약초상 + "명");
		System.out.println("채굴꾼: " + 마을.채굴꾼 + "명");

		System.out.println("======================================");

//		모든 주민들의 정보를 확인하다
		int 반복횟수 = 0;
		while (반복횟수 < 인구수) {
			this.주민들.get(반복횟수).정보를_확인하다();
			반복횟수++;
//			System.out.println("반복횟수: " + 반복횟수);
		}

	}

	public void 주민이_증가하다() {
		// 주민 증가

//		이주민 이주민_1 = new 이주민();
		주민 새로운_사람 = new 주민();
		주민들.add(새로운_사람);

		// 어린아이의 울음소리가 들린다.

		마을.인구수++;
		마을.아이++;
		System.out.println("주민이 " + 1 + "명 증가하였습니다.");

	}

	public void 이주민이_들어오다() {
		// 이주민 증가
		// 이주민들이 들어오는 소리가 들린다.
//				이주민[] 이주민들 = new 이주민[인원];
		Random 무작위 = new Random();
		int 임의의수 = 마을.최대인구수 - 마을.인구수;
		int 인원 = 무작위.nextInt(임의의수) + 1;
		if (인원 > 0 && 인원 > 임의의수 / 2) {
			인원 /= 2;
		}
		int 반복횟수 = 0;
		while (반복횟수 < 인원) {
			이주민 새로운_이주민 = new 이주민();
			주민들.add(새로운_이주민);
			// 인구를 증가시킨다.
			if (주민들.get(인구수 + 반복횟수).성인여부 == false) {
				마을.아이++;
			} else if (주민들.get(인구수 + 반복횟수).성인여부 == true) {
				마을.성인++;
			}

			if (주민들.get(인구수 + 반복횟수).직업 == "백수") {
				마을.백수++;
			} else if (주민들.get(인구수 + 반복횟수).직업 == "나무꾼") {
				마을.나무꾼++;
			} else if (주민들.get(인구수 + 반복횟수).직업 == "사냥꾼") {
				마을.사냥꾼++;
			} else if (주민들.get(인구수 + 반복횟수).직업 == "건축가") {
				마을.건축가++;
			} else if (주민들.get(인구수 + 반복횟수).직업 == "대장장이") {
				마을.대장장이++;
			} else if (주민들.get(인구수 + 반복횟수).직업 == "농부") {
				마을.농부++;
			} else if (주민들.get(인구수 + 반복횟수).직업 == "목동") {
				마을.목동++;
			} else if (주민들.get(인구수 + 반복횟수).직업 == "재단사") {
				마을.재단사++;
			} else if (주민들.get(인구수 + 반복횟수).직업 == "약초상") {
				마을.약초상++;
			} else if (주민들.get(인구수 + 반복횟수).직업 == "채굴꾼") {
				마을.채굴꾼++;
			}
			반복횟수++;
		}
		마을.인구수 += 인원;
		System.out.println("주민이 " + 인원 + "명 증가하였습니다.");
	}

	public void 주민이_감소하다(int 인원) {
		마을.인구수 -= 인원;
		System.out.println("주민이 " + 인원 + "명 감소하였습니다.");
	}

}// 마을 클래스
