public class CustomerManager {
    private Customer _customer;

    public CustomerManager(Customer customer){
        _customer = customer;
}
    public void save(){
        System.out.println("Müşteri kaydedildi: "+ _customer.FirstName);
    }

    public void delete(){
        System.out.println("Müşteri silindi: "+ _customer.FirstName);
    }
}
