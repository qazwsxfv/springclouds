package springcloudfeign.server1.service;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(name="VERSION2",fallback = Test2Service.CreateAddressServiceFallback.class)
public interface Test2Service {
    @RequestMapping("/test2/hello")
    public String hello();
    @Component
    static class CreateAddressServiceFallback implements Test2Service {


        @Override
        public String hello() {
            return "熔断";
        }
    }
}
