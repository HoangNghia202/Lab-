package manageGeography;

public class Country {
    protected String countryCode;
    protected String countryName;
    protected float area;

    public Country() {
    }

    public Country(String countryCode, String countryName, float area) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.area = area;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "area=" + area + ", countryCode=" + countryCode + ", countryName=" + countryName ;
    }

}
