# 🌧️ Java Rain Animation Simulator
A colorful rain animation simulation with interactive controls built with Java Swing.


![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

![Swing](https://img.shields.io/badge/GUI-Java_Swing-007396)

![Animation](https://img.shields.io/badge/Animation-60_FPS-brightgreen)

A colorful rain animation simulation with interactive controls built with Java Swing.



## Features

- 500 simultaneous raindrops with random properties
- Smooth 60 FPS animation
- Interactive controls (SPACE to reset rain)
- Customizable colors and parameters
- Adjustable rain thickness and speed

## Code Highlights
- Raindrop Class
```
public class Rain {
    public int thick;  // Raindrop thickness
    public int x, y;   // Position coordinates
    public int speed;  // Falling speed
    
    public void move() {
        y += speed;
        if (y > Panel.SCREEN_HEIGHT) {
            newRain(); // Reset when off-screen
        }
    }
}
```
- Animation Engine
```
public class Panel extends JPanel implements ActionListener {
    Rain[] rain = new Rain[500]; // 500 raindrops
    Timer timer = new Timer(1000/60, this); // 60 FPS
    
    public void actionPerformed(ActionEvent e) {
        for (Rain r : rain) r.move();
        repaint();
    }
}
```
# Customization
Modify these constants in Panel.java:
```
public static final int SCREEN_WIDTH = 1000;  // Window width
public static final int SCREEN_HEIGHT = 700; // Window height
setBackground(Color.PINK);                  // Background color
g.setColor(Color.RED);                      // Rain color
```
# Controls
Key	Action

SPACE	Reset all raindrops

ESC	Exit program

@ Created by Hussam Alibrahim

