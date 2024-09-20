public class ArtWork{

	private String title;

	private int year;

	private Artist artist;

	ArtWork(){
		this.title="No Title";
		this.year=0;
		this.artist=null;
	}
	ArtWork(String title, int year, Artist artist){
		this.title=title;
		this.year=year;
		this.artist=artist;
	}

	ArtWork(String title, int year){

	this.title=title;
	this.year=year;
	artist=new Artist("Unknown Artist");
	}

	public String getTitle(){

		return title;
	
	}
	public int getYear(){
		return year;
	}

	public Artist getArtist(){

		return artist;
	}


	public void setTitle(String title){

		this.title=title;
	}

	public void setYear(int year){
	
		this.year=year;
	}

	public void displayInformation() {
        System.out.println("Artwork : " + title);
        System.out.println("Created On: " + year);
      	artist.display();
    	}


	public ArtWork shallowCopy(){
	
		return new ArtWork(this.title,this.year,this.artist);
	
	}

	public ArtWork deepCopy(){
		Artist artist_new= new Artist(this.artist.getName());
		return new ArtWork(this.title,this.year,artist_new);
	}
}