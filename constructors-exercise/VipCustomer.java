public class VipCustomer {
    private String name;
    private double creditLimit;
    private String vipEmailAddress;

    public VipCustomer() {
        this("Default Vip", 0.0, "defaultemail@vip.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknownemail@vip.com");
    }

    public VipCustomer(String name, double creditLimit, String vipEmailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.vipEmailAddress = vipEmailAddress;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getVipEmailAddress() {
        return this.vipEmailAddress;
    }

    public void setVipEmailAddress(String vipEmailAddress) {
        this.vipEmailAddress = vipEmailAddress;
    }
}
