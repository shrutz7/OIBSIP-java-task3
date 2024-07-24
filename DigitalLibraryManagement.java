import java.util.*;

class DigitalLibraryManagement{
    HashMap<String,Integer> loginto = new HashMap<>();
    HashMap<Integer,String> map = new HashMap<>();
    public static String userID;
    public static int issues = 0;
    Scanner sc=new Scanner(System.in);
    
    
    public HashMap<Integer,String> book_database_server()
    {
        map.put(1,"The City and The City");
        map.put(2,"Shovel Ready");
        map.put(3,"The Shinning Girls");
        map.put(4,"A Good Girl's Guide to Murder");
        map.put(5,"A Silent Patient");
        map.put(6,"The Guest List");
        map.put(7,"The Intuitionist");
        map.put(8,"The Case Book of Sherlock Holmes");
        map.put(9,"Murder on the Links");
        map.put(10,"Pride and Prejudice");
        map.put(11,"Next in Line");
        map.put(12,"Station Eternity");
        map.put(13,"Blind Spots");
        map.put(14,"The Keepers of Secrets");
        map.put(15,"The Paradox Hotel");
        map.put(16,"Lost in Time");
        map.put(17,"The Storyteller's Death");
        map.put(18,"The Spare Man");
        map.put(19,"A Memory Called Empire");
        map.put(20,"BBA : Economics for Engineers");
        map.put(21,"The Caves of Steel");
        map.put(22,"Altered Carbon");
        map.put(23,"The Girl with The Dragon Tattoo");
        map.put(24,"And Then There Were None");
        map.put(25,"Rebecca");
        map.put(26,"In Cold Blood");
        map.put(27,"The Name of The Rose");
        map.put(28,"Gone Girl");
        map.put(29,"Mystic River");
        map.put(30,"Shutter Island");
        
        return map;
    }
    
