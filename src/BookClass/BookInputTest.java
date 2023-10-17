package BookClass;
import java.util.Scanner;

public class BookInputTest {

    public static void main(String[] args) {
        Book b = new Book();

        System.out.println("Please enter the title of the book");
        Scanner tt = new Scanner(System.in);
        b.title = tt.nextLine();  

        System.out.println("Please enter the author name");
        Scanner auth = new Scanner(System.in);
        b.author = auth.nextLine();  
        System.out.println("Please enter the number of pages");
        Scanner nOp = new Scanner(System.in);
        b.numberOfPages = nOp.nextInt();  
        System.out.println("The book title is: " + b.title);
        System.out.println("The book author is: " + b.author);
        System.out.println("The book has " + b.numberOfPages + " pages");
    }
}
