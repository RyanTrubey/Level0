import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot idk = new Robot();
	idk.penDown();
	idk.setSpeed(10);
	idk.hide();
	idk.move(500);
	idk.turn(90);
	for(int i = 0; i < 45; i++){
	idk.move(10);
	idk.turn(4);
	}
	idk.turn(-120);
	idk.move(230);
}
}
