public class CodeWordChecker implements StringChecker{
    private String word;
    private int min;
    private int max;

    public CodeWordChecker(int min, int max, String word){
        this.min = min;
        this.max = max;
        this.word = word;
    }

    public CodeWordChecker(String word){
        this.min = 6;
        this.max = 20;
        this.word = word;
    }

    public boolean isValid(String input){
        if (input.length() >= min && input.length() <= max){
            if(input.indexOf(word) == -1){
                return true;
            }
        }
        return false;
    }
}
