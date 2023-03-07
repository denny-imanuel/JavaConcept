package ListObject;

public class Customer {
    public Integer CustomerId;
    public String CustomerName;
    public String CustomerAddress;
    public String CustomerContact;

    public Customer(Integer id, String name, String addr, String contact) {
        this.CustomerId = id;
        this.CustomerName = name;
        this.CustomerAddress = addr;
        this.CustomerContact = contact;
    }

    public Integer getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Integer customerId) {
        CustomerId = customerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        CustomerAddress = customerAddress;
    }

    public String getCustomerContact() {
        return CustomerContact;
    }

    public void setCustomerContact(String customerContact) {
        CustomerContact = customerContact;
    }
}
