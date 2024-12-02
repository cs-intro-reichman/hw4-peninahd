public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the keywords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];
            if (sentence == null || sentence.isEmpty()){
                continue;
            }

            //find out how many different words are in the string
            int wordCounter = 0;
            for (int j = 0; j < sentence.length(); j++){
                if(sentence.charAt(j) == ' ') {
                    wordCounter++;
                }
            }

            //i want to turn each string of words into an array of individual words
            //then i can check if each word == keywords
            String[] newArr = new String[wordCounter + 1];
            int newArrIndex = 0;
            String word = "";

            for (int j = 0; j < sentence.length(); j++) {
                char c = sentence.charAt(j);
                if (c != ' ') {
                    word += c;
                } else {
                    newArr[newArrIndex] = word;
                    newArrIndex++;
                    word = "";
                }
            }

            //adding the last word
            if (!word.isEmpty()) {
                newArr[newArrIndex] = word;
            }
                //now i can iterate through each word and compare them to the keywords
                //need to fix this part!!!!
                for(int j = 0; j < newArr.length; j++) {
                    String words = newArr[j];
                    if (words == null) {
                        continue;
                    }
                    for (int k = 0; k < keywords.length; k++) {
                        String keyword = keywords[k];
                        if (words.toLowerCase().equals(keyword.toLowerCase())) {
                            System.out.println(sentence);
                            break;
                        }                         
                    }
            }
        }   
    }
}