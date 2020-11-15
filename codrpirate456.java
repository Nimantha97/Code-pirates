package codepirate.java;

public class codrpirate456 {
    



        public static void main(String[] args) {
    
            System.out.println("Select an option");
            System.out.println("* Enter 1 to display all contacts");
            System.out.println("* Enter 2 to add contacts");
            System.out.println("* Enter 3 to remove contacts");
            System.out.println("* Enter 4 to edit a contact");
            System.out.println("* Enter 5 to load contacts from a text file");
            System.out.println("* Enter 6 to save contacts to the text file");
            System.out.println("* Enter 7 to exit from the program");
    
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your number:");
    
            System.out.print("Entered number: " + input.nextInt());
    
    
            switch (input.nextInt()) {
                case 1:
                    ContactList.displayContacts();
    
                case 2:
                    System.out.println("Please enter name:");
                    Scanner name2 = new Scanner(System.in);
    
                    System.out.println("Please enter the new phone number:");
                    Scanner number2 = new Scanner(System.in);
                    ContactList.addContact(name2.nextLine(), number2.nextInt());
                    break;
    
                case 3:
                    System.out.println("Please enter the name of the contact that you want to delete:");
                    Scanner name3 = new Scanner(System.in);
                    ContactList.deleteContact(name3.nextLine());
                    break;
    
                case 4:
                    System.out.println("Please enter name tha name of the contact that you want to change:");
                    Scanner name4 = new Scanner(System.in);
    
                    System.out.println("Please enter the new phone number:");
                    Scanner number4 = new Scanner(System.in);
                    ContactList.editContact(name4.nextLine(), number4.nextInt());
                    break;
    
                case 5:
                    ContactList.loadContacts();
                    break;
    
                case 6:
                    ContactList.saveContacts();
                    break;
    
                case 7:
                    break;
                default:
                 
            }
    
    
        }
    
        class Contact {
            private String name;
            private String phoneN0;
    
        }
    
        static class ContactList {
            static void ContactList() {
                List<String> names = new ArrayList<>();
                names.add("Saman");
                names.add("Nimal");
                names.add("Yamuna");
                names.add("Nizam");
                names.add("Amal");
                System.out.println(names);
                List<Integer> phonenumber = new ArrayList<>();
                phonenumber.add(0332261261);
                phonenumber.add(0332264165);
                phonenumber.add(0332267123);
                phonenumber.add(0332278195);
                phonenumber.add(0332245278);
                System.out.println(phonenumber);
               
            }
    
    
    
            static void addContact(String name, int number) {
            name.add(name2.nextLine(), number2.nextInt());
    
            }
    
            static void deleteContact(String name) {
            name.remove(name3.nextLine());
            }
    
            static void editContact(String name, int number) {
    
            }
    
            static void displayContacts() {
                System.out.println( ContactList.ContactList());
    
            }
    
            static void loadContacts() {
                try {
                    File myObj = new File("filename.txt");
                    Scanner myReader = new Scanner(myObj);
                    while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        System.out.println(data);
                    }
                    myReader.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
    
                }
            }
    
            static void saveContacts() {
    
            }
    
    
        }
    }
    
    
}
