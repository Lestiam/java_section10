package Application.section99.application;

import Application.section99.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AumentaSalarioComList {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i =0; i < n; i++){
            System.out.println();
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {//enquanto o id que eu digitei existe na lista...
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);//instancio na memória um novo objeto funcionario com os dados que digitei

            list.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase :");
        int idSalary = sc.nextInt();
        //Integer pos = position(list, idSalary); //método com funçao que fiz fora da calsse principal
        Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null); //método usando Linq com lambda


        if (emp == null) { //usando o método anterior era pos == null
            System.out.print("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            //list.get(pos).IncreaseSalary(percent); //aqui usava o método antigo
            emp.IncreaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee e : list)//para cada Employee(objeto) e pertencente a minha lista "list"... eu vou mandar imprimir na tela o valor de e
            System.out.println(e);

        sc.close();
    }

    public static Integer position(List<Employee> list, int id){//recebe como argumento uma lista de funcionarios e um ID e tem que me retornar a posição desse funcionário na lista
        for (int i =0; i < list.size(); i++){
            if (list.get(i).getId() == id) { //se o elemento da lista na posição i, tiver o id igual ao elemento que eu forneci como argumento...
                return i;
            }
        }
        return  null; // o Integer pode retornar null para indicar que o elemento não foi encontrado (-1 indica que o elemento não foi encontrado  também(se fosse o int primitivo )
    }

    public static boolean hasId(List<Employee> list, int id){ //funçãoq ue valida se aquele ID já existe
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
