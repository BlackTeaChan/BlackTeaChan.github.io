public class MyClass {
	// ºÚÌÒ£¨Spade£©
	// ºìÌÒ£¨Heart£©
	// ·½¿é£¨Diamond£©
	// Ã·»¨£¨Club£©
	public static void main(String[] ages) {
		GetPoker gp = new GetPoker();

	}

}

class GetPoker {
	String color[] = { "S", "H", "D", "C" };
	char level[] = { 'A', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'J',
			'Q', 'K' };
	String[] poker = new String[55];
	int i = 1;
	{
		for (int k = 0; k < 13; k++) {
			for (int j = 0; j < 4; j++) {
				poker[i++] = (color[j] + level[k]);
			}
		}
		poker[53] = "J1";
		poker[54] = "J2";
		// for(i=1;i<55;i++)
		// System.out.println("poker[" + i + "]:" + poker[i]);
	}
}