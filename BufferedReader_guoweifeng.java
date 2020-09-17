import java.io.*;

public class BufferedReader_guoweifeng {
	public static void main(String[] args) throws Exception {
		BufferedReader buf = null;
		
		buf = new BufferedReader(new FileReader(new File("C:\\Users\\Administrator\\Desktop"+File.separator+"test.txt")));
		String str = null;
		str = buf.readLine();
		System.out.println("test.txt内容为：" + str);
	}
}
