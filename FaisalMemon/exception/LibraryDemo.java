package FaisalMemon.exception;

class Library{
    int availableBook = 3;

//    public void borrowBook(int requestedBook){
//       try {
//           int[] books = {101,102,103};
//           System.out.println("Requested Book is : "+books[requestedBook]);
//       }catch (ArrayIndexOutOfBoundsException e){
//           System.out.println("Exception occur, You are accessing wrong book");
//       }catch (NullPointerException e){
//           System.out.println("Null pointer Exception ");
//       }finally {
//           System.out.println("Library management call");
//       }
//    }

    // throw
//    public void borrowBook(int requestedBookCount){
//        try {
//            if(availableBook < requestedBookCount) throw new RuntimeException("Not enough books available");
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception occur, You are accessing wrong book");
//        }catch (Exception e){
//            System.out.println("Exception ");
//        }finally {
//            System.out.println("Library management call");
//        }
//    }

    // throws
    public void borrowBook(int requestedBookCount) throws Exception{
        if(requestedBookCount < 0) throw new InValidBookAccess("Please enter valid request");
        if (availableBook < requestedBookCount) throw new BookUnavailbleException("Not enough books available");

    }
}
public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();
        try {
            library.borrowBook(-1);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
