package ie.atu.openfeign2;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@FeignClient(name = "confirmation-service", url = "http//localhost:8082")
public interface RegServiceClient {
    @PostMapping("/confirm")
    String someDetails(@RequestBody UserDetails userDetails);

}
