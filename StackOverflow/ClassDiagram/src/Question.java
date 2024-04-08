import java.util.Date;

public class Question extends Component{

    Member member;
    Date date;


    public Question(Mediator mediator, String title) {
        super(mediator);
        this.title = title;
        this.answerCount = 0;
        mediator.registerQuestion(this);
    }

    public void incrementAnswerCount() {
        answerCount++;
        System.out.println("Question '" + title + "' now has " + answerCount + " answer(s).");
    }
}
