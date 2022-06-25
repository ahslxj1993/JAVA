package ex18_10_File;

import java.io.*;


public class copy_image {
	public static void main(String[] args) {
		String origialdir = "C:\\temp";
		String targetdir = "C:\\target";
		String origialFileName = "MyKoala.png";
		String targetFileName = "MyKoala_copy.png";
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		
		try {
			in = new BufferedInputStream(new FileInputStream(origialdir+"\\"+origialFileName));
			
			File to = new File(targetdir);
			
			if(!to.exists()) {
				if (to.mkdir()) {
					System.out.println("디렉토리 생성");
				}else {
					System.out.println("디렉토리 생성 실패");
					return;
				}
			}
			
			out = new BufferedOutputStream(
					new FileOutputStream(targetdir+"\\"+targetFileName));
			
			int readCount;
			byte [] readBytes = new byte[1024];
			
			while((readCount = in.read(readBytes)) != -1) {
				out.write(readBytes);
			}
			System.out.println("복사 완료");
		} catch(FileNotFoundException fnfe) {
			System.out.println("파일이 없음");
		}catch (IOException ioe) {
			System.out.println("파일을 읽을수 없음");
		}finally {
			try {
				if(in !=null)
					in.close();
			}
			catch (Exception e) {
				e.printStackTrace();;
			}
			
			try {
				if(out !=null)
					out.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*FileInputStream original = null;
		FileOutputStream copy = null;
		
		File f1 = new File("C:\\temp\\Mykoala.png");
		File dir = new File("C:\\target");
		File f2 = new File("C:\\target\\MyKoala.png");
		
		if (f1.exists()) {
			if(!dir.exists()) { 
				if(dir.mkdir()) { 
					System.out.println("새로 만든 디렉토리 이름 : "+f2.getPath());
				} else {
					System.out.println("디렉토리 생성에 실패했습니다.");
				}
			} else { 
				System.out.println("이미 있는 디렉토리 이름 : "+f2.getPath());
			}
		} else {
			System.out.println(f1+"파일이 없습니다.");
		}
		
		if(!f2.exists()) {
			try {
				original = new FileInputStream("C:\\temp\\Mykoala.png");
				copy = new FileOutputStream("C:\\target\\MyKoala.png");
				
				byte[] readBytes = new byte[1024];
				
				int readCount;
				
				while(true) {
					readCount = original.read(readBytes);
					
					if(readCount == -1)
						break;
					//copy.write(readBytes,0,readCount);
					copy.write(readBytes);
				}
				System.out.println("파일 복사 완료");
			} catch(FileNotFoundException fnfe) {
				System.out.println("파일이 없음");
			}catch (IOException ioe) {
				System.out.println("파일을 읽을수 없음");
			}finally {
				try {
					if(original !=null)
						original.close();
				}
				catch (Exception e) {
					e.printStackTrace();;
				}
				
				try {
					if(copy !=null)
						copy.close();
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}*/
	}
}
