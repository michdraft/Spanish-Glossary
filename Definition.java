import java.util.regex.*;

class Definition {

	//Spanish Meaning
	String span;
	//English Meaning
	String eng;
	//Array of possible English meanings
	String[] engs;
	//Category or type of word
	String cat;

	boolean alts;
	
	Pattern p = Pattern.compile(", ");

	public Definition(String sp, String en) {
    	if(hasAlts(en)) {
			engs = splitEng(en);
			alts = true;
		} else {
			alts = false;
		}
		span = sp;
		eng = en;
	}

	public Definition(String sp, String en, boolean a) {
    	span = sp;
		eng = en;
        engs = splitEng(en);
		alts = true;
	}

	public boolean hasAlts() {
     	return alts;
	}

	public boolean hasAlts(String s) {
     	Matcher m = p.matcher(s);
		if(m.find())
			return true;
		return false;
	}
	
	public String[] splitEng(String en) {
		String[] result = p.split(en);
		for(int i=0;i<result.length;i++)
			System.out.println(result[i]);
		return result;
	}

	public void setCat(String c) {
     	cat = c;
	}

	public String getCat() {
     	return cat;
	}

	public String getSpan() {
		return span;
	}

	public String getEng() {
     	return eng;
	}

	public boolean checkEngs(String s) {
    	for(int i=0;i<engs.length;i++) {
            if(engs[i].equals(s))
				return true;
		}
		return false;
	}
	
	public String toString() {
    	if(alts) { 	
		    String result = span+" : ";
			for(int i=0;i<engs.length-1;i++)
				result += engs[i]+", ";
			result += engs[engs.length-1];
			return result;
		}
		return span+" : "+eng;
	}
}
