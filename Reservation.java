import java.util.Date;

public class Reservation {

    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date bookingEndDate;
    Long fromTime;
    Long endTime;
    Location location;
    ReservationType reservationType;
    ReservationStatus reservationStatus;

    public int createReserve(User user, Vehicle vehicle)
    {
        reservationId = 12232;
        this.user=user;
        this.vehicle=vehicle;
        reservationType = ReservationType.DAILY;
        reservationStatus = ReservationStatus.SCHEDULED;

        return reservationId;

    }
}
