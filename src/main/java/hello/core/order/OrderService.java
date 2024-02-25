package hello.core.order;

//test용
public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
