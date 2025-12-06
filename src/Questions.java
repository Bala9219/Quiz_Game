public class Questions {
    private String questionText;
    private String[] options;
    private char correctAnswer;

    //Constructor...
    public Questions(String questionText, String[] options, char correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    //Function to display questions & options...
    public void displayQuestion(){
        System.out.println(questionText);
        for (String option : options){
            System.out.println(option);
        }
    }

    //Method to compare the user answer and correct answer...
    public boolean isCheckAnswer(char answer){
        return Character.toLowerCase(answer) == Character.toLowerCase(correctAnswer);
    }

    //Method to get the correct answer...
    public char getCorrectAnswer(){
        return correctAnswer;
    }
}
