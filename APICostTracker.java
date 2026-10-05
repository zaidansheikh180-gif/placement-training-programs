class APIUsage {
    private String provider;
    private double costPerCall;
    private int calls;

    public APIUsage(String provider, double costPerCall) {
        this.provider = provider;
        this.costPerCall = costPerCall;
    }

    public void logCall() {
        calls++;
    }

    public double getTotalCost() {
        return calls * costPerCall;
    }

    public void printCost() {
        System.out.printf("%-12s Rs.%.4f x %d calls = Rs.%.2f%n",
                provider, costPerCall, calls, getTotalCost());
    }
}

public class APICostTracker {
    public static void main(String[] args) {
        APIUsage openai = new APIUsage("OpenAI", 0.15);
        APIUsage claude = new APIUsage("Claude", 0.20);

        for (int i = 0; i < 12; i++) openai.logCall();
        for (int i = 0; i < 8; i++) claude.logCall();

        openai.printCost();
        claude.printCost();
    }
}
