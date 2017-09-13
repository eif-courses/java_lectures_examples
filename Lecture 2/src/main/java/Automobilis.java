import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Automobilis {
    class Variklis{}
    class Ratas{ }
    class Kebulas{}

static void sk(int ... skaicius){
    for (int i = 0; i < skaicius.length; i++) {
        System.out.println(skaicius[i]);
    }
}

    public static void main(String[] args) {
        sk(10, 50, 90,52,55);
        Automobilis auto = new Automobilis();
        Variklis variklis = auto.new Variklis();

        JButton j = new JButton();
        j.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


    }
}