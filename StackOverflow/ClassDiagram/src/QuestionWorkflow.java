public class QuestionWorkflow extends PostWorkflow{
    private String question;

    public QuestionWorkflow(String question) {
        this.question = question;
    }

    @Override
    protected void validateContent() {
        if (question.isEmpty()) {
            throw new IllegalArgumentException("Question cannot be empty.");
        }
        System.out.println("Question validated.");
    }

    @Override
    protected void addTags() {
        System.out.println("Adding tags to the question...");
    }

    @Override
    protected void publishPost() {
        super.publishPost();
        System.out.println("Question published: " + question);
    }
}
