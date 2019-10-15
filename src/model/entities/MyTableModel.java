package model.entities;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import model.services.DepartmentService;

public class MyTableModel extends AbstractTableModel implements TableModel{
	private List<Department> list;
	private String[] colunas = new String[] {"Id", "Name" };
	private DepartmentService service;
	
	public MyTableModel(List<Department> list) {
		this.list = list;
	}
	
	public MyTableModel() {
		this.list = new ArrayList<Department>();
	}
	

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public int getRowCount() {
		return list.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Department departamentoSelecionado = list.get(rowIndex);
		String selecionado = null;
		
		switch(columnIndex){
		case 0:
			selecionado = departamentoSelecionado.getId();
			break;
		case 1:
			selecionado = departamentoSelecionado.getName();
			break;
			
		}
		return selecionado;
	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	@Override
	public String getColumnName(int columnIndex) {
		return colunas[columnIndex];
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
			Department departamento = list.get(rowIndex);
			
			switch(columnIndex) {
			case 0:
				departamento.setId(aValue.toString());
				break;
				
			case 1:
				departamento.setName(aValue.toString());
				break;
			}
			fireTableCellUpdated(rowIndex, columnIndex);
	}
	
	public Department getDepartamento(int indexLinha) {
		return list.get(indexLinha);
	}
	
	public void addDepartment(Department department) {
		list.add(department);
		
		int ultimaLinha = getRowCount() - 1;
		
		fireTableRowsInserted(ultimaLinha, ultimaLinha);
	}
	
	public void removeDepartment(int linha) {
		list.remove(linha);
		
		fireTableRowsDeleted(linha, linha);
	}
	
	public void addListaDepartment(List<Department> list){
		int lastTamanho = getRowCount();
		
		list.addAll(list);
		fireTableRowsInserted(lastTamanho, getRowCount()-1);
	}
	
	public void limpar() {
		list.clear();
		fireTableDataChanged();
	}
	
	public void setDepartmentService(DepartmentService service) {
		this.service = service;
	}
}
