package planes;

import java.util.Objects;

/**
 * The Plane class serves as an abstract representation of an aircraft.
 * It encapsulates the fundamental characteristics that all planes share,
 * including model, maximum speed, maximum flight distance, and maximum load capacity.
 * Date: Jan 04, 2019
 *
 * @author Vitali Shulha
 */
public abstract class Plane {

    private final String model;
    private final int maxSpeed;
    private final int maxFlightDistance;
    private final int maxLoadCapacity;

    public Plane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    @Override
    public String toString() {
        return String.format("Plane{model='%s', maxSpeed=%d, maxFlightDistance=%d, maxLoadCapacity=%d}",
                model, maxSpeed,
                maxFlightDistance, maxLoadCapacity);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Plane plane = (Plane) object;
        return maxSpeed == plane.maxSpeed &&
                maxFlightDistance == plane.maxFlightDistance &&
                maxLoadCapacity == plane.maxLoadCapacity &&
                Objects.equals(model, plane.model);
    }


    @Override
    public int hashCode() {
        return Objects.hash(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
    }
}
