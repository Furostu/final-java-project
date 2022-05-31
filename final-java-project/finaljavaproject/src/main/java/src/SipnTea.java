package src;

import javax.swing.JOptionPane;

public class SipnTea {

    //MENU TRANSACTION
    static int trans;
    static int pay;
    //PRODUCT CHOICE
    static int choice;
    //CupChoice;
    private static int Cupchoice;

    //Quantity
    static int qty;

    static String ReceiptText = "";
    //OrderCost
    static int Order;
    //TOTAL COSTING
    static int OverAllCost;

    // MILKTEA
    static int TotalMilkTea;
    static int TotalWinter;
    static int TotalOreo;
    static int TotalCaramel;

    //FRUITTEA
    static int TotalFreshTea;
    static int TotalLemonTea;
    static int TotalStrawberryTea;
    static int TotalAppleTea;

    //SMOOTHIE    
    static int TotalSmoothie;
    static int TotalStrawberry;
    static int TotalLemon;
    static int TotalMango;

    static int[] ItemPurchased = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static int[] ItemPrice = {65, 75, 85, 79, 89, 99, 75, 85, 95, 60, 70, 80, 68, 78, 88, 65, 75, 85, 90, 110, 130, 95, 115, 135, 99, 119, 139};
    static String[] ItemName = {"Wintermelon - Pillar Cup", "Wintermelon - Classic Cup", "Wintermelon - Grande Cup", "Oreo Cheesecake - Pillar Cup",
        "Oreo Cheesecake - Classic Cup", "Oreo Cheesecake - Grande Cup", "Salted Caramel - Pillar Cup", "Salted Caramel - Classic Cup", "Salted Caramel - Grande Cup",
        "Lemon Tea - Petite", "Lemon Tea - Standard", "Lemon Tea - Mega", "Strawberry Tea - Petite", "Strawberry Tea - Standard", "Strawberry Tea - Mega", "Apple Tea - Petite",
        "Apple Tea - Standard", "Apple Tea - Mega", "Strawberry-Banana - Slim", "Strawberry-Banana - The Usual", "Strawberry-Banana - Jumbo", "Lemon-Blueberry - Slim", "Lemon-Blueberry - The Usual",
        "Lemon-Blueberry - Jumbo", "Mango-Pineapple - Slim", "Mango-Pineapple - The Usual", "Mango-Pineapple - Jumbo"};

    static void Receipt() {
        for (int x = 0; x <= 26; x++) {
            if (ItemPurchased[x] != 0) {
                ReceiptText += ItemName[x] + " - " + ItemPurchased[x] + " - " + (ItemPrice[x] * ItemPurchased[x]) + "\n";
            }
        }
    }

    static void DisplayMainMenu() {
        trans = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                   \tMenu Choices 
                                                                   [1] MilkTea              [4] Check Balance
                                                                   [2] Fresh Tea         [5] Payment
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
                    OreoCheeseCake();
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

    static void WinterMelon() {

        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Pillar " + 65
                + "\n[2] Classic " + 75
                + "\n[3] Grande Cup " + 85
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));

