
public class MovieNode {
	public String movieName;
	public MovieNode next;
	
	public MovieNode(String movieName, MovieNode next){
		this.movieName = movieName;
		this.next = next;
	}
	
	public String toString(){
		return movieName;
	}
}
