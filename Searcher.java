import java.util.ArrayList;

public class Searcher {

	ArrayList<Definition> list;

	public Searcher(ArrayList<Definition> l) {
     	list = l;
	}

	public Definition search(String d) {
		for(Definition def: list) {
			if((def.hasAlts() && def.checkEngs(d)) || def.getEng().equals(d) || def.getSpan().equals(d))
				return def;
		}
		return null;
	}
}
