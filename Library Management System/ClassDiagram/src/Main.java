public class Main {
    public static void main(String[] args) {
        LibraryItem book = LibraryItemFactory.createLibraryItem("book", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = LibraryItemFactory.createLibraryItem("magazine", "National Geographic", "January 2023");
        LibraryItem dvd = LibraryItemFactory.createLibraryItem("dvd", "Inception", "Christopher Nolan");

        book.displayInfo();
        magazine.displayInfo();
        dvd.displayInfo();


        BookInventory bookInventory = new BookInventory("The Great Gatsby", 5);

        BookDisplay display1 = new BookDisplay("Display 1");
        BookDisplay display2 = new BookDisplay("Display 2");

        bookInventory.registerObserver(display1);
        bookInventory.registerObserver(display2);

        bookInventory.borrowBook();
        bookInventory.borrowBook();
        bookInventory.returnBook();

        LibraryMember basicMember = new BasicMembership();
        LibraryMember premiumMember = new PremiumMembership(basicMember);
        LibraryMember goldcardMember = new GoldCardMembership(basicMember);

        LibraryMember premiumAndGoldCardMember=new GoldCardMembership(premiumMember);

        System.out.println("Basic Member:");
        basicMember.borrowBook();
        basicMember.returnBook();

        System.out.println("\nPremium Member:");
        premiumMember.borrowBook();
        premiumMember.returnBook();

        System.out.println("\nGoldCard Member:");
        goldcardMember.borrowBook();
        goldcardMember.returnBook();

        System.out.println("\nPremiumGoldCard Member:");
        premiumAndGoldCardMember.borrowBook();
        premiumAndGoldCardMember.returnBook();

        LibraryManager libraryManager = new LibraryManager();
        LibrarySystem librarySystem = new LibrarySystem();

        LibraryCommand addCommand1 = new AddItemCommand(libraryManager, "Book 1");
        LibraryCommand addCommand2 = new AddItemCommand(libraryManager, "Book 2");
        LibraryCommand removeCommand = new RemoveItemCommand(libraryManager, "Book 1");

        librarySystem.executeCommand(addCommand1);
        librarySystem.executeCommand(addCommand2);
        librarySystem.executeCommand(removeCommand);

        System.out.println("\nUndo last command:");
        librarySystem.undoLastCommand();

        System.out.println("\nRedo next command:");
        librarySystem.redoLastCommand();
    }
}
