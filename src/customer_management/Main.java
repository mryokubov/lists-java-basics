package customer_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //create a customer class
        //create a runner class that will:
        // -add a new customer
        // -update the existing customer
        // - delete the existing customer
        // - show all customers

        //

        List<Customer> customers = generateCustomers(); //list of 1000 customres


        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO CUSTOMER MANAGEMENT PLATFORM");
        while (true){
            System.out.println("add | update | delete | delete all | info | quit");
            String option = scanner.nextLine();

            if (option.equalsIgnoreCase("add")){

                System.out.print("FIRST NAME OF CUSTOMER: ");
                String firstName = scanner.nextLine();
                System.out.print("LAST NAME OF CUSTOMER: ");
                String lastName = scanner.nextLine();
                System.out.print("ADDRESS OF CUSTOMER: ");
                String address = scanner.nextLine();
                System.out.print("SSN OF CUSTOMER: ");
                String ssn = scanner.nextLine();

                Customer newCustomer = new Customer(lastName, firstName, address, ssn);

                if (customers.isEmpty()){
                    customers.add(newCustomer);
                    System.out.println("CUSTOMER ADDED SUCCESSFULLY");
                    continue;
                }

                boolean exists = false;
                for (int i = 0; i < customers.size(); i++) {

                    Customer customer = customers.get(i); //getting first customer

                    if (customer.getSsn().equalsIgnoreCase(newCustomer.getSsn())){
                        exists = true;
                        break;
                    }
                }
                if (!exists){
                    customers.add(newCustomer);
                    System.out.println("CUSTOMER ADDED SUCCESSFULLY");
                }else{
                    System.out.println("CUSTOMER ALREADY EXISTS");
                }

            }
            else if (option.equalsIgnoreCase("info")){
                if (customers.isEmpty()){
                    System.out.println("NO CUSTOMER YET");
                    continue;
                }

                for (int i = 0; i < customers.size(); i++) {
                    System.out.println( (i+1) + ". "+  customers.get(i));
                }
            }
            else if (option.equalsIgnoreCase("delete")){
                System.out.print("PLEASE ENTER SSN: ");
                String ssnNumber = scanner.nextLine();//00000
                Customer customerToDelete = null;
                for (int i = 0; i < customers.size(); i++) {
                    if (ssnNumber.equalsIgnoreCase(customers.get(i).getSsn())){
                        customerToDelete = customers.get(i);
                        break;
                    }
                }

                if (customerToDelete != null){
                    customers.remove(customerToDelete);
                    System.out.println("CUSTOMER WITH SSN " + ssnNumber + " DELETED SUCCESSFULLY");
                }else{
                    System.out.println("CUSTOMER WITH SSN " + ssnNumber + " DOES NOT EXIST");
                }

            }else if (option.equalsIgnoreCase("update")){
                System.out.print("PLEASE ENTER SSN: ");
                String ssnNumber = scanner.nextLine();//00000
                Customer customerToUpdate = null;
                for (int i = 0; i < customers.size(); i++) {
                    if (ssnNumber.equalsIgnoreCase(customers.get(i).getSsn())){
                        customerToUpdate = customers.get(i);
                        break;
                    }
                }

                if (customerToUpdate != null){
                   System.out.print("NEW FIRST NAME: ");
                    String newFirstName = scanner.nextLine();

                    System.out.print("NEW LAST NAME: ");
                    String newLastName = scanner.nextLine();

                    System.out.print("NEW ADDERESS: ");
                    String newAddress = scanner.nextLine();

                    customerToUpdate.setFirstName(newFirstName);
                    customerToUpdate.setLastName( newLastName);
                    customerToUpdate.setAddress(newAddress);

                    System.out.println("SUCCESSFULLY UPDATE CUSTOMER WITH SSN : " + ssnNumber);
                    System.out.println(customerToUpdate);

                }else{
                    System.out.println("CUSTOMER WITH SSN " + ssnNumber + " DOES NOT EXIST");
                }
            }

            else if (option.equalsIgnoreCase("quit")){
                System.out.println("HAVE A NICE DAY");
                break;
            }
            else if (option.equalsIgnoreCase("delete all")){
                System.out.println("ARE YOU SURE YOU WANT TO DELETE ALL CUSTOMERS?");
                System.out.print("ANSWER y or n: ");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("y")){
                    customers.clear();
                    System.out.println("DELETE ALL CUSTOMERS!");
                }

            }
            else{
                System.out.println("INVALID OPTION");

            }

        }

    }


    public static List<Customer> generateCustomers (){
        List<Customer> customer = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            customer.add(new Customer("Lee","Kevin","123 main street", ("123456" + i)));
        }
        return customer;
    }




}
