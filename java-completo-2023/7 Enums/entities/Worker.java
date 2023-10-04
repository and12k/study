package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    String name;
    WorkerLevel level;
    Double baseSalary;
    List<Contract> contracts;
    Departament departament;

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
        contracts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartment(String department){
        this.departament.setName(department);

    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void addContract (Contract contract){
        contracts.add(contract);
    }
    public void removeContract(Contract contract){
        contracts.remove(contract);
    }

    public double income(Integer month, Integer year){

        double totalIncome = baseSalary;

        for (Contract contract: contracts) {

            LocalDate dateValidate = contract.getDate();

            if (dateValidate.getMonth().getValue() == month && dateValidate.getYear() == year ) {
                totalIncome += contract.totalValue();
            }
        }

        return totalIncome;
    }

}
