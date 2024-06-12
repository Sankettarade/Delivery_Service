package abstractlist;

import java.util.AbstractSequentialList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class DeliveryRoute<E> extends AbstractSequentialList<E>{
	
	private final List<E> deliveryPoints;
	private int size;

	public DeliveryRoute()
	{
		deliveryPoints = new LinkedList<>();
		size = 0;
	}

	@Override
	public int size() {
		
		return deliveryPoints.size();
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		
		return deliveryPoints.listIterator(index);
	}
	
	@Override
	public boolean add(E e)
	{
		return deliveryPoints.add(e);
	}
	
	@Override
	public boolean remove(Object o)
	{
		return deliveryPoints.remove(o);
	}
	
	public static void main(String[] args) {
		DeliveryRoute deliveryRoute = new DeliveryRoute();
		System.out.println("Add delivery points : ");
		deliveryRoute.add("Pune");
		deliveryRoute.add("Wagholi");
		deliveryRoute.add("Shirur");
		deliveryRoute.add("Nagar");
		System.out.println(deliveryRoute);
		System.out.println("Remove delivery point : "+deliveryRoute.remove(1));
		System.out.println("After removeing delivery point : "+deliveryRoute);
		System.out.println("Get the specific index in list : "+deliveryRoute.get(0));
		System.out.println("Size of list : "+deliveryRoute.size());
		
	}
	
}