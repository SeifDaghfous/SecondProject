package tn.edu.esprit.firstProject.services;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class ManagmentServices
 */
@Stateless
public class ManagmentServices implements ManagmentServicesRemote, ManagmentServicesLocal {

    /**
     * Default constructor. 
     */
    public ManagmentServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int add(int a, int b) {
		return a+b;
	}

}
