package com.example.projet_novigrad;

public class EmployeeProfile {
    public String address,company,profiledescription, providerlicense;
    public int phonenumber;

    public EmployeeProfile(){
    }

    public EmployeeProfile(String address, int phonenumber, String company, String profiledescription) {
        this.address = address;
        this.phonenumber = phonenumber;
        this.profiledescription = profiledescription;
        this.company = company;
    }

    public int getphonenumber(){
        return this.phonenumber;
    }

    public String getAddress(){
        return this.address;
    }

    public String getProfiledescription(){
        return this.profiledescription;
    }

    public String getCompany(){
        return this.company;
    }

    public void setPhonenumber(int phonenumber){
        this.phonenumber = phonenumber;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setProfiledescription(String profiledescription){
        this.profiledescription = profiledescription;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public String toString(){
        return "PhoneNumber: "+this.phonenumber+" | Address: "+this.address+
                " | Description: "+this.profiledescription+ "| Company: "+this.company;
    }
}
