public abstract class PostWorkflow {
    void createPost(){
        validateContent();
        addTags();
        publishPost();
        sendNotification();
    }

    abstract void validateContent();
    abstract void addTags();
    protected void publishPost() {
        System.out.println("Publishing the post...");
    }

    protected void sendNotification() {
        System.out.println("Sending notification to interested users...");
    }
}
