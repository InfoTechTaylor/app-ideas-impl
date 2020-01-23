package bin2Dec;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	private final AtomicLong id = new AtomicLong();

	@GetMapping("/getDecimal")
	public BinaryToDecimal binaryToDecimal(@RequestParam(value = "binary", defaultValue = "0") String binary) {
		return new BinaryToDecimal(id.incrementAndGet(), binary);
    }
    
    // TODO add a mapping for errors
    // TODO add validation route that calls validation class, returns message if invalid
    // TODO add tests
}