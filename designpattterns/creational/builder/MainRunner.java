package creational.builder;

public class MainRunner {

	public static void main(String[] args) {

		LunchOrder.Builder builder=new LunchOrder.Builder();
		builder.bread("Wheat").meat("chicken");
		LunchOrder order=builder.build();
		System.out.println(order.getBread());
		System.out.println(order.getCondiments());
		System.out.println(order.getDressing());
		System.out.println(order.getMeat());

	}


}
