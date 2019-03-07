package demo.domain
import spock.lang.Specification

class OrderSpec extends Specification {
    def "Adding Order Details Via Constructor"() {
        
        given: "Creating order Instance"
        Order order = new Order(2, "Sample", 1234)
        
        expect:
        order.getItemName() == "Sample"
        order.getQuantity() == 2
        order.getPrice()==1234
    }
    def "Adding Data via Getter and Setters"(){
        given: "Creating order instance"
        Order order = new Order()
        
        when:
        order.setItemName("Sample1").setPrice(123).setQuantity(2).setPriceWithTex(145)
        
        then:
        order.getPrice() == 123
        order.getItemName() == "Sample1"
        order.getQuantity() == 2
        order.getPriceWithTex() == 145
    }
}
