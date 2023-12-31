package Week8.Ex11;
import Week8.Ex11.Book;
import Week8.Ex11.Box;
import Week8.Ex11.CD;
import Week8.Ex11.ToBeStored;

public class Main {

    public static void main(String[] args) {


        Box box = new Box(10);

        box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box.add( new Book("Robert Martin", "Clean Code", 1) );
        box.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

        box.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );

        System.out.println( box );

        Box bigBox = new Box(100);

        bigBox.add(box);

        System.out.println(bigBox);

        Box littleBox = new Box(4);

        littleBox.add(box);
        System.out.println(littleBox);

    }
}