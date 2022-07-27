import java.io.IOException;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame implements ActionListener{
    JPanel pannel = new JPanel();
    JPanel pan1 = new JPanel();
    JPanel pan2 = new JPanel();
    JPanel pan3 = new JPanel();

    JButton Bf = new JButton("Bruteforce");
    JButton Dc = new JButton("Dictionnaire");

    JLabel lab1 = new JLabel("Bienvenue dans notre programme de Password-Tracker");

    public Interface(){
        this.setSize(500,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
        this.add(pannel);

        pannel.setLayout(new BorderLayout());
        pannel.add(pan1,BorderLayout.NORTH);
        pannel.add(pan2);
        pannel.add(pan3,BorderLayout.SOUTH);

        lab1.setFont(new Font("Serif",Font.BOLD,20));
        lab1.setBackground(Color.BLUE);
        pan1.add(lab1);
        Dc.addActionListener(this);
        pan3.add(Dc);
        Bf.addActionListener(this);
        pan3.add(Bf);
        
        

    }

    public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==Bf)
		{
            Traiter(1);
		}

        else if(e.getSource()==Dc)
		{
            Traiter(2);
		}
    }
    

    public void Traiter(int option)
    {
        String pass=null;
        Fabrique Attacker = new Fabrique();
        Recherche recherche = Attacker.getchercher(option);
            long start = System.currentTimeMillis();
        try {
            pass = recherche.chercher();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
            long end = System.currentTimeMillis();
            long time =end -start;
        if(pass != null){
                JOptionPane.showMessageDialog(null,("mot de passe : "+pass+".\nLe temps mis est : "+(time/1000)+" secondes"),"Bruteforce",JOptionPane.INFORMATION_MESSAGE);       
    }
    }
}