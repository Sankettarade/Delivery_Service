package abstractlist;

import java.util.AbstractList;

public class OrderList<E> extends AbstractList<E>{
	private Object[] orders;
	private int size;
	
	public OrderList()
	{
		orders = new Object[10];  
		size = 0;
	}
	
	@Override
	public boolean add(E order)
	{
	        orders[size++] = order;
	        return true;
	}

	@Override
	public E get(int index) {
		if(index < 0 || index >= size)
		{
			throw new IndexOutOfBoundsException("Index : "+index +"Size : "+size);
			
		}
		return (E) orders[index];
	}
	
	@Override
	public E remove(int index)
	{
		if(index < 0 || index >= size)
		
			 throw new IndexOutOfBoundsException("Index : "+index +"Size : "+size);
			 E removedOrder = (E) orders[index];
		     System.arraycopy(orders, index + 1, orders, index, size - index - 1);
		     size--;
	         return removedOrder;
	}
	
	@Override
	public int size() {
		
		return size;
	}

public static void main(String[] args) {
	
	OrderList<String> orderList = new OrderList();
	orderList.add("Laptop");
	orderList.add("Headphone");
	orderList.add("Bag");
	orderList.add("Handwash");
	orderList.add("LG TV");
	orderList.add("Pen");
	System.out.println(orderList);
	System.out.println("Index of element : "+orderList.get(0));
	System.out.println("Remove order element : "+orderList.remove(1));
	System.out.println("After removing element in list : "+orderList);
	System.out.println("Size of list :"+orderList.size());

  }
}
