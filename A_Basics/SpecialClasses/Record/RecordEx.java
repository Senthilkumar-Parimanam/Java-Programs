package A_Basics.SpecialClasses.Record;

import java.util.Objects;

public class RecordEx {

    public record Book(Integer bookNumber, String bookName){

     /*   public Book {
            Objects.requireNonNull(bookNumber);
            Objects.requireNonNull(bookName);
        }


        public Book(Integer bookNumber) {
            this(bookNumber,"bookName");
        }

        public Book(String bookName) {
            this(Integer.valueOf(100),bookName);
        }*/

        public Book(Integer bookNumber, String bookName){
            this.bookNumber = 100;
            this.bookName = "book";
        }

    }

    public static void main(String[] arg){

        Book book1 = new Book(100, "CC++");
        System.out.println(" Book Value :: "+ book1.bookName());


    }
}
