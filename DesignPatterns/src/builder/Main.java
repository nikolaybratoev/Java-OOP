package builder;

public class Main {
    public static void main(String[] args) {

        User user = new User.UserBuilder("asdasdasdasdasd", "Bratoev")
                .age(28)
                .address("Some address")
                .phone("Some phone")
                .build();

        System.out.println(user);
    }
}
