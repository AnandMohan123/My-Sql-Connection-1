package com.mySqlConn.mybatis.springbootmybatis.model;

public class Users {

	private Integer Seq_No;
	private String Employee_Name;
	private String  Employee_Age;
	private Integer Employee_Salary;

    public String getName() {
        return Employee_Name;
    }

    public void setEmployee_Name(String Employee_Name) {
        this.Employee_Name = Employee_Name;
    }
    
    public String getEmployee_Age() {
        return Employee_Age;
    }

    public void setEmployee_Age(String Employee_Age) {
        this.Employee_Age = Employee_Age;
    }

    public Integer getEmployee_Salary() {
        return Employee_Salary;
    }

    public void setEmployee_Salary(Integer Employee_Salary) {
        this.Employee_Salary = Employee_Salary;
    }

    public Integer getSeq_No() {
        return Seq_No;
    }

    public void setSeq_No(Integer Seq_No) {
        this.Seq_No = Seq_No;
    }
}
