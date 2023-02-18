package decorator;

public abstract class Pizza {
    String description = "Plain Pizza";
    public String getDescription() {
        return description;
    }
    public abstract int getCost();
}
