package domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Ethon on 7/27/2016.
 */
@Embeddable
public class VehicleConditionType implements Serializable {
    private String RefcounterReading;
    private String Gas;
    private String MotorCondition;

    //constructors
    private VehicleConditionType()
    {

    }

    public VehicleConditionType(Builder builder)
    {
        this.RefcounterReading = builder.RefcounterReading;
        this.Gas = builder.Gas;
        this.MotorCondition = builder.MotorCondition;

    }

    //getters
    public String getRefcounterReading() {
        return RefcounterReading;
    }

    public String getGas() {
        return Gas;
    }

    public String getMotorCondition() {
        return MotorCondition;
    }


    public static class Builder
    {
        private String RefcounterReading;
        private String Gas;
        private String MotorCondition;

        public Builder RefcounterReading(String RefcounterReading)
        {
            this.MotorCondition = RefcounterReading;
            return this;
        }

        public Builder Gas(String Gas)
        {
            this.Gas = Gas;
            return this;
        }

        public Builder MotorCondition(String MotorCondition)
        {
            this.MotorCondition = MotorCondition;
            return this;
        }


        public Builder copy(VehicleConditionType addressEmbeddabletype)
        {
            this.RefcounterReading = addressEmbeddabletype.RefcounterReading;
            this.Gas = addressEmbeddabletype.Gas;
            this.MotorCondition = addressEmbeddabletype.MotorCondition;
            return this;
        }

        public VehicleConditionType build()
        {
            return new VehicleConditionType(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehicleConditionType that = (VehicleConditionType) o;

        if (RefcounterReading != null ? !RefcounterReading.equals(that.RefcounterReading) : that.RefcounterReading != null)
            return false;
        if (Gas != null ? !Gas.equals(that.Gas) : that.Gas != null) return false;
        return MotorCondition != null ? MotorCondition.equals(that.MotorCondition) : that.MotorCondition == null;

    }

    @Override
    public int hashCode() {
        int result = RefcounterReading != null ? RefcounterReading.hashCode() : 0;
        result = 31 * result + (Gas != null ? Gas.hashCode() : 0);
        result = 31 * result + (MotorCondition != null ? MotorCondition.hashCode() : 0);
        return result;
    }
}
