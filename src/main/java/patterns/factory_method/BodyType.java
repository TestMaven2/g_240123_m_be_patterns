package patterns.factory_method;

public enum BodyType {

    COUPE("Купе"),
    CABRIOLET("Кабриолет"),
    ROADSTER("Родстер");

    private String description;

    BodyType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}