package gr.aueb.cf.ch20.enums;

public class AccountMain {

    public static void main(String[] args) {
        AccountType accountType = AccountType.CURRENT;

        String strAccountType = accountType.name();
        System.out.println(strAccountType);

        AccountType accountType1 = AccountType.valueOf(strAccountType);

        for (AccountType value:AccountType.values()) {
            System.out.println(value.name() + "");
            System.out.println(value.ordinal());
        }
    }
}
