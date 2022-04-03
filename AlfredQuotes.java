import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        String greet = String.format("Hello, %s. Lovely to see you.", name);
        return greet;
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        String datePhrase = String.format("It is currently, %s.", new Date());
        return datePhrase;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if(conversation.indexOf("Alexis")> -1){
            return "Sorry, Alexis is on Vay-Kay right now";
        }
        if(conversation.indexOf("Alfred")> -1){
            return "I am 'DA Bot";
        }
        return "Beep Beep";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        String greetDayTime = String.format("Hello, %s. Lovely to see you. Hope you have a great %s", name, dayPeriod);
        return greetDayTime;
    }
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
    public String guestFullName(String firstName, String lastName){
        String string1 = String.format("Your first name is %s. ", firstName);
        String string2 = String.format("And your last name is %s.", lastName);
        String string3 = string1.concat(string2);
        return string3;
    }

}

