public class Artist {


	private String Artist_Name;

	Artist(String name){
	this.Artist_Name=name;
	}

	public void setName(String name){
		this.Artist_Name=name;
		
	}

	public String getName(){
	
	return Artist_Name;
}

	public void display(){
	System.out.println("Artist Name: "+ Artist_Name);
	}

}