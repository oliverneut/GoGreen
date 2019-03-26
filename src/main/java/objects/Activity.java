package objects;

import java.sql.Timestamp;
import java.util.Objects;

public class  Activity{
    private Timestamp time;
    private int CO2Amount;
    private int amount;
    private activityObject activity;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Activity() {

    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public int getCO2Amount() {
        return CO2Amount;
    }

    public enum activityObject {
        VEGMEAL,
        LOCALFOOD,
        BIKE,
        PUBTRANS,
        HOMETEMP,
        SOLARPANELS
    }

    public activityObject getActivity() {
        return activity;
    }

    public void setActivity(activityObject activity) {
        this.activity = activity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return CO2Amount == activity.CO2Amount &&
                Objects.equals(time, activity.time);
    }

    public void setCO2Amount(int CO2Amount) {
        this.CO2Amount = CO2Amount;
    }
}
