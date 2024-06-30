public class Literacy implements Comparable<Literacy> {

    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private double literacyPercent;

    public Literacy(String theme, String ageGroup, String gender, String country, int year, double literacyPercent) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getLiteracyPercent() {
        return literacyPercent;
    }

    public void setLiteracyPercent(double literacyPercent) {
        this.literacyPercent = literacyPercent;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + ")" + ", " + this.gender.split(" ")[0] + ", " + this.literacyPercent;
    }

    @Override
    public int compareTo(Literacy literacy) {
        return this.getLiteracyPercent() > literacy.getLiteracyPercent() ? 1 : -1;
    }
}
