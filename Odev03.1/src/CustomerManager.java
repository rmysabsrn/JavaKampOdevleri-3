public class CustomerManager {

    private Customer _customer;
    private CreditManagerDao _creditManager;


    public CustomerManager(Customer customer, CreditManagerDao creditManager){
        _customer = customer;
        _creditManager = creditManager;
}
    public void save(){
        System.out.println("Müşteri kaydedildi: ");
    }

    public void delete(){
        System.out.println("Müşteri silindi: ");
    }

    public void GiveCredit(){
        _creditManager.Calculate();
        System.out.println("Kredi verildi");
    }
}
