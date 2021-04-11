package com.projectassignment5;

import java.util.Scanner;

class ShippingAddress{
    String streetAddress;
    String city;
    String state;
    String zipCode;

    Scanner myScanner = new Scanner(System.in);

    void setStreetAddress(){
        System.out.println("Enter street address: ");
        streetAddress = myScanner.nextLine();
    };

    void setCity(){
        System.out.println("Enter city: ");
        city = myScanner.nextLine();
    };

    void setState(){
        System.out.println("Enter state: ");
        state = myScanner.nextLine();
    };

    void setZipCode(){
        System.out.println("Enter Zip Code: ");
        zipCode = myScanner.nextLine();
    };

    public String getStreetAddress(){
        return streetAddress;
    };

    public String getCity(){
        return city;
    };

    public String getState(){
        return state;
    };

    public String getZipCode(){
        return zipCode;
    };

    void setInfo(){
        setStreetAddress();
        setCity();
        setState();
        setZipCode();
    }

    void formattedPrint(){
        System.out.println("The Shipping address is: \n");
        System.out.println(getStreetAddress() + "\n");
        System.out.println(getCity() + ", " + getState() + "\n");
        System.out.println(getZipCode() + "\n");
    }
}

class CustomerInfo{
    String firstName;
    String lastName;
    String email;
    String phoneNumber;

    Scanner myScanner = new Scanner(System.in);

    void setFirstName(){
        System.out.println("Enter your first name: ");
        firstName = myScanner.nextLine();
    }

    void setLastName(){
        System.out.println("Enter your last name: ");
        lastName = myScanner.nextLine();
    }

    void setEmail(){
        System.out.println("Enter your email: ");
        email = myScanner.nextLine();
    }

    void setPhoneNumber(){
        System.out.println("Enter your phone number: ");
        phoneNumber = myScanner.nextLine();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    void setInfo(){
        setFirstName();
        setLastName();
        setEmail();
        setPhoneNumber();
    }

    void formattedPrint(){
        System.out.println("Contact Information: \n");
        System.out.println(getFirstName() + " " + getLastName() + "\n");
        System.out.println(getEmail() + "\n");
        System.out.println(getPhoneNumber() + "\n");
    }
}

public class Main {
    void shippingInfo(){
        ShippingAddress s = new ShippingAddress();
        s.setInfo();
        s.formattedPrint();
    }
    void custInfo(){
        CustomerInfo c = new CustomerInfo();
        c.setInfo();
        c.formattedPrint();
    }
    public static void main(String[] args) {
	    Main m = new Main();
	    m.shippingInfo();
	    m.custInfo();
    }
}
