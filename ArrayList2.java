import java.util.ArrayList;
public class ArrayList2{
	public static void main(String[]args){
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		for(int i = 1; i <= 10; i++){
			list1.add(i);
			list2.add(i);
		}
	}
	public static ArrayList<Integer> combine(ArrayList<Integer> a, ArrayList<Integer> b){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < a.size(); i++){
			list.add(a.get(i));
		}
		for(int i = 0; i < b.size(); i++){
			list.add(b.get(i));
		}
		return list;
	}
}