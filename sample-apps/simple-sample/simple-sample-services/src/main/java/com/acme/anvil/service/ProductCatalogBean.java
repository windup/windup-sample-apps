package com.acme.anvil.service;

import java.rmi.RemoteException;
import java.util.logging.Logger;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class ProductCatalogBean implements SessionBean {

	private static final Logger LOG = Logger.getLogger("ProductCatalogBean");
	
	private SessionContext sessionContext;
	
	public void setSessionContext(SessionContext ctx) throws EJBException, RemoteException {
		this.sessionContext = ctx;
	}

	public void ejbRemove() throws EJBException, RemoteException {
		LOG.info("Called Remove.");
	}

	public void ejbActivate() throws EJBException, RemoteException {
		LOG.info("Called Activate");
	}

	public void ejbPassivate() throws EJBException, RemoteException {
		LOG.info("Called Passivate");
	}
	
	public void populateCatalog() {
		LOG.info("Do something.");
	}
}
