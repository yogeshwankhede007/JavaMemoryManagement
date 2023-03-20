public class StackOverFlowError {
    public StackOverFlowError(){
        new StackOverFlowError();
    }

    public static void main(String[] args) {
        new StackOverFlowError();
    }
}
