package dta.ihm;

import java.util.Scanner;

import javax.ws.rs.WebApplicationException;

import dta.model.Employe;
import dta.service.EmployeService;


public class RechercherEmployeParIdAction implements Action {

	public Integer getId() {
		return 2;
	}

	public String getMenu() {
		return "Rechercher un employÃ© par id";
	}

	public void execute() {
		System.out.println("Veuillez saisir l'id de l'employé");
		Scanner sc = new Scanner(System.in);
		Integer id = sc.nextInt();
		System.out.println("Employé recherché :");
try {
			
			Employe employe = new EmployeService().findId(id);
			
			
				System.out.println(employe);
			
		} catch (WebApplicationException e) {
			System.out.println("Impossible de rÃ©cupÃ©rer les employes");
		}
	
	sc.close();
	}
	
}
