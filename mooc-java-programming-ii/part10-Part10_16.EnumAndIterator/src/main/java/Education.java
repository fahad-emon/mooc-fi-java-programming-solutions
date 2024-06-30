public enum Education {

    PHD("Doctoral degree"),
    MA("Masters degree"),
    BA("Bachelors degree"),
    HS("High School diploma");

    private String code;

    private Education(String code) {
        this.code = code;
    }

    public String getEducation() {
        return this.code;
    }
}
