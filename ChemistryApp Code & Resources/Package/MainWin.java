package Package;

import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author lazarekl
 */
public class MainWin extends javax.swing.JFrame {

    
    public static String Symbol;
    public static String answer;
    public static String percentMassVals = null;
    public static HashMap<String, String> Elements = new HashMap<String, String>();
    public static HashMap<String, Integer> sigFig = new HashMap<String, Integer>();
    public static HashMap<String, String> elemtGrid = new HashMap<String, String>();
    
    JLabel imgL;
    /**
     * Creates new form MainWin
     */
    public MainWin() {
        initComponents();
        try{
            BufferedImage img = ImageIO.read(getClass().getResource("PolyatomicIons.png"));
            imgL = new JLabel(new ImageIcon(img));
        }catch(Exception e){
            infoBox("Problem reading file. The table of Polyatomic Ions will not be able to display properly.", "Error");
        }
        initElements();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WaterPWin = new javax.swing.JFrame();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        VaporPic0 = new javax.swing.JLabel();
        VaporPic1 = new javax.swing.JLabel();
        VaporPic2 = new javax.swing.JLabel();
        VaporPic3 = new javax.swing.JLabel();
        VaporPic4 = new javax.swing.JLabel();
        CloseVaporB = new javax.swing.JButton();
        InfoWin = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        Pg1ScrollPane = new javax.swing.JScrollPane();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Pg2ScrollPane = new javax.swing.JScrollPane();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Pg3ScrollPane = new javax.swing.JScrollPane();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        InfoDoneB = new javax.swing.JButton();
        Full = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FullEnter = new javax.swing.JButton();
        BlockLabel1 = new javax.swing.JLabel();
        BlockLabel2 = new javax.swing.JLabel();
        BlockLabel3 = new javax.swing.JLabel();
        BlockLabel4 = new javax.swing.JLabel();
        BlockLabel5 = new javax.swing.JLabel();
        BlockLabel6 = new javax.swing.JLabel();
        BlockLabel7 = new javax.swing.JLabel();
        BlockLabel8 = new javax.swing.JLabel();
        FullMa = new javax.swing.JLabel();
        ShowEmp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PTable = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        RSDB = new javax.swing.JButton();
        IonsB = new javax.swing.JButton();
        WaterPressureB = new javax.swing.JButton();
        InfoB = new javax.swing.JLabel();
        SigFigIgnoreBox = new javax.swing.JCheckBox();

        WaterPWin.setTitle("Water Vapor Pressure");
        WaterPWin.setLocationByPlatform(true);
        WaterPWin.setMinimumSize(new java.awt.Dimension(410, 540));
        WaterPWin.getContentPane().setLayout(null);

        jLabel9.setText("Partial pressures of water vapor in millimeters of mercury:");
        WaterPWin.getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 10, 370, 20);

        jLabel10.setText("°C : mm Hg");
        WaterPWin.getContentPane().add(jLabel10);
        jLabel10.setBounds(160, 37, 80, 16);

        VaporPic0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/WaterP1.png"))); // NOI18N
        WaterPWin.getContentPane().add(VaporPic0);
        VaporPic0.setBounds(163, 57, 60, 20);

        VaporPic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/WaterP2.png"))); // NOI18N
        WaterPWin.getContentPane().add(VaporPic1);
        VaporPic1.setBounds(10, 90, 85, 380);

        VaporPic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/WaterP3.png"))); // NOI18N
        WaterPWin.getContentPane().add(VaporPic2);
        VaporPic2.setBounds(110, 90, 85, 380);

        VaporPic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/WaterP4.png"))); // NOI18N
        WaterPWin.getContentPane().add(VaporPic3);
        VaporPic3.setBounds(210, 90, 85, 380);

        VaporPic4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/WaterP5.png"))); // NOI18N
        WaterPWin.getContentPane().add(VaporPic4);
        VaporPic4.setBounds(310, 90, 85, 380);

