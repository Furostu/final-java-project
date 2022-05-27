package src;

import javax.swing.JOptionPane;

public class SipnTea {

    //MENU TRANSACTION
    static int trans;
    //PRODUCT CHOICE
    static int choice;
    //CupChoice;
    private int Cupchoice;

    //Quantity
    int qty;

    //OrderCost
    int OrderCost;
    int Order;

    static void DisplayMainMenu() {
        trans = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                   \tMenu Choices 
                                                                   [1] MilkTea              [4] Check Balance
                                                                   [2] Fresh Tea            [5] Payment
                                                                   [3] Smoothie
                                                                   Choose [1 - 3]: """));
        new SipnTea().evaluateTrans();
    }

    void evaluateTrans() {

        do {
            if (trans == 1) {
                MilkTea();
            } else if (trans == 2) {
                FreshTea();
            } else if (trans == 3) {
                Smoothie();
            }
        } while (trans < 5);

    }

    int getCup(int a) {
        return this.Cupchoice = a;
    }

    void showMilkTeaMenu() {
        choice = Integer.parseInt(JOptionPane.showInputDialog(null, "MilkTea Menu Choice"
                + "					 \n[1] Winter Melon"
                + "					 \n[2] Oreo Cheesecake"
                + "					 \n[3] Salted Caramel"
                + "\n[4] Return to the Main Menu"
                + "					\nChoose [1-3]:"));
    }

    void MilkTea() {

        showMilkTeaMenu();

        do {
            switch (choice) {
                case 1:
                    WinterMelon();
                    break;
                case 2:
                    System.out.println("Milktea Classic");
                    break;
                case 3:
                    System.out.println("Milktea Grande");
                    break;
                default:
                    break;
            }

        } while (choice <= 4);
    }

    void WinterMelon() {

        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Pillar " + 65
                + "\n[2] Classic " + 75
                + "\n[3] Grande Cup " + 85
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));
        getCup(Cupchoice);
        evaluateChoiceCup();

    }

    void evaluateChoiceCup() {
        int Pillar = 65;
        int Classic = 75;
        int Grande = 85;

        switch (Cupchoice) {
            case 1:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Pillar Cup "
                        + "\nQuantity: "));
                Order = qty * Pillar;
                addValues(Order);
                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Classic Cup "
                        + "\nQuantity: "));
                Order = qty * Classic;
                addValues(Order);
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Grande Cup "
                        + "\nQuantity: "));
                Order = qty * Grande;
                addValues(Order);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "\t \t Returning to MILKTEA Menu", "Return Window", JOptionPane.INFORMATION_MESSAGE);
                showMilkTeaMenu();
                break;

            default:

                throw new AssertionError();
        }

    }

    void addValues(int Order) {
        OrderCost = OrderCost + Order;
        System.out.println("Order Cost total = " + OrderCost);
    }

    static void FreshTea() {
        System.out.println("Transaction Choice is FRESH TEA  : " + trans);

    }

    static void Smoothie() {
        System.out.println("Transaction Choice is: SMOOTHIE " + trans);

    }

    public static void main(String[] args) {

        DisplayMainMenu();
    }
}
