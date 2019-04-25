import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class App extends JFrame
{
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

    public App()
    {
        super("App java Ragnarok");
        btnUpgrade = new JButton();
        btnPlay = new JButton();
        btnStatus = new JButton();
        jScrollPane1 = new JScrollPane();
        txtStatus = new JTextArea();
        txtCareer = new JTextField();
        txtGem1 = new JTextField();
        jLabel1 = new JLabel();

       
        Container c = getContentPane();
        c.setLayout( new BorderLayout(10,10));

        JPanel leftsize = new JPanel();
        leftsize.setBorder(BorderFactory.createEmptyBorder(20, 15, 15, 0));
        leftsize.setLayout(new BoxLayout(leftsize, BoxLayout.Y_AXIS));
        JLabel pic1 = new JLabel(new ImageIcon("123456.png"));
        JLabel career = new JLabel() ;
        leftsize.add(pic1);
        leftsize.add(career);

        
        JPanel header = new JPanel();
        header.setBorder(BorderFactory.createEmptyBorder(15,200, 0, 0)); 
        header.setLayout(new BoxLayout(header, BoxLayout.Y_AXIS));

        String Head = new String("                                          Ragnarok Games");
        JLabel head1 = new JLabel(Head,SwingConstants.CENTER);
        header.add(head1);

        JPanel states = new JPanel();
        states.setLayout(new BoxLayout(states, BoxLayout.Y_AXIS));



        

        JPanel down = new JPanel();
        down.setBorder(BorderFactory.createEmptyBorder(14, 14, 14, 14)); 
        down.setLayout(new BoxLayout(down, BoxLayout.Y_AXIS));

        
        down.add(btnPlay);
        btnPlay.setText("Play");
        btnPlay.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt)
            {
                btnPlayMouseClicked(evt);
            }
        });

        txtCareer.setBounds(40, 41, 144, 20);
        getContentPane().add(txtCareer);

        
        txtGem1.setBounds(270, 230, 140, 20);
        getContentPane().add(txtGem1);

        jScrollPane1.setBounds(250, 39, 300, 180);
        getContentPane().add(jScrollPane1);
        jScrollPane1.setViewportView(txtStatus);

        
        btnUpgrade.setPreferredSize(btnPlay.getPreferredSize());
        down.add(btnUpgrade);
        btnUpgrade.setText("Weapon Upgrade");
        btnUpgrade.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnUpgradeMouseClicked(evt);
            }
        });

        btnStatus.setPreferredSize(btnPlay.getPreferredSize());
        down.add(btnStatus);
        btnStatus.setBackground(new Color(255, 255, 255));
        btnStatus.setText("Status Player");
        btnStatus.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnStatusMouseClicked(evt);
            }
        });

        jLabel1.setForeground(new Color(0, 0, 0));
        jLabel1.setText("Gems");
        jLabel1.setBounds(230, 150, 150, 180);
        getContentPane().add(jLabel1);
        


       

        c.add(header,BorderLayout.NORTH);
        c.add(states,BorderLayout.CENTER);
        c.add(down,BorderLayout.SOUTH);
        c.add(leftsize,BorderLayout.WEST);
        //c.add(pic,BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,400);
        setVisible(true);
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

    public void Set(){
        LV++;
        Damage+=100*LV;
       
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

    public void DropGem(){
        gem=738+(int)(Math.random()*(6312));
        sumgem+=gem;
     }

     public void powerup() {
        dmg += 100;
        novice.FullHeal();
        power += 1;
    }

    private JButton btnPlay;
    private JButton btnStatus;
    private JButton btnUpgrade;
    private JLabel jLabel1;

    private JScrollPane jScrollPane1;
    private JTextField txtCareer;
    private JTextField txtGem1;
    private JTextArea txtStatus;

    public static void main(String[] args) {
        new App();
    }
}