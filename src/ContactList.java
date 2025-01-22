import java.util.ArrayList;
import java.util.Scanner;

public class ContactList
{
    private ArrayList<Person> contacts;

    public ContactList()
    {
       contacts = new ArrayList<Person>();
    }

    public ArrayList<Person> getContacts()
    {
        return contacts;
    }

    public void addContacts(Person contact)
    {
        contacts.add(contact);
    }

    public void printContact()
    {
        for (int i = 0; i < contacts.size(); i++)
        {
            System.out.println(contacts.get(i));
        }
    }

    public void sortBy (int number)
    {
        for(int i = 0; i < contacts.size() - 1; i++)
        {
            for (int j = 0; j < contacts.size() - 1; j++)
            {
                if (number == 0)
                {
                    if (contacts.get(j).getFirstName().compareTo(contacts.get(j + 1).getFirstName()) < 0)
                    {
                        Person a = contacts.get(j);
                        contacts.set(j, contacts.get(j+1));
                        contacts.set(j+1,a);
                    }
                }
                else if (number == 1)
                {
                    if (contacts.get(j).getFirstName().compareTo(contacts.get(j + 1).getFirstName()) < 0)
                    {
                        Person a = contacts.get(j);
                        contacts.set(j, contacts.get(j+1));
                        contacts.set(j+1,a);
                    }
                }
                else if (number == 2)
                {
                    if (contacts.get(j).getFirstName().compareTo(contacts.get(j + 1).getFirstName()) < 0)
                    {
                        Person a = contacts.get(j);
                        contacts.set(j, contacts.get(j+1));
                        contacts.set(j+1,a);
                    }
                }
            }
        }
    }

    public Person searchByFirstName(String firstName)
    {
        for(int i = 0; i < contacts.size(); i++)
        {
            if (contacts.get(i).getFirstName().equals(firstName))
            {
                return contacts.get(i);
            }
        }
        return null;
    }

    public Person searchByLastName(String lastName)
    {
        for (int i = 0; i < contacts.size(); i++)
        {
            if (contacts.get(i).getLastName().equals(lastName))
            {
                return contacts.get(i);
            }
        }
        return null;
    }

    public Person searchByPhoneNumber(String number)
    {
        for (int i = 0; i < contacts.size(); i++)
        {
            if (contacts.get(i).getPhoneNumber().equals(number))
            {
                return contacts.get(i);
            }
        }
        return null;
    }

    public void run()
    {
        Scanner input = new Scanner(System.in);

        while (true)
        {
            System.out.println("Menu: ");
            System.out.println("1. Add Contact");
            System.out.println("2. List All Contacts By First Name");
            System.out.println("3. List All Contacts By Last Name");
            System.out.println("4. List All Contacts By Phone Number");
            System.out.println("5. List All Students");
            System.out.println("6. Search By First Name");
            System.out.println("7. Search By Last Name");
            System.out.println("8. Search By Phone Number");
            System.out.println("0. Exit");

            int newnumber = input.nextInt();
            input.nextLine();

            if (newnumber == 0)
            {
                return;
            }
            else if (newnumber == 1)
            {
                System.out.println("Select a type of Contact to add");
                System.out.println("1. Student");
                System.out.println("2. Worker");
                int contactType = input.nextInt();
                input.nextLine();
                System.out.println("Please Fill Out The Following Information");
                System.out.println("First Name");
                String firstName = input.nextLine();
                System.out.println("Please Fill Out The Following Information");
                System.out.println("Last Name");
                String lastName = input.nextLine();
                System.out.println("Please Fill Out The Following Information");
                System.out.println("Phone Number");
                String number = input.nextLine();
                if (contactType == 1)
                {
                    System.out.println("Grade: ");
                    int grade = input.nextInt();
                    input.nextLine();
                    Student newContact = new Student (firstName, lastName, number, grade);
                    contacts.add(newContact);
                }
                else if (contactType == 2)
                {
                    System.out.println("Job: ");
                    String job = input.nextLine();
                    Worker newContact = new Worker (firstName, lastName, number, job);
                    contacts.add(newContact);
                }
            }
            else if (newnumber == 2)
            {
                sortBy(0);
                printContact();
            }
            else if (newnumber == 3)
            {
                sortBy(1);
                printContact();
            }
            else if (newnumber == 4)
            {
                sortBy(2);
                printContact();
            }
            else if (newnumber == 5)
            {
                for (int i = 0; i < contacts.size(); i++)
                {
                    if (contacts.get(i) instanceof Student)
                    {
                        System.out.println(contacts.get(i));
                    }
                }
            }
            else if (newnumber ==6)
            {
                System.out.println("Enter a first name:");
                String searchforname = input.nextLine();
                System.out.println(searchByFirstName(searchforname));
            }
            else if (newnumber == 7)
            {
                System.out.println("Enter a last name:");
                String searchforname = input.nextLine();
                System.out.println(searchByLastName(searchforname));
            }
            else if (newnumber == 8)
            {
                System.out.println("Enter a phone number:");
                String searchforname = input.nextLine();
                System.out.println(searchByPhoneNumber(searchforname));
            }
        }
    }

    public static void main(String args[])
    {
        ContactList contacts = new ContactList();
        contacts.run();
    }

}