        CloseVaporB.setText("Close");
        CloseVaporB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseVaporBActionPerformed(evt);
            }
        });
        WaterPWin.getContentPane().add(CloseVaporB);
        CloseVaporB.setBounds(315, 480, 79, 29);

        InfoWin.setTitle("Information");
        InfoWin.setLocation(new java.awt.Point(80, 22));
        InfoWin.setLocationByPlatform(true);
        InfoWin.setMinimumSize(new java.awt.Dimension(400, 325));
        InfoWin.setResizable(false);
        InfoWin.getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel11.setText("<HTML><b>Table of Contents");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 10, 120, 16);

        jLabel12.setText("<HTML><u>Page 3:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 130, 60, 16);

        jLabel13.setText("Instructions, features, and general use");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(40, 50, 250, 15);

        jLabel14.setText("<HTML><u>Page 1:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 30, 60, 16);

        jLabel15.setText("Formatting, restrictions, and errors");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(40, 100, 240, 16);

        jLabel16.setText("<HTML><u>Page 2:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(10, 80, 60, 16);

        jLabel17.setText("Contact information");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(40, 150, 150, 16);

        jTabbedPane1.addTab("Table of Contents", jPanel1);

        jPanel2.setLayout(null);

        jLabel18.setText("<HTML><b>Information, Instructions, and General Use");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(10, 10, 300, 16);

        Pg1ScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("<HTML><body style='width: 290px'><u>Features:</u><br>\nThe primary feature of this program is the molar mass calculator. To make use of this feature, simply enter the formula (of whatever compound \nor element you wish to calculate the molar mass of) into the blank text field, and either hit enter or press the \"Enter\" button. Alternatively, the individual elements can be clicked on in the periodic table to the right. The formula you \nentered will show up in the box below the entry field, labelled \"Formula\", and the molar mass will be in the box to the right, labelled \"Molar Mass\".\nClicking on the box containing the molar mass will bring up a window containing the percent composition by mass of the compound. All values\ncalculated by this program automatically take significant figures into account. To turn this off, simply check the \"Ignore Significant Figures\" box\nbelow the \"Formula\" and \"Molar Mass\" display boxes. With this enabled, all calculations will be made to six decimal places.<br>\n\n<br><br>Secondary features include:<br>\n- A periodic table of the elements.<br>\n- A table of common Polyatomic Ions, their formulas, and their charges.<br>\n- A table of water vapor pressures from 0º Celsius to 100º Celsius.<br>\n- A standard deviation calculator.<br><br>\n\nThe standard deviation calculator takes any number of parameters, all of which must be valid numbers, and calculates the\nstandard deviation between them. To make use of this feature, simply click on the \"Standard Deviation\" button and enter\nthe values to be used in the calculation, seperated by commas and spaces, and then click \"Ok\". A new window will pop-up\nwith the results of the calculation.");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Pg1ScrollPane.setViewportView(jLabel19);

        jPanel2.add(Pg1ScrollPane);
        Pg1ScrollPane.setBounds(0, 30, 400, 180);

        jTabbedPane1.addTab("Page 1", jPanel2);

        jPanel3.setLayout(null);

        Pg2ScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel20.setText("<HTML><body style='width: 290px'><u>Features:</u><br>\nThis program is designed to be as simple and intuitive to use as possible, although there are some specific guidelines that must be followed in order to not encounter errors. Primarily, subscripts should be entered into the calculator simply as an integer after the element symbol. <br>\nFurthermore, for formulas containing parentheses, the subscript must be distributed to the elements inside of the parantheses, so as to eliminate the parenthesis.<br>\nFinally, no spaces or other symbols should be entered.<br>\nFor example, the following formula:<br>\nCu(SO<sub>4</sub>)<sub>2</sub><br>\nShould be entered as:<br>\nCuS2O8<br>\nOtherwise, simply enter whichever formula you would like in any format whatsoever.\n<br><br>\nAdditionally, note that the standard deviation calculator will only take standard numbers, with no extraneous symbols, seperated by commas and spaces.");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Pg2ScrollPane.setViewportView(jLabel20);

        jPanel3.add(Pg2ScrollPane);
        Pg2ScrollPane.setBounds(0, 30, 400, 180);

        jLabel21.setText("<HTML><b>Formatting, Restrictions, and Errors");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(10, 10, 300, 16);

        jTabbedPane1.addTab("Page 2", jPanel3);

        jPanel4.setLayout(null);

        Pg3ScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel22.setText("<HTML><body style='width: 290px'><u>Features:</u><br>\nThis program was produced by Lukas Lazarek, who can be reached at LukasALazarek@gmail.com.<br>\nI do not claim any of the results produced by this program to be perfectly accurate, although I strive to make them as accurate as possible, nor do I claim ownership over any of the images used in this program.<br>");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Pg3ScrollPane.setViewportView(jLabel22);

        jPanel4.add(Pg3ScrollPane);
        Pg3ScrollPane.setBounds(0, 30, 400, 180);

        jLabel23.setText("<HTML><b>Contact Information</b>");
        jPanel4.add(jLabel23);
        jLabel23.setBounds(10, 10, 300, 16);

        jTabbedPane1.addTab("Page 3", jPanel4);

        InfoWin.getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 400, 250);

        InfoDoneB.setText("Done");
        InfoDoneB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoDoneBActionPerformed(evt);
            }
        });
        InfoWin.getContentPane().add(InfoDoneB);
        InfoDoneB.setBounds(300, 260, 77, 29);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Molar Mass Calculator");
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(900, 330));
        setResizable(false);
        getContentPane().setLayout(null);

        Full.setToolTipText("Enter the empirical formula of the substance for which the molar mass is needed");
        Full.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FullKeyPressed(evt);
            }
        });
        getContentPane().add(Full);
        Full.setBounds(10, 60, 98, 28);

        jLabel2.setText("Enter the complete formula of the ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(13, 10, 220, 16);

        FullEnter.setText("Enter");
        FullEnter.setToolTipText("Click here to perform the calculation");
        FullEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullEnterActionPerformed(evt);
            }
        });
        getContentPane().add(FullEnter);
        FullEnter.setBounds(140, 58, 95, 29);

        BlockLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlockLabel1.setText("<HTML><br><b>Or click on an element in the table below:");
        BlockLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(BlockLabel1);
        BlockLabel1.setBounds(323, 10, 351, 90);
        getContentPane().add(BlockLabel2);
        BlockLabel2.setBounds(250, 225, 70, 75);
        getContentPane().add(BlockLabel3);
        BlockLabel3.setBounds(323, 164, 32, 66);
        getContentPane().add(BlockLabel4);
        BlockLabel4.setBounds(855, 226, 35, 74);
        getContentPane().add(BlockLabel5);
        BlockLabel5.setBounds(662, 10, 190, 30);
        getContentPane().add(BlockLabel6);
        BlockLabel6.setBounds(287, 10, 37, 30);
        getContentPane().add(BlockLabel7);
        BlockLabel7.setBounds(323, 225, 530, 5);
        getContentPane().add(BlockLabel8);
        BlockLabel8.setBounds(323, 293, 530, 8);

        FullMa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FullMa.setToolTipText("The molar mass of the displayed compound. Click here for the percent composition by mass");
        FullMa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FullMa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FullMaMouseClicked(evt);
            }
        });
        FullMa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FullMaMouseDragged(evt);
            }
        });
        getContentPane().add(FullMa);
        FullMa.setBounds(140, 120, 95, 23);

        ShowEmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShowEmp.setToolTipText("The empirical formula for which the molar mass is displayed");
        ShowEmp.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ShowEmp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ShowEmp);
        ShowEmp.setBounds(10, 120, 95, 23);

        jLabel1.setText("=");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(116, 77, 10, 0);

        jLabel3.setText("=");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 120, 10, 16);

        jLabel4.setText("substance below:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(13, 30, 140, 16);

        PTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/Periodic-TableEdited.png"))); // NOI18N
        PTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PTable.setPreferredSize(new java.awt.Dimension(900, 289));
        PTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PTableMouseClicked(evt);
            }
        });
        getContentPane().add(PTable);
        PTable.setBounds(250, 10, 640, 290);

        jLabel7.setText("Formula");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 100, 70, 16);

        jLabel8.setText("Molar Mass");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(140, 100, 90, 16);

        RSDB.setText("Standard Deviation");
        RSDB.setToolTipText("Click here to calculate a set of values' standard deviation");
        RSDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSDBActionPerformed(evt);
            }
        });
        getContentPane().add(RSDB);
        RSDB.setBounds(40, 240, 150, 29);

        IonsB.setText("Polyatomic Ions");
        IonsB.setToolTipText("Click here for a list of common polyatomic ions and their charges");
        IonsB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IonsBActionPerformed(evt);
            }
        });
        getContentPane().add(IonsB);
        IonsB.setBounds(40, 210, 150, 29);

        WaterPressureB.setText("Water Vapor Pressure");
        WaterPressureB.setToolTipText("Click here for a list of water vapor pressures from 1ºC to 100ºC");
        WaterPressureB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WaterPressureBActionPerformed(evt);
            }
        });
        getContentPane().add(WaterPressureB);
        WaterPressureB.setBounds(36, 270, 160, 29);

        InfoB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InfoB.setText("<HTML><b>Information</b>");
        InfoB.setToolTipText("Click here for help, instructions, and general information about this program");
        InfoB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InfoB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InfoBMouseClicked(evt);
            }
        });
        InfoB.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                InfoBMouseDragged(evt);
            }
        });
        getContentPane().add(InfoB);
        InfoB.setBounds(70, 155, 100, 20);

        SigFigIgnoreBox.setText("Ignore Significant Figures");
        SigFigIgnoreBox.setToolTipText("Check to ignore significant figures in all calculations. Note that molar masses must be recalculated for this to take effect.");
        SigFigIgnoreBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigFigIgnoreBoxActionPerformed(evt);
            }
        });
        getContentPane().add(SigFigIgnoreBox);
        SigFigIgnoreBox.setBounds(30, 180, 210, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FullEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullEnterActionPerformed
        percentMassVals = "";
        String Form = Full.getText();
        Full.setText("");
        ShowEmp.setText(Form);
        answer = "";
        BigDecimal fullmass = new BigDecimal("0");
        FullMa.setToolTipText(null);
        int lowestScale = 6;
        HashMap<String, BigDecimal> indivMass = new HashMap<String, BigDecimal>();
        String[] Element;
        try{
            String[] seperate = Form.split("(?=[A-Z])");
            int Num = seperate.length;
            int beginning = 0;
            if(Num != 1){
                beginning = 1;
            }
            for(int k = beginning; k < (Num); k++){
                if(Form.contains("(") || Form.contains(")")){
                     throw new ArithmeticException();
                }else{
                    Element = seperate[k].split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
                    Symbol = Element[0];
                }
                if(Element.length == 1){
                    BigDecimal mass = new BigDecimal(Elements.get(Symbol));
                    fullmass = fullmass.add(mass);
                    if(indivMass.containsKey(Symbol)){
                        mass = mass.add(indivMass.get(Symbol));
                    }
                    indivMass.put(Symbol, mass);
                    if(!SigFigIgnoreBox.isSelected()){
                        lowestScale = updateScale(Symbol, lowestScale);
                    }
                }else{
                    BigDecimal Number = new BigDecimal(Element[1]);
                    BigDecimal n = new BigDecimal(Elements.get(Symbol));
                    BigDecimal finalMass = n.multiply(Number);
                    fullmass = fullmass.add(finalMass);
                    if(indivMass.containsKey(Symbol)){
                        finalMass = finalMass.add(indivMass.get(Symbol));
                    }
                    indivMass.put(Symbol, finalMass);
                    if(!SigFigIgnoreBox.isSelected()){
                        lowestScale = updateScale(Symbol, lowestScale);
                    }
                }
            }
            fullmass = fullmass.setScale(lowestScale, BigDecimal.ROUND_HALF_UP);
            BigDecimal comp = new BigDecimal("0");
            if(fullmass.compareTo(comp) == 0){
                answer = "Err: Not Found";
                FullMa.setToolTipText("Err");
            }else{
                answer = fullmass.toString();
                
                //Determining mass percent for each element present
                HashMap<String, String> percentMasses = new HashMap<String, String>();
                for(Map.Entry entry: indivMass.entrySet()){
                    
                    String elemtSymbol = (String)entry.getKey();
                    BigDecimal percent = (BigDecimal)entry.getValue();
                    
                    percent = percent.multiply(new BigDecimal(100));
                    String massStr = Elements.get(elemtSymbol);
                    percent = percent.divide(fullmass, 6, BigDecimal.ROUND_HALF_UP);
                    
                    if(!SigFigIgnoreBox.isSelected()){
                        //Determining and applying signficant figures to mass percents
                        String totalSigStr = answer;
                        String massSigStr = massStr;
                        int totalMaLength = answer.length();
                        int indivMaLength = massStr.length();
                        if(totalSigStr.contains(".")){totalMaLength -= 1;}//decimal points count as a character but not a significant figure
                        if(massSigStr.contains(".")){indivMaLength -= 1;}

                        int sigFigsInt = totalMaLength <= indivMaLength ? totalMaLength : indivMaLength;
                        String percentStr = percent.toString();
                        int newSigFig = sigFigsInt;
                        if(percentStr.contains(".")){
                            newSigFig += 1; //Compensate for the fact that decimal points count as a character in Sig Fig calculations
                        }
                        
                        String sigFigPercent = "";
                        if(percentStr.startsWith("0")){
                            newSigFig += 1; //Compensate for the fact that a leading zero counts as a character in Sig Fig calculations
                            sigFigPercent = round(percentStr, newSigFig);
                        }else{
                            sigFigPercent = round(percentStr, newSigFig);
                        }
                        
                        percentMasses.put(elemtSymbol, sigFigPercent);
                    }else{
                        percentMasses.put(elemtSymbol, percent.toString());
                    }
                }
                
                for(Map.Entry entry: percentMasses.entrySet()){
                    percentMassVals += entry.getKey() + ": " + entry.getValue() + "%\n";
                }
            }
            FullMa.setText(answer);
            Full.requestFocus();
            
        }catch(ArithmeticException p){
            FullMa.setText("ERR");
            percentMassVals = null;
            MainWin.infoBox("Unable to parse formula. This may be because you have used parenthesis. \nPlease remember that parenthesis should be removed and coefficients distributed before entering the formula.", "Error");
        }catch(Exception e){
            e.printStackTrace();
            FullMa.setText("ERR");
            percentMassVals = null;
            MainWin.infoBox("Unable to parse formula. Please check syntax.", "Error");
        }
    }//GEN-LAST:event_FullEnterActionPerformed

    private void FullKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FullKeyPressed
        
        if(evt.getKeyCode() == 10){
            FullEnter.doClick();
        }
    }//GEN-LAST:event_FullKeyPressed

    private void RSDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSDBActionPerformed
        
        try{
        String str = (String)JOptionPane.showInputDialog(null, "Enter the values "
                + "with which to make the calculation,\nseperated by commas and spaces:",
                "Standard Deviation", JOptionPane.PLAIN_MESSAGE);
        String[] numz = str.split(", ");
        int numTerms = numz.length;
        double[] nums = new double[numTerms];
        for(int i = 0; i < numTerms; i++){
            nums[i] = Double.valueOf(numz[i]);
        }
        double avg = 0;
        for(double k : nums){
            avg += k;
        }
        avg = avg/numTerms;
        
        double fulldiv = 0;
        for(int j = 0; j < numTerms; j++){
            double num = nums[j] - avg;
            fulldiv += Math.pow(num, 2);
        }
        double full = fulldiv/(numTerms - 1);
        double s = Math.sqrt(full);
        double RSD = (100*s)/avg;
        BigDecimal newS = new BigDecimal(s);
        BigDecimal newRSD = new BigDecimal(RSD);
        newS = newS.setScale(4, BigDecimal.ROUND_HALF_UP);
        newRSD = newRSD.setScale(4, BigDecimal.ROUND_HALF_UP);
        infoBox("Standard Deviation: " + newS.toString() + "\nRelative Standard Deviation: " + newRSD.toString() + "%", "Results:");
        }catch(NullPointerException e){
             // NullPointer is thrown if the user hits cancel
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Invalid entry, please ensure that only standard, real numbers are entered.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RSDBActionPerformed

    private void IonsBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IonsBActionPerformed
        
        JOptionPane.showMessageDialog(null, imgL, "Polyatomic Ions:", JOptionPane.PLAIN_MESSAGE, null);
    }//GEN-LAST:event_IonsBActionPerformed

    private void WaterPressureBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WaterPressureBActionPerformed
        
        WaterPWin.setVisible(true);
        CloseVaporB.requestFocus();
    }//GEN-LAST:event_WaterPressureBActionPerformed

    private void CloseVaporBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseVaporBActionPerformed
        
        WaterPWin.setVisible(false);
        Full.requestFocus();
    }//GEN-LAST:event_CloseVaporBActionPerformed

    private void FullMaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FullMaMouseClicked
        
        if(percentMassVals != null){
            infoBox(percentMassVals, "Percent Composition by Mass");
        }
    }//GEN-LAST:event_FullMaMouseClicked

    private void FullMaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FullMaMouseDragged
        
        FullMaMouseClicked(evt);
    }//GEN-LAST:event_FullMaMouseDragged

    private void InfoBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoBMouseClicked
        
        InfoWin.setVisible(true);
    }//GEN-LAST:event_InfoBMouseClicked

    private void InfoBMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoBMouseDragged
        
        InfoBMouseClicked(evt);
    }//GEN-LAST:event_InfoBMouseDragged

    private void SigFigIgnoreBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigFigIgnoreBoxActionPerformed
        
        Full.requestFocus();
    }//GEN-LAST:event_SigFigIgnoreBoxActionPerformed

    private void InfoDoneBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoDoneBActionPerformed
        
        InfoWin.setVisible(false);
    }//GEN-LAST:event_InfoDoneBActionPerformed

    private void PTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PTableMouseClicked
        int x = evt.getX();
        int y = evt.getY();
        Full.setText(Full.getText() + getClickedElement(x, y));
            
    }//GEN-LAST:event_PTableMouseClicked

    public static void infoBox(String infoMessage, String header)
    {
        JOptionPane.showMessageDialog(null, infoMessage, header, JOptionPane.PLAIN_MESSAGE);
    }
    
    public static String round(String percentStr, int newSigFig){
        String roundDigitStr = percentStr.substring(newSigFig - 1, newSigFig);
        String compDigitStr = percentStr.substring(newSigFig, newSigFig + 1);
        if(roundDigitStr.equals(".")){
            roundDigitStr = percentStr.substring(newSigFig - 2, newSigFig - 1);
        }
        if(compDigitStr.equals(".")){
            compDigitStr = percentStr.substring(newSigFig + 1, newSigFig + 2);
        }
        int compDigit = Integer.valueOf(compDigitStr);      //digit after digit to be rounded
        int roundDigit = Integer.valueOf(roundDigitStr);    //digit to be rounded
        if(compDigit < 5){
            return percentStr.substring(0, newSigFig);
        }else{
            String newPercentStr = "";
            if(roundDigit == 9){
                String nextDigitStr = percentStr.substring(newSigFig - 2, newSigFig - 1);
                if(nextDigitStr.equals(".")){
                    nextDigitStr = percentStr.substring(newSigFig - 3, newSigFig - 2);
                    int nextDigitInt = Integer.valueOf(nextDigitStr);
                    nextDigitInt += 1;
                    nextDigitStr = String.valueOf(nextDigitInt);
                    newPercentStr = percentStr.substring(0, newSigFig - 3) + nextDigitStr + ".0";
                }else if(nextDigitStr.equals("9")){
                    newPercentStr = round(percentStr, newSigFig - 1) + "0";
                }else{
                    int nextDigitInt = Integer.valueOf(nextDigitStr);
                    nextDigitInt += 1;
                    nextDigitStr = String.valueOf(nextDigitInt);
                    newPercentStr = percentStr.substring(0, newSigFig - 2) + nextDigitStr + "0";
                }
            }else{
                roundDigit += 1;
                String newRDigitStr = String.valueOf(roundDigit);
                newPercentStr = percentStr.substring(0, newSigFig - 1) + newRDigitStr;
            }
            return newPercentStr;
        }
    }
    
    public static int updateScale(String element, int lowestScale){
        String massStr = Elements.get(element);
        String[] pointSp = massStr.split("\\.");
        if(pointSp.length > 1){
            int scale = pointSp[1].length();
            if(scale < lowestScale){
                return scale;
            }else{
                return lowestScale;
            }
        }else{
            return 0;
        }
    }
    
    public static String getClickedElement(int x, int y){
        int xCase = 0;
        int yCase = 0;
        if(x >= 0 && x <= 34){
             xCase = 1;
        }else if(x >= 37 && x <= 70){
            xCase = 2;
        }else if(x >= 73 && x <= 104){
            xCase = 3;
        }else if(x >= 108 && x <= 141){
            xCase = 4;
        }else if(x >= 144 && x <= 176){
            xCase = 5;
        }else if(x >= 180 && x <= 212){
            xCase = 6;
        }else if(x >= 215 && x <= 247){
            xCase = 7;
        }else if(x >= 250 && x <= 283){
            xCase = 8;
        }else if(x >= 286 && x <= 318){
            xCase = 9;
        }else if(x >= 321 && x <= 354){
            xCase = 10;
        }else if(x >= 357 && x <= 389){
            xCase = 11;
        }else if(x >= 392 && x <= 424){
            xCase = 12;
        }else if(x >= 428 && x <= 460){
            xCase = 13;
        }else if(x >= 463 && x <= 496){
            xCase = 14;
        }else if(x >= 499 && x <= 532){
            xCase = 15;
        }else if(x >= 535 && x <= 566){
            xCase = 16;
        }else if(x >= 569 && x <= 602){
            xCase = 17;
        }else if(x >= 606 && x <= 639){
            xCase = 18;
        }
        
        if(y >= 0 && y <= 32){
            yCase = 1;
        }else if(y >= 34 && y <= 63){
            yCase = 2;
        }else if(y >= 66 && y <= 93){
            yCase = 3;
        }else if(y >= 97 && y <= 124){
            yCase = 4;
        }else if(y >= 126 && y <= 155){
            yCase = 5;
        }else if(y >= 157 && y <= 185){
            yCase = 6;
        }else if(y >= 188 && y <= 216){
            yCase = 7;
        }else if(y >= 223 && y <= 252){
            yCase = 8;
        }else if(y >= 255 && y <= 283){
            yCase = 9;
        }
        
        if(yCase == 0 || xCase == 0){
            return "";
        }else{
            String elSymbol = elemtGrid.get(Integer.toString(xCase) + ":" + Integer.toString(yCase));
            return elSymbol == null ? "" : elSymbol;
        }
    }
    
    public static void initElements(){
        Elements.put("H", "1.008");
        elemtGrid.put("1:1", "H");
        Elements.put("Li", "6.941");
        elemtGrid.put("1:2", "Li");
        Elements.put("Na", "22.99");
        elemtGrid.put("1:3", "Na");
        Elements.put("K", "39.10");
        elemtGrid.put("1:4", "K");
        Elements.put("Rb", "85.47");
        elemtGrid.put("1:5", "Rb");
        Elements.put("Cs", "132.9");
        elemtGrid.put("1:6", "Cs");
        Elements.put("Fr", "223.");
        elemtGrid.put("1:7", "Fr");
        Elements.put("Be", "9.012");
        elemtGrid.put("2:2", "Be");
        Elements.put("Mg", "24.31");
        elemtGrid.put("2:3", "Mg");
        Elements.put("Ca", "40.08");
        elemtGrid.put("2:4", "Ca");
        Elements.put("Sr", "87.62");
        elemtGrid.put("2:5", "Sr");
        Elements.put("Ba", "137.3");
        elemtGrid.put("2:6", "Ba");
        Elements.put("Ra", "226.");
        elemtGrid.put("2:7", "Ra");
        Elements.put("Sc", "44.96");
        elemtGrid.put("3:4", "Sc");
        Elements.put("Y", "88.91");
        elemtGrid.put("3:5", "Y");
        Elements.put("Lu", "175.0");
        elemtGrid.put("17:8", "Lu");
        Elements.put("Lr", "262");
        elemtGrid.put("17:9", "Lr");
        Elements.put("Ti", "47.88");
        elemtGrid.put("4:4", "Ti");
        Elements.put("Zr", "91.22");
        elemtGrid.put("4:5", "Zr");
        Elements.put("Hf", "178.5");
        elemtGrid.put("4:6", "Hf");
        Elements.put("Rf", "261.");
        elemtGrid.put("4:7", "Rf");
        Elements.put("V", "50.94");
        elemtGrid.put("5:4", "V");
        Elements.put("Nb", "92.91");
        elemtGrid.put("5:5", "Nb");
        Elements.put("Ta", "180.9");
        elemtGrid.put("5:6", "Ta");
        Elements.put("Db", "262.");
        elemtGrid.put("5:7", "Db");
        Elements.put("Cr", "52.00");
        elemtGrid.put("6:4", "Cr");
        Elements.put("Mo", "95.94");
        elemtGrid.put("6:5", "Mo");
        Elements.put("W", "183.9");
        elemtGrid.put("6:6", "W");
        Elements.put("Sg", "263.");
        elemtGrid.put("6:7", "Sg");
        Elements.put("Mn", "54.94");
        elemtGrid.put("7:4", "Mn");
        Elements.put("Tc", "98");
        elemtGrid.put("7:5", "Tc");
        Elements.put("Re", "186.2");
        elemtGrid.put("7:6", "Re");
        Elements.put("Bh", "264.");
        elemtGrid.put("7:7", "Bh");
        Elements.put("Fe", "55.85");
        elemtGrid.put("8:4", "Fe");
        Elements.put("Ru", "101.1");
        elemtGrid.put("8:5", "Ru");
        Elements.put("Os", "190.2");
        elemtGrid.put("8:6", "Os");
        Elements.put("Hs", "265.");
        elemtGrid.put("8:7", "Hs");
        Elements.put("Co", "58.93");
        elemtGrid.put("9:4", "Co");
        Elements.put("Rh", "102.9");
        elemtGrid.put("9:5", "Rh");
        Elements.put("Ir", "192.2");
        elemtGrid.put("9:6", "Ir");
        Elements.put("Mt", "268.");
        elemtGrid.put("9:7", "Mt");
        Elements.put("Ni", "58.69");
        elemtGrid.put("10:4", "Ni");
        Elements.put("Pd", "106.4");
        elemtGrid.put("10:5", "Pd");
        Elements.put("Pt", "195.1");
        elemtGrid.put("10:6", "Pt");
        Elements.put("Ds", "271.");
        elemtGrid.put("10:7", "Ds");
        Elements.put("Cu", "63.55");
        elemtGrid.put("11:4", "Cu");
        Elements.put("Ag", "107.9");
        elemtGrid.put("11:5", "Ag");
        Elements.put("Au", "197.0");
        elemtGrid.put("11:6", "Au");
        Elements.put("Rg", "272.");
        elemtGrid.put("11:7", "Rg");
        Elements.put("Zn", "65.38");
        elemtGrid.put("12:4", "Zn");
        Elements.put("Cd", "112.4");
        elemtGrid.put("12:5", "Cd");
        Elements.put("Hg", "200.6");
        elemtGrid.put("12:6", "Hg");
        Elements.put("Cn", "285.");
        elemtGrid.put("12:7", "Cn");
        Elements.put("B", "10.81");
        elemtGrid.put("13:2", "B");
        Elements.put("Al", "26.98");
        elemtGrid.put("13:3", "Al");
        Elements.put("Ga", "69.72");
        elemtGrid.put("13:4", "Ga");
        Elements.put("Ln", "114.8");
        elemtGrid.put("13:5", "Ln");
        Elements.put("Tl", "204.4");
        elemtGrid.put("13:6", "Tl");
        Elements.put("Uut", "284.");
        elemtGrid.put("13:7", "Uut");
        Elements.put("C", "12.01");
        elemtGrid.put("14:2", "C");
        Elements.put("Si", "28.09");
        elemtGrid.put("14:3", "Si");
        Elements.put("Ge", "72.59");
        elemtGrid.put("14:4", "Ge");
        Elements.put("Sn", "118.7");
        elemtGrid.put("14:5", "Sn");
        Elements.put("Pb", "207.2");
        elemtGrid.put("14:6", "Pb");
        Elements.put("Fl", "289.");
        elemtGrid.put("14:7", "Fl");
        Elements.put("N", "14.01");
        elemtGrid.put("15:2", "N");
        Elements.put("P", "30.97");
        elemtGrid.put("15:3", "P");
        Elements.put("As", "74.92");
        elemtGrid.put("15:4", "As");
        Elements.put("Sb", "121.8");
        elemtGrid.put("15:5", "Sb");
        Elements.put("Bi", "209.0");
        elemtGrid.put("15:6", "Bi");
        Elements.put("Uup", "288.");
        elemtGrid.put("15:7", "Uup");
        Elements.put("O", "16.00");
        elemtGrid.put("16:2", "O");
        Elements.put("S", "32.07");
        elemtGrid.put("16:3", "S");
        Elements.put("Se", "78.96");
        elemtGrid.put("16:4", "Se");
        Elements.put("Te", "127.6");
        elemtGrid.put("16:5", "Te");
        Elements.put("Po", "209");
        elemtGrid.put("16:6", "Po");
        Elements.put("Lv", "293.");
        elemtGrid.put("16:7", "Lv");
        Elements.put("F", "19.00");
        elemtGrid.put("17:2", "F");
        Elements.put("Cl", "35.45");
        elemtGrid.put("17:3", "Cl");
        Elements.put("Br", "79.90");
        elemtGrid.put("17:4", "Br");
        Elements.put("I", "126.9");
        elemtGrid.put("17:5", "I");
        Elements.put("At", "210.");
        elemtGrid.put("17:6", "At");
        Elements.put("Uus", "294.");
        elemtGrid.put("17:7", "Uus");
        Elements.put("He", "4.003");
        elemtGrid.put("18:1", "He");
        Elements.put("Ne", "20.18");
        elemtGrid.put("18:2", "Ne");
        Elements.put("Ar", "39.95");
        elemtGrid.put("18:3", "Ar");
        Elements.put("Kr", "83.80");
        elemtGrid.put("18:4", "Kr");
        Elements.put("Xe", "131.3");
        elemtGrid.put("18:5", "Xe");
        Elements.put("Rn", "222.");
        elemtGrid.put("18:6", "Rn");
        Elements.put("Uuo", "294.");
        elemtGrid.put("18:7", "Uuo");
        Elements.put("La", "138.9");
        elemtGrid.put("3:8", "La");
        Elements.put("Ce", "140.1");
        elemtGrid.put("4:8", "Ce");
        Elements.put("Pr", "140.9");
        elemtGrid.put("5:8", "Pr");
        Elements.put("Nd", "144.2");
        elemtGrid.put("6:8", "Nd");
        Elements.put("Pm", "145.");
        elemtGrid.put("7:8", "Pm");
        Elements.put("Sm", "150.4");
        elemtGrid.put("8:8", "Sm");
        Elements.put("Eu", "152.0");
        elemtGrid.put("9:8", "Eu");
        Elements.put("Gd", "157.3");
        elemtGrid.put("10:8", "Gd");
        Elements.put("Tb", "158.9");
        elemtGrid.put("11:8", "Tb");
        Elements.put("Dy", "162.5");
        elemtGrid.put("12:8", "Dy");
        Elements.put("Ho", "164.9");
        elemtGrid.put("13:8", "Ho");
        Elements.put("Er", "167.3");
        elemtGrid.put("14:8", "Er");
        Elements.put("Tm", "168.9");
        elemtGrid.put("15:8", "Tm");
        Elements.put("Yb", "173.0");
        elemtGrid.put("16:8", "Yb");
        Elements.put("Lu", "175.0");
        elemtGrid.put("17:8", "Lu");
        Elements.put("Ac", "227.");
        elemtGrid.put("3:9", "Ac");
        Elements.put("Th", "232.0");
        elemtGrid.put("4:9", "Th");
        Elements.put("Pa", "231.");
        elemtGrid.put("5:9", "Pa");
        Elements.put("U", "238.0");
        elemtGrid.put("6:9", "U");
        Elements.put("Np", "237.");
        elemtGrid.put("7:9", "Np");
        Elements.put("Pu", "244.");
        elemtGrid.put("8:9", "Pu");
        Elements.put("Am", "243.");
        elemtGrid.put("9:9", "Am");
        Elements.put("Cm", "247.");
        elemtGrid.put("10:9", "Cm");
        Elements.put("Bl", "247.");
        elemtGrid.put("11:9", "Bl");
        Elements.put("Cf", "251.");
        elemtGrid.put("12:9", "Cf");
        Elements.put("Es", "252.");
        elemtGrid.put("13:9", "Es");
        Elements.put("Fm", "257.");
        elemtGrid.put("14:9", "Fm");
        Elements.put("Md", "258.");
        elemtGrid.put("15:9", "Md");
        Elements.put("No", "259.");
        elemtGrid.put("16:9", "No");
        Elements.put("Lr", "260.");
        elemtGrid.put("17:9", "Lr");
    }
    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BlockLabel1;
    private javax.swing.JLabel BlockLabel2;
    private javax.swing.JLabel BlockLabel3;
    private javax.swing.JLabel BlockLabel4;
    private javax.swing.JLabel BlockLabel5;
    private javax.swing.JLabel BlockLabel6;
    private javax.swing.JLabel BlockLabel7;
    private javax.swing.JLabel BlockLabel8;
    private javax.swing.JButton CloseVaporB;
    private javax.swing.JTextField Full;
    private javax.swing.JButton FullEnter;
    private javax.swing.JLabel FullMa;
    private javax.swing.JLabel InfoB;
    private javax.swing.JButton InfoDoneB;
    private javax.swing.JFrame InfoWin;
    private javax.swing.JButton IonsB;
    private javax.swing.JLabel PTable;
    private javax.swing.JScrollPane Pg1ScrollPane;
    private javax.swing.JScrollPane Pg2ScrollPane;
    private javax.swing.JScrollPane Pg3ScrollPane;
    private javax.swing.JButton RSDB;
    private javax.swing.JLabel ShowEmp;
    private javax.swing.JCheckBox SigFigIgnoreBox;
    private javax.swing.JLabel VaporPic0;
    private javax.swing.JLabel VaporPic1;
    private javax.swing.JLabel VaporPic2;
    private javax.swing.JLabel VaporPic3;
    private javax.swing.JLabel VaporPic4;
    private javax.swing.JFrame WaterPWin;
    private javax.swing.JButton WaterPressureB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
