package SpringDemo.stDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(Application.class, args);
//		Mario mario = new Mario();
//		pacMan pacman = new pacMan();
//		Contra contra = new Contra();
//		
//		GameRunner gr = new GameRunner(contra);
//		gr.runGame();
		
		GameRunner runner = context.getBean(GameRunner.class);
		runner.runGame();
	}

}
