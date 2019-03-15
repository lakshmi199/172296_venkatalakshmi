package com.springjdbc.assignment;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setEmpno(rs.getInt("empno"));
        employee.setEname(rs.getString("ename"));
        employee.setJob(rs.getString("job"));
        employee.setMgr(rs.getInt("mgr"));
      //employee.setHiredate(rs.getDate("hiredate"));
        employee.setSal(rs.getInt("sal"));
     employee.setComm(rs.getInt("comm"));
      employee.setDeptno(rs.getInt("deptno"));
        return employee;
    }
}