        evaluateWinterCup();

    }

    static void OreoCheeseCake() {

        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Pillar " + 79
                + "\n[2] Classic " + 89
                + "\n[3] Grande Cup " + 99
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));

        evaluateOreoCup();

    }

    static void SaltedCaramel() {

        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Pillar " + 75
                + "\n[2] Classic " + 85
                + "\n[3] Grande Cup " + 95
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));

        evaluateSaltedCup();

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
                ItemPurchased[0] += qty;
                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Classic Cup "
                        + "\nQuantity: "));
                Order = qty * Classic;
                TotalWinter = Add(TotalWinter, Order);

                System.out.println("TotalWinter " + TotalWinter);
                System.out.println("Order " + Order);
                ItemPurchased[1] += qty;
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Grande Cup "
                        + "\nQuantity: "));
                Order = qty * Grande;
                TotalWinter = Add(TotalWinter, Order);
                System.out.println("TotalWinter " + TotalWinter);
                System.out.println("Order " + Order);
                ItemPurchased[2] += qty;
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "\t \t Returning to MILKTEA Menu", "Return Window", JOptionPane.INFORMATION_MESSAGE);
                showMilkTeaMenu();
                break;

            default:

                throw new AssertionError();
        }

    }

    static void evaluateOreoCup() {

        int Pillar = 79;
        int Classic = 89;
        int Grande = 99;

        switch (Cupchoice) {
            case 1:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Oreo Cheesecake + Pillar Cup "
                        + "\nQuantity: "));
                Order = qty * Pillar;
                TotalOreo = Add(TotalOreo, Order);

                System.out.println("TotalOreo " + TotalOreo);
                System.out.println("Order " + Order);
                ItemPurchased[3] += qty;
                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Classic Cup "
                        + "\nQuantity: "));
                Order = qty * Classic;
                TotalOreo = Add(TotalOreo, Order);

                System.out.println("TotalOreo " + TotalOreo);
                System.out.println("Order " + Order);
                ItemPurchased[4] += qty;
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Oreo Cheesecake + Grande Cup "
                        + "\nQuantity: "));
                Order = qty * Grande;
                TotalOreo = Add(TotalOreo, Order);
                System.out.println("TotalOreo " + TotalOreo);
                System.out.println("Order " + Order);
                ItemPurchased[5] += qty;
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "\t \t Returning to MILKTEA Menu", "Return Window", JOptionPane.INFORMATION_MESSAGE);
                showMilkTeaMenu();
                break;

            default:

                throw new AssertionError();
        }

    }

    static void evaluateSaltedCup() {

        int Pillar = 75;
        int Classic = 85;
        int Grande = 95;

        switch (Cupchoice) {
            case 1:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Salted Caramel + Pillar Cup "
                        + "\nQuantity: "));
                Order = qty * Pillar;
                TotalCaramel = Add(TotalCaramel, Order);

                System.out.println("TotalCaramel " + TotalCaramel);
                System.out.println("Order " + Order);
                ItemPurchased[6] += qty;
                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Salted Caramel + Classic Cup "
                        + "\nQuantity: "));
                Order = qty * Classic;
                TotalCaramel = Add(TotalCaramel, Order);
                System.out.println("TotalCaramel " + TotalCaramel);
                System.out.println("Order " + Order);
                ItemPurchased[7] += qty;
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Salted Caramel + Grande Cup "
                        + "\nQuantity: "));
                Order = qty * Grande;
                TotalCaramel = Add(TotalCaramel, Order);
                System.out.println("TotalCaramel " + TotalCaramel);
                System.out.println("Order " + Order);
                ItemPurchased[8] += qty;
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

        choice = Integer.parseInt(JOptionPane.showInputDialog(null, "FreshTea Menu Choice"
                + "					 \n[1] Lemon Tea"
                + "					 \n[2] Strawberry Tea"
                + "					 \n[3] Apple Tea\n"
                + "[4] Return to the Main Menu\n"
                + "					Choose [1-3]:"));
    }

    static void FreshTea() {
        showFreshTeaMenu();

        do {
            switch (choice) {

                case 1:
                    LemonTea();
                    break;

                case 2:
                    StrawberryTea();
                    break;

                case 3:
                    AppleTea();
                    break;

                case 4:
                    DisplayMainMenu();
                    break;
            }

        } while (choice <= 4);

    }

    //FreshTea Flavor Menu
    static void LemonTea() {
        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Petite " + 60
                + "\n[2] Standard " + 70
                + "\n[3] Mega " + 80
                + "\n[4] Go Back to Fresh Tea Menu" + "\n"
                + "Choose [1-3]: "));
        evaluateLemonTea();
    }

    static void StrawberryTea() {
        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Petite " + 68
                + "\n[2] Standard " + 78
                + "\n[3] Mega " + 88
                + "\n[4] Go Back to Fresh Tea Menu" + "\n"
                + "Choose [1-3]: "));
        evaluateStrawberryTea();
    }

    static void AppleTea() {
        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Petite " + 65
                + "\n[2] Standard " + 75
                + "\n[3] Mega " + 85
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));
        evaluateAppleTea();
    }

