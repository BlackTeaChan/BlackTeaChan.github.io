public class MyClass {
	// ���ң�Spade��
	// ���ң�Heart��
	// ���飨Diamond��
	// ÷����Club��
	public static void main(String[] ages) {
		System.out.println("������ 0.0 beta    By BlackTea Chan");
		Run run=new Run();
	}
}
class GetPoker {
	private int i=1;
	private int random;
	String color[] = { "S", "H", "D", "C" };
	char level[] = { '3', '4', '5', '6', '7', '8', '9', '0', 'J','Q', 'K', 'A', '2' };
	String[] poker1 = new String[55];
	String[] poker2 = new String[55];
	String[] player1=new String[21];
	String[] player2=new String[21];
	String[] player3=new String[21];
	String[] dizhu=new String[3];
	GetPoker(){
		for (int k = 0; k < 13; k++)
			for (int j = 0; j < 4; j++){
				poker1[i] = (color[j] + level[k]);
				poker2[i++] = (color[j] + level[k]);
			}
		poker1[53] = "J1";
		poker1[54] = "J2";
		poker2[53] = "J1";
		poker2[54] = "J2";
		for(i=0;i<3;i++){
			random=(int)(Math.random()*54+1);
			if(poker1[random]=="void"){
				i--;
				continue;
			}
			dizhu[i]=poker1[random];
			poker1[random]="void";
		}
	}
	void GetPlayer1(){
		for(i=1;i<=17;i++){
			random=(int)(Math.random()*54+1);//�������һ����random��������player1���ƣ�
			if(poker1[random]=="void"){//��⵽�˿���Ϊvoidʱ��˵���Ѿ����������ƣ���һ�ţ�
				i--;
				continue;
			}
			player1[i]=poker1[random];
			poker1[random]="void";//�Ѿ���������Stringֵ��Ϊ��void����
		}
	}
	void GetPlayer2(){
		for(i=1;i<=17;i++){
			random=(int)(Math.random()*54+1);
			if(poker1[random]=="void"){
				i--;
				continue;
			}
			player2[i]=poker1[random];
			poker1[random]="void";
		}
	}
	void GetPlayer3(){
		for(i=1;i<=17;i++){
			random=(int)(Math.random()*54+1);
			if(poker1[random]=="void"){
				i--;
				continue;
			}
			player3[i]=poker1[random];
			poker1[random]="void";
		}
	}
	
	
	void TestPoker(){
		for(i=1;i<55;i++){
			System.out.println("poker[" + i + "]:" + poker1[i]);
//			try {
//				Thread.sleep(100);
//	        } catch (InterruptedException e) {
//	            e.printStackTrace(); 
//	        }
		}
	}
	void TestPlayer1(){
		System.out.println("���һ�˿��ƣ�");
		for(i=1;i<=17;i++){
			if(player1[i]=="void")continue;
			System.out.printf(player1[i]+" ");
		}
	}
	void TestPlayer2(){
		for(i=1;i<=17;i++)
			System.out.println("player2[" + i + "]:" + player2[i]);
	}
	void TestPlayer3(){
		for(i=1;i<=17;i++)
			System.out.println("player3[" + i + "]:" + player3[i]);
	}
	void TestDiZhu(){
		System.out.println("�����ƣ�"+dizhu[0]+","+dizhu[1]+","+dizhu[2]);
	}
}
class Run extends GetPoker{
	Run(){
		this.GetPlayer1();
		this.GetPlayer2();
		this.GetPlayer3();
		this.TestPlayer1();
	}
}