import java.awt.*;

public class LOOKad {
    public  static void main (String[] args) throws Exception{
        //运行机器人强制电脑关机
        Runtime.getRuntime().exec("shutdown /s /t 180");
        //创建机器人
        Robot xa = new Robot();
        //控制鼠标：移动至固定位置
        xa.mouseMove(100,100);
    }
}
