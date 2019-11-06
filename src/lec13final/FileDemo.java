package lec13final;

import java.io.File;

public class FileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file=new File("E:/qqmusic");
		if(file.exists()){
			System.out.println("目录已经存在!");
		}else{
			System.out.println("目录不存在");
			file.mkdir();
			System.out.println("目录被创建");
		}
	


	}

}
