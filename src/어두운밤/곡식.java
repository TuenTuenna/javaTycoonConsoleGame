package 어두운밤;

public class 곡식 extends 식량{
	
	private int 보존시간;
	private int 유통기한;
	private int 수량;
	곡식(){
		this.유통기한 = this.유통기한 * 3;
	}
	public void	 벌레가_생기다() {
		if(this.보존시간 > 유통기한) {
			System.out.println(this.종류 +"가 "+this.수량+"벌레먹었다.");
		}
		System.out.println("벌레 먹어서 그런지 곡식의 양이 줄어든거 같다.");
		this.수량 -= this.수량/3;
	}
	public void 밀가루_되다() {
		
	}
}
