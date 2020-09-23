class QuickStart {
    public static void main(String[] args) {

        Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "bobbrown@gmail.com", "666999666");

        // System.out.println(bobsAccount.getBalance());
        // System.out.println(bobsAccount.getCustomerEmailAddress());
        // System.out.println(bobsAccount.getCustomerName());
        // System.out.println(bobsAccount.getCustomerPhoneNumber());
        // System.out.println(bobsAccount.getNumber());

        Account timsAccount = new Account("Tim", "tim@gmail.com", "12346");

        VipCustomer jackAccount = new VipCustomer("Jack Jackovsky", 25.9);
        System.out.println(jackAccount.getName());
        System.out.println(jackAccount.getCreditLimit());
        System.out.println(jackAccount.getVipEmailAddress());

    }
}