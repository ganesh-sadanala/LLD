import java.util.List;

public class CompositeMeeting implements Meeting{
    String subject;
    private List<Meeting> meetings;
    @Override
    public void addMeeting(Meeting meeting) {
        meetings.add(meeting);
    }

    @Override
    public void removeMeeting(Meeting meeting) {
        meetings.remove(meeting);
    }

    @Override
    public Meeting getMeeting(int index) {
        return meetings.get(index);
    }

    @Override
    public String getDetails() {
        StringBuilder details = new StringBuilder("Composite Meeting: " + subject + "\n");
        for (Meeting meeting : meetings) {
            details.append(meeting.getDetails()).append("\n");
        }
        return details.toString();
    }
}
