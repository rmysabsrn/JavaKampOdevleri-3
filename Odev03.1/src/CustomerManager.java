public class CustomerManager {
    private Customer _customer;

    public CustomerManager(Customer customer){
        _customer = customer;
}
    public void save(){
        System.out.println("Müşteri kaydedildi: ");
    }

    public void delete(){
        System.out.println("Müşteri silindi: ");
    }
}
