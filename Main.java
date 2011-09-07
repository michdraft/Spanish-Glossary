import java.io.*;

public class Main {
 	public static void main(String[] args) {
		try{
			FileInputStream fsSpan = new FileInputStream("Spanish.txt");
			FileInputStream fsEng = new FileInputStream("English.txt");
			DataInputStream inSpan = new DataInputStream(fsSpan);
			DataInputStream inEng = new DataInputStream(fsEng);
			BufferedReader brSpan = new BufferedReader(new InputStreamReader(inSpan));
			BufferedReader brEng = new BufferedReader(new InputStreamReader(inEng));
			Definition[] dict = new Definition[20];
			for(int i=0; i<20; i++) {
    			String tmpSpan = brSpan.readLine();
				String tmpEng = brEng.readLine();
				dict[i] = new Definition(tmpSpan, tmpEng);
				System.out.println(dict[i].getSpan() +" "+dict[i].getEng());
			}
		}catch(IOException exc) {}
		
		Definition d = new Definition("Hola!", "Hey!");
		System.out.println(d.getEng());
	}
}
