public class AlfredTest {
    /*
    * This main method will always be the launch point for a Java application
    */
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes to access all its methods.
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        // Make some test greetings, providing any necessary data
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Selina Kyle");
        String testGuestGreeting2 = alfredBot.guestGreeting("Bruce Wayne");

        String testDateAnnouncement = alfredBot.dateAnnouncement();
        
        String alexisTest = alfredBot.respondBeforeAlexis(
                            "Alexis! Tell us Dad joke that is actually funny."
                            );
        String alexisTest1 = alfredBot.respondBeforeAlexis(
            "I can't find my yo-yo. Maybe Alfred will know where it is.");
        String alexisTest2 = alfredBot.respondBeforeAlexis(
            "Maybe that's what Batman is about. Not winning. But failing.."
        );
        String angryAlfredTest = alfredBot.angryAlfred("Is this the door to the basement?");
        String angryAlfredTest2 = alfredBot.angryAlfred("Batman is a pathetic joke?");
        
        // Print the greetings to test.
        System.out.println(testGuestGreeting);
        System.out.println(testGuestGreeting2);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alexisTest1);
        System.out.println(alexisTest2);
        System.out.println(angryAlfredTest);
        
        
    }
}