    public void homepage()
    {
        System.out.println("--------------------------------------------------------");
        System.out.println("----- WELCOME TO DIGITAL LIBRARY MANAGEMENT SYSTEM -----");
        System.out.println("----------------------- HOMEPAGE -----------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("Please Select One Option, " + "\n");
        System.out.println("1.>>> Admin Login >>>");
        System.out.println("2.>>> User Login >>>");
        System.out.println("3.>>> Exit >>>");
        System.out.println("--------------------------------------------------------");
        System.out.print("Select Option(1,2,3): ");
        int sp=sc.nextInt();
        switch(sp){
            case 1: 
            	admin_login();
            	break;
            case 2: 
            	user_login();
            	break;
            case 3:
                System.out.print("\n" + "Do You want to Exit? (Y/N): ");
                String exit = sc.next();
                if(exit.equalsIgnoreCase("Y"))
                {
                    System.out.println("\n" + "--------------------------------------------------------");
                    System.out.println("\n" + "YOU HAVE EXITTED SUCCESSFULLY!");
                    System.out.println("\n" + "--------------------------------------------------------");
                    System.out.println("\n" + "Thank You! Do Visit Again.");
                    System.out.println("\n" + "--------------------------------------------------------");
                	System.exit(0);
                }
                else{
                    System.out.println("\n" + "Exit cancelled, you will be redirected to the home page.");
                    homepage();
                }
            	break;
            default: 
            	System.out.println("\n" + "Invalid Choice! Please Try again...");
            	homepage();
            	break;
        }
    }
    
    public void admin_login()
    {
    	System.out.println("--------------------------------------------------------");
    	System.out.println("------------------- ADMIN LOGIN PAGE -------------------");
    	System.out.println("--------------------------------------------------------");
        System.out.print("Enter User-Id: ");
        userID = sc.next();
        System.out.print("Enter Password: ");
        int password = sc.nextInt();
        loginto.put("admin1",11111);
        loginto.put("admin2",22222);
        
        if (loginto.containsKey(userID) && loginto.get(userID) == password)
        {
            System.out.println("--------------------------------------------------------");
            System.out.println("\n" + "ADMIN HAS LOGGED IN SUCCESSFULLY!");
            System.out.println("\n" + "--------------------------------------------------------");
            admin_mainpage();
        }
        else{
            System.out.println("\n" + "Invalid login credentials. Please try again.");
            admin_login();
        }
    }

    public void user_login()
    {
    	System.out.println("--------------------------------------------------------");
    	System.out.println("-------------------- USER LOGIN PAGE -------------------");
    	System.out.println("--------------------------------------------------------");
        System.out.print("Enter User-Id: ");
        userID = sc.next();
        System.out.print("Enter Password: ");
        int password = sc.nextInt();
        loginto.put("admin1",11111);
        loginto.put("admin2",22222);
        loginto.put("user1",12345);
        loginto.put("user2",67890);
        loginto.put("user3",13579);
        loginto.put("user4",24680);
        if (loginto.containsKey(userID) && loginto.get(userID) == password)
        {
            System.out.println("--------------------------------------------------------");
            System.out.println("\n" + "USER LOGGED IN SUCCESSFULLY");
            System.out.println("\n" + "--------------------------------------------------------");
            user_mainpage();
        }
        else{
            System.out.println("\n" + "Invalid login credentials. Please try again...");
            user_login();
        }
    }

    public void admin_mainpage()
    {
        System.out.println("--------------------------------------------------------");
        System.out.println("----- Digital Library ---> Welcome Admin " + DigitalLibraryManagement.userID + "! ----");
        System.out.println("-------------------- ADMIN MAINPAGE --------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("Please Select One Option..." + "\n");
        System.out.println("1.>>> Add a New Book >>>");
        System.out.println("2.>>> Update a Existing Book >>>");
        System.out.println("3.>>> Delete a Existing Book >>>");
        System.out.println("4.>>> Go To User MainPage >>>");
        System.out.println("5.>>> Logout >>> Back to HomePage >>>");
        System.out.println("--------------------------------------------------------");
        System.out.print("Select Option(1,2,3,4,5): ");
        int sp=sc.nextInt();
        switch(sp){
            case 1: 
            	map = add_new();
            	admin_mainpage();
            	break;
            case 2:
                map = upd_old();
                admin_mainpage();
                break;
            case 3: 
            	map = del_old();
            	admin_mainpage();
            	break;
            case 4:
                user_mainpage();
                break;
            case 5:
                System.out.println("--------------------------------------------------------");
                System.out.println("\n" + "YOU HAVE LOGGED OUT SUCCESSFULLY");
                System.out.println("\n" + "--------------------------------------------------------");
            	homepage();
            	break;
            default: 
            	System.out.println("\n" + "Invalid Choice. Please Try again...");
            	admin_mainpage();
            	break;
        }
    }
    
    public void user_mainpage()
    {
        System.out.println("--------------------------------------------------------");
        System.out.println("----- Digital Library ---> Welcome User " + DigitalLibraryManagement.userID + "! -----");
        System.out.println("--------------------- USER MAINPAGE --------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("We offer a wide range of books from various genres");
        System.out.println("We mostly have the best collection of the top books from the Crime, Mystery and Sci-fi genres");
        System.out.println("Please Select One Option..." + "\n");
        System.out.println("1.>>> View any Book >>>");
        System.out.println("2.>>> Issue a Book >>>");
        System.out.println("3.>>> Return a Book >>>");
        System.out.println("4.>>> Logout >>> Back to HomePage >>>");
        System.out.println("--------------------------------------------------------");
        System.out.print("Select Option(1,2,3,4): ");
        int sp=sc.nextInt();
        switch(sp){
            case 1: 
            	views();
            	break;
            case 2: 
            	borrows();
            	break;
            case 3:
                returns();
                break;
            case 4:
                System.out.println("--------------------------------------------------------");
                System.out.println("\n" + " YOU HAVE SUCCESSFULLY LOGGED OUT.");
                System.out.println("\n" + "--------------------------------------------------------");
            	homepage();
            	break;
            default: 
            	System.out.println("\n" + "Invalid Choice. Please Try again!");
            	user_mainpage();
            	break;
        }
    }

    public HashMap<Integer,String> add_new()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------- ADD A NEW BOOK -------------------");
        System.out.print("Enter a New Book Number: ");
        int addbook = sc.nextInt();
        if(book_database_server().containsKey(addbook))
        {
            System.out.println("\n" + "This Book Number has already been assigned to another book! Please try with another number!");
        }
        else if(addbook == 0 || addbook < 0)
        {
            System.out.println("\n" + "You can't assign Zero(0) or a Negative(-ve) number for a book ");
        }
        else{
            System.out.print("Enter New Book Details: ");
            String addbookdetails = scanner.nextLine();
            map.put(addbook,addbookdetails);
            System.out.println("\n" + "New Book added Successfully...");
            System.out.println("New Book No.:: " + addbook);
            System.out.println("New Book Name :: " + map.get(addbook));
        }
        return map;
    }
    
    public HashMap<Integer,String> upd_old()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("----------------- UPDATE A BOOK DETAILS ----------------");
        System.out.print("Enter a Book Number to Update its Details: ");
        int updbook = sc.nextInt();
        if(book_database_server().containsKey(updbook))
        {
            System.out.println("Backdated Book Name :: " + map.get(updbook));
            System.out.print("Enter the Updated Book Details: ");
            String upbookdetails = scan.nextLine();
            book_database_server().replace(updbook,upbookdetails);
            System.out.println("\n" + "Book Details Updated Successfully!");
            System.out.println("Book No.:: " + updbook);
            System .out.println("Updated Book Name :: " + map.get(updbook));
        }
        else{
            System.out.println("\n" + "Sorry! This Book Number is not Available.");
        }
        return map;
    }
    
    public HashMap<Integer,String> del_old()
    {
        System.out.println("----------------- DELETE A BOOK DETAILS ----------------");
        System.out.print("Enter the Book Number of the book you want to delete: ");
        int delbook = sc.nextInt();
        if(book_database_server().containsKey(delbook))
        {
            System.out.println("\n" + "Book Details You Want to Delete...>>>");
            System.out.println("Book No.:: " + delbook);
            System .out.println("Book Name:: " + map.get(delbook));
            System.out.print("\n" + "Do You want to Delete this Book? (Y/N): ");
            String delbookdetails = sc.next();
            if(delbookdetails.equalsIgnoreCase("Y"))
            {
                String returned_value = (String)map.remove(delbook);
                System.out.println("\n\"" + returned_value + "\" Book Details Deleted Successfully...");
            }
            else{
                System.out.println("\n" + "Book Deletion Cancelled...!");
            }
        }
        else{
            System.out.println("\n" + "This Book does not exist in our directory");
        }
        return map;
    }
    
    public void views()
    {
        System.out.println("--------------------------------------------------------");
        System.out.println("---------------------- VIEW BOOKS ----------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("Please Select One Option..." + "\n");
        System.out.println("1.>>> View a Specific Book >>>");
        System.out.println("2.>>> View all Books >>>");
        System.out.println("3.>>> Back to MainPage >>>");
        System.out.println("--------------------------------------------------------");
        System.out.print("Select Option(1,2,3): ");
        int dip=sc.nextInt();
        switch(dip){
            case 1: 
                System.out.println("--------------------------------------------------------");
                System.out.print("Enter Book Number: ");
                int books = sc.nextInt();
            	if(book_database_server().containsKey(books))
            	{
            	    System.out.println("\n" + books + " ---> " + map.get(books));
            	}
            	else{
            	    System.out.println("\n" + "Oops! This book number is not available... Please Try Another...");
            	}
            	views();
            	break;
            case 2:
                System.out.println("\n" + "All Available Books >>>" + "\n");
                for(Map.Entry<Integer, String> entry : book_database_server().entrySet()) 
                {
                    int key = entry.getKey();
                    String value = entry.getValue();
                    System.out.println(key + " ---> " + value);
                }
                views();
                break;
            case 3: 
                System.out.println("--------------------------------------------------------");
                System.out.println("\n" + "REDIRECTING TO USER MAINPAGE..." + "\n");
                System.out.println("--------------------------------------------------------");
            	user_mainpage();
            	break;
            default: 
            	System.out.println("\n" + "Invalid Choice! Please Try again.");
            	views();
            	break;
        }
    }
    
    public void borrows()
    {
        System.out.println("--------------------- ISSUE A BOOK ---------------------");
        System.out.print("Enter a Book Number which You want to Issue: ");
        int isbook = sc.nextInt();
        if(issues == 0 && isbook > 0 && book_database_server().containsKey(isbook))
        {
            issues = isbook;
            System.out.println("\n" + "Successfully Issued the Book...");
            System.out.println("Issued Book No.:: " + isbook);
            System .out.println("Issued Book Name & Details:: " + map.get(isbook));
        }
        else if(issues != 0)
        {
            System.out.println("\n" + "You have Already Issued a Book! Please Return that book to Issue a new book...");
        }
        else
        {
            System.out.println("\n" + "Invalid Book Number or Book is not Available...");
        }
        user_mainpage();
    }
    
    public void returns()
    {
        System.out.println("--------------------- RETURN A BOOK --------------------");
        if(book_database_server().containsKey(issues))
        {
            System.out.println("Issued Book Details...>>>");
            System.out.println("Book No.:: " + issues);
            System .out.println("Book Name:: " + map.get(issues));
            System.out.print("\n" + "Do You want to Return this Book? (Y/N): ");
            String rebook = sc.next();
            if(rebook.equalsIgnoreCase("Y"))
            {
                issues = 0;
                System.out.println("\n" + "The Book has been Returned Successfully...");
            }
            else{
                System.out.println("\n" + "Book Return Cancelled...!");
            }
        }
        else{
            System.out.println("\n" + "You don't have any issued book!");
        }
        user_mainpage();
    }
    
    
    public static void main(String args[]){
    	DigitalLibraryManagement system_run = new DigitalLibraryManagement();
        system_run.homepage();
    }
}