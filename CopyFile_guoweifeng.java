import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile_guoweifeng {
	
	public static void main(String[] args) throws Exception {
		String src = "C:\\Users\\Administrator\\Desktop"+File.separator+"myfile.txt";
		String dat = "C:\\Users\\Administrator\\Desktop"+File.separator+"myfile_cp2.txt";
		copy(src, dat);
	}
	
	public static void copy(String src,String dat) throws Exception {
		File inFile = new File(src);
		File outFile = new File(dat);
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		FileInputStream fis = new FileInputStream(inFile);
		FileOutputStream fos = new FileOutputStream(outFile);
		
		bis = new BufferedInputStream(fis);
		bos = new BufferedOutputStream(fos);
		
		byte[] b = new byte[1024];
		int len;
		while ((len = bis.read(b)) != -1) {
			bos.write(b, 0, len);
			bos.flush();		
		}
		bos.close();
		bis.close();
	}
}
