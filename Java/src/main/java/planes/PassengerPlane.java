package planes;

import java.util.Objects;

/**
 * The PassengerPlane class represents a passenger aircraft and extends the
 * Plane class. It encapsulates the characteristics specific to passenger planes,
 * including their capacity for carrying passengers.
 * Date: Jan 04, 2019
 *
 * @author Vitali Shulha
 */
public class PassengerPlane extends Plane{

    private final int passengersCapacity;

    public PassengerPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                String.format(", passengersCapacity=%s}", passengersCapacity));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerPlane)) return false;
        if (!super.equals(o)) return false;
        PassengerPlane plane = (PassengerPlane) o;
        return passengersCapacity == plane.passengersCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCapacity);
    }
}
