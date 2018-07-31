package ishop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;


@SpringBootApplication
@EntityScan(basePackageClasses = {
		IShopOAuth2ServiceApplication.class,
		Jsr310JpaConverters.class
})
public class IShopOAuth2ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IShopOAuth2ServiceApplication.class, args);
	}
}
