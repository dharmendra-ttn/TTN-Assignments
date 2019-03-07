package demo.service

import demo.domain.Order;
import spock.lang.Specification;

class EmailServiceSpec extends Specification {
    def "CheckForException"(){
        given:"Creating EmailService Instance"
        EmailService emailService = new EmailService()
         and: "Mocking Order"
         Order order = Mock(Order)
        
        when:
        emailService.sendEmail(order)
        
        then:
        thrown(RuntimeException)
        
    }
    def "Check for return value"(){
        given:"Creating EmailService Instance"
        EmailService emailService = new EmailService()
        and:"Mocking Order"
        Order order = Mock(Order)
        and:"Creating a blank String"
        String cc = ""
        and: "Creating Boolean Return"
        Boolean ret
        when:
        ret = emailService.sendEmail(order,cc)
        
        then:
        ret == true
        
    }
}
