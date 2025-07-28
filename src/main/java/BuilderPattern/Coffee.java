package BuilderPattern;

/**
 * A class representing a coffee order using the Builder pattern.
 */
public class Coffee {

    // Required parameters
    private final String size;
    private final String type;

    // Optional parameters
    private final boolean hasExtraShot;
    private final boolean isIced;
    private final String milkType;
    private final String toppings;

    // Private constructor
    private Coffee(Builder builder) {
        this.size = builder.size;
        this.type = builder.type;
        this.hasExtraShot = builder.hasExtraShot;
        this.isIced = builder.isIced;
        this.milkType = builder.milkType;
        this.toppings = builder.toppings;
    }

    @Override
    public String toString() {
        return "CoffeeOrder{" +
            "size='" + size + '\'' +
            ", type='" + type + '\'' +
            ", hasExtraShot=" + hasExtraShot +
            ", isIced=" + isIced +
            ", milkType='" + milkType + '\'' +
            ", toppings='" + toppings + '\'' +
            '}';
    }

    // Builder class
    public static class Builder {
        // Required
        private final String size;
        private final String type;

        // Optional
        private boolean hasExtraShot = false;
        private boolean isIced = false;
        private String milkType = "Whole";
        private String toppings = "None";

        public Builder(String size, String type) {
            this.size = size;
            this.type = type;
        }

        public Builder addExtraShot(boolean value) {
            this.hasExtraShot = value;
            return this;
        }

        public Builder makeIced(boolean value) {
            this.isIced = value;
            return this;
        }

        public Builder setMilkType(String milkType) {
            this.milkType = milkType;
            return this;
        }

        public Builder addToppings(String toppings) {
            this.toppings = toppings;
            return this;
        }

        public Coffee build() {
            return new Coffee(this);
        }
    }
}
