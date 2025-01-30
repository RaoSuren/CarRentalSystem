import java.util.List;

public class VehicleRentelSystem {

    List<Store> stores;
    List<User> users;


    public VehicleRentelSystem(List<Store> stores, List<User> users) {
        this.stores = stores;
        this.users = users;
    }

    public Store getStore(Location location)
    {
        return stores.get(0);
    }
}
