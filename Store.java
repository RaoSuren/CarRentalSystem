import java.util.List;

public class Store {
    int storeId;
    VehicleInventoryManagement inventoryManagement;
    List<Reservation> reservations;

    public List<Vehicle> getVehicle(VehicleType type)
    {
        return inventoryManagement.getVehicles();
    }

    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user,vehicle);
        reservations.add(reservation);
        return reservation;

    }
}
