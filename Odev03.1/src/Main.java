public class Main {
    public static void main(String[] args) {
        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Save();


        Customer customer= new Customer();
        customer.id = 1 ;
        customer.City = "Karaman";

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save();
        customerManager.delete();

        Company company = new Company();
        company.TaxNumber = "100000";
        company.CompanyName = "Arçelik";
        company.id = 100;
        CustomerManager customerManager2 = new CustomerManager(new Customer());

        Person person = new Person();
        person.NationalIdentity = "";

        System.out.println();
    }
}