import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Spammer {
    public static void main(String[] args) throws AWTException, InterruptedException {

        Robot robot = new Robot();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el texto que quieres espamear");
        String textoSpam= sc.nextLine();
        System.out.println("Cuantos mensajes quieres que se envien");
        int numeroVeces= sc.nextInt();
        StringSelection stringSelection= new StringSelection(textoSpam);
        Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection,null);
        System.out.println("El proceso de Spam comenzara en 5s");
        Thread.sleep(5000);
        int contador= 0;
        while (numeroVeces>=contador) {
            Thread.sleep(1000);



            robot.keyPress(KeyEvent.VK_META);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_META);
            robot.keyRelease(KeyEvent.VK_V);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);




            contador++;
        }
    }
}
