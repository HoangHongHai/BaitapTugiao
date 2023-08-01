package Bai3;


public class Customer {
    private String name;
    private boolean member = false;
    private String memberType;
    public Customer (String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
    public Boolean isMember() {
        return true;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getMemberType() {
        return memberType;
    }

    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }
}
