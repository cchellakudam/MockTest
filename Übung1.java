
public class Übung1 {

	public int add(int i, int j){
		if(i==0||j==0){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i+j;
		
	}
}
