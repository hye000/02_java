package com.kh.object.practice7.run;

import com.kh.object.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmpNo(200);
		emp1.setEmpName("홍xx");
		System.out.println("empNo : " + emp1.getEmpNo() + " | empName : " + emp1.getEmpName());
		
		System.out.println();
		
		Employee emp2 = new Employee();
		emp2.setEmpNo(100);
		emp2.setEmpName("홍길동");
		emp2.setDept("영업부");
		emp2.setJob("과장");
		emp2.setAge(25);
		emp2.setGender('남');
		emp2.setSalary(2500000);
		emp2.setBonusPoint(0.05);
		emp2.setPhone("010-1234-5678");
		emp2.setAddress("서울시 강남구");
		
		System.out.print("empNo : " + emp2.getEmpNo() + "\n"
						+ "empName : " + emp2.getEmpName() + "\n"
						+ "dept : " + emp2.getDept() + "\n"
						+ "job : " + emp2.getJob() + "\n"
						+ "age : " + emp2.getAge() + "\n"
						+ "gender : " + emp2.getGender() + "\n"
						+ "salary : " + emp2.getSalary() + "\n"
						+ "bonusPoint : " + emp2.getBonusPoint() + "\n"
						+ "phone : " + emp2.getPhone() + "\n"
						+ "address : " + emp2.getAddress());
	}

}
