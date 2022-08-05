package com.kenzie.library;

//import dependencies
import com.kenzie.library.book.service.BookRequestService;
import com.kenzie.library.logger.service.Logger;
import com.kenzie.library.model.LibraryBook;

import java.util.ArrayList;



public class Application {
    public static LibraryBook convertResponseToLibraryBook(String response){
        LibraryBook responseLB = new LibraryBook();
        responseLB.setBookInfo(response);
        return responseLB;
    }


    public static ArrayList<LibraryBook> returnBookList(String response1,
                                                        String response2,
                                                        String response3,
                                                        String response4,
                                                        String response5) {
        ArrayList<LibraryBook> libraryBookArrayList = new ArrayList<LibraryBook>();
        libraryBookArrayList.add(convertResponseToLibraryBook(response1));
        libraryBookArrayList.add(convertResponseToLibraryBook(response2));
        libraryBookArrayList.add(convertResponseToLibraryBook(response3));
        libraryBookArrayList.add(convertResponseToLibraryBook(response4));
        libraryBookArrayList.add(convertResponseToLibraryBook(response5));
        return libraryBookArrayList;
    }

    public static void main(String[] args) {
        //Use these constant values as input
        final String BOOK_1 = "The Hobbit|J.R.R. Tolkien||";
        final String BOOK_2 = "Dune|Frank Herbert||";
        final String BOOK_3 = "The Nonsense Book|Mr. Myzlplk||";
        final String BOOK_4 = "The Cat in the Hat|Dr. Seuss||";
        final String BOOK_5 = "The Art of War|Sun Tzu||";

        try {
            //Write code inside this try/catch block
            //1. Instantiate Singleton Logger object to log: "Process starting"
            //2. Repeat for all five books listed (you do not need to loop):
            //      a. Call BookRequestService.sendGetRequest()
            //      b. Get the String response as the return value
            //      c. Use Logger to log each response string
            // 3. Write a public static method convertResponseToLibraryBook() in Appplication.java
            //      a. the method takes in a response string
            //      b. instantiate a LibraryBook object
            //      c. use the response string to set book info
            //      d. return the LibraryBook object
            // 4. Write a public static method returnBookList() in Application.java
            //      a. the method takes in 5 formatted Strings
            //      b. within the method, instantiate the LibraryBook objects
            //      c. Add the LibraryBook objects to an ArrayList<LibraryBook>
            //      d. return the Arraylist<LibraryBook>
            //5. Call the returnBookList() and print the results with System.out.println()
            //        to make sure the method works and toString() is overridden.
            //6. User Logger to log: "Process complete"
            //7. Unit Test your code with LibraryBookTest.java and ApplicationTest.java

            //use logger to log
            Logger singleLogger = Logger.getInstance();
            singleLogger.logMessage("Process starting");

            //using BookRequestService.sendGetRequest() and log each string
            String response1 = BookRequestService.sendGetRequest(BOOK_1);
            singleLogger.logMessage(response1);

            String response2 = BookRequestService.sendGetRequest(BOOK_2);
            singleLogger.logMessage(response2);

            String response3 = BookRequestService.sendGetRequest(BOOK_3);
            singleLogger.logMessage(response3);

            String response4 = BookRequestService.sendGetRequest(BOOK_4);
            singleLogger.logMessage(response4);

            String response5 = BookRequestService.sendGetRequest(BOOK_5);
            singleLogger.logMessage(response5);

            //call returnBookList() and print
            System.out.println(returnBookList(response1, response2, response3, response4, response5));

            //use Logger to log
            singleLogger.logMessage("Process complete");
    }
        catch (Exception e){
            System.out.println("Error occurred: unable to request book info");
            System.out.println("Exception info:" + e.getMessage());
        }
    }

}
