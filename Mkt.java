import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Mercadinho {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Mercado");
		
		JPanel panel = new JPanel();
		
		JLabel product = new JLabel("Produtos: ");
		JCheckBox batata = new JCheckBox("Batata");
		JCheckBox cenoura = new JCheckBox("Cenoura");
		JCheckBox cebola = new JCheckBox("Cebola");
		JCheckBox beterraba = new JCheckBox("Beterraba");
		JCheckBox pepino = new JCheckBox("Pepino");
		JCheckBox pimentao = new JCheckBox("Pimentão");
		JCheckBox tomate = new JCheckBox("Tomate");
		
		JLabel price = new JLabel("Preços: ");
		JLabel batataPrice = new JLabel("R$ 1.50");
		JLabel cenouraPrice = new JLabel("R$ 2.00");
		JLabel cebolaPrice = new JLabel("R$ 3.10");
		JLabel beterrabaPrice = new JLabel("R$ 2.35");
		JLabel pepinoPrice = new JLabel("R$ 1.85");
		JLabel pimentaoPrice = new JLabel("R$ 3.00");
		JLabel tomatePrice = new JLabel("R$ 3.50");
		
		JLabel qtd = new JLabel("Quantidade (kg)");
		JTextField bttKg = new JTextField("0");
		JTextField cnrKg = new JTextField("0");
		JTextField cblKg = new JTextField("0");
		JTextField btrbKg = new JTextField("0");
		JTextField ppnKg = new JTextField("0");
		JTextField pmtKg = new JTextField("0");
		JTextField tmtKg = new JTextField("0");
		
		JButton botao = new JButton("Comprar");
		JLabel total = new JLabel();
		
		frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        panel.setLayout(null);
        product.setBounds(20, 10, 100, 30);
        batata.setBounds(20, 40, 100, 25);
        cenoura.setBounds(20, 60, 100, 25);
        cebola.setBounds(20, 80, 100, 25);
        beterraba.setBounds(20, 100, 100, 25);
        pepino.setBounds(20, 120, 100, 25);
        pimentao.setBounds(20, 140, 100, 25);
        tomate.setBounds(20, 160, 100, 25);
        
        price.setBounds(140, 10, 100, 30);
        batataPrice.setBounds(140, 40, 100, 25);
        cenouraPrice.setBounds(140, 60, 100, 25);
        cebolaPrice.setBounds(140, 80, 100, 25);
        beterrabaPrice.setBounds(140, 100, 100, 25);
        pepinoPrice.setBounds(140, 120, 100, 25);
        pimentaoPrice.setBounds(140, 140, 100, 25);
        tomatePrice.setBounds(140, 160, 100, 25);
        
        qtd.setBounds(240, 10, 100, 30);
        bttKg.setBounds(240, 40, 100, 20);
        cnrKg.setBounds(240, 60, 100, 20);
        cblKg.setBounds(240, 80, 100, 20);
        btrbKg.setBounds(240, 100, 100, 20);
        ppnKg.setBounds(240, 120, 100, 20);
        pmtKg.setBounds(240, 140, 100, 20);
        tmtKg.setBounds(240, 160, 100, 20);
        
        botao.setBounds(130, 200, 100, 30);
        total.setBounds(128, 240, 300, 30);
        
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	double prcBtt = Double.valueOf(bttKg.getText());
            	double prcCnr = Double.valueOf(cnrKg.getText());
            	double prcCbl = Double.valueOf(cblKg.getText());
            	double prcBtrb = Double.valueOf(btrbKg.getText());
            	double prcPpn = Double.valueOf(ppnKg.getText());
            	double prcPmt = Double.valueOf(pmtKg.getText());
            	double prcTmt = Double.valueOf(tmtKg.getText());
            	
            	double batataTT = prcBtt * 1.50;
            	double cenouraTT = prcCnr * 2;
            	double cebolaTT = prcCbl * 3.10;
            	double beterrabaTT = prcBtrb * 2.35;
            	double pepinoTT = prcPpn * 1.85;
            	double pimentaoTT = prcPmt * 3.00;
            	double tomateTT = prcTmt * 3.50;
            	
            	double soma = 0;
            	
            	if (batata.isSelected()) {
            		soma += batataTT;
            	};
            	if (cenoura.isSelected()) {
            		soma += cenouraTT;
            	};
            	if (cebola.isSelected()) {
            		soma += cebolaTT;
            	};
            	if (beterraba.isSelected()) {
            		soma += beterrabaTT;
            	};
            	if (pepino.isSelected()) {
            		soma += pepinoTT;
            	};
            	if (pimentao.isSelected()) {
            		soma += pimentaoTT;
            	};
            	if (tomate.isSelected()) {
            		soma += tomateTT;
            	};
            	
            	total.setText("Valor total:  R$ " + String.valueOf(soma));
            	
            }});
        
        panel.add(product);
        panel.add(batata);
        panel.add(cenoura);
        panel.add(cebola);
        panel.add(beterraba);
        panel.add(pepino);
        panel.add(pimentao);
        panel.add(tomate);
        panel.add(price);
        panel.add(batataPrice);
        panel.add(cenouraPrice);
        panel.add(cebolaPrice);
        panel.add(beterrabaPrice);
        panel.add(pepinoPrice);
        panel.add(pimentaoPrice);
        panel.add(tomatePrice);
        panel.add(qtd);
        panel.add(bttKg);
        panel.add(cnrKg);
        panel.add(cblKg);
        panel.add(btrbKg);
        panel.add(ppnKg);
        panel.add(pmtKg);
        panel.add(tmtKg);
        panel.add(botao);
        panel.add(total);

        frame.add(panel);
        frame.setVisible(true);
	}

}
