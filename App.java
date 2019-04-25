
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
 
 
 

public class App extends JFrame {

    Novice novice = new Novice();
    Career career = new Career();
    Item item = new Item();
    Monster mons = new Monster();
    int x = 100;
    int LV=0;
    int Damage=0;
    int power = 0;
    int Bottom;
    int Powerup = 0;
    int Vanish = 0;
    int heal = 0;
    int choose = 0;
    int dmg = 30,gem=0,sumgem=0;
    int MonsterC = 0, MonsterD = 0, MonsterDr = 0;
    
    public App() {
        super("Java App Ragnarok");
        initComponents();
        
    }

                      
    private void initComponents() {
        
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        btnUpgrade = new JButton();
        btnPlay = new JButton();
        btnStatus = new JButton();
        jScrollPane1 = new JScrollPane();
        txtStatus = new JTextArea();
        jLabel2 = new JLabel();
        jLabel1 = new JLabel();
        txtCareer = new JTextField();
        txtGem1 = new JTextField();
        jLabel3 = new JLabel();
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new Color(0, 0, 0));

        btnUpgrade.setBackground(new Color(255, 255, 255));
        btnUpgrade.setText("Weapon Upgrade");
        btnUpgrade.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnUpgradeMouseClicked(evt);
            }
        });

        btnPlay.setBackground(new Color(255, 255, 255));
        btnPlay.setText("Play");
        btnPlay.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnPlayMouseClicked(evt);
            }
        });

        btnStatus.setBackground(new Color(255, 255, 255));
        btnStatus.setText("Player");
        btnStatus.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnStatusMouseClicked(evt);
            }
        });

        txtStatus.setBackground(new Color(255, 255, 255));
        txtStatus.setColumns(20);
        txtStatus.setRows(5);
        jScrollPane1.setViewportView(txtStatus);

        jLabel2.setForeground(new Color(255, 255, 0));
        jLabel2.setText("Status Player\n");

        jLabel1.setForeground(new Color(255, 255, 0));
        jLabel1.setText("Career");

        jLabel3.setForeground(new Color(255, 255, 0));
        jLabel3.setText("Gems");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(161, 161, 161))
            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCareer, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(txtGem1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(btnStatus, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnPlay, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(btnUpgrade))
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(337, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(txtGem1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCareer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnUpgrade, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                        .addComponent(btnPlay, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnStatus, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        
 public void DropGem(){
       gem=738+(int)(Math.random()*(6312));
       sumgem+=gem;
    }
    public void powerup() {
        dmg += 100;
        novice.FullHeal();
        power += 1;
    }
    private void btnUpgradeMouseClicked(MouseEvent evt) {                                        

        if(choose!=0){
            if(sumgem>5000){
                int gacha=1;
                gacha=1+(int)(Math.random()*(3));
                if(gacha==1){
                    if(choose==1){

                        JOptionPane.showMessageDialog(rootPane, "---Before Upgrade---"
                            + "\nYou Career: Sword"
                            + "\nWeapon LV : "+(LV+1)
                            + "\nDamage : "+(Damage), "System Message", JOptionPane.WARNING_MESSAGE);

                        Set();
                        if(LV>0){
                            txtStatus.setText("---After Upgrade---"
                                + "\nYou Career: Sword"
                                + "\nWeapon LV : "+(LV+1)
                                + "\nDamage : "+Damage);
                            sumgem-=5000;
                            txtGem1.setText(""+sumgem);

                        }
                    }else if(choose==2){

                        JOptionPane.showMessageDialog(rootPane, "---Before Upgrade---"
                            + "\nYou Career: Melee"
                            + "\nWeapon LV : "+(LV+1)
                            + "\nDamage : "+(Damage), "System Message", JOptionPane.WARNING_MESSAGE);
                        Set();
                        if(LV>0){
                            txtStatus.setText("---After Upgrade---"
                                + "\nYou Career: Melee"
                                + "\nWeapon LV : "+(LV+1)
                                + "\nDamage : "+Damage);
                            sumgem-=5000;
                            txtGem1.setText(""+sumgem);
                        }
                    }
                }else if(gacha!=1){
                    JOptionPane.showMessageDialog(this, "Upgrade Fail", "System Message", JOptionPane.WARNING_MESSAGE );
                    sumgem-=5000;
                    txtGem1.setText(""+sumgem);
                }
            }else {
                JOptionPane.showMessageDialog(this, "You Don't Have Gem", "System Message", JOptionPane.WARNING_MESSAGE);

            }
        }else {
            JOptionPane.showMessageDialog(this, "You Not Have Career\n"
                + "please get more EXP","System Message", JOptionPane.WARNING_MESSAGE);
        }

    }                                       
public void Career() {

        if (choose == 1) {
            career.SelectCareerS();
            txtCareer.setText("You Career: Sword");
            dmg += novice.Dmg() + 100 - 30;
       
            
        } else if (choose == 2) {
            career.SelectCareerM();
            txtCareer.setText("You Career: Melee");
            dmg += novice.Dmg() + 70 - 30;
            
            
        } else {

            txtCareer.setText("You Career: Free");
           
        }
    }
 public void Set(){
     LV++;
     Damage+=100*LV;
    
    }
    private void btnPlayMouseClicked(MouseEvent evt) {                                     

        if (novice.getlevel() < 5) {
            Career();
        }
        if (novice.gethp() != 0) {
            String input;
            input = JOptionPane.showInputDialog(this, "\nChoose 1 for ATK / Choose 2 Open Bag / Choose 3 ShowStatus", "MenuPlay", JOptionPane.WARNING_MESSAGE);
            Bottom = Integer.parseInt(input);
            if (Bottom != 0) {

                if (Bottom == 1) {
                    if (novice.getlevel() == 5) {
                        input = JOptionPane.showInputDialog(this, "1.Sword  2.Melee", "RegisterCareer", JOptionPane.WARNING_MESSAGE);
                        choose += Integer.parseInt(input);
                        Career();
                        novice.giveLv();
                    }
                    input = JOptionPane.showInputDialog(this, "1.CatDevil      |   2.TreeheadDog     | 3.Dragon\n"
                        + "HP :" + mons.getCatDevil() * novice.getlevel() + "/" + mons.getCatDevil() * novice.getlevel() + "  |"
                        + "   HP :" + mons.getTreeHeadDog() * novice.getlevel() + "/" + mons.getTreeHeadDog() * novice.getlevel() + "           | "
                        + "HP :" + mons.getDragon()* novice.getlevel() + "/" + mons.getDragon()* novice.getlevel()
                        + "\nLV :" + novice.getlevel() + "                |"
                        + "   LV :" + novice.getlevel() + "                        |"
                        + "LV :" + novice.getlevel(), "Select Monster", JOptionPane.WARNING_MESSAGE);
                    int select = 0;
                    select += Integer.parseInt(input);
                    if (select == 1) {
                        novice.attackCat();
                        MonsterC += 1;
                        if (power != 0) {
                            power--;
                            dmg -= 100;
                        }
                        DropGem();
                        txtGem1.setText(""+sumgem);
                        txtStatus.setText("----System messages----\nSucceed\nCatDevil\nHP :" + novice.attackCat() + "/" + mons.getCatDevil() * novice.getlevel()
                            + "\nLV :" + novice.getlevel() + "\nDrop Item"+"\nDrop Gem :"+gem);
                        if (novice.gethp() <= 0) {
                            JOptionPane.showMessageDialog(this, "You Die");
                            System.exit(0);
                        } else {
                            heal += item.DropiHealing();
                            Vanish += item.DropiVanish();
                            Powerup += item.DropiPowerup();
                            item.setVanish(Vanish);
                            item.setHeal(heal);
                            item.setPower(Powerup);
                        }

                    } else if (select == 2) {
                        novice.attackDog();
                        MonsterD += 1;
                        if (power != 0) {
                            power--;
                            dmg -= 100;
                        }
                        DropGem();
                        txtGem1.setText(""+sumgem);
                        txtStatus.setText("----System messages----\nSucceed\nDog TreeHead\nHP :" + novice.attackDog() + "/" + mons.getTreeHeadDog() * novice.getlevel()
                            + "\nLV :" + novice.getlevel() + "\nDrop Item"+"\nDrop Gem :"+gem);
                        if (novice.gethp() <= 0) {
                            JOptionPane.showMessageDialog(this, "You Die");
                            System.exit(0);
                        } else {
                            heal += item.DropiHealing();
                            Vanish += item.DropiVanish();
                            Powerup += item.DropiPowerup();
                            item.setVanish(Vanish);
                            item.setHeal(heal);
                            item.setPower(Powerup);
                        }
                    } else if (select == 3) {
                        novice.attackDog();
                        MonsterDr += 1;
                        if (power != 0) {
                            power--;
                            dmg -= 100;
                        }
                        DropGem();
                        txtGem1.setText(""+sumgem);
                        txtStatus.setText("----System messages----\nSucceed\nDragon\nHP :" + novice.attackDragon() + "/" + mons.getDragon() * novice.getlevel()
                            + "\nLV :" + novice.getlevel() + "\nDrop Item"+"\nDrop Gem :"+gem);
                        if (novice.gethp() <= 0) {
                            JOptionPane.showMessageDialog(this, "You Die");
                            System.exit(0);
                        } else {
                            heal += item.DropiHealing();
                            Vanish += item.DropiVanish();
                            Powerup += item.DropiPowerup();
                            item.setVanish(Vanish);
                            item.setHeal(heal);
                            item.setPower(Powerup);
                        }

                    }
                } else if (Bottom == 2) {
                    txtStatus.setText("-----Item Bag----\n"
                        + "1.Healing :" + heal + "\n2.Powerup :" + Powerup + "\n3.Vanish :" + Vanish);
                    input = JOptionPane.showInputDialog(this, "1.Healing :" + heal + "\n2.Powerup :" + Powerup + "\n3.Vanish :" + Vanish, "Select Item", NORMAL);
                    int select = 0;
                    select += Integer.parseInt(input);
                    if (select == 1) {
                        if (heal > 0) {
                            txtStatus.setText("Use Item Healing\nHP+25");
                            novice.heal();
                            heal--;
                        } else if (heal == 0) {
                            JOptionPane.showMessageDialog(this, "You Not Have Item", "System Error", JOptionPane.WARNING_MESSAGE);
                        }
                    } else if (select == 2) {
                        if (heal > 0) {
                            txtStatus.setText("Use Item PowerUp\nDamage +100\nHp Full");
                            powerup();
                            Powerup--;
                        } else if (heal == 0) {
                            JOptionPane.showMessageDialog(this, "You Not Have Item", "System Error", JOptionPane.WARNING_MESSAGE);
                        }
                    } else if (select == 3) {
                        if (heal > 0) {
                            txtStatus.setText("Use Item Vanish\nEXP+22");
                            novice.vinish();
                            Vanish--;
                        } else if (heal == 0) {
                            JOptionPane.showMessageDialog(this, "You Not Have Item", "System Error", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }

            }

        } else {
            JOptionPane.showMessageDialog(this, "You Dead");
            System.exit(0);
        }
    }                                    

    private void btnStatusMouseClicked(MouseEvent evt) {                                       
        String input;
      
        if (novice.getlevel() == 5) {
            input = JOptionPane.showInputDialog(this, "1.Sword  2.Melee", "RegisterCareer", JOptionPane.WARNING_MESSAGE);
            choose += Integer.parseInt(input);
            Career();
            novice.giveLv();
        }
        txtStatus.setText("-----Player Status-----\n" + "Your HP: "
            + novice.gethp() + "\nYour EXP: "
            + novice.getexp() + "/" + x * novice.getlevel()
            + "\nYour LV: " + novice.getlevel()
            + "\nWeapon LV : "+(LV+1)
            + "\nYou Damage: " + (dmg+Damage) +"\nYou Gem :"+sumgem+"\n-----Item Bag----\n"
            + "1.Healing :" + heal + "\n2.Powerup :" + Powerup + "\n3.Vanish :" + Vanish + "\n-----Monster Your Kill-----\n"
            + "CatDevil :" + MonsterC + "\nDog TreeHead :" + MonsterD + "\nDragon :" + MonsterDr);
        
    }                                      

   
    public static void main(String args[]) {
        new App();
       
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true); 
                
            }
        });
    }
                   
    private JButton btnPlay;
    private JButton btnStatus;
    private JButton btnUpgrade;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JTextField txtCareer;
    private JTextField txtGem1;
    private JTextArea txtStatus;
    // End of variables declaration                   
}
