
package calcolatrice;
 
import javax.swing.JOptionPane;


public class Calcolatrice extends javax.swing.JFrame {

    public Calcolatrice() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Lb_base = new javax.swing.JLabel();
        Lb_altezza = new javax.swing.JLabel();
        txt_base = new javax.swing.JTextField();
        txt_altezza = new javax.swing.JTextField();
        btn_area = new javax.swing.JButton();
        btn_perimetro = new javax.swing.JButton();
        txt_area = new javax.swing.JTextField();
        txt_perimetro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operazioni geometriche rettangolo");
        setBackground(new java.awt.Color(254, 135, 59));
        setPreferredSize(new java.awt.Dimension(600, 400));

        Lb_base.setText("Base");

        Lb_altezza.setText("Altezza");

        txt_altezza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_altezzaActionPerformed(evt);
            }
        });

        btn_area.setBackground(new java.awt.Color(223, 131, 131));
        btn_area.setText("Calcola area");
        btn_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_areaActionPerformed(evt);
            }
        });

        btn_perimetro.setBackground(new java.awt.Color(223, 131, 131));
        btn_perimetro.setText("Calcola perimetro");
        btn_perimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perimetroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_perimetro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_area, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_area, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txt_perimetro))
                        .addGap(0, 93, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lb_base)
                            .addComponent(Lb_altezza))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_altezza, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(txt_base))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_base)
                    .addComponent(txt_base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_altezza)
                    .addComponent(txt_altezza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_area)
                    .addComponent(txt_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_perimetro)
                    .addComponent(txt_perimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void txt_altezzaActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           

    private void btn_perimetroActionPerformed(java.awt.event.ActionEvent evt) {   
       try{
       double valore_base = Double.parseDouble(txt_base.getText());
       double valore_altezza = Double.parseDouble(txt_altezza.getText());
       double perimetro = (valore_base*2)+(valore_altezza*2);
        
        String perimetroString = Double.toString(perimetro);
        
        txt_perimetro.setText(perimetroString);
       }
       catch(java.lang.NumberFormatException e){
           JOptionPane.showMessageDialog(this, e);
           txt_perimetro.setText("errore");
           System.out.println("Inserisci solo dei numeri ad entrambi i campi");
       }
    }                                             

    private void btn_areaActionPerformed(java.awt.event.ActionEvent evt) {   
        try{
        double valore_base = Double.parseDouble(txt_base.getText());
        double valore_altezza = Double.parseDouble(txt_altezza.getText());
        double area = (valore_base*valore_altezza)/2;
        
        String areaString = Double.toString(area);
        
        txt_area.setText(areaString);
        }
        catch(java.lang.NumberFormatException e){
        JOptionPane.showMessageDialog(this, e);
        txt_area.setText("errore");
        System.out.println("Inserisci solo dei numeri ad entrambi i campi");
        }
    }                                        

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calcolatrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calcolatrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calcolatrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calcolatrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calcolatrice().setVisible(true);
            }
        });
    }                    
    private javax.swing.JLabel Lb_altezza;
    private javax.swing.JLabel Lb_base;
    private javax.swing.JButton btn_area;
    private javax.swing.JButton btn_perimetro;
    private javax.swing.JTextField txt_altezza;
    private javax.swing.JTextField txt_area;
    private javax.swing.JTextField txt_base;
    private javax.swing.JTextField txt_perimetro;                   
}
