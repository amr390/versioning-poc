package be.cipal.poc

import org.springframework.boot.context.embedded.ServletRegistrationBean
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.ClassPathResource
import org.springframework.core.io.Resource
import org.springframework.ws.config.annotation.EnableWs
import org.springframework.ws.config.annotation.WsConfigurerAdapter
import org.springframework.ws.transport.http.MessageDispatcherServlet
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet()
        servlet.setApplicationContext(applicationContext)
        servlet.setTransformWsdlLocations(true)
        return new ServletRegistrationBean(servlet, "/addressbook", "*.wsdl")
    }

    @Bean(name = "getAddress")
    public SimpleWsdl11Definition simpleWsdl11Definition(Resource addressWsdl) {
        SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition(addressWsdl)
        wsdl11Definition
    }

    @Bean
    public Resource addressWsdl() {
        new ClassPathResource("contract/address-book/address-book.wsdl")
    }
}
