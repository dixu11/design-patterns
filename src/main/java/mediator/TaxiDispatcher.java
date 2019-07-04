package mediator;

import java.util.List;

public class TaxiDispatcher implements Dispatcher {
    List<Driver> drivers;


    public TaxiDispatcher(List<Driver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public void newOrder() {

    }

    @Override
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }
}
