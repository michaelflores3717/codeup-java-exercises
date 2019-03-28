public class ServerNameGenerator {

    public static void main(String[] args) {

        String[] adjectives = {"dedicated", "lame", "happy", "depressed", "joyful", "angry", "grumpy", "dancing", "pudgy"};
        String[] nouns = {"torpedo", "cat", "doggo", "guy", "server", "hamster", "duck", "bear", "monkey", "weasel"};

        String adjective = returnRandomElement(adjectives);
        String noun = returnRandomElement(nouns);

        System.out.println(adjective + "-" + noun);

    }

    public static String returnRandomElement (String[] arrayString) {
        int rand = (int)((Math.random() * (arrayString.length)) + 1) - 1;
        return arrayString[rand];
    }


}
