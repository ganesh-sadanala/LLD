public class IndividualMeeting implements Meeting{

    int id;
    User []participants;
    Interval interval;
    MeetingRoom meetingRoom;
    String subject;
    int participantsCount;

    @Override
    public void addMeeting(Meeting meeting) {
        throw new UnsupportedOperationException("Cannot add a meeting to an individual meeting.");
    }

    @Override
    public void removeMeeting(Meeting meeting) {
        throw new UnsupportedOperationException("Cannot remove a meeting from an individual meeting.");
    }

    @Override
    public Meeting getMeeting(int index) {
        throw new UnsupportedOperationException("Cannot get a meeting from an individual meeting.");
    }

    @Override
    public String getDetails() {
        return "Individual Meeting: " + subject;
    }
}
