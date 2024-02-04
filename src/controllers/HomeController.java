package controllers;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import DAO.DAOEmployee;
import models.Employee;
import models.TableModel;
import utils.DBSingleton;
import views.HomeFenetre;

public class HomeController {
	private HomeFenetre h;
	private TableModel myTable;
	private List<Employee> employees;
    private DAOEmployee daoEmployee;
	
	public HomeController(HomeFenetre h) throws SQLException {
		super();
		this.h = h;
		employees = new ArrayList<>();
		myTable = new TableModel(employees);
		daoEmployee = new DAOEmployee(DBSingleton.getInstance().getConnection());
		init();
		h.setVisible(true);
	}
	
	public void init() {
		try {
            employees = daoEmployee.findAll(0, 48);
            myTable = new TableModel(employees);
			h.getTable().setModel(myTable);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }	
	}
	
}
