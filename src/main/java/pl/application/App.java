package pl.application;


public class App 
{
    public static void main( String[] args )throws OwnException
    {
        Address address = new Address.Builder()
                .city("Krakow")
                .house_number(10)
                .post_code("37-565")
                .street("Test")
                .build();

        System.out.println(address);


        Address address1 = new Address.Builder()
                .city("krakow")
                .house_number(10)
                .post_code("37-565")
                .street("Test")
                .build();
    }
}
