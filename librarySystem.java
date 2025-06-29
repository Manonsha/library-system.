package projectUpload;

class user {
	String name;
	String regno;
	String department;

		
	}

class book{

	String bookName;
	String catofBook;
	String author;
	
}
class card{
	int cardNo;
	String cardType;
	
}

class remindMessage{
	String message;
}

class librarySystem{

	public static void main(String[] args) {
		user usr=new user();
		usr.name=" Santhiya ";
		usr.regno="1u21ca045";
		usr.department="BCA";
		System.out.println("Name : "+(usr.name));
		System.out.println("Reg NO : " +(usr.regno));
		System.out.println("Department : "+ usr.department);
		
		System.out.println();
		
		book Book=new book();
		Book.bookName="BlackBeauty";
		Book.catofBook="Animal";
		Book.author="Anna sevil";
		
		System.out.println("Book Name : " +Book.bookName);
		System.out.println("Category of Book : " + Book.catofBook);
		System.out.println("Author : " +Book.author);
		
		System.out.println();
		
		card Card=new card();
		Card.cardNo=23;
		Card.cardType="permanent";
		
		System.out.println("Card No : "+Card.cardNo);
		System.out.println("Card Type : " +Card.cardType);
		
		System.out.println();
		
		remindMessage alert=new remindMessage();
		alert.message="Gentle Reminder !!! Today is the last date to return the book ";
		
		System.out.println(usr.name + alert.message);

	}
}


