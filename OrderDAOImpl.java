package one2many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class OrderDAOImpl implements OrderDAO {
	EntityManager entityManager;
	@Override
	public List<Order> findAllOrder() {
		// TODO Auto-generated method stub
		
			TypedQuery<Order> query = entityManager.createQuery("from Order", Order.class);
			return query.getResultList();
		}
	}


