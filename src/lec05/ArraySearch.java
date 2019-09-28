package lec05;

public class ArraySearch {
    public static void main(String[] args) {
        int []a={1,2,13,23,1,13,12,3,17,12,3,123,123};
        int key=13;
        int pos=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                pos=i;
                break;
            }
        }
        if(pos>=0){
            System.out.println(key+" at pos= "+pos);
        }else {
            System.out.println("NOT FOUND");
        }

    }
}
