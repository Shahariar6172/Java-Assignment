import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Quiz {
static class Question {
String question;
String[] options;
char correct;
    Question(String question, String[] options, char correct) {
    this.question = question;
    this.options = options;
    this.correct = Character.toUpperCase(correct);
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("High School General Knowledge Quiz");
    System.out.print("Enter your name: ");
    String name = sc.nextLine();
    List<Question> questions = Arrays.asList(
        new Question("What is the chemical formula of water?",
        new String[]{"WO", "H2O", "HO2", "O2H"}, 'B'),
        new Question("Which data structure uses FIFO (First In First Out)?",
        new String[]{"Stack", "Queue", "Tree", "Graph"}, 'B'),
        new Question("Which language is primarily used for Android app development?",
        new String[]{"Python", "Java", "PHP", "C"}, 'B'),
        new Question("Which of the following is NOT an operating system?",
        new String[]{"Windows", "Linux", "Oracle", "MacOS"}, 'C'),
        new Question("What does ICT stand for?",
        new String[]{"Information and Communication Technology", "Institute of Computer Technology",
                            "International Communication Transfer", "Information Coding Technique"}, 'A'),
        new Question("Which device converts digital signals to analog signals?",
        new String[]{"Router", "Modem", "Switch", "Repeater"}, 'B'),
        new Question("Which of the following is NOT an input device?",
        new String[]{"Keyboard", "Mouse", "Scanner", "Monitor"}, 'D'),
        new Question("Which number system uses only 0 and 1?",
        new String[]{"Decimal", "Octal", "Binary", "Hexadecimal"}, 'C')
        );
        Collections.shuffle(questions);
        int totalQuestions = Math.min(5, questions.size());
        int score = 0;
        for (int i = 0; i < totalQuestions; i++) {
        Question q = questions.get(i);
        System.out.println("\nQ" + (i + 1) + ": " + q.question);
        System.out.println("A) " + q.options[0]);
        System.out.println("B) " + q.options[1]);
        System.out.println("C) " + q.options[2]);
        System.out.println("D) " + q.options[3]);
        char ans;
        while (true) {
        System.out.print("Your answer (A/B/C/D): ");
        String input = sc.nextLine().trim().toUpperCase();
            if (input.length() == 1 && input.charAt(0) >= 'A' && input.charAt(0) <= 'D') {
            ans = input.charAt(0);
            break;
                }
             System.out.println("Invalid input! Try again.");
            }
            if (ans == q.correct) {
            System.out.println("Correct!");
            score++;
            } else {
            System.out.println("Wrong! Correct answer: " + q.correct);
            }
        }
        System.out.println("\nQUIZ COMPLETED");
        System.out.println("Player: " + name);
        System.out.println("Score: " + score + "/" + totalQuestions);
        saveScoreCSV(name, score, totalQuestions);
    }
    private static void saveScoreCSV(String name, int score, int total) {
    try {
    FileWriter fw = new FileWriter("scores.csv", true);
    String time = LocalDateTime.now()
       .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        fw.write(time + "," + name + "," + score + "," + total + "\n");
        fw.close();
        System.out.println("\nYour score has been saved to scores.csv");
        } catch (IOException e) {
            System.out.println("Error: Could not save score.");
        }
    }
}
