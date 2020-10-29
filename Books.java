package unit_2;

public class Books {
    private static String book_title;
    private static String book_author;
    private static int page_nums;
    private static int rating1;
    private static int rating2;
    private static int rating3;

    public Books(String title, String author, int pages) {
        book_title = title;
        book_author = author;
        page_nums = pages;
        rating1 = addRatings();
        rating2 = addRatings();
        rating3 = addRatings();

    }

    public Books(int pages) {
        book_title = "Bumper To Bumper";
        book_author = "Doug Demuro";
        page_nums = pages;
        rating1 = addRatings();
        rating2 = addRatings();
        rating3 = addRatings();
    }

    public static void main(String[] args) {
        // book 1 info
        Books book1 = new Books("Dog Days", "Jeff Kinney", 150);
        int book1_r1 = book1.rating1;
        int book1_r2 = book1.rating2;
        int book1_r3 = book1.rating3;
        int book1_pages = book1.page_nums;
        String book1_author = book1.book_author;
        String book1_title = book1.book_title;
        book1.printInfo();
        

        Books book2 = new Books(0);
        int book2_r1 = book2.rating1;
        int book2_r2 = book2.rating2;
        int book2_r3 = book2.rating3;
        book2.printInfo();
        int book2_pages = book2.page_nums;
        String book2_author = book2.book_author;
        String book2_title = book2.book_title;

        Books book3 = new Books("Minecraft: Guide to : Creative", "Mojang", 250);
        int book3_r1 = book3.rating1;
        int book3_r2 = book3.rating2;
        int book3_r3 = book3.rating3;
        book3.printInfo();
        int book3_pages = book3.page_nums;
        String book3_author = book3.book_author;
        String book3_title = book3.book_title;

        Books book4 = new Books(0);
        int book4_r1 = book4.rating1;
        int book4_r2 = book4.rating2;
        int book4_r3 = book4.rating3;
        book4.printInfo();
        int book4_pages = book4.page_nums;
        String book4_author = book4.book_author;
        String book4_title = book4.book_title;

        //Summary
        int totalPages = book1_pages + book2_pages + book3_pages + book4_pages;
        int totalLetters = book1_title.length() + book2_title.length() + book3_title.length() + book4_title.length();
        String firstLetter = book1_author.substring(0,1) + book2_author.substring(0,1) + book3_author.substring(0,1) + book4_author.substring(0,1);
        String lastLetter = book1_title.substring(7) + book2_title.substring(15) + book3_title.substring(29) + book4_title.substring(15);
        double totalAvgRating = (double)(book1_r1 + book1_r2 + book1_r3 + book2_r1 + book2_r2 + book2_r3 + book3_r1 + book3_r2 + book3_r3 + book4_r1 + book4_r2 + book4_r3) / 9;
        System.out.println("Total Pages: " + totalPages);
        System.out.println("Total Letters: " + totalLetters);
        System.out.println("All First Letters(Author): " + firstLetter);
        System.out.println("All Last Letters(Titles): " + lastLetter);
        System.out.println("Average Rating: " + String.format("%.2f", totalAvgRating));
    }

    public static int addRatings() {
        int rating = (int) (Math.random() * 6);
        return rating;
    }
    

    public static void printInfo() {
        System.out.println("Title: " + book_title);
        System.out.println("Author: " + book_author);
        System.out.println("Pages: " + page_nums);
        System.out.println("Ratings: a." + rating1 + " b." + rating2 + " c." + rating3);
        System.out.println();
    }
}