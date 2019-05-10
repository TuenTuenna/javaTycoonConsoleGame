package 어두운밤;

import java.util.ArrayList;
import java.util.Scanner;

public class 게임실행 {
	
	public static String 이름;

	public static void main(String[] args) {
		Scanner 사용자입력 = new Scanner(System.in);
//		마을 새마을 = new 마을();
//		이주민 이주민_1 = new 이주민();
//		boolean 되돌아가기 = true;
//		while (되돌아가기 == true) {
//			System.out.println("======================================");
//			System.out.println("환영합니다.");
//			System.out.println("이름을 입력해 주세요.");
//			System.out.println("======================================");
//			이름 = 사용자입력.next();
//			System.out.println("나이를 입력해 주세요.");
//			int 나이 = 사용자입력.nextInt();
//
//			System.out.println("성별을 입력해 주세요.");
//			String 성별 = 사용자입력.next();
//
//			// 마을생성
//			
//			족장 플레이어 = new 족장(이름, 나이, 성별);
////		족장 정의정 = new 족장("정의정", 20, "남");
//			
//			사용자입력.nextLine();
//			{
//				System.out.println("눈을 비비며 잠에서 깬다...");
//			}
//			사용자입력.nextLine();
//			{
//				System.out.println(플레이어.이름 + ": 여기는 어디지? (어리둥절 하다)");
//			}
//			사용자입력.nextLine();
//			{
//				System.out.println("수상한노인: 허허허 안녕하신가 자네는 나를 대신하여 마을의 족장이 되주게!");
//			}
//			사용자입력.nextLine();
//			{
//				System.out.println(플레이어.이름 + ": 엇 도대체 무슨소리신지?..");
//			}
//			사용자입력.nextLine();
//			{
//				System.out.println("수상한노인: 아직 어리둥절 한겐가? ");
//			}
//
//			사용자입력.nextLine();
//			{
//				System.out.println("수상한노인: '나의 정보보기'를 눌러 자네의 개인정보를 살펴보게 허허허!\n");
//			}
//			사용자입력.nextLine();
//			boolean 입력오류 = true;
//			while (입력오류) {
//				System.out.println("번호를 선택한다.");
//				System.out.println("==================================================");
//				System.out.println("[ 1.나의 정보보기 ] [ 2.돌아가기 ]");
//				System.out.println("==================================================\n");
//				int 진행 = 사용자입력.nextInt();
//
//				if (진행 == 1) {
//					플레이어.정보를_확인하다();
//					입력오류 = false;
//					되돌아가기 = false;
//				} else if (진행 == 2) {
//					System.out.println("처음부터 다시 진행하시겠습니까?(1: yes / 2: no)\n");
//					int 다시진행선택 = 사용자입력.nextInt();
//					if (다시진행선택 == 1) {
//						되돌아가기 = true;
//						입력오류 = false;
//					} else if (다시진행선택 == 2) {
//						되돌아가기 = false;
//						입력오류 = true;
//						System.out.println("허허허~ 처음부터 다시하는 것도 나쁘지는 않을걸세~\n");
//					} else {
//						입력오류 = true;
//					}
//
//				} else {
//					System.out.println("잘못입력하셨습니다. 다시 입력하여주십시오.\n");
//				}
//			} // 입력오류 반복문
//
//		} // 되돌아가기 반복문
//		사용자입력.nextLine();
//		{
//			System.out.println("\n수상한노인: 허허허 내말이 맞지?");
//		}
//		사용자입력.nextLine();
//		{
//			System.out.println("수상한노인: 자, 이제 '마을 정보보기'를 눌러 보게나");
//		}
//
//		사용자입력.nextLine();
//		{
//			System.out.println("번호를 선택한다.");
//			System.out.println("==================================================");
//			System.out.println("[ 1.마을 정보보기 ] ");
//			System.out.println("==================================================\n");
//		}
//		int 진행 = 사용자입력.nextInt();
//		
//		if(진행 == 1) {
//			
//			새마을.정보를_확인하다();
//			
//		} else {
//			System.out.println("잘못입력하셨습니다. 다시 입력하여주십시오.\n");
//		}
//	
//		System.out.println("수상한노인: 자 이제 곧, 이주민들이 들어올걸세");
//		int 인원랜덤 = 이주민_1.마을에_들어오다();
//		새마을.이주민이_들어오다(인원랜덤);
//		새마을.정보를_확인하다();
//		
//		
//		System.out.println("==================================================\n");
//		System.out.println("계속하시려면 아무키나 눌러주세요!");
//
//		System.out.println("바깥에는 바람이 강하게 분다.");

//		String 엔터1 = 사용자입력.nextLine();
		
		//사용자 정보입력
		족장 정의정 = new 족장("정의정",20,"남");
		
		마을 마을_1 = new 마을(정의정.이름);
		System.out.println("당신은 족장입니다 !\n");
		System.out.println("게임이 시작됩니다.\n");
		System.out.println("==================================================\n");
		
		
		마을_1.주민이_증가하다();
		마을_1.이주민이_들어오다();
		
		마을_1.정보를_확인하다();
		
		System.out.println("==================================================\n");
		System.out.println("[1.마을정보] [2.주민정보] [3.일시키기] [4.날씨확인] ");
		System.out.println("==================================================\n");
		
		
//		마을_1.주민이_증가하다();
//		이주민 새로운_이주민 = new 이주민();
//		마을_1.주민들.add(새로운_이주민);
//		이주민 새로운_이주민1 = new 이주민();
//		마을_1.주민들.add(새로운_이주민1);
//		
//		마을_1.이주민이_들어오다(2);
//		마을_1.주민이_증가하다();

//		System.out.println("주민1 이름: "+ 마을_1.주민들.get(0).이름);
//		System.out.println("주민1 직업: "+ 마을_1.주민들.get(0).직업);
//		System.out.println("주민1 건강: "+ 마을_1.주민들.get(0).건강);
//		System.out.println("주민1 건강수치: "+ 마을_1.주민들.get(0).건강수치);
//		System.out.println("++++++++++++++++++++++++++++++++++++++++");
//		System.out.println("주민2 이름: "+ 마을_1.주민들.get(1).이름);
//		System.out.println("주민2 직업: "+ 마을_1.주민들.get(1).직업);
//		System.out.println("주민2 건강: "+ 마을_1.주민들.get(1).건강);
//		System.out.println("주민2 건강수치: "+ 마을_1.주민들.get(1).건강수치);
//		System.out.println("주민들 length: "+ 마을_1.주민들.size() );
//		
//		System.out.println("현재인원: "+ 마을_1.인구수 );
//		마을_1.정보를_확인하다();
//		마을_1.주민들.get(0).나이를_먹는다();
//		System.out.println("주민1 이름: "+ 마을_1.주민들.get(0).이름);
//		System.out.println("주민1 나이: "+ 마을_1.주민들.get(0).나이);
//		System.out.println("주민1 직업숙련도: "+ 마을_1.주민들.get(0).직업숙련도);

//		이주민 이주민_11 = new 이주민();
//		int 인구증가랜덤 = 이주민_11.마을에_들어오다();
//		
//		//이주민 증가
//		이주민[] 이주민들 = new 이주민[2];
//		
//		int 반복횟수 = 0;
//		while(반복횟수 < 2) {
//			이주민들[반복횟수] = new 이주민();	
//			// 인구를 증가시킨다.
////			이주민들[반복횟수].정보를_확인하다();
//			if(이주민들[반복횟수].직업 == "백수") {
//				마을.백수++;
//			}else if(이주민들[반복횟수].직업 == "나무꾼") {
//				마을.나무꾼++;
//			}else if (이주민들[반복횟수].직업 == "사냥꾼") {
//				마을.사냥꾼++;
//			}else if (이주민들[반복횟수].직업 == "건축가") {
//				마을.건축가++; 
//			}else if (이주민들[반복횟수].직업 == "대장장이") {
//				마을.대장장이++;
//			}else if (이주민들[반복횟수].직업 == "농부") {
//				마을.농부++;
//			}else if (이주민들[반복횟수].직업 == "목동") {
//				마을.목동++;
//			}else if (이주민들[반복횟수].직업 == "재단사") {
//				마을.재단사++;
//			}else if (이주민들[반복횟수].직업 == "약초상") {
//				마을.약초상++;
//			}else if (이주민들[반복횟수].직업 == "채굴꾼") {
//				마을.채굴꾼++;
//			}
//			반복횟수++;
//		}
//		ArrayList<이주민> 이주민들 = new ArrayList<>();
//		이주민 정의정= new 이주민();
//		이주민 손선영= new 이주민();
//		System.out.println(이주민들.get(0).이름);
//		이주민들.add(정의정);
//		이주민들.add(손선영);
//		이주민들.add(10);
//		System.out.println(numbers);
//		System.out.println(이주민들.get(0).이름);
//		System.out.println(이주민들.get(0).직업);
//		이주민들.get(0).정보를_확인하다();
//		
//		System.out.println(이주민들.get(1).이름);
//		System.out.println(이주민들.get(1).직업);
//		이주민들.get(1).정보를_확인하다();
//		System.out.println(이주민들[1].이름);
//		마을.정보를_확인하다();
//		
//		//사람을 고용하다.
//		족장.고용하다(3,3);
//		

//		마을.정보를_확인하다();

//		//건물선택메뉴
//		boolean 입력오류 = true;
//		while(입력오류 == true) {
//			System.out.println("건물을 지으시겠습니까?(예:1/아니요:2)\n");
//			int 선택 = 사용자입력.nextInt();
//			System.out.println(선택);
//			
//			if(선택 == 1) {
//				족장.건물을_짓는다();
//				입력오류 = false;
//			} else if(선택 == 2) {
//				족장.건물을_철거한다();
//				입력오류 = false;
//			} else {
//				System.out.println("잘못입력하셨습니다. 다시입력하여 주십시오\n");
//				입력오류 = true;
//			}
//		}
//	

//		System.out.println(초+"초 \n");

//		int year = 캘린더.get(Calendar.YEAR);
//		System.out.print("년: "+year+"\n");

	} // 메인
}
