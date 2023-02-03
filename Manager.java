package org.example.Day35PracticePrablem;


import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Manager {

    public static void quryRunnur(Employee employee) throws SQLException {

        Connection con = MyConnection.connection();
        String q = "select * from emplyeePayroll";
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(q);

        List<Employee> employeeList = new ArrayList<>();

        while (resultSet.next()) {
            employee = new Employee();
            employee.setEmpID(resultSet.getInt(1));
            employee.setEmpName(resultSet.getString(2));
            employee.setPhoneNumber(resultSet.getString(3));
            employee.setAdress(resultSet.getString(4));
            employee.setDepartment(resultSet.getString(5));
            employee.setBasicPay(resultSet.getFloat(7));
            employee.setStartDate(resultSet.getDate(8));
            employee.setCity(resultSet.getString(9));
            employee.setContry(resultSet.getString(10));
            employeeList.add(employee);
        }
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()){
            Employee next = iterator.next();
            System.out.println(next);
        }
    }

    public static Employee employee(){
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("enter name");
        employee.setEmpName(sc.nextLine());

        System.out.println("enter phoneNumber");
        employee.setEmpName(sc.nextLine());

        System.out.println("enter adress");
        employee.setEmpName(sc.nextLine());

        System.out.println("enter depart");
        employee.setEmpName(sc.nextLine());

        System.out.println("enter basic pay ");
        float basic = sc.nextFloat();
        employee.setBasicPay(basic);

        System.out.println("enter date in =2006-07-04");
        String string = sc.toString();

        // Using parse method to convert the string to LocalDate object
       /* Instant timestamp = Instant.parse(string);
        employee.setStartDate(Date.from(timestamp));*/


        return employee;
    }
    public static boolean creat() throws SQLException {
        Connection con = MyConnection.connection();
        Employee employee = employee();
        boolean f = false;
        try {
            String q = "insert into emplyeePayroll(empName ,phoneNumber ,adress ,department  ,basicPay ,city ,contry)" +
                    "values( ?,?,?,?,?,?,?)";
            PreparedStatement pstp = con.prepareStatement(q);
            pstp.setString(1,employee.getEmpName());
            pstp.setString(2, employee.getPhoneNumber());
            pstp.setString(3, employee.getAdress());
            pstp.setString(4, employee.getDepartment());
            //  pstp.setCharacterStream(5, employee.getGen());
            pstp.setFloat(5, employee.getBasicPay());
          //  pstp.setDate(6, employee.getStartDate());
            pstp.setString(7, employee.getCity());
            pstp.setString(8, employee.getCity());

            pstp.executeUpdate();
            f = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }

    //create ,retrive update, delete


}
