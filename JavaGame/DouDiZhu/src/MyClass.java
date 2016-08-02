public class MyClass {
	// 黑桃（Spade）
	// 红桃（Heart）
	// 方块（Diamond）
	// 梅花（Club）
	public static void main(String[] ages) {
		GetPoker gp = new GetPoker();
		gp.TestPoker();
		gp.GetPlayer1();
		gp.GetPlayer2();
		gp.GetPlayer3();
		gp.TestPlayer1();
		gp.TestPlayer2();
		gp.TestPlayer3();
	}
}
class GetPoker {
	private int i=1;
	private int random;
	String color[] = { "S", "H", "D", "C" };
	char level[] = { '3', '4', '5', '6', '7', '8', '9', '0', 'J','Q', 'K', 'A', '2' };
	String[] poker = new String[55];
	String[] player1=new String[21];
	String[] player2=new String[21];
	String[] player3=new String[21];
	GetPoker(){
		for (int k = 0; k < 13; k++)
			for (int j = 0; j < 4; j++)
				poker[i++] = (color[j] + level[k]);
		poker[53] = "J1";
		poker[54] = "J2";
	}
	void GetPlayer1(){
		for(i=1;i<=17;i++){
			random=(int)(Math.random()*54+1);//随机生成一个数random，用来给player1发牌；
			if(poker[random]=="void"){//检测到扑克牌为void时，说明已经发过这张牌，换一张；
				i--;
				continue;
			}
			player1[i]=poker[random];
			poker[random]="void";//已经发过的牌String值改为“void”；
		}
	}
	void GetPlayer2(){
		for(i=1;i<=17;i++){
			random=(int)(Math.random()*54+1);
			if(poker[random]=="void"){
				i--;
				continue;
			}
			player2[i]=poker[random];
			poker[random]="void";
		}
	}
	void GetPlayer3(){
		for(i=1;i<=17;i++){
			random=(int)(Math.random()*54+1);
			if(poker[random]=="void"){
				i--;
				continue;
			}
			player3[i]=poker[random];
			poker[random]="void";
		}
	}
	void TestPoker(){
		for(i=1;i<55;i++){
			System.out.println("poker[" + i + "]:" + poker[i]);
//			try {
//				Thread.sleep(100);
//	        } catch (InterruptedException e) {
//	            e.printStackTrace(); 
//	        }
		}
	}
	void TestPlayer1(){
		for(i=1;i<=17;i++)
			System.out.println("player1[" + i + "]:" + player1[i]);
	}
	void TestPlayer2(){
		for(i=1;i<=17;i++)
			System.out.println("player2[" + i + "]:" + player2[i]);
	}
	void TestPlayer3(){
		for(i=1;i<=17;i++)
			System.out.println("player3[" + i + "]:" + player3[i]);
	}
}