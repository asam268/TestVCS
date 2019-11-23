public class AP {

    /*
    Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.

    scoresIncreasing([1, 3, 4]) → true
    scoresIncreasing([1, 3, 2]) → false
    scoresIncreasing([1, 1, 4]) → true
     */
    public boolean scoresIncreasing(int[] scores){
        boolean greater = true;
        for(int i = 0; i < scores.length-1; i++){
            if(scores[i+1] < scores[i])
                greater = false;
        }
        return greater;
    }

    public boolean scores100(int[] scores){
        boolean toReturn = false;
        for(int i = 0; i < scores.length-1; i++){
            if(scores[i] == 100 && scores[i+1] == 100)
                toReturn = true;
        }

        return toReturn;
    }

    public int wordsCount(String[] words, int len){
        int count = 0;
        for(String w: words){
            if(w.length() == len)
                count++;
        }

        return count;
    }
}
