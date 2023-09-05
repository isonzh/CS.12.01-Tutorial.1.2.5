public class WordScrambler {
    private String[] scrambledWords;
    public String[] getScrambledWords()
    {
        return scrambledWords;
    }    public WordScrambler(String[] wordArr) {

        scrambledWords = mixedWords(wordArr);

    }

    private String recombine(String word1, String word2) {
        String word="";
        word+=word1.substring(0,word1.length()/2);
        word+=word2.substring(word2.length()/2,word2.length());
        return word;
    }

    private String[] mixedWords(String[] words) {
        for(int i=0;i<words.length;i++){
        if (words[i].contains(" ")) {

        throw new IllegalArgumentException("Word Array must contain single words only! Attack on Titan contains more than one word!");}}
        for(int i=0;i<words.length;i=i+2){
        String store1=recombine(words[i],words[i+1]);
        String store2=recombine(words[i+1],words[i]);
        words[i]=store1;
        words[i+1]=store2;
    }

    return words;
    }
}
