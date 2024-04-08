public interface Mediator {
    void registerQuestion(Question q);
    void registerAnswer(Question q);
    void registerNotification(Notification notification);
    void postAnswer(Answer answer);
}
