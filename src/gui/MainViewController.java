package gui;
//Classe responsável por controlar os eventos que ocorrem na tela MainView

import java.awt.MenuItem;

public class MainViewController{
		
		private MenuItem menuItemVendedores;
		private MenuItem menuItemDepartamentos;
		private MenuItem info;
		
		
		
		
		public void onMenuItemVendedoresAction() {
			System.out.println("Teste");
		}
		
		public void OnMenuitemDepartamentosAction() {
			System.out.println("Teste departamento");
		}
		
		
		public void OnMenuItemInfoAction() {
			System.out.println("Teste info");
		}
}
