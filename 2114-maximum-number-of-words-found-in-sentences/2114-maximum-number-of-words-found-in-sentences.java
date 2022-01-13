class Solution {
    public int mostWordsFound(String[] sentences) {
        int answer = 0;
        for(String sentence : sentences){
            answer = Math.max(sentence.length() - sentence.replaceAll(" ","").length() + 1, answer);
        }
        
        return answer;
    }
}