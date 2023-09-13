package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Contract {
    LocalDate date;
    double valuePerHour;
    Integer hours;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue(){
        double value = getValuePerHour();
        Integer hours = getHours();

        double total = value * hours;

        return total;
    }
}
