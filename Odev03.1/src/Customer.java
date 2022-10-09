public class Customer {
    public int id;
    public String City;

    public Customer() {
        System.out.println("müşteri nesnesi başlatıldı");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
