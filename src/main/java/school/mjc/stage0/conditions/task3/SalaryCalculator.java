package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0){
            System.out.println("wrong input!");
        }
        else if(salary<=10000){
            System.out.println((float)salary*85/100);
        }
        else if(salary > 10000 && salary <=20000){
            System.out.println((float)salary*82/100);
        }
        else if(salary > 20000){
            System.out.println((float)salary*80/100);
        }

    }
}
