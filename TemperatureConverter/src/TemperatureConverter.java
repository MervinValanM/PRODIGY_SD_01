import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;

class TemperatureConverter
{
    public static JFrame frmMain;
    public static JLabel lblCelsius;
    public static JTextField textCelsius;
    public static JLabel lblFahrenheit;
    public static JTextField textFahrenheit;
    public static JLabel lblKelvin;
    public static JTextField textKelvin;
    public static JButton btnCalculateFromC;
    public static JButton btnCalculateFromF;
    public static JButton btnCalculateFromK;

    public static void main(String[] args)
    {

        frmMain = new JFrame("Temperature Converter");
        frmMain.setSize(215, 275);
        frmMain.setLayout(new FlowLayout());


        lblCelsius = new JLabel("Celsius:");
        textCelsius = new JTextField(10);
        lblFahrenheit = new JLabel("Fahrenheit:");
        textFahrenheit = new JTextField(10);
        lblKelvin = new JLabel("Kelvin:");
        textKelvin = new JTextField(10);
        btnCalculateFromC = new JButton("Convert from C ");


        btnCalculateFromC.addActionListener
                (
                        new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                // Converting C to F
                                String cText = textCelsius.getText();
                                float c = Float.parseFloat(cText);
                                float f = (c * 9 / 5) + 32;
                                DecimalFormat df = new DecimalFormat("#.##");
                                textFahrenheit.setText(df.format(f));

                                //Converting C to K
                                double K = c + 273.15;
                                textKelvin.setText(df.format(K));

                            }
                        }
                );

        btnCalculateFromF = new JButton("Convert from F");

        btnCalculateFromF.addActionListener
                (
                        new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                // Converting F to C
                                String fText = textFahrenheit.getText();
                                double f = Double.parseDouble(fText);
                                double c = (f - 32) * 5 / 9;
                                DecimalFormat df = new DecimalFormat("#.##");
                                textCelsius.setText(df.format(c));

                                // Converting F to K
                                double k = (f - 32) * 5/9 + 273.15;
                                textKelvin.setText(df.format(k));
                            }
                        }
                );
        btnCalculateFromK = new JButton("Convert from K");

        btnCalculateFromK.addActionListener
                (
                        new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                // Converting K to C
                                String kText = textKelvin.getText();
                                double k = Double.parseDouble(kText);
                                double c = k - 273.15;
                                DecimalFormat df = new DecimalFormat("#.##");
                                textCelsius.setText(df.format(c));

                                // Converting K to F
                                double f = (k - 273.15) *9/5 +32;
                                textFahrenheit.setText(df.format(f));
                            }
                        }
                );




        frmMain.add(lblCelsius);
        frmMain.add(textCelsius);
        frmMain.add(lblFahrenheit);
        frmMain.add(textFahrenheit);
        frmMain.add(lblKelvin);
        frmMain.add(textKelvin);
        frmMain.add(btnCalculateFromC);
        frmMain.add(btnCalculateFromF);
        frmMain.add(btnCalculateFromK);


        frmMain.setVisible(true);
    }
}