package jogayjoga.sport;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
// import java.util.List;



@FeignClient(name = "jogayjoga-sport")
public interface SportController {
    
    @PostMapping("/sport")
    ResponseEntity<?> create(
            @RequestBody(required = true) SportIn in);
    
    // @GetMapping("/sport/")
    // //list?
    // ResponseEntity<List<sportOut>> getAllsports();

    @GetMapping("/sport/{id}")
    ResponseEntity<SportOut> get(
        @PathVariable(required = true) String id
    );
        
    // @PutMapping("/sport/{id}")
    // ResponseEntity<sportOut> update (
    //     @PathVariable(required = true) String id,
    //     @RequestBody(required = true) UpdateIn in
    // );
}
