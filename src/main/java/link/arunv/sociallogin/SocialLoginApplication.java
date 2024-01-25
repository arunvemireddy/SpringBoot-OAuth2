package link.arunv.sociallogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication(scanBasePackages = "link.arunv")
public class SocialLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialLoginApplication.class, args);
	}

}
