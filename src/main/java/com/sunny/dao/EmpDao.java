package com.sunny.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sunny.beans.Emp;

public class EmpDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Emp p) {
		String sql = "insert into employee(name, salary, email, designation, phonenumber, dept) values('" + p.getName()
				+ "'," + p.getSalary() + ",'" + p.getEmail() + "','" + p.getDesignation() + "','" + p.getPhoneNumber()
				+ "','" + p.getDept() + "')";
		return template.update(sql);
	}

	public int update(Emp p) {
		String sql = "update employee set name='" + p.getName() + "', salary=" + p.getSalary() + ", email='"
				+ p.getEmail() + "', designation='" + p.getDesignation() + "', phonenumber='" + p.getPhoneNumber()
				+ "', dept='" + p.getDept() + "' where id=" + p.getId() + "";
		return template.update(sql);
	}

	public int delete(int id) {
		String sql = "delete from employee where id=" + id + "";
		return template.update(sql);
	}

	public Emp getEmpById(int id) {
		String sql = "select * from employee where id=?";
		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<Emp>(Emp.class));
	}

	public List<Emp> getEmployees() {
		return template.query("select * from employee", new RowMapper<Emp>() {
			@Override
			public Emp mapRow(ResultSet rs, int row) throws SQLException {
				Emp e = new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				e.setEmail(rs.getString(4));
				if (rs.getString(5) == "Y") {
					e.setActive(Boolean.TRUE);
				} else {
					e.setActive(Boolean.FALSE);
				}
				if (rs.getString(6) == "Y") {
					e.setReference(Boolean.TRUE);
				} else {
					e.setReference(Boolean.FALSE);
				}
				e.setDesignation(rs.getString(7));
				e.setPhoneNumber(rs.getString(8));
				e.setDept(rs.getString(9));

				return e;
			}
		});
	}
}