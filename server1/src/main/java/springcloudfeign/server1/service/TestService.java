package springcloudfeign.server1.service;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(name="VERSION2",fallback = TestService.CreateAddressServiceFallback.class)
public interface TestService {
    @RequestMapping("/test/hello")
    public String hello();
    @Component
    static class CreateAddressServiceFallback implements TestService{


        @Override
        public String hello() {
            return "熔断";
        }
    }
}
