public class AnswerWorkflow extends PostWorkflow{
    private String answer;

    public AnswerWorkflow(String answer) {
        this.answer = answer;
    }

    @Override
    protected void validateContent() {
        if (answer.isEmpty()) {
            throw new IllegalArgumentException("Answer cannot be empty.");
        }
        System.out.println("Answer validated.");
    }

    @Override
    protected void addTags() {
        // No tags for answers
    }

    @Override
    protected void publishPost() {
        super.publishPost();
        System.out.println("Answer published: " + answer);
    }
}
