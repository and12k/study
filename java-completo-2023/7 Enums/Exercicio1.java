import entities.Contract;
import entities.Departament;
import entities.Worker;
import entities.WorkerLevel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercicio1 {
    public static void main(String[] args) {

//        Ler os dados de um trabalhador com N contratos (M fornecido pelo usuário). Depois, solicitar do usuário
//        um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo

//        Enter department's name: Design
//        Enter worker data:
//        Name: Alex
//        Level: MID_LEVEL
//        Base salary: 1200.00
//        How many contracts to this worker? 3
//        Enter contract #1 data:
//        Date (DD/MM/YYYY): 20/08/2018
//        Value per hour: 50.00
//        Duration (hours): 20
//        Enter contract #2 data:
//        Date (DD/MM/YYYY): 13/06/2018
//        Value per hour: 30.00
//        Duration (hours): 18
//        Enter contract #3 data:
//        Date (DD/MM/YYYY): 25/08/2018
//        Value per hour: 80.00
//        Duration (hours): 10
//        Enter month and year to calculate income (MM/YYYY): 08/2018
//        ---------------------------------
//        Name: Alex
//        Department: Design
//        Income for 08/2018: 3000.00
//        ---------------------------------

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String name, level;
        Departament department = new Departament();
        double baseSalary;
        Worker worker;

        System.out.print("Enter department's name: ");
        department.setName(sc.nextLine());

        System.out.println("Enter Worker Data");

        System.out.print("Name: ");
        name = sc.nextLine();

        System.out.print("Level: ");
        level = sc.next();

        System.out.print("Base salary: ");
        baseSalary = sc.nextDouble();

        System.out.print("How many contracts to this worker? ");
        int numberContracts = sc.nextInt();

        worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, department);

        for (int i = 0; i != numberContracts;i++){
            System.out.println();

            Contract contract = new Contract();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.println("Enter contract #"+(i+1)+" data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            String date = sc.next();
            contract.setDate(LocalDate.parse(date, formatter));

            System.out.print("Value per hour: ");
            contract.setValuePerHour(sc.nextDouble());

            System.out.print("Duration (Hours): ");
            contract.setHours(sc.nextInt());

            worker.addContract(contract);
    }
        System.out.println("---------------------------------------------------");
        System.out.print("Enter Month and Year to calculate income (MM/YYYY): ");
        String dataInsert = sc.next();
        String[] monthAndYear = dataInsert.split("/");
        Integer month = Integer.valueOf(monthAndYear[0]);
        Integer year = Integer.valueOf(monthAndYear[1]);

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartament().getName());
        System.out.printf("Income for %s: %.2f \n",dataInsert,  worker.income(month,year));

        System.out.println("---------------------------------------------------");









        sc.close();
}}
