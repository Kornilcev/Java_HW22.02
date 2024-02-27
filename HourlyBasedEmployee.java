package extension;

import lesson10.Employee;
import lesson10.HourlyEmployee;

public class HourlyBasedEmployee {
    private int monthlyHours;

    private String name;
    private double baseSalary;

   public double calculateSalary(){
       return monthlyHours * 25 + baseSalary;
    }
    public HourlyBasedEmployee(String name, double baseSalary, int monthlyHours){
       this.name = name;
       this.baseSalary = baseSalary;
       this.monthlyHours = monthlyHours;
    }

    public int getMonthlyHours() {
        return monthlyHours;
    }

    public void setMonthlyHours(int monthlyHours) {
        this.monthlyHours = monthlyHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public static void main(String[] args) {
        HourlyBasedEmployee a1 = new HourlyBasedEmployee("Misha", 25, 180);
        HourlyBasedEmployee a2 = new HourlyBasedEmployee("Edik",25, 90);
        HourlyBasedEmployee a3 = new HourlyBasedEmployee("Tania", 25, 360);
        System.out.println(a1.getName() + ":" + a1.calculateSalary());
        System.out.println(a2.getName() + ":" + a2.calculateSalary());
        System.out.println(a3.getName() + ":" + a3.calculateSalary());
    }
}