//Evaluate FreshTea Flavor Menu
    static void evaluateLemonTea() {
        int Petite = 60;
        int Standard = 70;
        int Mega = 80;

        switch (Cupchoice) {
            case 1:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Lemon Tea + Petite "
                        + "\nQuantity: "));
                Order = qty * Petite;
                TotalLemonTea = Add(TotalLemonTea, Order);
                System.out.println("TotalLemonTea " + TotalLemonTea);
                System.out.println("Order " + Order);
                ItemPurchased[9] += qty;
                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Lemon Tea + Standard "
                        + "\nQuantity: "));
                Order = qty * Standard;
                TotalLemonTea = Add(TotalLemonTea, Order);
                System.out.println("TotalLemonTea " + TotalLemonTea);
                ItemPurchased[10] += qty;
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Lemon Tea + Mega "
                        + "\nQuantity: "));
                Order = qty * Mega;
                TotalLemonTea = Add(TotalLemonTea, Order);
                System.out.println("TotalLemonTea " + TotalLemonTea);
                ItemPurchased[11] += qty;
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "\t \t Returning to FRESHTEA Menu", "Return Window", JOptionPane.INFORMATION_MESSAGE);
                FreshTea();
                break;

            default:

                throw new AssertionError();
        }

    }

    static void evaluateStrawberryTea() {
        int Petite = 68;
        int Standard = 78;
        int Mega = 88;

        switch (Cupchoice) {
            case 1:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Strawberry Tea + Petite "
                        + "\nQuantity: "));
                Order = qty * Petite;
                TotalStrawberryTea = Add(TotalStrawberryTea, Order);
                System.out.println("TotalStrawberryTea " + TotalStrawberryTea);
                System.out.println("Order " + Order);
                ItemPurchased[12] += qty;
                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Strawberry Tea + Standard "
                        + "\nQuantity: "));
                Order = qty * Standard;
                TotalStrawberryTea = Add(TotalStrawberryTea, Order);
                System.out.println("TotalStrawberryTea " + TotalStrawberryTea);
                ItemPurchased[13] += qty;
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Strawberry Tea + Mega "
                        + "\nQuantity: "));
                Order = qty * Mega;
                TotalStrawberryTea = Add(TotalStrawberryTea, Order);
                System.out.println("TotalStrawberryTea " + TotalStrawberryTea);
                ItemPurchased[14] += qty;
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "\t \t Returning to FRESHTEA Menu", "Return Window", JOptionPane.INFORMATION_MESSAGE);
                FreshTea();
                break;

            default:

                throw new AssertionError();
        }

    }

    static void evaluateAppleTea() {
        int Petite = 65;
        int Standard = 75;
        int Mega = 85;

        switch (Cupchoice) {
            case 1:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Apple Tea + Petite "
                        + "\nQuantity: "));
                Order = qty * Petite;
                TotalAppleTea = Add(TotalAppleTea, Order);
                System.out.println("TotalAppleTea " + TotalAppleTea);
                System.out.println("Order " + Order);
                ItemPurchased[15] += qty;
                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Apple Tea + Standard "
                        + "\nQuantity: "));
                Order = qty * Standard;
                TotalAppleTea = Add(TotalAppleTea, Order);
                System.out.println("TotalAppleTea " + TotalAppleTea);
                ItemPurchased[16] += qty;
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Apple Tea + Mega "
                        + "\nQuantity: "));
                Order = qty * Mega;
                TotalAppleTea = Add(TotalAppleTea, Order);
                System.out.println("TotalAppleTea " + TotalAppleTea);
                ItemPurchased[17] += qty;
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "\t \t Returning to FRESHTEA Menu", "Return Window", JOptionPane.INFORMATION_MESSAGE);
                FreshTea();
                break;

            default:

                throw new AssertionError();
        }

    }

