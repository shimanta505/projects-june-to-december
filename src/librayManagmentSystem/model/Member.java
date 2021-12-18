package librayManagmentSystem.model;

public class Member {
    private String name;
    private int registrationNumber;

    public Member(String name, int registrationNumber) {
        this.name = name;
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }
}
