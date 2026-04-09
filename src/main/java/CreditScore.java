public class CreditScore {

    public static int calculateScore(int income, int debts) {
        if (income <= 0) return 300;  // ✅ fixed

        int score = 700 + (income / 1000) - (debts / 500);

        if (score > 850) return 850;
        if (score < 300) return 300;

        return score;
    }

    public static void main(String[] args) {
        System.out.println("Credit Score System Running...");
    }
}