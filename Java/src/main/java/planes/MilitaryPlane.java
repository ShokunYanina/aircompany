package planes;

import models.MilitaryType;

import java.util.Objects;
/**
 * The MilitaryPlane class represents a military aircraft and extends the
 * Plane class. It encapsulates the characteristics specific to military planes,
 * including the type of military aircraft.
 * Date: Jan 04, 2019
 *
 * @author Vitali Shulha
 */
public class MilitaryPlane extends Plane{

    private final MilitaryType type;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
    }

    public MilitaryType getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                String.format(", type=%s}", type));
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        MilitaryPlane that = (MilitaryPlane) object;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
