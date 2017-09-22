import java.util.NoSuchElementException;
/*Viranchi is working on this*/
public class LinkedListApp {

	public static void main(String[] args) {
		MovieNode front=null;
		
		System.out.println("Add Operation");
		String movieName= "two states";
		front = addMovie(front, movieName);
		//System.out.println(front);
		
		movieName= "3 idiots";
		front = addMovie(front, movieName);
		//System.out.println(front);
		
		movieName= "one night at call center";
		front = addMovie(front, movieName);
		//System.out.println(front);
		
		movieName= "koi po che";
		front = addMovie(front, movieName);
		//System.out.println(front);
		
		/*System.out.println("Delete Operation");
		front = deleteMovie(front);
		System.out.println(front);
		
		front = deleteMovie(front);
		System.out.println(front);*/
		
		System.out.println("Count of all elements in linkedlist");
		int j = countElement(front);
		System.out.println(j);
		//System.out.println("last movie add :"+front);
		
		addMovieBet(front, "pk",1);
		j = countElement(front);
		System.out.println(j);
		
		front = deleteMovieBet(front, "3 idiots");
		j = countElement(front);
		System.out.println(j);
	}
	
	public static MovieNode addMovie(MovieNode front, String movieName){
		MovieNode temp = new MovieNode(movieName, front);
		return temp;
	}
	
	public static MovieNode deleteMovie(MovieNode front){
		if(front == null){
			throw new NoSuchElementException();
		}
		return front.next;
	}
	
	public static int countElement(MovieNode front){
		int i=0;
		while(front!= null){
			i++;
			front = front.next;
		}
		return i;
	}
	
	public static void addMovieBet(MovieNode front, String movieName, int position){
		MovieNode temp = new MovieNode(movieName, null);
		
		for(int i=0; i<=position;i++){
			front = front.next;
			//System.out.println(front);
		}
		temp.next = front.next;
		front.next= temp;
	}
	
/*	public static MovieNode deleteMovieBet(MovieNode front, String movieName){
		System.out.println(front);
		if(front.toString()==movieName){
			front = deleteMovie(front);
		}
		else{
			while(front.next.toString()!=movieName)
				front = front.next;
			MovieNode temp = front.next;
			front = temp.next;
		}
		return front;
	}*/
	public static MovieNode deleteMovieBet(MovieNode front, String movieName){
		//System.out.println(front);
		MovieNode front1 = front;
		if(front.toString()==movieName){
			front = front.next;
		}
		else{
			front = front.next;
			while(front.toString()!=movieName){
				front = front.next;
			}
			front.next= front.next.next;
		}
		return front1;
	}
}
