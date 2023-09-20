package SpringDemo.stDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface GameConsole{
	void left();
	void right();
	void up();
	void down();
	
}
@Component("Mario")
class Mario implements GameConsole{
	public void left() {System.out.println("left mario");}
	public void right() {System.out.println("right mario");}
	public void up(){System.out.println("up mario");}
	public void down() {System.out.println("down mario");}
}
@Component("pacMan")
@Primary
class pacMan implements GameConsole{
	public void left() {System.out.println("left pacMan");}
	public void right() {System.out.println("right pacMan");}
	public void up() {System.out.println("up pacMan");}
	public void down() {System.out.println("down pacMan");}
}
@Component("Contra")
class Contra implements GameConsole{
	public void left() {System.out.println("left Contra");}
	public void right() {System.out.println("right Contra");}
	public void up() {System.out.println("up Contra");}
	public void down() {System.out.println("down Contra");}
}
@Component
class GameRunner{
	
	
	@Autowired
	@Qualifier("Mario")
	GameConsole obj;
	public GameRunner(GameConsole obj) {
		this.obj=obj;
	}
	public void runGame() {
		obj.left();
		obj.right();
		obj.up();
		obj.down();
	}
}