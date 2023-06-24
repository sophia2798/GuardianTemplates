package guardiantemplates;

import java.util.Arrays;

public class Trips {

    private String city;
    private String reportDoc;
    private boolean completed;
    private String startDate; // possibly think about using Date java.util package for validation later on?
    private String endDate;
    private String[] itinerary;
    private User[] users;


    public Trips(String city, String reportDoc, boolean completed, String startDate, String endDate, String[] itinerary, User[] users) {
        this.city = city;
        this.reportDoc = reportDoc;
        this.completed = completed;
        this.startDate = startDate;
        this.endDate = endDate;
        this.itinerary = Arrays.copyOf(itinerary, itinerary.length);
        this.users = Arrays.copyOf(users, users.length);
    }


    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getReportDoc() {
        return this.reportDoc;
    }

    public void setReportDoc(String reportDoc) {
        this.reportDoc = reportDoc;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public boolean getCompleted() {
        return this.completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String[] getItinerary() {
        return this.itinerary;
    }

    public void setItinerary(String[] itinerary) {
        this.itinerary = itinerary;
    }

    public User[] getUsers() {
        return this.users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }


}