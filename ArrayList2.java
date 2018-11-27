import java.util.ArrayList;
public class ArrayList2{
	public static void main(String[]args){
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();

		for(int i = 1; i <= 10; i++){
			list1.add(i);
			list2.add(i);
			list3.add(i);
		}
		System.out.println(combine(list1, list2));
		withComma(list1);
		System.out.println();

		list3.add(1);
		list3.add(5);
		System.out.println(removeDuplicates(list3));
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

	public static void withComma(ArrayList<Integer> a){
		for(int i = 0; i < a.size(); i++){
			System.out.print(a.get(i)+", ");
		}
	}
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> a){
		for(int i = 0; i < a.size(); i++){
			for(int h = i+1; h < a.size(); h++){
				if(a.get(i) == a.get(h)){
					a.remove(i);
					a.remove(h-1);
					i = 0;
					h = i+1;
				}
			}
		}
		return a;
	}
}