// SMOOTHIE METHOD
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
//Smoothie Flavor Menu

    static void Strawberry() {
        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Slim " + 90
                + "\n[2] The Usual " + 110
                + "\n[3] Jumbo " + 130
                + "\n[4] Go Back to Smoothie Menu" + "\n"
                + "Choose [1-3]: "));
        evaluateStrawberryCup();
    }

    static void Lemon() {
        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Slim " + 95
                + "\n[2] The Usual " + 115
                + "\n[3] Jumbo " + 135
                + "\n[4] Go Back to Smoothie Menu" + "\n"
                + "Choose [1-3]: "));
        evaluateLemonCup();
    }

    static void Mango() {
        Cupchoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Slim " + 99
                + "\n[2] The Usual " + 119
                + "\n[3] Jumbo " + 139
                + "\n[4] Go Back to Smoothie Menu" + "\n"
                + "Choose [1-3]: "));
        evaluateMangoCup();
    }

    //Evaluate Smoothie Flavor Menu
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
                ItemPurchased[18] += qty;
                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Strawberry + The Usual "
                        + "\nQuantity: "));
                Order = qty * TheUsual;
                TotalStrawberry = Add(TotalStrawberry, Order);
                System.out.println("TotalStrawberry " + TotalStrawberry);
                ItemPurchased[19] += qty;
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Strawberry + Jumbo "
                        + "\nQuantity: "));
                Order = qty * Jumbo;
                TotalStrawberry = Add(TotalStrawberry, Order);
                System.out.println("TotalStrawberry " + TotalStrawberry);
                ItemPurchased[20] += qty;
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "\t \t Returning to MILKTEA Menu", "Return Window", JOptionPane.INFORMATION_MESSAGE);
                Smoothie();
                break;

            default:

                throw new AssertionError();
        }

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
                ItemPurchased[21] += qty;
                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Lemon + The Usual "
                        + "\nQuantity: "));
                Order = qty * TheUsual;
                TotalLemon = Add(TotalLemon, Order);
                System.out.println("TotalLemon " + TotalLemon);
                ItemPurchased[22] += qty;
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Lemon + Jumbo "
                        + "\nQuantity: "));
                Order = qty * Jumbo;
                TotalLemon = Add(TotalLemon, Order);
                System.out.println("TotalLemon " + TotalLemon);
                ItemPurchased[23] += qty;
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "\t \t Returning to SMOOTHIE Menu", "Return Window", JOptionPane.INFORMATION_MESSAGE);
                Smoothie();
                break;

            default:

                throw new AssertionError();
        }

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
                ItemPurchased[24] += qty;
                break;

            case 2:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Mango + The Usual "
                        + "\nQuantity: "));
                Order = qty * TheUsual;
                TotalMango = Add(TotalMango, Order);
                System.out.println("TotalMango " + TotalMango);
                ItemPurchased[25] += qty;
                break;

            case 3:
                qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Mango + Jumbo "
                        + "\nQuantity: "));
                Order = qty * Jumbo;
                TotalMango = Add(TotalMango, Order);
                System.out.println("TotalMango " + TotalMango);
                ItemPurchased[26] += qty;
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

    static void CheckBalance() {

        TotalMilkTea = Add(TotalOreo, TotalCaramel, TotalWinter);
        System.out.println("THE TotalMilkTea IS  = " + TotalMilkTea);

        TotalFreshTea = Add(TotalLemonTea, TotalStrawberryTea, TotalAppleTea);
        System.out.println("THE TotalFreshTea IS  = " + TotalFreshTea);

        TotalSmoothie = Add(TotalStrawberry, TotalLemon, TotalMango);
        System.out.println("THE TotalSmoothie IS  = " + TotalSmoothie);

        OverAllCost = Add(TotalSmoothie, TotalMilkTea, TotalFreshTea);

        System.out.println("THE OVER ALL COMPUTATION IS  = " + OverAllCost);

        JOptionPane.showMessageDialog(null, "\t \t YOUR CURRENT BALANCE IS " + OverAllCost, "Return Window", JOptionPane.INFORMATION_MESSAGE);
        DisplayMainMenu();
    }

    static void Payment() {
        Receipt();
        pay = Integer.parseInt(JOptionPane.showInputDialog(null, "Your Payment: "));

        if (trans != 4) {
            TotalMilkTea = Add(TotalOreo, TotalCaramel, TotalWinter);
            System.out.println("THE TotalMilkTea IS  = " + TotalMilkTea);

            TotalFreshTea = Add(TotalLemonTea, TotalStrawberryTea, TotalAppleTea);
            System.out.println("THE TotalFreshTea IS  = " + TotalFreshTea);

            TotalSmoothie = Add(TotalStrawberry, TotalLemon, TotalMango);
            System.out.println("THE TotalSmoothie IS  = " + TotalSmoothie);

            OverAllCost = Add(TotalSmoothie, TotalMilkTea, TotalFreshTea);
            System.out.println("THE OVER ALL COMPUTATION IS  = " + OverAllCost);
        }
        System.out.print(ReceiptText);
        if (OverAllCost <= pay) {

            JOptionPane.showMessageDialog(null,
                    "========RECEIPT==========\n"
                    + ReceiptText
                    + "\n"
                    + "\n"
                    + "========================="
                    + "\nTotal .........." + OverAllCost
                    + "\nPayment .........." + pay
                    + "\nChange .........." + (pay - OverAllCost));
            exit();
        } else {
            JOptionPane.showMessageDialog(null, "\t \t INSUFFICIENT PAYMENT\n"
                    + "\n \t YOUR OVERALL PRICE IS " + OverAllCost, "Return Window", JOptionPane.WARNING_MESSAGE);
            Payment();
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

        new SipnTea().DisplayMainMenu();
    }
}
