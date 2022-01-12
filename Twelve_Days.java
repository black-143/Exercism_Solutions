class Main{
	static String[] days = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
    
        static String[] gifts = {
           "a Partridge in a Pear Tree",
        "two Turtle Doves",
        "three French Hens",
        "four Calling Birds",
        "five Gold Rings",
        "six Geese-a-Laying",
        "seven Swans-a-Swimming",
        "eight Maids-a-Milking",
        "nine Ladies Dancing",
        "ten Lords-a-Leaping",
        "eleven Pipers Piping",
       "twelve Drummers Drumming"};
       static String verse(int verseNumber) {
        String finalStr = "",giftStr = "";
        for(int i = verseNumber-1; i < verseNumber; i++){
            finalStr += "On the " + days[i] + " day of Christmas my true love gave to me: ";
            for(int j = i; j >= 0; j--){
                if(j == 0) giftStr = gifts[j] + ".";
                else giftStr = gifts[j] + ", ";
                if(i > 0 && j == 0){
                    giftStr = "and " + giftStr;
                }
                finalStr += giftStr;
            }
            finalStr += "\n";
        }
        return finalStr;
    }
    

    static String verses(int startVerse, int endVerse) {
        String finalStr = "",giftStr = "";
        for(int i = startVerse-1; i < endVerse; i++){
            finalStr += "On the " + days[i] + " day of Christmas my true love gave to me: ";
            for(int j = i; j >= 0; j--){
                if(j == 0) giftStr = gifts[j] + ".";
                else giftStr = gifts[j] + ", ";
                if(i > 0 && j == 0){
                    giftStr = "and " + giftStr;
                }
                finalStr += giftStr;
            }
            if (i == endVerse-1) finalStr += "\n";
            else finalStr += "\n\n";
        }
        return finalStr;
    }
    
    
    static String sing() {
        String finalStr = "",giftStr = "";
        for(int i = 0; i < days.length; i++){
            finalStr += "On the " + days[i] + " day of Christmas my true love gave to me: ";
            for(int j = i; j >= 0; j--){
                if(j == 0) giftStr = gifts[j] + ".";
                else giftStr = gifts[j] + ", ";
                if(i > 0 && j == 0){
                    giftStr = "and " + giftStr;
                }
                finalStr += giftStr;
            }
            if (i == days.length-1) finalStr += "\n";
            else finalStr += "\n\n";
        }
        return finalStr;
    }

	public static void main(String[] args) {
		System.out.println(verse(8));
		System.out.println(verses(1,3));
		System.out.println(sing());
	}
}