package planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

import java.util.Objects;
/**
 * The ExperimentalPlane class represents a specialized type of plane
 * that is used for experimental purposes. It extends the Plane class
 * and adds additional attributes specific to experimental aircraft,
 * including the type of experimental plane and its classification level.
 * Date: Jan 04, 2019
 *
 * @author Vitali Shulha
 */
public class ExperimentalPlane extends Plane {

    private final ExperimentalTypes type;
    private final ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes type, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        ExperimentalPlane that = (ExperimentalPlane) object;
        return type == that.type &&
                classificationLevel == that.classificationLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, classificationLevel);
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                String.format(", type=%s, classificationLevel=%s}", type, classificationLevel));
    }
}
