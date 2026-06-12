package java_code.danyuan15;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class BallPane extends Pane {
    public final double radius = 50;
    private double x = radius,y = radius;
    private double dx = 1,dy = 1;
    private final Circle circle = new Circle(x,y,radius);
    private final Timeline animation;

    public BallPane(){
        this.getChildren().add(circle);
        circle.setFill(Color.RED);
        animation = new Timeline(new KeyFrame(Duration.millis(40),e->{
            Moveball();
        }));
        animation.setCycleCount(Timeline.INDEFINITE);        //  设置动画循环次数
        animation.play();         // 动画运行

    }

    public Animation.Status getStatus(){
        return animation.getStatus();
    }
    public void play(){                 //  暂 停
        animation.play();
    }
    public void pause(){               //  运 行
        animation.pause();
    }


    public void increaseSpeed(){                           // 加 速
        animation.setRate(animation.getRate()+0.3);
    }
    public void decreaseSpeed(){                          // 减 速
        animation.setRate(
                animation.getRate()>0 ? animation.getRate()-0.3:0
        );
    }

    protected void Moveball(){
        if (x < radius || x > getWidth()-radius){
            dx = -dx;
        }
        if (y < radius || y > getHeight()-radius){
            dy = -dy;
        }
        x += dx;
        y += dy;
        circle.setCenterX(x);       // 重置圆点坐标
        circle.setCenterY(y);


//        //渐变效果
        Stop[] stops = new Stop[] { new Stop(0, Color.WHITE), new Stop(0.3, Color.RED),new Stop(1, Color.DARKRED) };
        RadialGradient rg = new RadialGradient(0,.1,x-25,y-25,radius, false, CycleMethod.NO_CYCLE,stops);
        circle.setFill(rg);
     }


}

