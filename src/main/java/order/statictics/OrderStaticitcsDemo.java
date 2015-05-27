package order.statictics;

public class OrderStaticitcsDemo {

	public static void main(String[] args) {
	
		OrderStatistics orderStatistics = new OrderStatistics(new int[] {1,7,4,6,3,10,5,8,9});
		System.out.println(orderStatistics.randomizedSelect(0, 8, 4));

	}

}