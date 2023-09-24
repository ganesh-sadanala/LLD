public class Platinum extends Seat{
    double seatRate;

    @Override
    public void setSeatStatus(SeatStatus seatStatus) {
        super.setSeatStatus(seatStatus);
    }

    @Override
    public void setSeatNo(String seatNo) {
        super.setSeatNo(seatNo);
    }

    @Override
    public void setSeatRate(double seatRate) {
        this.seatRate = seatRate;
    }
}
