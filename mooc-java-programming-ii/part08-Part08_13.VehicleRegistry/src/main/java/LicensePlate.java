
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;
    
    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public String getLiNumber(){
        return this.liNumber;
    }

    public String getCountry(){
        return this.country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LicensePlate that = (LicensePlate) o;
        /* 
        if ((liNumber != null && !liNumber.equals(that.liNumber)) || (liNumber == null && that.liNumber != null)) {
        return false;
        }
        */
        if (liNumber != null ? !liNumber.equals(that.liNumber) : that.liNumber != null) return false;
        return country != null ? country.equals(that.country) : that.country == null;
    }

    @Override
    public int hashCode() {
        int result = liNumber != null ? liNumber.hashCode() : 0;
        result = 1 * result + (country != null ? country.hashCode() : 0);
        return result;
    }

}
