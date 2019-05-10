package 어두운밤;

public class 자재 extends 자원{

	자재(int 자재선택){
		String 자재종류[] = new String [2];
		자재종류[0] = "나무";
		자재종류[1] = "석재";
		switch (자재선택-1){
		case 0: 종류 = 자재종류[0];//나무
				채집시간 = 3;
		break;
		case 1: 종류 = 자재종류[0];//석재
				채집시간 = 7;
		break;
		}
		
		
	}
}
