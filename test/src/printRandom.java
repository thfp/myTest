public class printRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 2013-04-01=134.0
		String out = "";
		for (int i = 1; i < 13; i++)
			if (i < 10)
				out = out + "2013-04-0" + i + "=" + (int)(Math.random() * 200) + "|";
			else
				out = out + "2013-04-" + i + "=" + (int)(Math.random() * 200) + "|";
		String randResult = out.substring(0, out.length()-1);
		System.out.println(randResult);
	}
}
