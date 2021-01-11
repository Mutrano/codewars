import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {
	public static void main(String[] args) {
		//testing
		System.out.println(sortDesc(12345));
		System.out.println(sortDesc(156423465));
		System.out.println(sortDesc(123456789));
	}
  public static int sortDesc(final int num) {
        Integer entry = num;
    String temp = entry.toString();
    
    List<Integer> list = new ArrayList<Integer>();
    for(int i =0;i<temp.length();i++) {
      list.add(Character.getNumericValue(temp.charAt(i)));
    }
    Collections.sort(list, Collections.reverseOrder());;

    temp ="";
    for(Integer k:list) {
      temp=temp.concat(k.toString());
    }
    return Integer.parseInt(temp);
  }
}