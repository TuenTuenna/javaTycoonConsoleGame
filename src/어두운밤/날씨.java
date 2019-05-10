package 어두운밤;

import java.util.Random;

public class 날씨 {
	int 강우;
	int 최고온도;
	int 최저온도;
	static int 평균온도;
	int 월 = 1;
	String 계절 = "";
	
	날씨(){
		String [] 계절배열 = new String [4];
		int 계절순서=0;
		계절배열 [0] = "봄"; //3,4,5월
		계절배열 [1] = "여름"; //6,7,8월
		계절배열 [2] = "가을"; //9,10,11월
		계절배열 [3] = "겨울"; //12,1,2월
		Random 무작위 = new Random();
		월 = 무작위.nextInt(12)+1;
		
		switch (월) {
		case 1: 최고온도 = 1;
				최저온도 = -6;
				강우 = 3;
				계절 = "겨울";
			break;
		case 2: 최고온도 = 4;
				최저온도 = -4;
				강우 = 3;
				계절 = "겨울";
			break;
		case 3: 최고온도 = 10;
				최저온도 = 2;
				강우 = 4;
				계절 = "봄";
			break;
		case 4: 최고온도 = 17;
				최저온도 = 8;
				강우 = 5;
				계절 = "봄";
			break;
		case 5: 최고온도 = 22;
				최저온도 = 14;
				강우 = 5;
				계절 = "봄";
			break;
		case 6: 최고온도 = 26;
				최저온도 = 19;
				강우 = 6;
				계절 = "여름";
			break;
		case 7: 최고온도 = 28;
				최저온도 = 23;
				강우 = 13;
				계절 = "여름";
			break;
		case 8: 최고온도 = 29;
				최저온도 = 23;
				강우 = 11;
				계절 = "여름";
			break;
		case 9: 최고온도 = 25;
				최저온도 = 17;
				강우 = 7;
				계절 = "가을";
			break;
		case 10: 최고온도 = 19;
				최저온도 = 10;
				강우 = 4;
				계절 = "가을";
			break;
		case 11: 최고온도 = 11;
				 최저온도 = 3;
				 강우 = 6;
				 계절 = "가을";
			break;
		case 12: 최고온도 = 4;
				최저온도 = -3;
				강우 = 3;
				계절 = "겨울";
			break;
		} 
		평균온도 = 최고온도-최저온도/2;
		
		
	}
	
	public void 비or눈이_내리다(int 강우){
		Random 무작위 = new Random();
		int 랜덤수치 = 무작위.nextInt(20);
		int 온도랜덤 = 무작위.nextInt(10);
		if(랜덤수치 <= 강우) {
			if(계절 == "봄") {
				System.out.println("봄비가 내린다.. 새싹들이 잘 자랄것 만 같다.");
			}else if (계절 == "여름") {
				System.out.println("폭우가 떨어진다.. .");
			}else if (계절 == "가을") {
				System.out.println("가을비가 내린다..");
			}else if (계절 == "겨울") {
				System.out.println("눈이 4흘째 계속 내리고 있다.. 농작물이 자라지 않을것 같다.");
			}
		} else if (계절 == "봄" && 날씨.평균온도 > 온도랜덤)	{
			System.out.println("따스한 봄바람이 분다..");
		}else if (계절 == "여름"&& 날씨.평균온도 > 온도랜덤) {
			System.out.println("날이 매우 덥다..");
		}else if (계절 == "가을"&& 날씨.평균온도 > 온도랜덤) {
			System.out.println("하늘이 높다..");
		}else if (계절 == "겨울"&& 날씨.평균온도 > 온도랜덤) {
			System.out.println("칼바람이 불고 있다..");
		}
	}
	
	
	
	public void 날씨를_확인하다() {
		
		System.out.println("현재의 날씨를 확인합니다.");
		System.out.println("======================================");
		System.out.println("온도: " + (최고온도+최저온도/2));
		System.out.println("계절: " + 계절 );
		System.out.println("개월: " +월+" 월");
		System.out.println("======================================");
	}
		
	public void 전염병에_걸리다() {
		System.out.println("전염병이 돌았다...");
		System.out.println("산자들은 죽은자들을 추모하기 위해 돌아간다...");
	}
	
	public void 얼어죽다() {
		System.out.println("입을 옷이 없는 이들은 다음날 싸늘한 시체가 되었다..");
	}
	 
	public void 식중독에_걸리다() {
//		주민.건강수치 --;
		System.out.println("부패한 음식때문일까.. 복통을 호소하는 사람들이 늘기 시작했다..\n");
		
	}
	
	public void 농작물이_자라다() {
		System.out.println("농작물들이 자라기 시작한다...\n");
	}
	
	
}
