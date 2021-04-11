package com.example.assignment3;

import java.util.ArrayList;

public class BookData {
    private static String[] title = new String[] {"Destination Anywhere", "Starry Eyes", "Love Letter to The Dead", "The Book of Lost Things", "Fantastic Beast: The Original Screenplay", "The Sullivan Sisters", "Red Queen: Red Queen #1", "War Storm: Red Queen #4", "King's Cage: Red Queen #3", "Glass World: Red Queen #2"};
    private static String[] author = new String[] {"by Sara Barnard", "by Jenn Bennett", "by Ava Dellaira", "by John Connolly", "by JK. Rowling", "by Kathryn Ormsbee", "by Victoria Aveyard", "by Victoria Aveyard", "by Victoria Aveyard", "by Victoria Aveyard"};
    private static int[] thumbnail = new int[] {R.drawable.book1, R.drawable.book2, R.drawable.book3, R.drawable.book4, R.drawable.book5, R.drawable.book6, R.drawable.book7, R.drawable.book8, R.drawable.book9, R.drawable.book10};

    public static ArrayList<BookModel> getListData(){
        BookModel bookModel = null;
        ArrayList<BookModel> list = new ArrayList<>();
        for (int i=0; i < title.length; i++){
            bookModel = new BookModel();
            bookModel.setTV(title[i]);
            bookModel.setAuthor(author[i]);
            bookModel.setIV(thumbnail[i]);
            list.add(bookModel);
        }return list;

    }
}
