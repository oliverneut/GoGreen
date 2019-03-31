package objects;

public class Friend {
    String email;
    float totalCO2;

    public Friend() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getTotalCO2() {
        return totalCO2;
    }

    public void setTotalCO2(float totalCO2) {
        this.totalCO2 = totalCO2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Friend friend = (Friend) o;

        if (Float.compare(friend.totalCO2, totalCO2) != 0) {
            return false;
        }
        return email != null ? email.equals(friend.email) : friend.email == null;
    }
}
