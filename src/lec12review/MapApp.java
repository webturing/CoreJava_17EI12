package lec12review;
import java.util.TreeMap;


public class MapApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int S[]={1,2,2,2,1,1,3,2,2,2,3,5};
		TreeMap<Integer,Integer> M=new TreeMap<Integer,Integer>();
		for(int i:S){
			if(M.containsKey(i)){
				M.put(i, M.get(i)+1);
			}else{
				M.put(i, 1);
			}
		}
		System.out.println(M);
		int v=S[0],f=1;
		for(Integer i:M.keySet()){
			if(M.get(i)>f){
				v=i;
				f=M.get(i);
			}
		}
		System.out.println(v);
		System.out.println(f);

	}

}
