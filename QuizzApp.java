import java.util.Scanner;

public class QuizzApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Tough farming-related questions
        String[] questions = {
            "What is the process called where plants lose water through evaporation from the soil and transpiration from the plants?",
            "Which crop is known as the 'King of Cereals' due to its high protein content?",
            "What is the term for a variety of wheat that is resistant to drought?",
            "Which type of irrigation system involves water flowing through pipes and tubes to deliver it directly to plant roots?",
            "What is the term for the practice of planting different crops in a specific sequence to enhance soil health and reduce pest cycles?"
        };

        // Answer options for each question
        String[][] options = {
            {"Transpiration", "Evapotranspiration", "Capillary action", "Photosynthesis"},
            {"Wheat", "Rice", "Maize", "Barley"},
            {"Drought-resistant wheat", "Hard red spring wheat", "Hard white wheat", "Durum wheat"},
            {"Drip irrigation", "Flood irrigation", "Sprinkler irrigation", "Surface irrigation"},
            {"Monoculture", "Crop rotation", "Agroforestry", "Permaculture"}
        };

        // Correct answers
        String[] correctAnswers = {"Evapotranspiration", "Maize", "Drought-resistant wheat", "Drip irrigation", "Crop rotation"};

        // Loop through the questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println((j + 1) + ". " + options[i][j]);
            }
            System.out.print("Enter your answer (1-4): ");
            int answer = scanner.nextInt();
            
            if (options[i][answer - 1].equals(correctAnswers[i])) {
                score++;
                System.out.println("Correct!\n");
            } else {
                System.out.println("Incorrect!\n");
            }
        }

        // Final score
        System.out.println("Your final score is: " + score + "/" + questions.length);
        scanner.close();
    }
}
