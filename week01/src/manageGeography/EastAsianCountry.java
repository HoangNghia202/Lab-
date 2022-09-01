package manageGeography;

public class EastAsianCountry extends Country {
    private String countryTerrian;

    public EastAsianCountry(String countryCode, String countryName, float area, String countryTerrian) {
        super(countryCode, countryName, area);
        this.countryTerrian = countryTerrian;
    }

    @Override
    public String toString() {
        return "EastAsianCountry ["+super.toString()+", countryTerrian=" + countryTerrian + "]";
    }

    
    
}
