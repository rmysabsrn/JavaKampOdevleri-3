public class MySqlCustomerDal implements ICustomerDal, IRepositoryDal{
    @Override
    public void add() {
        System.out.println("My sql eklendi");
    }
}
