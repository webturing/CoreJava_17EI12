package lec13final;

import java.io.File;

public class FileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file=new File("E:/qqmusic");
		if(file.exists()){
			System.out.println("Ŀ¼�Ѿ�����!");
		}else{
			System.out.println("Ŀ¼������");
			file.mkdir();
			System.out.println("Ŀ¼������");
		}
	


	}

}
