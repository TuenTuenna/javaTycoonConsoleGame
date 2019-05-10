package 어두운밤;

public class 식량 extends 자원{
	int 포만감=3;
	int 보존시간=0;
	int 유통기한=10;
	int 부패된_식량=0;
	public int 부패하다() {
		if(this.보존시간 > 유통기한) {
			System.out.println(this.종류 +"가 "+this.수량+"덩어리가 부패되었다.");
		}
		System.out.println("먹으면 병에 걸릴것만 같다.");
		return this.수량;
	}
	
	public int 포만감을_주다() {
		return this.포만감;
	}
}
