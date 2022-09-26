
package com.mycompany.netbeans_currencychartmaven;

import java.time.*;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Calendar;
import java.time.format.DateTimeFormatter;

// @author lad 
public class Curr_chart extends javax.swing.JFrame {

    public Curr_chart() {
        initComponents();
        
        setLocationRelativeTo(null);  // установить JFrame в центре экрана
                       
        // в интерфейсе
        // по умолчанию - год
        Calendar now = Calendar.getInstance();   // Gets the current date and time
        int year = now.get(Calendar.YEAR);       // The current year        
        for (int i = 1; i <= 5; i++ ) {
            this.year_com.addItem(Integer.toString(year--));
        }
        this.minus_year.setValue(2);
        
        // по умолчанию - месяц
        int month = now.get(Calendar.MONTH);
        this.month_com.setSelectedIndex(month);
        this.minus_month.setValue(1);
        this.plus_month.setValue(1);
        //this.check_month.setSelected(true);
        this.check_month.setSelected(false);

        // по умолчанию - день
        int day = now.get(Calendar.DAY_OF_MONTH);
        this.day_com.setSelectedIndex(day - 1);
        this.minus_day.setValue(15);
        this.plus_day.setValue(15);
        //this.check_day.setSelected(false);
        this.check_day.setSelected(true);
        
        // расчет диапазонов и вывод данных
        Calc_range();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        curr_code = new javax.swing.JComboBox<>();
        Calc_button = new javax.swing.JButton();
        button_kurs_nbu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        year_com = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        minus_year = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        month_com = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        minus_month = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        plus_month = new javax.swing.JFormattedTextField();
        check_month = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        day_com = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        minus_day = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        plus_day = new javax.swing.JFormattedTextField();
        check_day = new javax.swing.JCheckBox();
        visible_points = new javax.swing.JCheckBox();
        sred_value_valut = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Изменение курса валют");
        setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Валюта");

        curr_code.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD - Доллар США", "EUR - Евро", "GBP - Фунт" }));

        Calc_button.setText("Обновить график");
        Calc_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calc_buttonActionPerformed(evt);
            }
        });

        button_kurs_nbu.setText("Ссылка на курсы НБУ");
        button_kurs_nbu.setToolTipText("https://bank.gov.ua/control/uk/curmetal/currency/search/form/period");
        button_kurs_nbu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_kurs_nbuActionPerformed(evt);
            }
        });

        jLabel2.setText("Год");
        jLabel2.setName(""); // NOI18N

        jLabel3.setText("Диапазон (-)");

        minus_year.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        minus_year.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel4.setText("Месяц");

        month_com.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01 - Январь", "02 - Февраль", "03 - Март", "04 - Апрель", "05 - Май", "06 - Июнь", "07 - Июль", "08 - Август", "09 - Сентябрь", "10 - Октябрь", "11 - Ноябрь", "12 - Декабрь" }));

        jLabel5.setText("Диапазон (-)");

        minus_month.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        minus_month.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel6.setText("Диапазон (+)");

        plus_month.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        plus_month.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        check_month.setSelected(true);
        check_month.setText("Использовать настройки месяц");

        jLabel7.setText("День");

        day_com.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01 ", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel8.setText("Диапазон (-)");

        minus_day.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        minus_day.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel9.setText("Диапазон (+)");

        plus_day.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        plus_day.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        check_day.setSelected(true);
        check_day.setText("Использовать настройки день");

        visible_points.setSelected(true);
        visible_points.setText("Отображать значения в точках");

        sred_value_valut.setSelected(true);
        sred_value_valut.setText("Среднее значение валюты");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(curr_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minus_year, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(year_com, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_month)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minus_month, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plus_month, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(month_com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minus_day, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plus_day, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(day_com, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(check_day))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Calc_button, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_kurs_nbu))
                    .addComponent(visible_points)
                    .addComponent(sred_value_valut))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(day_com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(minus_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(plus_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(curr_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(Calc_button)
                                    .addComponent(button_kurs_nbu)
                                    .addComponent(jLabel2)
                                    .addComponent(year_com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(month_com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(minus_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(minus_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(plus_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(visible_points, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(check_month)
                                .addComponent(check_day))
                            .addComponent(sred_value_valut))))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(422, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Расчет значений графика и его прорисовка
    private void Calc_range() {
        Calendar now = Calendar.getInstance();   // Gets the current date and time
        int year = now.get(Calendar.YEAR);       // The current year        
        int year_now = year;
        // расчитываем диапазон
        int mYear = (int) getString_Double(this.minus_year.getText()) + 1;

        // год
        LocalDate[] mDate1 = new LocalDate [mYear];
        LocalDate[] mDate2 = new LocalDate [mYear];

        year = year_now - mYear + 1;
        for (int i = 0; i <= mYear - 1; i++) {

            // день
            if (this.check_day.isSelected()) {

                int mMonthS = this.month_com.getSelectedIndex() + 1;
                int mDay = (int) getString_Double(this.plus_day.getText()) + (int) getString_Double(this.minus_day.getText()) + 1;
                int mDayS = this.day_com.getSelectedIndex();

                // стартовая дата        
                mDate1[i] = LocalDate.parse ("01." + String.format("%2s", mMonthS).replace(' ', '0') + "." + year , DateTimeFormatter.ofPattern ( "dd.MM.yyyy" ) );
                // выходим на день
                if (mDayS > 0) {
                    mDate1[i] = mDate1[i].plusDays(mDayS);
                }
                // минус дней
                if ((int) getString_Double(this.minus_day.getText()) > 0) {
                    mDate1[i] = mDate1[i].minusDays((int) getString_Double(this.minus_day.getText()));
                }
                // плюс необходимое кол-во дней
                mDate2[i] = mDate1[i].plusDays(mDay);
            }
            // месяц
            else if (this.check_month.isSelected()) {

                int mMonth = (int) getString_Double(plus_month.getText()) + (int) getString_Double(this.minus_month.getText()) + 1;
                int mMonthS = this.month_com.getSelectedIndex() - (int) getString_Double(this.minus_month.getText()) + 1;
                if (mMonthS < 0) {
                    mMonthS = 12 + mMonthS;
                    if (i == 0) { year = year - 1; }
                }

                mDate1[i] = LocalDate.parse ( "01." + String.format("%2s", mMonthS).replace(' ', '0') + "." + year , DateTimeFormatter.ofPattern ( "dd.MM.yyyy" ) );
                // плюс необходимо кол-во месяцев
                mDate2[i] = mDate1[i].plusMonths(mMonth);
                // минус 1 день
                mDate2[i] = mDate2[i].minusDays(1);
            }
            // год
            else {
                mDate1[i] = LocalDate.parse ( "01.01." + year , DateTimeFormatter.ofPattern ( "dd.MM.yyyy" ));
                mDate2[i] = LocalDate.parse ( "31.12." + year , DateTimeFormatter.ofPattern ( "dd.MM.yyyy" ));
            }

            year++;
        }
        
        // добавляем в панель - график
        String mCurrCode = this.curr_code.getSelectedItem().toString().substring(0, 3);                
        String [][] mArray;
        mArray = NetBeans_CurrencyChartMaven.getKursNbu(mCurrCode, mDate1, mDate2);
        
        // считать среднее значение
        int is_sred_value_valut = 0;
        if (this.sred_value_valut.isSelected() == true) {
            is_sred_value_valut = 1;
        }
        
        // показывать значения в точках
        int is_visible_points = 0;
        if (this.visible_points.isSelected() == true) {
            is_visible_points = 1;
        }
        
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(new JFreeChartLine(mArray, is_visible_points, is_sred_value_valut));
        jPanel1.validate();
    }           
       
    public static float getString_Float(String string) 
    {           
        String string_new  = string.replace(",", ".");
        if (string_new.isEmpty() == true) { return 0; }
        try {               
            Float m_float = Float.valueOf(string_new);
            return m_float;
        } catch (NumberFormatException e) {
          return 0;
           }
    }
    
    // Преобразование текста в число
    public static double getString_Double(String string)
    {
        String string_new  = string.replace(",", ".");
        if (string_new.isEmpty()) { return 0; }
        try {
            return Double.parseDouble(string_new);
        } catch (NumberFormatException e) {
            return 0;
        }
    }    

    public float getObjectFloatNaN(Object string) 
    {       
      if (string == null) { return 0; }            
      String string_new  = string.toString();           
      return getString_Float(string_new);           
    }    

    private void Calc_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calc_buttonActionPerformed
        // Обновить график
        // расчет диапазонов и вывод данных
        Calc_range();      
    }//GEN-LAST:event_Calc_buttonActionPerformed

    private void button_kurs_nbuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_kurs_nbuActionPerformed
        // Ссылка на курсы НБУ
        try {
            Desktop d = Desktop.getDesktop();
            d.browse(new URI("https://bank.gov.ua/control/uk/curmetal/currency/search/form/period"));                  
            } 
        catch (IOException | URISyntaxException ioe) {
        }
    }//GEN-LAST:event_button_kurs_nbuActionPerformed
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Curr_chart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Curr_chart().setVisible(true);
        });
    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calc_button;
    private javax.swing.JButton button_kurs_nbu;
    private javax.swing.JCheckBox check_day;
    private javax.swing.JCheckBox check_month;
    private javax.swing.JComboBox<String> curr_code;
    private javax.swing.JComboBox<String> day_com;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFormattedTextField minus_day;
    private javax.swing.JFormattedTextField minus_month;
    private javax.swing.JFormattedTextField minus_year;
    private javax.swing.JComboBox<String> month_com;
    private javax.swing.JFormattedTextField plus_day;
    private javax.swing.JFormattedTextField plus_month;
    private javax.swing.JCheckBox sred_value_valut;
    private javax.swing.JCheckBox visible_points;
    private javax.swing.JComboBox<String> year_com;
    // End of variables declaration//GEN-END:variables
}