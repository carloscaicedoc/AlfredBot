import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Welcome, " + name + " to the Wayne Mansion. My name is AlfredBot, and I'm here to serve you.";
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "The current date and time are: " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") != -1) {
        return "I'll do it inmediatly, Mr Wayne. That device is not competent enough.";
        } 
        else if (conversation.indexOf("Alfred") != -1) {
            return "Off course! Master. I'll do it right away. ";
        }
        else {
            return "Right. And with that I shall retire";
        }
    }
    
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
	public String angryAlfred(String phrase) {
        return phrase.toUpperCase();
    }
    // NINJA BONUS
	// See the specs to overload the guessGreeting method
}

