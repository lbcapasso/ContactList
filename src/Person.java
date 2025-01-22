public class Person
{
    private String firstName;
    private String lastName;
    private String phoneNumber;


    public Person (String first, String last, String number)
    {
        firstName = first;
        lastName = last;
        phoneNumber = number;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String toString()
    {
        return firstName + " " + lastName + " - " + "#" + phoneNumber;
    }
}
