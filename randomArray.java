import java.lang.Math;

public class randomArray{
	public static void main(String[] args){
		int[]array = new int[20];
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random() * 101);
		}
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
}
		
