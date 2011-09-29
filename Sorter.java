import java.util.ArrayList;

public class Sorter {
 	
	public ArrayList<Definition> sortByEnglish(ArrayList<Definition> list) {
		ArrayList<Definition> result = new ArrayList(list);
		boolean done = false;
		while(!done) {
         	done = true;
			for(int i=1; i<result.size();i++) {
             	if(result.get(i-1).getEng().compareTo(result.get(i).getEng()) > 0) {
                 	swap(result, i-1, i);
					done = false;
				}
			}
		}
		return result;
	}

	public ArrayList<Definition> sortVerbs(ArrayList<Definition> list) {
     	ArrayList<Definition> result = new ArrayList(list);
		for(Definition def: list) {
         	String s = def.getSpan();
			if (s.substring(s.length()-2, s.length()).equals("ar") ||
				s.substring(s.length()-2, s.length()).equals("er") ||
				s.substring(s.length()-2, s.length()).equals("ir"))
				result.add(def);
		}
		return result;
	}

	public void swap(ArrayList<Definition> list, int a, int b) {
     	Definition tmp = list.get(a);
		list.set(a, list.get(b));
		list.set(b, tmp);
	}
}
