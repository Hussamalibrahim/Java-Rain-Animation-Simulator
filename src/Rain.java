import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.Random;

public class Rain {
    public int thick;
    public int x;
    public int y;
    public int py;
    public int speed;
    Rain(){
       newRain();
    }
    public void move(){
        py = y;
        y += speed;
        if (y > Panel.SCREEN_HEIGHT){
            newRain();
        }

    }
    public void newRain(){
        y= -new Random().nextInt(Panel.SCREEN_HEIGHT /2);
        py = 0;
        x = new Random().nextInt(Panel.SCREEN_WIDTH);
        speed =  new Random().nextInt(5) +2;
        thick = new Random().nextInt(3) +1;
    }
}
