import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class form4 extends BaseFrame implements ActionListener {
    JPanel jPanel1;
    JLabel jLabel1;
    JComboBox<String> firstCountry, secondCountry;
    JLabel jLabel2;
    JTextField t1, t2;
    JButton jButton1, jButton2, jButtonLogout, jButtonBuy;

    private double US_Dollar = 1.0;
    private double Bangladeshi_Taka = 74.23;
    private double Brazilian_Real = 5.40;
    private double Canadian_Dollar = 1.37;
    private double European_Euro = 0.87;
    private double Pound_Sterling = 0.78;
    private double Japanese_Yen = 111.15;
    private double Swiss_Franc = 0.99;
    private double Chinese_Yuan = 6.65;
    private double South_African_Rand = 16.31;
    private double Mexican_Peso = 21.35;
    private double Argentine_Peso = 93.49;
    private double Russian_Ruble = 0.013;
    private double South_Korean_Won = 1155.54;
    private double Taiwanese_Dollar = 31.48;
    private double Australian_Dollar = 1.44;

    form4() {
		super("Purchase Currency");
        jPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon bg = new ImageIcon("main.png");
                g.drawImage(bg.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };

        jLabel1 = new JLabel("Select First Country");
        jLabel2 = new JLabel("Select Second Country");
        jButton1 = new JButton("Convert");
        jButton2 = new JButton("Reset");
        jButtonLogout = new JButton("Logout");
        jButtonBuy = new JButton("Buy");
        t1 = new JTextField(5);
        t2 = new JTextField(5);
		


        
        t1.setText("Choose your amount");

        setDefaultCloseOperation(BaseFrame.EXIT_ON_CLOSE);
        setTitle("Currency Converter");
        jPanel1.setLayout(null);

        firstCountry = new JComboBox<>(new String[]{"US Dollar", "Bangladeshi Taka", "Brazilian Real", "Canadian Dollar", "European Euro", "Pound Sterling", "Japanese Yen", "Swiss Franc", "Chinese Yuan", "South African Rand", "Mexican Peso", "Argentine Peso", "Russian Ruble", "South Korean Won", "Taiwanese Dollar", "Australian Dollar"});
        secondCountry = new JComboBox<>(new String[]{"US Dollar", "Bangladeshi Taka", "Brazilian Real", "Canadian Dollar", "European Euro", "Pound Sterling", "Japanese Yen", "Swiss Franc", "Chinese Yuan", "South African Rand", "Mexican Peso", "Argentine Peso", "Russian Ruble", "South Korean Won", "Taiwanese Dollar", "Australian Dollar"});

        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButtonLogout.addActionListener(this);
        jButtonBuy.addActionListener(this);

        jPanel1.add(jLabel1);
        jPanel1.add(firstCountry);
        jPanel1.add(jLabel2);
        jPanel1.add(secondCountry);
        jPanel1.add(jButton1);
        jPanel1.add(jButton2);
        jPanel1.add(t1);
        jPanel1.add(jButtonLogout);
        jPanel1.add(jButtonBuy);
        jPanel1.add(t2);

      
        jLabel1.setBounds(50, 50, 150, 30);
        firstCountry.setBounds(200, 50, 150, 30);
        jLabel2.setBounds(400, 50, 150, 30);
        secondCountry.setBounds(550, 50, 150, 30);
        t1.setBounds(300, 177, 150, 30);
        t2.setBounds(400, 278, 150, 30);
        jButton1.setBounds(350, 230, 100, 30);
        jButton2.setBounds(500, 500, 100, 30);
        jButtonBuy.setBounds(350, 410, 110, 40);
        jButtonLogout.setBounds(650, 500, 100, 30);


        t1.setOpaque(false);
        t2.setOpaque(false);
        t1.setBorder(BorderFactory.createEmptyBorder());
        t2.setBorder(BorderFactory.createEmptyBorder()); 

       
        
       jButton1.setForeground(Color.WHITE);
       jButton1.setBackground(new Color(0, 128, 0));
       jButton1.setBorder(BorderFactory.createLineBorder(Color.WHITE));

       jButton2.setForeground(Color.WHITE);
       jButton2.setBackground(new Color(0, 128, 0));
       jButton2.setBorder(BorderFactory.createLineBorder(Color.WHITE));

       jButtonLogout.setForeground(Color.WHITE);
       jButtonLogout.setBackground(new Color(0, 128, 0));
       jButtonLogout.setBorder(BorderFactory.createLineBorder(Color.WHITE));

       jButtonBuy.setForeground(Color.WHITE);
       jButtonBuy.setBackground(new Color(0, 128, 0));
       jButtonBuy.setBorder(BorderFactory.createLineBorder(Color.WHITE));


    


        add(jPanel1);


        setVisible(true);
		

		
    }
	
	
	     // Get and set methods
    public double getUSDollar() {
        return US_Dollar;
    }

    public void setUSDollar(double US_Dollar) {
        this.US_Dollar = US_Dollar;
    }

   
    public double getBangladeshiTaka() {
        return Bangladeshi_Taka;
    }

    public void setBangladeshiTaka(double Bangladeshi_Taka) {
        this.Bangladeshi_Taka = Bangladeshi_Taka;
    }

   
    public double getBrazilianReal() {
        return Brazilian_Real;
    }

    public void setBrazilianReal(double Brazilian_Real) {
        this.Brazilian_Real = Brazilian_Real;
    }

   
    public double getCanadianDollar() {
        return Canadian_Dollar;
    }

    public void setCanadianDollar(double Canadian_Dollar) {
        this.Canadian_Dollar = Canadian_Dollar;
    }

   
    public double getEuropeanEuro() {
        return European_Euro;
    }

    public void setEuropeanEuro(double European_Euro) {
        this.European_Euro = European_Euro;
    }

   
    public double getPoundSterling() {
        return Pound_Sterling;
    }

    public void setPoundSterling(double Pound_Sterling) {
        this.Pound_Sterling = Pound_Sterling;
    }

  
    public double getJapaneseYen() {
        return Japanese_Yen;
    }

    public void setJapaneseYen(double Japanese_Yen) {
        this.Japanese_Yen = Japanese_Yen;
    }

   
    public double getSwissFranc() {
        return Swiss_Franc;
    }

    public void setSwissFranc(double Swiss_Franc) {
        this.Swiss_Franc = Swiss_Franc;
    }

    
    public double getChineseYuan() {
        return Chinese_Yuan;
    }

    public void setChineseYuan(double Chinese_Yuan) {
        this.Chinese_Yuan = Chinese_Yuan;
    }

   
    public double getSouthAfricanRand() {
        return South_African_Rand;
    }

    public void setSouthAfricanRand(double South_African_Rand) {
        this.South_African_Rand = South_African_Rand;
    }

    
    public double getMexicanPeso() {
        return Mexican_Peso;
    }

    public void setMexicanPeso(double Mexican_Peso) {
        this.Mexican_Peso = Mexican_Peso;
    }

    
    public double getArgentinePeso() {
        return Argentine_Peso;
    }

    public void setArgentinePeso(double Argentine_Peso) {
        this.Argentine_Peso = Argentine_Peso;
    }

    
    public double getRussianRuble() {
        return Russian_Ruble;
    }

    public void setRussianRuble(double Russian_Ruble) {
        this.Russian_Ruble = Russian_Ruble;
    }

    
    public double getSouthKoreanWon() {
        return South_Korean_Won;
    }

    public void setSouthKoreanWon(double South_Korean_Won) {
        this.South_Korean_Won = South_Korean_Won;
    }

    
    public double getTaiwaneseDollar() {
        return Taiwanese_Dollar;
    }

    public void setTaiwaneseDollar(double Taiwanese_Dollar) {
        this.Taiwanese_Dollar = Taiwanese_Dollar;
    }

    
    public double getAustralianDollar() {
        return Australian_Dollar;
    }

    public void setAustralianDollar(double Australian_Dollar) {
        this.Australian_Dollar = Australian_Dollar;
    }
	
	

    @Override
   public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton1) {
            jButton1ActionPerformed(e);
        } else if (e.getSource() == jButton2) {
            jButton2ActionPerformed(e);
        } else if (e.getSource() == jButtonLogout) {
            jButtonLogoutActionPerformed(e);
        } else if (e.getSource() == jButtonBuy) {
            jButtonBuyActionPerformed(e);
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        String fromCountry = firstCountry.getSelectedItem().toString();
        String toCountry = secondCountry.getSelectedItem().toString();
        double fromValue = Double.parseDouble(t1.getText());
        double toValue = 0.0;

        switch (fromCountry) {
            case "US Dollar":
                switch (toCountry) {
                    case "Bangladeshi Taka":
                        toValue = fromValue * Bangladeshi_Taka;
                        break;
                    case "Brazilian Real":
                        toValue = fromValue * Brazilian_Real;
                        break;
                    case "Canadian Dollar":
                        toValue = fromValue * Canadian_Dollar;
                        break;
                    case "European Euro":
                        toValue = fromValue * European_Euro;
                        break;
                    case "Pound Sterling":
                        toValue = fromValue * Pound_Sterling;
                        break;
                    case "Japanese Yen":
                        toValue = fromValue * Japanese_Yen;
                        break;
                    case "Swiss Franc":
                        toValue = fromValue * Swiss_Franc;
                        break;
                    case "Chinese Yuan":
                        toValue = fromValue * Chinese_Yuan;
                        break;
                    case "South African Rand":
                        toValue = fromValue * South_African_Rand;
                        break;
                    case "Mexican Peso":
                        toValue = fromValue * Mexican_Peso;
                        break;
                    case "Argentine Peso":
                        toValue = fromValue * Argentine_Peso;
                        break;
                    case "Russian Ruble":
                        toValue = fromValue * Russian_Ruble;
                        break;
                    case "South Korean Won":
                        toValue = fromValue * South_Korean_Won;
                        break;
                    case "Taiwanese Dollar":
                        toValue = fromValue * Taiwanese_Dollar;
                        break;
                    case "Australian Dollar":
                        toValue = fromValue * Australian_Dollar;
                        break;
                }
                break;
            case "Bangladeshi Taka":
                switch (toCountry) {
                    case "US Dollar":
                        toValue = fromValue / Bangladeshi_Taka;
                        break;
                    case "Brazilian Real":
                        toValue = fromValue / Bangladeshi_Taka * Brazilian_Real;
                        break;
                    case "Canadian Dollar":
                        toValue = fromValue / Bangladeshi_Taka * Canadian_Dollar;
                        break;
                    case "European Euro":
                        toValue = fromValue / Bangladeshi_Taka * European_Euro;
                        break;
                    case "Pound Sterling":
                        toValue = fromValue / Bangladeshi_Taka * Pound_Sterling;
                        break;
                    case "Japanese Yen":
                        toValue = fromValue / Bangladeshi_Taka * Japanese_Yen;
                        break;
                    case "Swiss Franc":
                        toValue = fromValue / Bangladeshi_Taka * Swiss_Franc;
                        break;
                    case "Chinese Yuan":
                        toValue = fromValue / Bangladeshi_Taka * Chinese_Yuan;
                        break;
                    case "South African Rand":
                        toValue = fromValue / Bangladeshi_Taka * South_African_Rand;
                        break;
                    case "Mexican Peso":
                        toValue = fromValue / Bangladeshi_Taka * Mexican_Peso;
                        break;
                    case "Argentine Peso":
                        toValue = fromValue / Bangladeshi_Taka * Argentine_Peso;
                        break;
                    case "Russian Ruble":
                        toValue = fromValue / Bangladeshi_Taka * Russian_Ruble;
                        break;
                    case "South Korean Won":
                        toValue = fromValue / Bangladeshi_Taka * South_Korean_Won;
                        break;
                    case "Taiwanese Dollar":
                        toValue = fromValue / Bangladeshi_Taka * Taiwanese_Dollar;
                        break;
                    case "Australian Dollar":
                        toValue = fromValue / Bangladeshi_Taka * Australian_Dollar;
                        break;
                }
                break;
            case "Brazilian Real":
                switch (toCountry) {
                    case "US Dollar":
                        toValue = fromValue / Brazilian_Real;
                        break;
                    case "Bangladeshi Taka":
                        toValue = fromValue / Brazilian_Real * Bangladeshi_Taka;
                        break;
                    case "Canadian Dollar":
                        toValue = fromValue / Brazilian_Real * Canadian_Dollar;
                        break;
                    case "European Euro":
                        toValue = fromValue / Brazilian_Real * European_Euro;
                        break;
                    case "Pound Sterling":
                        toValue = fromValue / Brazilian_Real * Pound_Sterling;
                        break;
                    case "Japanese Yen":
                        toValue = fromValue / Brazilian_Real * Japanese_Yen;
                        break;
                    case "Swiss Franc":
                        toValue = fromValue / Brazilian_Real * Swiss_Franc;
                        break;
                    case "Chinese Yuan":
                        toValue = fromValue / Brazilian_Real * Chinese_Yuan;
                        break;
                    case "South African Rand":
                        toValue = fromValue / Brazilian_Real * South_African_Rand;
                        break;
                    case "Mexican Peso":
                        toValue = fromValue / Brazilian_Real * Mexican_Peso;
                        break;
                    case "Argentine Peso":
                        toValue = fromValue / Brazilian_Real * Argentine_Peso;
                        break;
                    case "Russian Ruble":
                        toValue = fromValue / Brazilian_Real * Russian_Ruble;
                        break;
                    case "South Korean Won":
                        toValue = fromValue / Brazilian_Real * South_Korean_Won;
                        break;
                    case "Taiwanese Dollar":
                        toValue = fromValue / Brazilian_Real * Taiwanese_Dollar;
                        break;
                    case "Australian Dollar":
                        toValue = fromValue / Brazilian_Real * Australian_Dollar;
                        break;
                }
                break;
            case "Canadian Dollar":
                switch (toCountry) {
                    case "US Dollar":
                        toValue = fromValue / Canadian_Dollar;
                        break;
                    case "Bangladeshi Taka":
                        toValue = fromValue / Canadian_Dollar * Bangladeshi_Taka;
                        break;
                    case "Brazilian Real":
                        toValue = fromValue / Canadian_Dollar * Brazilian_Real;
                        break;
                    case "European Euro":
                        toValue = fromValue / Canadian_Dollar * European_Euro;
                        break;
                    case "Pound Sterling":
                        toValue = fromValue / Canadian_Dollar * Pound_Sterling;
                        break;
                    case "Japanese Yen":
                        toValue = fromValue / Canadian_Dollar * Japanese_Yen;
                        break;
                    case "Swiss Franc":
                        toValue = fromValue / Canadian_Dollar * Swiss_Franc;
                        break;
                    case "Chinese Yuan":
                        toValue = fromValue / Canadian_Dollar * Chinese_Yuan;
                        break;
                    case "South African Rand":
                        toValue = fromValue / Canadian_Dollar * South_African_Rand;
                        break;
                    case "Mexican Peso":
                        toValue = fromValue / Canadian_Dollar * Mexican_Peso;
                        break;
                    case "Argentine Peso":
                        toValue = fromValue / Canadian_Dollar * Argentine_Peso;
                        break;
                    case "Russian Ruble":
                        toValue = fromValue / Canadian_Dollar * Russian_Ruble;
                        break;
                    case "South Korean Won":
                        toValue = fromValue / Canadian_Dollar * South_Korean_Won;
                        break;
                    case "Taiwanese Dollar":
                        toValue = fromValue / Canadian_Dollar * Taiwanese_Dollar;
                        break;
                    case "Australian Dollar":
                        toValue = fromValue / Canadian_Dollar * Australian_Dollar;
                        break;
                }
                break;
            case "European Euro":
                switch (toCountry) {
                    case "US Dollar":
                        toValue = fromValue / European_Euro;
                        break;
                    case "Bangladeshi Taka":
                        toValue = fromValue / European_Euro * Bangladeshi_Taka;
                        break;
                    case "Brazilian Real":
                        toValue = fromValue / European_Euro * Brazilian_Real;
                        break;
                    case "Canadian Dollar":
                        toValue = fromValue / European_Euro * Canadian_Dollar;
                        break;
                    case "Pound Sterling":
                        toValue = fromValue / European_Euro * Pound_Sterling;
                        break;
                    case "Japanese Yen":
                        toValue = fromValue / European_Euro * Japanese_Yen;
                        break;
                    case "Swiss Franc":
                        toValue = fromValue / European_Euro * Swiss_Franc;
                        break;
                    case "Chinese Yuan":
                        toValue = fromValue / European_Euro * Chinese_Yuan;
                        break;
                    case "South African Rand":
                        toValue = fromValue / European_Euro * South_African_Rand;
                        break;
                    case "Mexican Peso":
                        toValue = fromValue / European_Euro * Mexican_Peso;
                        break;
                    case "Argentine Peso":
                        toValue = fromValue / European_Euro * Argentine_Peso;
                        break;
                    case "Russian Ruble":
                        toValue = fromValue / European_Euro * Russian_Ruble;
                        break;
                    case "South Korean Won":
                        toValue = fromValue / European_Euro * South_Korean_Won;
                        break;
                    case "Taiwanese Dollar":
                        toValue = fromValue / European_Euro * Taiwanese_Dollar;
                        break;
                    case "Australian Dollar":
                        toValue = fromValue / European_Euro * Australian_Dollar;
                        break;
                }
                break;
            case "Pound Sterling":
                switch (toCountry) {
                    case "US Dollar":
                        toValue = fromValue / Pound_Sterling;
                        break;
                    case "Bangladeshi Taka":
                        toValue = fromValue / Pound_Sterling * Bangladeshi_Taka;
                        break;
                    case "Brazilian Real":
                        toValue = fromValue / Pound_Sterling * Brazilian_Real;
                        break;
                    case "Canadian Dollar":
                        toValue = fromValue / Pound_Sterling * Canadian_Dollar;
                        break;
                    case "European Euro":
                        toValue = fromValue / Pound_Sterling * European_Euro;
                        break;
                    case "Japanese Yen":
                        toValue = fromValue / Pound_Sterling * Japanese_Yen;
                        break;
                    case "Swiss Franc":
                        toValue = fromValue / Pound_Sterling * Swiss_Franc;
                        break;
                    case "Chinese Yuan":
                        toValue = fromValue / Pound_Sterling * Chinese_Yuan;
                        break;
                    case "South African Rand":
                        toValue = fromValue / Pound_Sterling * South_African_Rand;
                        break;
                    case "Mexican Peso":
                        toValue = fromValue / Pound_Sterling * Mexican_Peso;
                        break;
                    case "Argentine Peso":
                        toValue = fromValue / Pound_Sterling * Argentine_Peso;
                        break;
                    case "Russian Ruble":
                        toValue = fromValue / Pound_Sterling * Russian_Ruble;
                        break;
                    case "South Korean Won":
                        toValue = fromValue / Pound_Sterling * South_Korean_Won;
                        break;
                    case "Taiwanese Dollar":
                        toValue = fromValue / Pound_Sterling * Taiwanese_Dollar;
                        break;
                    case "Australian Dollar":
                        toValue = fromValue / Pound_Sterling * Australian_Dollar;
                        break;
                }
                break;
            case "Japanese Yen":
                switch (toCountry) {
                    case "US Dollar":
                        toValue = fromValue / Japanese_Yen;
                        break;
                    case "Bangladeshi Taka":
                        toValue = fromValue / Japanese_Yen * Bangladeshi_Taka;
                        break;
                    case "Brazilian Real":
                        toValue = fromValue / Japanese_Yen * Brazilian_Real;
                        break;
                    case "Canadian Dollar":
                        toValue = fromValue / Japanese_Yen * Canadian_Dollar;
                        break;
                    case "European Euro":
                        toValue = fromValue / Japanese_Yen * European_Euro;
                        break;
                    case "Pound Sterling":
                        toValue = fromValue / Japanese_Yen * Pound_Sterling;
                        break;
                    case "Swiss Franc":
                        toValue = fromValue / Japanese_Yen * Swiss_Franc;
                        break;
                    case "Chinese Yuan":
                        toValue = fromValue / Japanese_Yen * Chinese_Yuan;
                        break;
                    case "South African Rand":
                        toValue = fromValue / Japanese_Yen * South_African_Rand;
                        break;
                    case "Mexican Peso":
                        toValue = fromValue / Japanese_Yen * Mexican_Peso;
                        break;
                    case "Argentine Peso":
                        toValue = fromValue / Japanese_Yen * Argentine_Peso;
                        break;
                    case "Russian Ruble":
                        toValue = fromValue / Japanese_Yen * Russian_Ruble;
                        break;
                    case "South Korean Won":
                        toValue = fromValue / Japanese_Yen * South_Korean_Won;
                        break;
                    case "Taiwanese Dollar":
                        toValue = fromValue / Japanese_Yen * Taiwanese_Dollar;
                        break;
                    case "Australian Dollar":
                        toValue = fromValue / Japanese_Yen * Australian_Dollar;
                        break;
                }
                break;
            case "Swiss Franc":
                switch (toCountry) {
                    case "US Dollar":
                        toValue = fromValue / Swiss_Franc;
                        break;
                    case "Bangladeshi Taka":
                        toValue = fromValue / Swiss_Franc * Bangladeshi_Taka;
                        break;
                    case "Brazilian Real":
                        toValue = fromValue / Swiss_Franc * Brazilian_Real;
                        break;
                    case "Canadian Dollar":
                        toValue = fromValue / Swiss_Franc * Canadian_Dollar;
                        break;
                    case "European Euro":
                        toValue = fromValue / Swiss_Franc * European_Euro;
                        break;
                    case "Pound Sterling":
                        toValue = fromValue / Swiss_Franc * Pound_Sterling;
                        break;
                    case "Japanese Yen":
                        toValue = fromValue / Swiss_Franc * Japanese_Yen;
                        break;
                    case "Chinese Yuan":
                        toValue = fromValue / Swiss_Franc * Chinese_Yuan;
                        break;
                    case "South African Rand":
                        toValue = fromValue / Swiss_Franc * South_African_Rand;
                        break;
                    case "Mexican Peso":
                        toValue = fromValue / Swiss_Franc * Mexican_Peso;
                        break;
                    case "Argentine Peso":
                        toValue = fromValue / Swiss_Franc * Argentine_Peso;
                        break;
                    case "Russian Ruble":
                        toValue = fromValue / Swiss_Franc * Russian_Ruble;
                        break;
                    case "South Korean Won":
                        toValue = fromValue / Swiss_Franc * South_Korean_Won;
                        break;
                    case "Taiwanese Dollar":
                        toValue = fromValue / Swiss_Franc * Taiwanese_Dollar;
                        break;
                    case "Australian Dollar":
                        toValue = fromValue / Swiss_Franc * Australian_Dollar;
                        break;
                }
                break;
            case "Chinese Yuan":
                switch (toCountry) {
                    case "US Dollar":
                        toValue = fromValue / Chinese_Yuan;
                        break;
                    case "Bangladeshi Taka":
                        toValue = fromValue / Chinese_Yuan * Bangladeshi_Taka;
                        break;
                    case "Brazilian Real":
                        toValue = fromValue / Chinese_Yuan * Brazilian_Real;
                        break;
                    case "Canadian Dollar":
                        toValue = fromValue / Chinese_Yuan * Canadian_Dollar;
                        break;
                    case "European Euro":
                        toValue = fromValue / Chinese_Yuan * European_Euro;
                        break;
                    case "Pound Sterling":
                        toValue = fromValue / Chinese_Yuan * Pound_Sterling;
                        break;
                    case "Japanese Yen":
                        toValue = fromValue / Chinese_Yuan * Japanese_Yen;
                        break;
                    case "Swiss Franc":
                        toValue = fromValue / Chinese_Yuan * Swiss_Franc;
                        break;
                    case "South African Rand":
                        toValue = fromValue / Chinese_Yuan * South_African_Rand;
                        break;
                    case "Mexican Peso":
                        toValue = fromValue / Chinese_Yuan * Mexican_Peso;
                        break;
                    case "Argentine Peso":
                        toValue = fromValue / Chinese_Yuan * Argentine_Peso;
                        break;
                    case "Russian Ruble":
                        toValue = fromValue / Chinese_Yuan * Russian_Ruble;
                        break;
                    case "South Korean Won":
                        toValue = fromValue / Chinese_Yuan * South_Korean_Won;
                        break;
                    case "Taiwanese Dollar":
                        toValue = fromValue / Chinese_Yuan * Taiwanese_Dollar;
                        break;
                    case "Australian Dollar":
                        toValue = fromValue / Chinese_Yuan * Australian_Dollar;
                        break;
                }
                break;
            case "South African Rand":
                switch (toCountry) {
                    case "US Dollar":
                        toValue = fromValue / South_African_Rand;
                        break;
                    case "Bangladeshi Taka":
                        toValue = fromValue / South_African_Rand * Bangladeshi_Taka;
                        break;
                    case "Brazilian Real":
                        toValue = fromValue / South_African_Rand * Brazilian_Real;
                        break;
                    case "Canadian Dollar":
                        toValue = fromValue / South_African_Rand * Canadian_Dollar;
                        break;
                    case "European Euro":
                        toValue = fromValue / South_African_Rand * European_Euro;
                        break;
                    case "Pound Sterling":
                        toValue = fromValue / South_African_Rand * Pound_Sterling;
                        break;
                    case "Japanese Yen":
                        toValue = fromValue / South_African_Rand * Japanese_Yen;
                        break;
                    case "Swiss Franc":
                        toValue = fromValue / South_African_Rand * Swiss_Franc;
                        break;
                    case "Chinese Yuan":
                        toValue = fromValue / South_African_Rand * Chinese_Yuan;
                        break;
                    case "Mexican Peso":
                        toValue = fromValue / South_African_Rand * Mexican_Peso;
                        break;
                    case "Argentine Peso":
                        toValue = fromValue / South_African_Rand * Argentine_Peso;
                        break;
                    case "Russian Ruble":
                        toValue = fromValue / South_African_Rand * Russian_Ruble;
                        break;
                    case "South Korean Won":
                        toValue = fromValue / South_African_Rand * South_Korean_Won;
                        break;
                    case "Taiwanese Dollar":
                        toValue = fromValue / South_African_Rand * Taiwanese_Dollar;
                        break;
                    case "Australian Dollar":
                        toValue = fromValue / South_African_Rand * Australian_Dollar;
                        break;
                }
                break;
            case "Mexican Peso":
                switch (toCountry) {
                    case "US Dollar":
                        toValue = fromValue / Mexican_Peso;
                        break;
                    case "Bangladeshi Taka":
                        toValue = fromValue / Mexican_Peso * Bangladeshi_Taka;
                        break;
                    case "Brazilian Real":
                        toValue = fromValue / Mexican_Peso * Brazilian_Real;
                        break;
                    case "Canadian Dollar":
                        toValue = fromValue / Mexican_Peso * Canadian_Dollar;
                        break;
                    case "European Euro":
                        toValue = fromValue / Mexican_Peso * European_Euro;
                        break;
                    case "Pound Sterling":
                        toValue = fromValue / Mexican_Peso * Pound_Sterling;
                        break;
                    case "Japanese Yen":
                        toValue = fromValue / Mexican_Peso * Japanese_Yen;
                        break;
                    case "Swiss Franc":
                        toValue = fromValue / Mexican_Peso * Swiss_Franc;
                        break;
                    case "Chinese Yuan":
                        toValue = fromValue / Mexican_Peso * Chinese_Yuan;
                        break;
                    case "South African Rand":
                        toValue = fromValue / Mexican_Peso * South_African_Rand;
                        break;
                    case "Argentine Peso":
                        toValue = fromValue / Mexican_Peso * Argentine_Peso;
                        break;
                    case "Russian Ruble":
                        toValue = fromValue / Mexican_Peso * Russian_Ruble;
                        break;
                    case "South Korean Won":
                        toValue = fromValue / Mexican_Peso * South_Korean_Won;
                        break;
                    case "Taiwanese Dollar":
                        toValue = fromValue / Mexican_Peso * Taiwanese_Dollar;
                        break;
                    case "Australian Dollar":
                        toValue = fromValue / Mexican_Peso * Australian_Dollar;
                        break;
                }
                break;
            case "Argentine Peso":
                switch (toCountry) {
                    case "US Dollar":
                        toValue = fromValue / Argentine_Peso;
                        break;
                    case "Bangladeshi Taka":
                        toValue = fromValue / Argentine_Peso * Bangladeshi_Taka;
                        break;
                    case "Brazilian Real":
                        toValue = fromValue / Argentine_Peso * Brazilian_Real;
                        break;
                    case "Canadian Dollar":
                        toValue = fromValue / Argentine_Peso * Canadian_Dollar;
                        break;
                    case "European Euro":
                        toValue = fromValue / Argentine_Peso * European_Euro;
                        break;
                    case "Pound Sterling":
                        toValue = fromValue / Argentine_Peso * Pound_Sterling;
                        break;
                    case "Japanese Yen":
                        toValue = fromValue / Argentine_Peso * Japanese_Yen;
                        break;
                    case "Swiss Franc":
                        toValue = fromValue / Argentine_Peso * Swiss_Franc;
                        break;
                    case "Chinese Yuan":
                        toValue = fromValue / Argentine_Peso * Chinese_Yuan;
                        break;
                    case "South African Rand":
                        toValue = fromValue / Argentine_Peso * South_African_Rand;
                        break;
                    case "Mexican Peso":
                        toValue = fromValue / Argentine_Peso * Mexican_Peso;
                        break;
                    case "Russian Ruble":
                        toValue = fromValue / Argentine_Peso * Russian_Ruble;
                        break;
                    case "South Korean Won":
                        toValue = fromValue / Argentine_Peso * South_Korean_Won;
                        break;
                    case "Taiwanese Dollar":
                        toValue = fromValue / Argentine_Peso * Taiwanese_Dollar;
                        break;
                    case "Australian Dollar":
                        toValue = fromValue / Argentine_Peso * Australian_Dollar;
                        break;
                }
                break;
            case "Russian Ruble":
                switch (toCountry) {
                    case "US Dollar":
                        toValue = fromValue / Russian_Ruble;
                        break;
                    case "Bangladeshi Taka":
                        toValue = fromValue / Russian_Ruble * Bangladeshi_Taka;
                        break;
                    case "Brazilian Real":
                        toValue = fromValue / Russian_Ruble * Brazilian_Real;
                        break;
                    case "Canadian Dollar":
                        toValue = fromValue / Russian_Ruble * Canadian_Dollar;
                        break;
                    case "European Euro":
                        toValue = fromValue / Russian_Ruble * European_Euro;
                        break;
                    case "Pound Sterling":
                        toValue = fromValue / Russian_Ruble * Pound_Sterling;
                        break;
                    case "Japanese Yen":
                        toValue = fromValue / Russian_Ruble * Japanese_Yen;
                        break;
                    case "Swiss Franc":
                        toValue = fromValue / Russian_Ruble * Swiss_Franc;
                        break;
                    case "Chinese Yuan":
                        toValue = fromValue / Russian_Ruble * Chinese_Yuan;
                        break;
                    case "South African Rand":
                        toValue = fromValue / Russian_Ruble * South_African_Rand;
                        break;
                    case "Mexican Peso":
                        toValue = fromValue / Russian_Ruble * Mexican_Peso;
                        break;
                    case "Argentine Peso":
                        toValue = fromValue / Russian_Ruble * Argentine_Peso;
                        break;
                    case "South Korean Won":
                        toValue = fromValue / Russian_Ruble * South_Korean_Won;
                        break;
                    case "Taiwanese Dollar":
                        toValue = fromValue / Russian_Ruble * Taiwanese_Dollar;
                        break;
                    case "Australian Dollar":
                        toValue = fromValue / Russian_Ruble * Australian_Dollar;
                        break;
                }
                break;
            case "South Korean Won":
                switch (toCountry) {
                    case "US Dollar":
                        toValue = fromValue / South_Korean_Won;
                        break;
                    case "Bangladeshi Taka":
                        toValue = fromValue / South_Korean_Won * Bangladeshi_Taka;
                        break;
                    case "Brazilian Real":
                        toValue = fromValue / South_Korean_Won * Brazilian_Real;
                        break;
                    case "Canadian Dollar":
                        toValue = fromValue / South_Korean_Won * Canadian_Dollar;
                        break;
                    case "European Euro":
                        toValue = fromValue / South_Korean_Won * European_Euro;
                        break;
                    case "Pound Sterling":
                        toValue = fromValue / South_Korean_Won * Pound_Sterling;
                        break;
                    case "Japanese Yen":
                        toValue = fromValue / South_Korean_Won * Japanese_Yen;
                        break;
                    case "Swiss Franc":
                        toValue = fromValue / South_Korean_Won * Swiss_Franc;
                        break;
                    case "Chinese Yuan":
                        toValue = fromValue / South_Korean_Won * Chinese_Yuan;
                        break;
                    case "South African Rand":
                        toValue = fromValue / South_Korean_Won * South_African_Rand;
                        break;
                    case "Mexican Peso":
                        toValue = fromValue / South_Korean_Won * Mexican_Peso;
                        break;
                    case "Argentine Peso":
                        toValue = fromValue / South_Korean_Won * Argentine_Peso;
                        break;
                    case "Russian Ruble":
                        toValue = fromValue / South_Korean_Won * Russian_Ruble;
                        break;
                    case "Taiwanese Dollar":
                        toValue = fromValue / South_Korean_Won * Taiwanese_Dollar;
                        break;
                    case "Australian Dollar":
                        toValue = fromValue / South_Korean_Won * Australian_Dollar;
                        break;
                }
                break;
            case "Taiwanese Dollar":
                switch (toCountry) {
                    case "US Dollar":
                        toValue = fromValue / Taiwanese_Dollar;
                        break;
                    case "Bangladeshi Taka":
                        toValue = fromValue / Taiwanese_Dollar * Bangladeshi_Taka;
                        break;
                    case "Brazilian Real":
                        toValue = fromValue / Taiwanese_Dollar * Brazilian_Real;
                        break;
                    case "Canadian Dollar":
                        toValue = fromValue / Taiwanese_Dollar * Canadian_Dollar;
                        break;
                    case "European Euro":
                        toValue = fromValue / Taiwanese_Dollar * European_Euro;
                        break;
                    case "Pound Sterling":
                        toValue = fromValue / Taiwanese_Dollar * Pound_Sterling;
                        break;
                    case "Japanese Yen":
                        toValue = fromValue / Taiwanese_Dollar * Japanese_Yen;
                        break;
                    case "Swiss Franc":
                        toValue = fromValue / Taiwanese_Dollar * Swiss_Franc;
                        break;
                    case "Chinese Yuan":
                        toValue = fromValue / Taiwanese_Dollar * Chinese_Yuan;
                        break;
                    case "South African Rand":
                        toValue = fromValue / Taiwanese_Dollar * South_African_Rand;
                        break;
                    case "Mexican Peso":
                        toValue = fromValue / Taiwanese_Dollar * Mexican_Peso;
                        break;
                    case "Argentine Peso":
                        toValue = fromValue / Taiwanese_Dollar * Argentine_Peso;
                        break;
                    case "Russian Ruble":
                        toValue = fromValue / Taiwanese_Dollar * Russian_Ruble;
                        break;
                    case "South Korean Won":
                        toValue = fromValue / Taiwanese_Dollar * South_Korean_Won;
                        break;
                    case "Australian Dollar":
                        toValue = fromValue / Taiwanese_Dollar * Australian_Dollar;
                        break;
                }
                break;
            case "Australian Dollar":
                switch (toCountry) {
                    case "US Dollar":
                        toValue = fromValue / Australian_Dollar;
                        break;
                    case "Bangladeshi Taka":
                        toValue = fromValue / Australian_Dollar * Bangladeshi_Taka;
                        break;
                    case "Brazilian Real":
                        toValue = fromValue / Australian_Dollar * Brazilian_Real;
                        break;
                    case "Canadian Dollar":
                        toValue = fromValue / Australian_Dollar * Canadian_Dollar;
                        break;
                    case "European Euro":
                        toValue = fromValue / Australian_Dollar * European_Euro;
                        break;
                    case "Pound Sterling":
                        toValue = fromValue / Australian_Dollar * Pound_Sterling;
                        break;
                    case "Japanese Yen":
                        toValue = fromValue / Australian_Dollar * Japanese_Yen;
                        break;
                    case "Swiss Franc":
                        toValue = fromValue / Australian_Dollar * Swiss_Franc;
                        break;
                    case "Chinese Yuan":
                        toValue = fromValue / Australian_Dollar * Chinese_Yuan;
                        break;
                    case "South African Rand":
                        toValue = fromValue / Australian_Dollar * South_African_Rand;
                        break;
                    case "Mexican Peso":
                        toValue = fromValue / Australian_Dollar * Mexican_Peso;
                        break;
                    case "Argentine Peso":
                        toValue = fromValue / Australian_Dollar * Argentine_Peso;
                        break;
                    case "Russian Ruble":
                        toValue = fromValue / Australian_Dollar * Russian_Ruble;
                        break;
                    case "South Korean Won":
                        toValue = fromValue / Australian_Dollar * South_Korean_Won;
                        break;
                    case "Taiwanese Dollar":
                        toValue = fromValue / Australian_Dollar * Taiwanese_Dollar;
                        break;
                }
                break;
        }







        t2.setText(String.format("%.2f", toValue));
    }
	
	

    private void jButton2ActionPerformed(ActionEvent evt) {
        firstCountry.setSelectedIndex(0);
        secondCountry.setSelectedIndex(0);
        t1.setText("");
        t2.setText("");
    }

    private void jButtonLogoutActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    private void jButtonBuyActionPerformed(ActionEvent evt) {
      
        Random random = new Random();
        double[] offeringRates = new double[5];

        
        double convertedAmount = Double.parseDouble(t2.getText());
        for (int i = 0; i < 5; i++) {
            offeringRates[i] = convertedAmount * (0.95 + (0.1 * random.nextDouble()));
        }

        // Display the offering rates for each company
        StringBuilder message = new StringBuilder("Offering Rates:\n");
        String[] paymentCompanies = {"JPMorgan Chase", "XTX Markets", "Deutsche Bank", "Goldman Sachs", "BNP Paribas"};
        for (int i = 0; i < 5; i++) {
            message.append(paymentCompanies[i]).append(": ").append(String.format("%.2f", offeringRates[i])).append("\n");
        }

        
        String selectedCompany = (String) JOptionPane.showInputDialog(this, message.toString(), "Select Payment Company", JOptionPane.PLAIN_MESSAGE, null, paymentCompanies, paymentCompanies[0]);

        if (selectedCompany != null) {
            // If the user selects a company, display payment method options
            String[] paymentMethods = {"Credit Card", "PayPal", "Bitcoin", "Bank Transfer", "Cash"};
            String selectedMethod = (String) JOptionPane.showInputDialog(this, "Select Payment Method", "Payment Methods", JOptionPane.PLAIN_MESSAGE, null, paymentMethods, paymentMethods[0]);

            if (selectedMethod != null) {
                // If the user selects a payment method, display confirmation
                int confirmation = JOptionPane.showConfirmDialog(this, "Payment Successful!\nCompany: " + selectedCompany + "\nMethod: " + selectedMethod + "\nDo you want to see Congratulations message?", "Payment Confirmation", JOptionPane.YES_NO_OPTION);

                if (confirmation == JOptionPane.YES_OPTION) {
                    // Open the Congratulation window
                    double amount = Double.parseDouble(t2.getText());
                    String username = ""; 
                    String companyName = selectedCompany;
                    String method = selectedMethod;
                    new Congratulation(username, String.valueOf(amount), companyName, method).setVisible(true);
                }
            }
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form4().setVisible(true);
            }
        });
    }
}
