package unit_2;

public class Books {
    //declaring the instance variables of the Books class
    private static String book_title;

    private static String book_author;

    private static int page_nums;

    private static int rating1;

    private static int rating2;

    private static int rating3;


    //First constructor for objects of class Books
    public Books(String title, String author, int pages) {

        // initialise instance variables
        book_title = title;

        book_author = author;

        page_nums = pages;

        //using the addRating() method to set the ratings
        rating1 = addRatings();

        rating2 = addRatings();

        rating3 = addRatings();

    }


    //overloaded constructor for objects of class Books
    public Books(int pages) {
        // initialise instance variables
        book_title = "Bumper To Bumper";

        book_author = "Doug Demuro";

        page_nums = pages;

        //using the addRating() method to set the ratings
        rating1 = addRatings();

        rating2 = addRatings();

        rating3 = addRatings();
    }

    public static void main(String[] args) {
        // creates the book1 object
        Books book1 = new Books("Dog Days", "Jeff Kinney", 150);

        int book1_r1 = book1.rating1;//stores the first rating for book1

        int book1_r2 = book1.rating2;//stores the second rating for book1

        int book1_r3 = book1.rating3;//stores the third rating for book1

        int book1_pages = book1.page_nums; //stores the author for book1

        String book1_author = book1.book_author; //stores the author for book
        
        String book1_title = book1.book_title; //stores the title for book

        book1.printInfo(); //calls the printInfo method to print all of the info 
        

        Books book2 = new Books(100);

        int book2_r1 = book2.rating1;//stores the first rating for book2

        int book2_r2 = book2.rating2;//stores the second rating for book2

        int book2_r3 = book2.rating3;//stores the third rating for book2

        int book2_pages = book2.page_nums; //stores the pages for book2

        String book2_author = book2.book_author; //stores the author for book2

        String book2_title = book2.book_title; //stores the title for book

        book2.printInfo();//calls the print function

        Books book3 = new Books("Minecraft: Guide to : Creative", "Mojang", 250);

        int book3_r1 = book3.rating1;//stores the first rating for book3

        int book3_r2 = book3.rating2;//stores the second rating for book3

        int book3_r3 = book3.rating3;//stores the third rating for book3

        int book3_pages = book3.page_nums; //stores the pages for book3

        String book3_author = book3.book_author; //stores the author for book3

        String book3_title = book3.book_title; //stores the title for book

        book3.printInfo();// calls the print function

        Books book4 = new Books(100);

        int book4_r1 = book4.rating1;// stores the first rating for book4

        int book4_r2 = book4.rating2;// stores the second rating for book4

        int book4_r3 = book4.rating3;// stores the third rating for book4

        int book4_pages = book4.page_nums; //stores the pages for book4

        String book4_author = book4.book_author; //stores the author for book3

        String book4_title = book4.book_title; //stores the title for book

        book4.printInfo();// calls the print function


        // Summary
        int totalPages = book1_pages + book2_pages + book3_pages + book4_pages; //adds up all of the page values

        int totalLetters = book1_title.length() + book2_title.length() + book3_title.length() + book4_title.length(); // gets the length of all the titles then adds them to int value

        String firstLetter = book1_author.substring(0, 1) + book2_author.substring(0, 1) + book3_author.substring(0, 1) + book4_author.substring(0, 1); //gets the first letter of each author and then concatenats them

        String lastLetter = book1_title.substring(7) + book2_title.substring(15) + book3_title.substring(29) + book4_title.substring(15); //gets the last letter of each title and concatenats them

        double totalAvgRating = (double) (book1_r1 + book1_r2 + book1_r3 + //adds book1 ratings and makes the whole sum a double type
                                          book2_r1 + book2_r2 + book2_r3 + //adds book2 ratings
                                          book3_r1 + book3_r2 + book3_r3 + //adds book3 ratings
                                          book4_r1 + book4_r2 + book4_r3) / 9; //adds the book4 ratings and divides the whole sum by 9 to get the average

        System.out.println("Total Pages: " + totalPages);//prints the total pages

        System.out.println("Total Letters: " + totalLetters); //prints the total amount of characters in the titles

        System.out.println("All First Letters(Author): " + firstLetter); //prints all of the first letter of authors names

        System.out.println("All Last Letters(Titles): " + lastLetter); //prints all of the last letters of the titles

        System.out.println("Average Rating: " + String.format("%.2f", totalAvgRating)); //prints the average rating and formats the double to 2 decimal places

        System.out.println();// added line for separation of the output

    }

    // static method use Math.random to return a rating from 0 to 5
    public static int addRatings() {

        int rating = (int) (Math.random() * 6);

        return rating;
    }

    // method prints all of the attribues of the object
    public static void printInfo() {

        System.out.println("Title: " + book_title); //prints the book title

        System.out.println("Author: " + book_author); //prints the author

        System.out.println("Pages: " + page_nums); //prints the pages

        System.out.println("Ratings: a." + rating1 + " b." + rating2 + " c." + rating3); // prints the three ratings
        
        System.out.println();// added line for separation of the output
    }
}
