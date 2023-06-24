package guardiantemplates;

import java.util.Arrays;

public class User {
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String position;
    private Trips[] trips;


    public User(String email, String firstName, String lastName, String password, String position, Trips[] trips) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.position = position;
        this.trips = Arrays.copyOf(trips, trips.length);
    }


    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Trips[] getTrips() {
        return this.trips;
    }

    public void setTrips(Trips[] trips) {
        this.trips = trips;
    }

    
}