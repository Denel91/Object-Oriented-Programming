package Design_Pattern.Builder;

import Design_Pattern.Builder.BankAccount.BankAccountBuilder;

public class ClientBuilder {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccountBuilder("John", "22738022275")
                .withEmail("john@gmail.com")
                .wantNewsLetter(true)
                .build();
    }
}
