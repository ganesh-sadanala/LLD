public abstract class Seat {
    String seatNo;
    SeatStatus seatStatus;

    boolean isAvailable() {
        return seatStatus == SeatStatus.Available;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public void setSeatRate(double seatRate) {

    }
}
