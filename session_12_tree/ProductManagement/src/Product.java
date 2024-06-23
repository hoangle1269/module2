public class Product {
    String name;
    String id;
    Integer productionDate;
    Integer expiredDate;
    String label;
    String type;
    Double price;  // Add price attribute

    public Product(String name, String id, Integer productionDate, Integer expiredDate, String label, String type, Double price) {
        this.name = name;
        this.id = id;
        this.productionDate = productionDate;
        this.expiredDate = expiredDate;
        this.label = label;
        this.type = type;
        this.price = price;
    }
 
    // Getters and setters for price
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // Other getters and setters remain the same

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Integer productionDate) {
        this.productionDate = productionDate;
    }

    public Integer getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Integer expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", productionDate=" + productionDate +
                ", expiredDate=" + expiredDate +
                ", label='" + label + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
