package src;

import javax.swing.JOptionPane;

public class SipnTea {

    //MENU TRANSACTION
    static int trans;

    //PRODUCT CHOICE
    static int choice;

    //CupChoice;
    private static int Cupchoice;

    //Quantity
    static int qty;

    //OrderCost
    static int Order;

    //TOTAL COSTING
    static int OverAllCost;

    //PAYMENT
    static int payment;
    static int diff;

    // MILKTEA
    static int TotalMilkTea;
    static int TotalWinter;
    static int TotalOreo;
    static int TotalCaramel;

    //FRUITTEA
    static int TotalFreshTea;
    static int TotalLemonTea;
    static int TotalSBerrytea;
    static int TotalAppleTea;

    //SMOOTHIE    
    static int TotalSmoothie;
    static int TotalStrawberry;
    static int TotalLemon;
    static int TotalMango;

    static void DisplayMainMenu() {
        trans = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                   \tMenu Choices 
                                                                   [1] MilkTea              [4] Check Balance
                                                                   [2] Fresh Tea            [5] Payment
                                                                   [3] Smoothie
                                                                   Choose [1 - 3]: """));
        evaluateTrans();
    }

    static void evaluateTrans() {

        do {
            switch (trans) {
                case 1:
                    MilkTea();
                    break;

                case 2:
                    FreshTea();
                    break;

                case 3:
                    Smoothie();
                    break;

                case 4:
                    CheckBalance();
                    break;

                case 5:
                    Payment();
                    break;
                default:
                    throw new AssertionError();
            }

        } while (trans < 5);

    }

    int getCup(int a) {
        return this.Cupchoice = a;
    }

    //MILKTEA METHOD
    static void showMilkTeaMenu() {
        choice = Integer.parseInt(JOptionPane.showInputDialog(null, "MilkTea Menu Choice"
                + "					 \n[1] Winter Melon"
                + "					 \n[2] Oreo Cheesecake"
                + "					 \n[3] Salted Caramel"
                + "\n[4] Return to the Main Menu"
                + "					\nChoose [1-3]:"));
    }

    static void MilkTea() {

        showMilkTeaMenu();

        do {
            switch (choice) {
                case 1:
                    WinterMelon();
                    break;
                case 2:
                    // OREO CHEESECAKE

                    break;
                case 3:
                    // SALTED CARAMEL METHOD
                    SaltedCaramel();
                    break;

                case 4:
                    DisplayMainMenu();
                    break;
                default:

                    break;
            }

        } while (choice <= 4);
    }

    //WINTERMELON
    static void WinterMelon() {

        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Pillar " + 65
                + "\n[2] Classic " + 75
                + "\n[3] Grande Cup " + 85
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));

        evaluateWinterCup();

    }

    static void evaluateWinterCup() {
        int Pillar = 65;
        int Classic = 75;
        int Grande = 85;

        switch (Cupchoice) {
            case 1:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Pillar Cup "
                        + "\nQuantity: "));
                Order = qty * Pillar;
                TotalWinter = Add(TotalWinter, Order);

                System.out.println("TotalWinter " + TotalWinter);
                System.out.println("Order " + Order);

                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Classic Cup "
                        + "\nQuantity: "));
                Order = qty * Classic;
                TotalWinter = Add(TotalWinter, Order);

                System.out.println("TotalWinter " + TotalWinter);
                System.out.println("Order " + Order);
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Grande Cup "
                        + "\nQuantity: "));
                Order = qty * Grande;
                TotalWinter = Add(TotalWinter, Order);
                System.out.println("TotalWinter " + TotalWinter);
                System.out.println("Order " + Order);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "\t \t Returning to MILKTEA Menu", "Return Window", JOptionPane.INFORMATION_MESSAGE);
                showMilkTeaMenu();
                break;

            default:

                throw new AssertionError();
        }

    }

    static void showFreshTeaMenu() {
        choice = Integer.parseInt(JOptionPane.showInputDialog(null, "FRESH Tea Menu Choice"
                + "					 \n[1] Lemon Tea"
                + "					 \n[2] Strawberry Tea"
                + "					 \n[3]  Apple Tea"
                + "\n[4] Return to the Main Menu"
                + "					\nChoose [1-3]:"));
    }

    static void FreshTea() {

        showFreshTeaMenu();

        do {
            switch (choice) {
                case 1:
                    LemonTea();
                    break;
                case 2:
                    SBerryTea();
                    break;
                case 3:
                    AppleTea();
                    break;

                case 4:
                    DisplayMainMenu();
                    break;
                default:

                    break;
            }

        } while (choice <= 4);
    }

    static void LemonTea() {

        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Pillar " + 60
                + "\n[2] Petite " + 70
                + "\n[3] Mega " + 80
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));

        evaluateLemonTeaCup();

    }

    static void evaluateLemonTeaCup() {
        int Petite = 60;
        int Standard = 70;
        int Mega = 80;

        switch (Cupchoice) {
            case 1:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Lemon Tea + Petite Cup "
                        + "\nQuantity: "));
                Order = qty * Petite;
                TotalLemonTea = Add(TotalLemonTea, Order);

                System.out.println("TotalLemon " + TotalLemonTea);
                System.out.println("Order " + Order);

                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Lemon Tea + Standard Cup "
                        + "\nQuantity: "));
                Order = qty * Standard;
                TotalLemonTea = Add(TotalLemonTea, Order);

                System.out.println("TotalLemon " + TotalLemonTea);
                System.out.println("Order " + Order);
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Lemon Tea + Mega Cup "
                        + "\nQuantity: "));
                Order = qty * Mega;
                TotalLemonTea = Add(TotalLemonTea, Order);
                System.out.println("TotalLemon " + TotalLemonTea);
                System.out.println("Order " + Order);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "\t \t Returning to MILKTEA Menu", "Return Window", JOptionPane.INFORMATION_MESSAGE);
                showFreshTeaMenu();
                break;

            default:

                throw new AssertionError();
        }

    }

    //SALTED CARAMEL
    static void SaltedCaramel() {

        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Pillar " + 75
                + "\n[2] Classic " + 85
                + "\n[3] Grande Cup " + 95
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));

        evaluateSaltedCup();

    }

    static void evaluateSaltedCup() {

        int Pillar = 75;
        int Classic = 85;
        int Grande = 95;

        switch (Cupchoice) {
            case 1:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Pillar Cup "
                        + "\nQuantity: "));
                Order = qty * Pillar;
                TotalCaramel = Add(TotalCaramel, Order);

                System.out.println("TotalCaramel " + TotalCaramel);
                System.out.println("Order " + Order);

                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Classic Cup "
                        + "\nQuantity: "));
                Order = qty * Classic;
                TotalCaramel = Add(TotalCaramel, Order);
                System.out.println("TotalCaramel " + TotalCaramel);
                System.out.println("Order " + Order);
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Grande Cup "
                        + "\nQuantity: "));
                Order = qty * Grande;
                TotalCaramel = Add(TotalCaramel, Order);
                System.out.println("TotalCaramel " + TotalCaramel);
                System.out.println("Order " + Order);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "\t \t Returning to MILKTEA Menu", "Return Window", JOptionPane.INFORMATION_MESSAGE);
                showMilkTeaMenu();
                break;

            default:

                throw new AssertionError();
        }

    }

    static void SBerryTea() {

        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Pillar " + 68
                + "\n[2] Petite " + 78
                + "\n[3] Mega " + 88
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));

        evaluateSBerryTeaCup();

    }

    static void evaluateSBerryTeaCup() {
        int Petite = 68;
        int Standard = 78;
        int Mega = 88;

        switch (Cupchoice) {
            case 1:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Strawberry Tea + Petite Cup "
                        + "\nQuantity: "));
                Order = qty * Petite;
                TotalSBerrytea = Add(TotalSBerrytea, Order);

                System.out.println("TotalLemon " + TotalSBerrytea);
                System.out.println("Order " + Order);

                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Strawberry Tea + Standard Cup "
                        + "\nQuantity: "));
                Order = qty * Standard;
                TotalSBerrytea = Add(TotalSBerrytea, Order);

                System.out.println("TotalLemon " + TotalSBerrytea);
                System.out.println("Order " + Order);
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Strawberry Tea + Mega Cup "
                        + "\nQuantity: "));
                Order = qty * Mega;
                TotalSBerrytea = Add(TotalSBerrytea, Order);
                System.out.println("TotalLemon " + TotalSBerrytea);
                System.out.println("Order " + Order);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "\t \t Returning to MILKTEA Menu", "Return Window", JOptionPane.INFORMATION_MESSAGE);
                showFreshTeaMenu();
                break;

            default:

                throw new AssertionError();
        }

    }

    static void AppleTea() {

        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Pillar " + 65
                + "\n[2] Petite " + 75
                + "\n[3] Mega " + 85
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));

        evaluateAppleTeaCup();

    }

    static void evaluateAppleTeaCup() {
        int Petite = 65;
        int Standard = 75;
        int Mega = 85;

        switch (Cupchoice) {
            case 1:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Apple Tea + Petite Cup "
                        + "\nQuantity: "));
                Order = qty * Petite;
                TotalAppleTea = Add(TotalAppleTea, Order);

                System.out.println("TotalLemon " + TotalAppleTea);
                System.out.println("Order " + Order);

                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Apple Tea + Standard Cup "
                        + "\nQuantity: "));
                Order = qty * Standard;
                TotalAppleTea = Add(TotalAppleTea, Order);

                System.out.println("TotalLemon " + TotalAppleTea);
                System.out.println("Order " + Order);
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Apple Tea + Mega Cup "
                        + "\nQuantity: "));
                Order = qty * Mega;
                TotalAppleTea = Add(TotalAppleTea, Order);
                System.out.println("TotalLemon " + TotalAppleTea);
                System.out.println("Order " + Order);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "\t \t Returning to MILKTEA Menu", "Return Window", JOptionPane.INFORMATION_MESSAGE);
                showFreshTeaMenu();
                break;

            default:

                throw new AssertionError();
        }

    }

    static void showSmoothieMenu() {

        choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Smoothie Menu Choice\n"
                + "					 [1] Strawberry\n"
                + "					 [2] Lemon\n"
                + "					 [3] Mango\n"
                + " [4] Return to the Main Menu\n"
                + "					Choose [1-3]:"));
    }

    static void Smoothie() {

        showSmoothieMenu();

        do {
            switch (choice) {

                case 1:
                    Strawberry();
                    break;

                case 2:
                    Lemon();
                    break;

                case 3:
                    Mango();
                    break;

                case 4:
                    DisplayMainMenu();
                    break;
            }

        } while (choice <= 4);

    }

    // STRAWBERRY
    static void Strawberry() {
        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Slim " + 90
                + "\n[2] The Usual " + 110
                + "\n[3] Jumbo " + 130
                + "\n[4] Go Back to Smoothie Menu" + "\n"
                + "Choose [1-3]: "));
        evaluateStrawberryCup();
    }

    static void evaluateStrawberryCup() {
        int Slim = 90;
        int TheUsual = 110;
        int Jumbo = 130;

        switch (Cupchoice) {
            case 1:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Strawberry + Slim "
                        + "\nQuantity: "));
                Order = qty * Slim;
                TotalStrawberry = Add(TotalStrawberry, Order);
                System.out.println("TotalStrawberry " + TotalStrawberry);
                System.out.println("Order " + Order);
                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Strawberry + The Usual "
                        + "\nQuantity: "));
                Order = qty * TheUsual;
                TotalStrawberry = Add(TotalStrawberry, Order);
                System.out.println("TotalStrawberry " + TotalStrawberry);
                System.out.println("Order " + Order);
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Strawberry + Jumbo "
                        + "\nQuantity: "));
                Order = qty * Jumbo;
                TotalStrawberry = Add(TotalStrawberry, Order);
                System.out.println("TotalStrawberry " + TotalStrawberry);
                System.out.println("Order " + Order);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "\t \t Returning to MILKTEA Menu", "Return Window", JOptionPane.INFORMATION_MESSAGE);
                Smoothie();
                break;

            default:

                throw new AssertionError();
        }

    }

    // LEMON
    static void Lemon() {
        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Slim " + 95
                + "\n[2] The Usual " + 115
                + "\n[3] Jumbo " + 135
                + "\n[4] Go Back to Smoothie Menu" + "\n"
                + "Choose [1-3]: "));
        evaluateLemonCup();
    }

    static void evaluateLemonCup() {
        int Slim = 95;
        int TheUsual = 115;
        int Jumbo = 135;

        switch (Cupchoice) {
            case 1:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Lemon + Slim "
                        + "\nQuantity: "));
                Order = qty * Slim;
                TotalLemon = Add(TotalLemon, Order);
                System.out.println("TotalLemon " + TotalLemon);
                System.out.println("Order " + Order);
                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Lemon + The Usual "
                        + "\nQuantity: "));
                Order = qty * TheUsual;
                TotalLemon = Add(TotalLemon, Order);
                System.out.println("TotalLemon " + TotalLemon);
                System.out.println("Order " + Order);
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Lemon + Jumbo "
                        + "\nQuantity: "));
                Order = qty * Jumbo;
                TotalLemon = Add(TotalLemon, Order);
                System.out.println("TotalLemon " + TotalLemon);
                System.out.println("Order " + Order);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "\t \t Returning to SMOOTHIE Menu", "Return Window", JOptionPane.INFORMATION_MESSAGE);
                Smoothie();
                break;

            default:

                throw new AssertionError();
        }

    }

    // MANGO
    static void Mango() {
        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Slim " + 99
                + "\n[2] The Usual " + 119
                + "\n[3] Jumbo " + 139
                + "\n[4] Go Back to Smoothie Menu" + "\n"
                + "Choose [1-3]: "));
        evaluateMangoCup();
    }

    static void evaluateMangoCup() {
        int Slim = 99;
        int TheUsual = 119;
        int Jumbo = 139;

        switch (Cupchoice) {
            case 1:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Mango + Slim "
                        + "\nQuantity: "));
                Order = qty * Slim;
                TotalMango = Add(TotalMango, Order);
                System.out.println("TotalMango " + TotalMango);
                System.out.println("Order " + Order);
                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Mango + The Usual "
                        + "\nQuantity: "));
                Order = qty * TheUsual;
                TotalMango = Add(TotalMango, Order);
                System.out.println("TotalMango " + TotalMango);
                System.out.println("Order " + Order);
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Mango + Jumbo "
                        + "\nQuantity: "));
                Order = qty * Jumbo;
                TotalMango = Add(TotalMango, Order);
                System.out.println("TotalMango " + TotalMango);
                System.out.println("Order " + Order);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "\t \t Returning to SMOOTHIE Menu", "Return Window", JOptionPane.INFORMATION_MESSAGE);
                Smoothie();
                break;

            default:

                throw new AssertionError();
        }

    }

    static int Add(int a, int b) {
        return a + b;
    }

    static int Add(int a, int b, int c) {
        return a + b + c;
    }

    // CHECK BALANCE
    static void CheckBalance() {

        TotalMilkTea = Add(TotalOreo, TotalCaramel, TotalWinter);

        System.out.println("THE TotalMilkTea IS  = " + TotalMilkTea);

        TotalSmoothie = Add(TotalStrawberry, TotalCaramel, TotalOreo);

        System.out.println("THE TotalOreo  = " + TotalOreo);

        TotalFreshTea = Add(TotalLemonTea, TotalSBerrytea, TotalAppleTea);

        System.out.println("THE TotalFreshTea IS  = " + TotalFreshTea);

        OverAllCost = Add(TotalSmoothie, TotalMilkTea, TotalFreshTea);

        System.out.println("THE OVER ALL COMPUTATION IS  = " + OverAllCost);

        JOptionPane.showMessageDialog(null, "\t \t YOUR CURRENT BALANCE IS " + OverAllCost, "Return Window", JOptionPane.INFORMATION_MESSAGE);
        DisplayMainMenu();

    }

    // PAYMENT
    static void Payment() {

        if (OverAllCost == 0) {
            JOptionPane.showMessageDialog(null,
                    "You don't have current balance. Please return to the Main Menu"
            );
            DisplayMainMenu();
        } else {
            payment = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your Payment: "));
            pay();
            exit();
        }
    }

    static void pay() {

        diff = payment - OverAllCost;

        if (payment < OverAllCost) {
            JOptionPane.showMessageDialog(null,
                    "Insuffienct Funds"
            );
            Payment();
        } else {
            JOptionPane.showMessageDialog(null,
                    "Your total cost: " + OverAllCost
                    + "\nChange: " + diff
            );
        }
    }

    static void exit() {

        JOptionPane.showMessageDialog(null,
                "Thank you for choosing Sip n' Tea! \n"
                + "             Come Again! ('-')/"
        );
        System.exit(0);
    }

    public static void main(String args[]) {
        DisplayMainMenu();
    }

}
/*
    static int TotalFreshTea;
    static  int TotalLemonTea;
    static  int TotalSBerrytea;
    static  int TotalAppleTea; */
