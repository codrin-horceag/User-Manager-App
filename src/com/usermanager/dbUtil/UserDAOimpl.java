/**
 * Copyright the original author or authors.
 */
package com.usermanager.dbUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDAOimpl {

	Session session = HibernateUtil.getHibernateSession().openSession();

	Transaction transaction = null;

}
