import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Array to store questions, options and answers...(Simply an array of class Questions objects)
        Questions[] question = { new Questions("What is the capital of Russia ?", new String[]{" a) Ukraine b) Moscow c) Frankfurt"}, 'b'),
                new Questions("Who is the Marvel Character holds hammer ?", new String[]{" a) Captain America, b) Flash Man c) Thor"}, 'c'),
                new Questions("What is 9 + 7 = ?", new String[]{" a) 16, b) 18, c) 24"}, 'a'),
                new Questions("Which is the largest ocean?", new String[]{" a) Atlantic Ocean b) Pacific Ocean c) Indian Ocean"}, 'b'),
                new Questions("Which is fastest car ?", new String[]{" a) Alfa Romeo b) Mercedes c) Bugatti"}, 'c'),
                new Questions("What is the horse power of F1 car ?", new String[]{" a) 1000hp b) 1200hp c) 1500hp"}, 'a')
        };
        int score = 0;

        //Loop through Questions...
        for(Questions q : question){
            q.displayQuestion();
            System.out.print("Enter your answer a/b/c : ");
            char userAnswer = sc.next().charAt(0);

            if(q.isCheckAnswer(userAnswer)){
                System.out.println("Correct Answer /.\n");
                score++;
            }else{
                System.out.println("Wrong Answer! The correct answer is : " + q.getCorrectAnswer()+"\n");
            }
        }
        System.out.println("You got "+score+" points out of " +question.length+ " correct!");
        sc.close();
    }
}