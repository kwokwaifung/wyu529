package cn.ibm.homework.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderWriter_guoweifeng {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\Administrator\\Desktop\\test" + File.separator + "a.txt");
		file.createNewFile();
		Writer out = new FileWriter(file);
		String str = "Hi World";
		out.write(str);
		out.close();
		out = new FileWriter(file, true);
		str = "\nHello World";
		out.write(str);
		out.close();
		Reader reader = new FileReader(file);
		char ch[] = new char[1024];
		int len = reader.read(ch);
		reader.close();
		System.out.println("Ìí¼ÓºóµÄƒÈÈÝ£º");
		System.out.println(new String(ch, 0, len));
	}
}
