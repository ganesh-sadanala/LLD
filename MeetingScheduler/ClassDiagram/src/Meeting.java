public interface Meeting {

    void addMeeting(Meeting meeting);
    void removeMeeting(Meeting meeting);
    Meeting getMeeting(int index);
    String getDetails();
}
