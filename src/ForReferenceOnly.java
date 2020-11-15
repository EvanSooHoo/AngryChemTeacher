import java.util.Scanner;

public class AyNakoConsole {

    public static void mainMethodSub() {

        boolean bonus = true;

        boolean bonus1 = false;

        int loop = 0;

        while (loop == 0) {

            System.out

                    .println("\nWelcome to Ay Nako! (Type C to continue, or hit enter to skip ahead )");

            Scanner firstComx = new Scanner(System.in);

            String com1 = firstComx.nextLine();

            com1 = com1.trim();

            com1 = com1.toLowerCase();

            com1 = com1.replaceAll(" ", "");

            if (com1.equals("c") || com1.equals("continue")) {

                System.out.println("First, a brief explanation:  ");

                System.out

                        .println("\n-This program will throw you random chemistry questions");

                System.out

                        .println("\n-The program is designed to adapt depending on what answers are given");

                System.out

                        .println("\n-Most questions expect a specific answer, like a number, letter, word or phrase");

                System.out

                        .println(
                                "\n-If you have something like 3 O2 (In writing, the 2 is written below the O), 3 is a coefficient and 2 is a subscript");

                System.out

                        .println(
                                "\n-To balance chemical equations, simply write the coefficients.  For example, the program may expect the line 2 3 1");

                System.out

                        .println(
                                "\n-For short answer questions, just write whatever comes to mind.  The program will look for key words");

                continueCom();

                Scanner sc1 = new Scanner(System.in);

                System.out

                        .println("What's that person's name, again? \n\n\nENTER NAME:");

                String name = sc1.nextLine();

                name = formatBetter(name);

                String loudName = name.toUpperCase();

                if (name.equals("kai")) {

                    System.out

                            .println("KAI?!  GET OUT OF MY CLASS.  Just kidding.  You're a very good student.");

                }

                if (name.equals("zaid")) {

                    System.out.println("Zaid?  Rock on.");

                }

                if (name.equals("15/25")) {

                    bonus1 = true;

                    System.out.println("Bonus activated");

                }

                String firstGrade = "";

                if (name.equals("david") || name.equals("jon")

                        || name.equals("kai")) {

                    firstGrade = "A";

                } else if (name.equals("stanley")) {

                    firstGrade = "A+";

                } else {

                    firstGrade = "B+";

                }

                System.out

                        .println("\n"

                                + loudName

                                + ", COME TO THE BOARD.\n\nPROVE THAT YOU DESERVE YOUR "

                                + firstGrade);

                System.out.println("Fe + Cl2 ---> FeCl3");

                System.out.println("(Balance this chemical equation):");

                Scanner help = new Scanner(System.in);

                String firstCom = help.nextLine();

                firstCom = firstCom.toLowerCase();

                firstCom = firstCom.replaceAll(" ", "");

                firstCom = firstCom.trim();

                firstCom = firstCom.replaceAll(",", "");

                firstCom = firstCom.replaceAll(">", "");

                // System.out.println("Test value is " + firstCom);

                if (firstCom.equals("232")

                        || firstCom.equals("2fe+3cl2---2fecl3")) {

                    loop++;

                    System.out.println("IS THAT THE ANSWER, CLASS?");

                    System.out.println("YES");

                    System.out

                            .println("Yes, 2 Fe + 3 Cl2 yields 2 FeCl3.  Have a seat.");

                    System.out

                            .println("Congratulations, you have passed round 1.");

                } else {

                    loop++;

                    System.out.println("AY NAKO");

                    System.out

                            .println(
                                    "\nFor a helpful tutorial on balancing chemical equations, see http://www.youtube.com/watch?v=RnGu3xO2h74");

                }

                continueCom();

                Scanner doNow = new Scanner(System.in);

                System.out.println("DO NOW");

                System.out

                        .println(
                                "This is a short answer question.  \nYou are to write everything you know about the atom.\n\nWhat is it made of?  \nWhat is its significance?\n\nYou will be given a score out of 100 based on your short answer response:");

                String dn = doNow.nextLine();

                dn = dn.toLowerCase();

                dn = dn.trim();

                int score = 0;

                String reason = "";

                if (dn.length() >= 1) {

                    score += 50;

                } else {

                    reason += "\nYou wrote nothing";

                }

                if (dn.indexOf("neutron") != -1 && dn.indexOf("proton") != -1

                        && dn.indexOf("electron") != -1) {

                    score += 40;

                } else {

                    reason += "\n-You did not mention ALL THREE sub-atomic particles";

                }

                if ((dn.indexOf("building") != -1)

                        || (dn.indexOf("block") != -1 || dn.indexOf("make") != -1)

                        || (dn.indexOf("fundamental") != -1)

                        || (dn.indexOf("important") != -1)) {

                    score += 10;

                } else {

                    reason += "\n-You did not say it's the building block of all things";

                }

                System.out.println("\nYour do now score is " + score);

                if (score != 100) {

                    bonus = false;

                    System.out.println("The reason you didn't get 100 is: "

                            + reason);

                }

                continueCom();

                System.out.println("All right class, time for your lesson.");

                System.out.println("Lesson 1:  Introduction to chemistry");

                if (readOn() == true) {

                    System.out

                            .println(
                                    "-Just for the hell of it, I'll spend a day discussing the scientific method and another day discussing how CFC damaged the ozone.");

                    System.out

                            .println(
                                    "\n\n-Chemistry, by defintion, is the study of matter and the changes that it undergoes.");

                    System.out

                            .println(
                                    "\n-In this class, you will learn a variety of subjects.  Unifying concepts will continually repeat.");

                    System.out

                            .println(
                                    "For example, you will continually use the concept of Conservation of Mass.  It will help you balance out chemical equations, for example.");

                    System.out

                            .println(
                                    "\nYou really should read the book, but below are a few concepts that will come up again and again in this course.");

                    System.out

                            .println(
                                    "\n-Quantiative data is data that consists of numerical information.  Qualatative data is based simply on observations.");

                    System.out

                            .println("\n-Percent error is the amount error divided by the accepted value");

                    System.out

                            .println("\n-In this class, you will frequently use scientific notation and SI units.");

                    System.out

                            .println(
                                    "\n-When you round, you keep the same number of SIGNIFICANT FIGURES.  For info on significant figures, go to page 39 in your chemistry textbook."

                                            + "");

                    System.out

                            .println(
                                    "\n-The Law of Conservation of Mass is the most important rule in chemistry.  Mass is neither created nor destroyed in a chemical reaction");

                    System.out

                            .println(
                                    "\n-Matter is affected by physical and chemical changes.  A chmical change actually changes a substance's composition");

                    System.out

                            .println(
                                    "\n-A substance is a form of matter with a uniform and unchanging composition.  A mixture is a blend of two or more pure substances");

                    System.out

                            .println(
                                    "Homogenous mixtures have a constant composition throughout.  In heterogeneous mixtures, individual substances remain distinct");

                    System.out

                            .println("\n-Solutions are mixtures.  Mixtures can be separated by physical means");

                    System.out

                            .println(
                                    "Matter is either a mixture or a substance.  A substance is either an element or a compound.");

                    System.out

                            .println("\n-ELEMENTS are substances that CANNOT BE BROKEN DOWN into simpler substances");

                    System.out

                            .println("\n-(Aside) When doing labs, do not fuck around");

                    // continueCom();

                    System.out

                            .println(
                                    "\nThe first math concept you'll come across in this course is conversion.  It's an extremely straight-forward concept");

                    System.out

                            .println(
                                    "\nSay you want to convert 50 centimeters into meters.  Take the given and multiply it by a conversion factor.");

                    System.out

                            .println(
                                    "For example, in this case, you take 50 centimeters, and multiply it by 1  METER OVER 100 CENTIMETERS.");

                    System.out

                            .println("The fraction, or conversion factor, is equal to one.");

                    System.out

                            .println(
                                    "\nYou probably could have done this calcultaion mentally, but using DIMENSIONAL ANALYSIS, the method involving the fraction, will prove useful in more complicated chemistry equations.");

                }

                continueCom();

                System.out

                        .println("\nThat's all for day one.  Below are a few last tips in the introduction");

                System.out

                        .println(
                                "\n-Unless you really want to, don't bring the chemistry book back and fourth.  It's online, and a PDF version is downloadable.");

                System.out

                        .println(
                                "\n-Of all the resources out there, one of the most valuable is Khan Academy.  He can be found on Youtube");

                System.out

                        .println("\n-Some homework solutions are available on a site called whitechemistry.net");

                System.out

                        .println("\n-When you're really stuck, don't be afraid to Google for help.");

                // System.out.println("\n-That's all for part 1.");

            }

            System.out.println("\n\nWelcome to your second day.");

            loop++;

            continueCom();

            System.out

                    .println("By now, you may have noted the following about Sunga:");

            continueCom();

            System.out

                    .println(
                            "\n-Grades are curved, which is always beneficial.  Tests are curved a little, and everything else is curved even more");

            System.out

                    .println(
                            "\n-You'll waste a lot of time copying down lab procedures.  This doesn't require any thinking, at least.");

            System.out

                    .println("\n-Sunga doesn't like getting questions, for the most part.");

            System.out

                    .println("\n-You may find you'll learn more by reading the book than by listening to Sunga");

            System.out

                    .println("\n-If you can, read your chemistry book one section ahead of the class.");

            continueCom();

            int score2 = 0;

            String reason2 = "";

            System.out.println("DO YOUR DO NOW");

            // continueCom();

            System.out

                    .println("Question 1:  How many significant figures does 4320 have?"); // 3,

            // 6.20

            // also

            // has

            // 3

            Scanner dN1 = new Scanner(System.in);

            String doNow1 = dN1.nextLine();

            doNow1 = doNow1.trim();

            doNow1 = doNow1.replaceAll(" ", "");

            if (doNow1.equals("3") || doNow1.equals("three")) {

                score2 += 25;

            } else {

                reason2 += "\n-Answer 1 was wrong";

            }

            System.out

                    .println("Question 2:  How many significant figures does 6.20 have?");

            Scanner dN2 = new Scanner(System.in);

            String doNow2 = dN2.nextLine();

            doNow2 = doNow2.trim();

            doNow2 = doNow2.replaceAll(" ", "");

            if (doNow2.equals("3") || doNow2.equals("three")) {

                score2 += 25;

            } else {

                reason2 += "\n-Answer 2 was wrong";

            }

            System.out

                    .println("Question 3:  How many centimeters are in 6.2 meters?");

            Scanner dN3 = new Scanner(System.in);

            String doNow3 = dN3.nextLine();

            doNow3 = doNow3.trim();

            doNow3 = doNow3.replaceAll(" ", "");

            if (doNow3.equals("6200") || doNow3.equals("6200 centimeters")) {

                score2 += 50;

            } else {

                reason2 += "\n-Answer 3 was wrong";

            }

            System.out.println("Your score is " + curve(score2));

            if (score2 != 100) {

                bonus = false;

                System.out.println(reason2);

            }

            continueCom();

            System.out

                    .println("Random guy 1:  Ms. Sunga, doesn't 4320 have four significant figures?");

            System.out.println("No, because this is for ROUNDING.  AY NAKO.");

            continueCom();

            System.out

                    .println("Random guy 2:  But that doesn't make any sense. ");

            System.out

                    .println("When rounding, you have to keep the SAME NUMBER OF SIGNIFAICNT FIGURES.  Ay Nako.");

            System.out

                    .println("\n(This is one of those things you just have to get used to)");

            continueCom();

            System.out.println("Quiet, class, time for your lesson.");

            System.out.println("Lesson 2:  The periodic table");

            if (readOn() == true) {

                System.out

                        .println("\n-The atom is the building block of all matter.");

                System.out

                        .println("\n-Atoms are made of protons, neutrons, and electrons.");

                System.out

                        .println(
                                "\n-Protons have a positive charge, neutrons have no charge and electrons have a negative charge");

                System.out

                        .println("\n-Much of an atom's mass is in its nucleus.  The nucleus has protons and neutrons");

                System.out.println("\n-Atoms are mostly made of empty space.");

                System.out

                        .println(
                                "\n-Electrons travel around the nucleus, but not in the way planets revolve around the sun.  There's a probability function.  They're more likely to be at certain places than at others.");

                System.out

                        .println("\n-There's some history to the discovery of atomic structure.  Yeah.");

                System.out

                        .println(
                                "\n-The number of protons (and electrons) is the atomic number.  Atomic mass is...the mass of an atom.");

                System.out

                        .println(
                                "\n-Atoms consist of separate orbitals and levels.  The main thing to take from this is that atoms have a certain number of valence electrons.");

                System.out

                        .println(
                                "\n-Valence electrons are the electrons on an atom's outermost layer.  The determine properties when atoms bond.");

                continueCom();

                System.out

                        .println("\n-The periodic table arranges elements based on atomic number.");

                System.out.println("\n-Each row is a period.");

                System.out

                        .println("\n-Each column is a family.  Families have similar properties.");

                System.out

                        .println(
                                "\n-Look at the period table.  It's divided into four blocks.  The f-block is broken off.  The other three are the s, d, and p blocks");

                System.out

                        .println("\n-The D-block is columns 3-14.  See how it looks like a separate part?");

                System.out

                        .println("\n-The S-block is on the left.  The P-block is on the right.");

                System.out

                        .println("(Once you're allowed to use the periodic table, electron configurations are easy.)");

                System.out

                        .println(
                                "\n-The periodic table is easily the most useful tool you'll use in chemistry.  The atomic numbers, masses, and placement on the table are all vital.");

                continueCom();

                System.out

                        .println(
                                "On the very right of the P-block are noble gases.  They have 8 valence electrons and are extremely stable. This is the rule of eight.");

                System.out

                        .println(
                                "Look at any box.  You'll notice it has the element's name, atomic number, atomic mass, and places the element in a special place.");

                System.out

                        .println(
                                "There are trends in the periodic table.  For example, as you electronegativity, the ability of an atom to attract electrons, generally increases as you move right on the table.");

                continueCom();

                System.out

                        .println("All right, let's do a brief demonstration.  Look at Argon on the periodic table.");

                continueCom();

                System.out

                        .println("Here are things you can figure out from the table alone:");

                System.out.println("\n-Argon is a noble gas.");

                System.out

                        .println("\n-Argon has atomic number 18.  Therefore, argon has 18 electrons and 18 protons.");

                System.out

                        .println("\n-Argon has a lot in common with other noble gases, like neon.");

                System.out.println("\n-Argon has no valence electrons.");

                System.out.println("\n-Argon has an atomic mass of 39.95 AMU");

                System.out.println("\n\nThat's all for day 2.");

            }

            System.out.println("Day 3:  Do your do now:");

            int score3 = 0;

            String reason3 = "";

            System.out.println("Question 1:  What is oxygen's atomic number?");

            Scanner xx1 = new Scanner(System.in);

            String xx2 = xx1.nextLine();

            xx2 = formatBetter(xx2);

            if (xx2.equals("8") || xx2.equals("eight")) {

                score3 += 25;

            } else {

                reason3 += "\n-Number 1 was wrong";

            }

            System.out

                    .println("Question 2:  What is oxygen's atomic mass, as a whole number?");

            Scanner xxx2 = new Scanner(System.in);

            String xxx3 = xxx2.nextLine();

            xxx3 = formatBetter(xxx3);

            if (xxx3.equals("16") || xxx3.equals("sixteen")) {

                score3 += 25;

            } else {

                reason3 += "\n-Number 2 was wrong";

            }

            System.out

                    .println("Question 3:  How many valence electrons does neon have?");

            Scanner neon = new Scanner(System.in);

            String neon1 = neon.nextLine();

            neon1 = formatBetter(neon1);

            if (neon1.equals("8") || neon1.equals("eight")) {

                score3 += 25;

            } else {

                reason3 += "\n-Number 3 was wrong";

            }

            System.out

                    .println("Question 4:  Which block, s, p, d, or f, is cobalt located in?");

            Scanner d = new Scanner(System.in);

            String d1 = d.nextLine();

            d1 = formatBetter(d1);

            if (d1.equals("d")) {

                score3 += 25;

            } else {

                reason3 += "\n-Answer 4 was wrong";

            }

            if (score3 != 100) {

                bonus = false;

            }

            System.out.println("Your score is " + curve(score3) + reason3);

            System.out.println("Day 3:  Chemical bonds");

            if (readOn() == true) {

                System.out

                        .println("\n-Chemical bonds allow thousands of compounds to form.");

                System.out

                        .println("\n-An ion is an atom or molecule with a net charge.");

                System.out

                        .println(
                                "\n-Noble gases have eight valence electrons, which is stable.  Other elements seek this stability.");

                System.out

                        .println(
                                "\n-Consider the creation of NaCl, which is an ionic compound better known as table salt.  Na has one valence electron and Cl has 7.  In\nthis ionic compound, the Na (or sodium) atom loses an electron and, by giving up its \nnegative electron, becomes a positive ion.  The Cl atom takes the valence electron and becomes a \nnegative ion.  Both atoms gain a stable electron configuration.");

                System.out

                        .println(
                                "\n-A monatomic (one-atom) ion has an oxidation number.  An oxidation number is how many");

                System.out

                        .println(
                                "electrons are transferred from an atom to form an ion.  For example, in NaCl, Na has an oxidation");

                System.out

                        .println(
                                "number of 1+ because it loses one electron and becomes positive.  Cl has an oxidation number");

                System.out

                        .println("of 1- because it gains one electron and becomes negative.");

                System.out

                        .println(
                                "\n-Say you want to determine the formula of an ionic compound, like aluminum sulfide.  You");

                System.out

                        .println(
                                "know that aluminum is Al and sulfur is s.  Al has an oxidation number of 3+ and sulfur");

                System.out

                        .println(
                                "has an oxidation number of 2-.  The overall charge must be 0, so we use something I call the");

                System.out

                        .println(
                                "criss-cross method.  Basically, you write in subscripts and then multiply diagonally to");

                System.out

                        .println(
                                "see if the overall charge is 0.  The correct formula is Al2S3 (2 and 3 are subscripts).");

                System.out

                        .println("Note that the positive ion is written before the negative ion.");

                System.out

                        .println(
                                "\n-You can use the periodic table to help you find oxidation numbers.  How did we know Aluminum");

                System.out

                        .println(
                                "had an oxidation number of 3+?  Count on the periodic table.  You can see that it has three");

                System.out

                        .println("valence electrons, so it loses those three and gains a 3+ oxidation number.");

                System.out

                        .println(
                                "\n-Many compounds contain polyatomic ions, or single ions that contain more than one atom.");

                System.out

                        .println(
                                "For example, Nitrate, or NO3, has oxidation number 1-.  I don't expect you to know the polyatomic");

                System.out

                        .println(
                                "charges off the top of your head.  Just refer to page 919 to see common polyatomic ions and their");

                System.out

                        .println(
                                "charges.  When you write formulas, know that polyatomic ions have a COLLECTIVE, SINGLE charge.");

                System.out

                        .println("\n-I never really understood naming, so...uh....go ahead and read page 226.");

                System.out

                        .println("Naming ionic compounds Chemical nomenclature is a systematic way of");

                System.out

                        .println("naming compunds. Now that you are familiar with writing chemical formulas,");

                System.out

                        .println("you will use the following general rules in naming ionic compounds");

                System.out.println("when their formulas are known.");

                System.out

                        .println("\n1. Name the cation first and the anion second. Remember that the cation is");

                System.out

                        .println("always written first in the formula. For example, CsBr is a compound);");

                System.out

                        .println("used in X-ray fluorescent screens. In the formula CsBr, Cs is the);");

                System.out

                        .println("cation and is named first. The anion is Br and is named second.");

                System.out

                        .println("\n2. Monatomic cations use the element name. The name of the cation Cs");

                System.out.println("is cesium, the name of the element.");

                System.out

                        .println("\n3. Monatomic anions take their name from the root of the element name");

                System.out

                        .println("plus the suffix -ide. The compound CsBr contains the bromide anion.");

                System.out

                        .println("\n4. Group 1A and group 2A metals have only one oxidation number.");

                System.out

                        .println("Transition metals and metals on the right side of the periodic table often");

                System.out

                        .println("have more than one oxidation number. To distinguish between multiple");

                System.out

                        .println("oxidation numbers of the same element, the name of the chemical formula");

                System.out

                        .println("must indicate the oxidation number of the cation. The oxidation");

                System.out

                        .println("number is written as a Roman numeral in parentheses after the name of");

                System.out

                        .println("the cation. For example, the compound formed from Fe2 and O2 has");

                System.out

                        .println("the formula FeO and is named iron(II) oxide. The compound formed");

                System.out

                        .println("from Fe3 and O2 has the formula Fe2O3 and is named iron(III) oxide.");

                System.out

                        .println("\n5. If the compound contains a polyatomic ion, simply name the ion. The");

                System.out

                        .println("name of the compound that contains the sodium cation and the polyatomic");

                System.out

                        .println("hydroxide anion, NaOH, is sodium hydroxide. The compound");

                System.out.println("(NH4)2S is ammonium sulfide.)");

                System.out

                        .println(
                                "\n-Metallic bonds have special properties because they are created by a sea of electrons.");

                System.out

                        .println("An alloy is made by more than one element and has metallic properties.");

                continueCom();

                System.out

                        .println("Okay, I just threw a lot of crap at you, but I hope you got it.");

                System.out.println("\nBecause I'm about to throw more");

                continueCom();

                System.out

                        .println("\n-A covalent bond is the result of SHARING valence electrons");

                System.out

                        .println("\n-A molecule is formed when two or more atoms form a covalent bond");

                System.out

                        .println(
                                "\n-IMPORTANT:  Hydrogen (H2), nitrogen (N2), oxygen (O2), fluorine (F2), chlorine (Cl2), bromine (Br2), and iodine (I2) occur in nature as diatomic molecules.");

                System.out

                        .println(
                                "\n-To name a binary molecular compound, first name the first element, then, to name the second");

                System.out

                        .println(
                                "use the root of the element with the suffix -ide.  Prefixes indicate the number of atoms.");

                System.out

                        .println(
                                "When counting prefixes, the order is mono, di, tri, tetra, penta, hexa, hepta, octa, nona, and deca");

                System.out

                        .println(
                                "Confused?  Here's an example:  P2O5 is diphosphorous pentoxide.  We dropped the a so it wouldn't sound awkward");

                System.out

                        .println("Note that these are named differently than ionic compounds.");

                System.out

                        .println("\n-If a compound produces H+ (a hydrogen ion) in a solution, it is an acid");

                System.out

                        .println(
                                "\n-A binary acid contains hydrogen and one other element.  To name, use hydro and add -ic.  For example, HBr is hydrobromic acid ");

                System.out

                        .println("\n-An oxyacid contains an oxyanion, which is a polyatomic ion that contains oxygen");

                System.out

                        .println(
                                "\n-To name an oxyacid, name the anion as a suffix, then change -ate to -ic or -ite to -ous");

                System.out

                        .println(
                                "For example, HNO2 is nitrous acid  (NO2 is nitrogen dioxIDE).  HClO3 is chloric acid.");

                System.out.println("If confused, refer to page 251");

                System.out

                        .println(
                                "\n-This won't come up much after the chapter, but covalent bonds can be represented with Lewis Dot Structures.  Also, molecules have special shapes.");

                System.out

                        .println(
                                "You can see page 260 for a helpful chart on that, but once again, it won't come up that much except in the chapter test");

            }

            continueCom();

            System.out

                    .println("It's day four, and my other classes have been pissing me off.");

            System.out.println("So shut up and do your do now");

            continueCom();

            int score69 = 0;

            String reason69 = "";

            Scanner h69 = new Scanner(System.in);

            System.out

                    .println(
                            "Question 1:  When aluminum and oxygen form an ionic compound, what is that compound's formula?");

            String arb = h69.nextLine();

            arb = formatBetter(arb);

            if (arb.equals("al2o3") || arb.equals("23")) {

                score69 += 25;

            } else {

                reason69 += "\n-Answer 1 was wrong.  The correct answer was Al2 O3";

            }

            Scanner arbx1 = new Scanner(System.in);

            System.out

                    .println("Question 2:  What is Hydrogen's (H) oxidation number?");

            String arbx11 = arbx1.nextLine();

            arbx11 = formatBetter(arbx11);

            if (arbx11.equals("1+")) {

                score69 += 25;

            } else {

                reason69 += "\n-Answer 2 was wrong.  The correct answer was 1+";

            }

            Scanner w69 = new Scanner(System.in);

            System.out

                    .println("Question 3:  What is the name of CsBr?  Hint:  Use the periodic table; This is ionic");

            String w699 = w69.nextLine();

            w699 = formatBetter(w699);

            if (w699.equals("cesiumbromide")) {

                score69 += 25;

            } else {

                reason69 += "\n-Answer 3 was wrong.  The correct answer was cesium bromide";

            }

            Scanner xx69 = new Scanner(System.in);

            System.out

                    .println("Question 4:  What is the molecular compound name of H2O? Hint:  The answer is NOT water");

            String xx69a = xx69.nextLine();

            xx69a = formatBetter(xx69a);

            if (xx69a.equals("dihydrogenmonoxide")) {

                score69 += 25;

            } else {

                reason69 += "\nAnswer 4 was wrong.  The correct answer was dihydrogen monoxide";

            }

            score69 = curve(score69);

            System.out.println("Your do now score is " + score69 + ".");

            if (score69 != 100) {

                bonus = false;

                System.out.println("The reason you didn't get 100 is:"

                        + reason69);

            }

            if (readOn() == true) {

                System.out.println("Lesson 4:  Chemical reactions");

                System.out

                        .println("\n-A chemical reaction is a term for any chemical change");

                System.out

                        .println(
                                "\n-There are a ton of examples, but here's my favorite:  Say you have blood stains on clothing...");

                System.out

                        .println(
                                "To get out the stains, pour some hydrogen peroxide (H2O2) on it.  The blood will bubble and disappear");

                System.out

                        .println("Why?  A key enzyme in blood will turn the hydrogen peroxide into water and oxygen.");

                System.out.println("2H2O2 --> 2H2O + O2");

                System.out

                        .println(
                                "\n-To balance a chemical reaction, first write the skeleton equation of the reaction.");

                System.out

                        .println(
                                "Hydrogen and chlorine yields hydrogen chloride.  H and Cl are diatomic.  A plus connects products.");

                System.out

                        .println(
                                "The skeleton equation is H2(g) +  Cl2(g) ---> HCl(g).  In this class, we can leave out (g), which shows that it's a gas.");

                System.out

                        .println(
                                "The arrow means yields.  On the left are reactants, and on the right are products, or, in this case, the product.");

                System.out

                        .println(
                                "\n-Here comes the tedious, trial and error process.  Make up coefficients until you have something that balances properly.");

                System.out

                        .println(
                                "\n-The correct chemical formula is H2 + Cl2 ---> 2 HCl.  In this case, it wasn't that bad. ");

                System.out

                        .println(
                                "\n-Make sure your answer checks out.  On the left, there are two hydrogen atoms and two chlorine atoms.");

                System.out

                        .println(
                                "On the right, you distribute the coefficient to all atoms in the compound.  Therefore, there are two hydrogen and two chlorine atoms.");

                System.out

                        .println("Conservation of mass is respected.  The equation is correct.");

                System.out

                        .println(
                                "When you do this, make sure your coefficients are in the lowest possible ratio.  Don't change subscripts unless you're determining the products (ie you don't already know the reactant)");

                System.out

                        .println(
                                "\n-There are several types of chemical reactions.  There are four names, and they're all self-explanatory");

                System.out

                        .println(
                                "\n-Except for a combustion reaction.  In a combustion reaction, hydrogen and oxygen are reactants.  Water is a product.");

                System.out

                        .println(
                                "\n-In a single-replacement reaction, something cannot replace something more reactive than itself.  The only way to know is by checking page 288 (This doens't come up much after the chapter)");

            }

            continueCom();

            System.out.println("Do your do now");

            System.out

                    .println("\nAluminum and oxygen yield aluminum oxide.  Write the chemical equation");

            continueCom();

            System.out

                    .println("\nRandom person 3: Is the skeleton equation Al + O ---> AlO?  ");

            System.out

                    .println(
                            "\nIt's O2.  Even in skeleton equations, you have to use the correct chemical formulas.  Oxygen is diatomic.  AY NAKO");

            System.out

                    .println("\nRandom person 3:  So the skeleton equation is Al + O2 ---> AlO?");

            System.out

                    .println(
                            "\nNo, it's Al2O3.  Again, you need correct chemical formulas.  You know it's Al2O3 because of oxidation numbers and the criss-cross method ");

            System.out

                    .println("\nRandom person 2:  So the skeleton equation is Al + O2 ---> Al2O3?");

            System.out

                    .println("\nTHAT'S IT, NO MORE QUESTIONS.  DO YOUR DO NOW");

            Scanner random2 = new Scanner(System.in);

            int curScore1 = 0;

            System.out.println("Write the balanced chemical equation:");

            String random2a = random2.nextLine();

            random2a = formatBetter(random2a);

            if (random2a.equals("432") || random2a.equals("4al+3o2--->2al2o3")

                    || random2a.equals("4al+3o2yields2al2o3")) {

                curScore1 = 100;

            } else if (random2a.length() == 0) {

                curScore1 = 0;

            } else {

                curScore1 = 60;

            }

            System.out.println("Your do now score is " + curScore1);

            if (curScore1 != 100) {

                bonus = false;

                System.out

                        .println(
                                "The correct equation was 4 Al + 3 O2 ---> 2 Al2O3.  Just writing 432 was also acceptable to this program");

            }

            continueCom();

            if (readOn() == true) {

                System.out.println("Lesson 5:  Stoichiometry");

                System.out

                        .println("This chapter is, in essence, multiplication of fractions.");

                System.out

                        .println("\n-A mole, or mol, is equal to 6.02 x 10^23 atoms, or particles.  ");

                System.out

                        .println("\n-An element's atomic mass is the number of GRAMS PER MOLE");

                System.out

                        .println(
                                "\n-To find molar mass, break a compound down.  For example, AgNO3 is 1 Ag, 1 N and three O");

                System.out

                        .println(
                                "Multiply 1 by Ag's grams per mole (or atomic mass), do the same for N, and multiply O by 3 and then by the atomic mass.  Add them up");

                System.out

                        .println("You should get 170.  The unit for molar mass is g/mo, or grams per mole");

                System.out

                        .println(
                                "\n-In stoichiometry, you take a reaction, write the balanced chemical equation, determine a mole ratio, and convert.");

                System.out

                        .println(
                                "\n-What confuses people about stoichiometry is dimensional analysis.  If you remember that you're");

                System.out

                        .println(
                                "you're basically just multiplying by fractions that equal one, if you label your units, and if you");

                System.out

                        .println("remember to cancel out units diagonally, you should be fine.");

                continueCom();

                System.out.println("Okay, follow this closely");

                continueCom();

                System.out

                        .println(
                                "Potassium and water yield hydrogen and potassium hydroxide.  0.04 moles of potassium are used.  How many moles or hydrogen are produced?");

                continueCom();

                System.out

                        .println(
                                "If you balance correctly, the chemical formula you find will be 2 K + 2 H2O ---> KOH + H2");

                continueCom();

                System.out

                        .println("So you have 0.04 moles K.  Always put your given first when doing this.");

                continueCom();

                System.out

                        .println("Multiply by the mole ratio.  Multiply by the fraction 1 mol H2 over 2 mol K");

                System.out

                        .println(
                                "This is because, if you look at the chemical equation, there is one mole of H2 for every 2 moles of potassium");

                continueCom();

                System.out

                        .println(
                                "Now cancel diagonally.  See how mol K and mol K are diagonal?  Using simple algebra, you can cancel the units.");

                continueCom();

                System.out

                        .println(
                                "So, now that you've crossed out both instanes of mol K, you can multiply and divide to get 0.02.  See how mol H2 is left over?  That's your answer");

                System.out.println("Your final answer is 0.02 moles H2");

                System.out

                        .println(
                                "Was that simple?  That was relatively simple, but all stoichiometry is an extension of that simple concept.");

                System.out

                        .println(
                                "Just take your given, use fractions to carry out some dimensional analysis, cancel units, and get your answer.");

                System.out

                        .println(
                                "\n-When dealing with mass to mass conversions, you must find the molar mass of both elements/compounds before carrying out dimensional analysis.");

                System.out

                        .println(
                                "\n-When dealing with mass to mole conversions, only find the molar mass of the unknown");

            }

            continueCom();

            boolean epicness = false;

            System.out.println("This is the last phase of Ay Nako");

            System.out.println("Do your last do now");

            Scanner epic = new Scanner(System.in);

            System.out

                    .println(
                            "AgNO3 + NaCl ---> AgCl + AgNO3.  17 g of AgNO3 are used.  How many grams of AgCl are produced?  Provide your answer:");

            String epicAnswer = epic.nextLine();

            epicAnswer = formatBetter(epicAnswer);

            if (epicAnswer.equals("14.3") || epicAnswer.equals("14.3g")

                    || epicAnswer.equals("14.3grams")) {

                System.out.println("100%.  Awesome.");

                epicness = true;

            } else {

                bonus = false;

                System.out.println("Wrong");

            }

            if (epicness == false) {

                System.out.println("Let's walk through this");

                System.out.println("First of all, you have 17 g AgNO3");

                continueCom();

                System.out

                        .println(
                                "Its molar mass is 170 grams over moles, or grams per mole.  So multiply your given by 1 mole AgNO3 over 170 g AgNO3.");

                continueCom();

                System.out

                        .println(
                                "The mole ration is 1 over 1, one mole AgCl for every 1 mole AgNO3.  See that in the formula?");

                continueCom();

                System.out

                        .println(
                                "The molar mass of AgCl is 143 grams/mole.  We multiply by 143 g AgCl over 1 mol AgCl.  Remember, 143g/1 mol and 1 mol/143 g are both 1 in this case.");

                continueCom();

                System.out

                        .println(
                                "See how we've arranged the fractions?  THE STARS ARE ALIGNED.  Do some cancelling and get your answer.");

                continueCom();

                System.out.println("You should end up with 14.3 g AgCl");

            }

            if (readOn() == true) {

                System.out

                        .println("\n-If you've made it this far, you've touched on most of the curriculum.");

                System.out

                        .println("\n-The next two chapters, gases and solutions, are basically just subsitution.");

                System.out

                        .println(
                                "All you have to do is memorize a lot of formulas, know some random numbers, and know how to plug and chug");

                System.out

                        .println(
                                "\n-P1V1/T1 = P2V2 / T2.  That's the combined gas law, and it has three gas laws in it.  Confused?  Don't be.  It will be easy.");

                System.out

                        .println("\n-One mole of gas occupies 22.4 L, or liters");

                System.out

                        .println(
                                "\n-Here are some random numbers that will be significant in due time:  1 atm, 0 C, 0.0821, and 62.4");

                System.out

                        .println("\n- PV = NRT.  When it comes, memorize it.  You can rearrange it and do a lot");

                System.out

                        .println(
                                "\n-As for solutions, just remember that molarity is moles of solute divided by liters of solution.  Molality is moles of solute divided by kilograms of solvent.");

                System.out

                        .println(
                                "\n-How do you know which is which?  Here's how I remember it - water is the universal SOLVENT.");

                System.out

                        .println(
                                "\n-And, when you do boiling point/freezing point equations, just use the chart.  And it's freezing point depression.  Substract, don't add.");

                System.out.println("Aside from that, good luck.");

                System.out

                        .println(
                                "You're not done with this class, but by the time you've covered gas/solutions, you're almost there.");

            }

            if (bonus == true) {

                System.out

                        .println(
                                "\nBONUS\n\nBecause you've scored all do nows correctly, this program will provide part of a chemistry rap.");

                System.out.println("Ionic compounds, by kai");

                System.out

                        .println(
                                "Yo I’m gonna spit some rhymes/Bout ionic compounds/They’re microscopic/So they can’t be found ");

                System.out

                        .println("\nSo you ready?/  Aight, here we go./  1 2 3 4 AY NA KO");

                System.out

                        .println("Now before you learn/ about ionic compounds/ ya gotta know/ about chemical bonds");

                System.out

                        .println("They form/ by the attraction/ of a positive /and negative ion");

                System.out

                        .println("A monatomic ion shock is the number of oxidation");

                System.out

                        .println("If they match in two elements it will end their stagnation...");

            }

            if (bonus1 == true) {

                System.out

                        .println("\nBONUS\n-Didn't you wonder why this program was so big?");

                System.out

                        .println("\n-I have bundled minesweeper into it.  Our version.  For memories");

                GameController gc1 = new GameController();

                gc1.getDifficulty();

            }

        }

    }

    public static void main(String[] args) {

        /*
         * 
         * PrintStream con=new PrintStream(new TextAreaOutputStream(...));
         * 
         * System.setOut(con);
         * 
         * System.setErr(con);
         * 
         */

        boolean bonus = true;

        boolean bonus1 = false;

        int loop = 0;

        while (loop == 0) {

            System.out

                    .println("\nWelcome to Ay Nako! (Type C to continue, or hit enter to skip ahead )");

            Scanner firstComx = new Scanner(System.in);

            String com1 = firstComx.nextLine();

            com1 = com1.trim();

            com1 = com1.toLowerCase();

            com1 = com1.replaceAll(" ", "");

            if (com1.equals("c") || com1.equals("continue")) {

                System.out.println("First, a brief explanation:  ");

                System.out

                        .println("\n-This program will throw you random chemistry questions");

                System.out

                        .println("\n-The program is designed to adapt depending on what answers are given");

                System.out

                        .println("\n-Most questions expect a specific answer, like a number, letter, word or phrase");

                System.out

                        .println(
                                "\n-If you have something like 3 O2 (In writing, the 2 is written below the O), 3 is a coefficient and 2 is a subscript");

                System.out

                        .println(
                                "\n-To balance chemical equations, simply write the coefficients.  For example, the program may expect the line 2 3 1");

                System.out

                        .println(
                                "\n-For short answer questions, just write whatever comes to mind.  The program will look for key words");

                continueCom();

                Scanner sc1 = new Scanner(System.in);

                System.out

                        .println("What's that person's name, again? \n\n\nENTER NAME:");

                String name = sc1.nextLine();

                name = formatBetter(name);

                String loudName = name.toUpperCase();

                if (name.equals("kai")) {

                    System.out

                            .println("KAI?!  GET OUT OF MY CLASS.  Just kidding.  You're a very good student.");

                }

                if (name.equals("zaid")) {

                    System.out.println("Zaid?  Rock on.");

                }

                if (name.equals("15/25")) {

                    bonus1 = true;

                    System.out.println("Bonus activated");

                }

                String firstGrade = "";

                if (name.equals("david") || name.equals("jon")

                        || name.equals("kai")) {

                    firstGrade = "A";

                } else if (name.equals("stanley")) {

                    firstGrade = "A+";

                } else {

                    firstGrade = "B+";

                }

                System.out

                        .println("\n"

                                + loudName

                                + ", COME TO THE BOARD.\n\nPROVE THAT YOU DESERVE YOUR "

                                + firstGrade);

                System.out.println("Fe + Cl2 ---> FeCl3");

                System.out.println("(Balance this chemical equation):");

                Scanner help = new Scanner(System.in);

                String firstCom = help.nextLine();

                firstCom = firstCom.toLowerCase();

                firstCom = firstCom.replaceAll(" ", "");

                firstCom = firstCom.trim();

                firstCom = firstCom.replaceAll(",", "");

                firstCom = firstCom.replaceAll(">", "");

                // System.out.println("Test value is " + firstCom);

                if (firstCom.equals("232")

                        || firstCom.equals("2fe+3cl2---2fecl3")) {

                    loop++;

                    System.out.println("IS THAT THE ANSWER, CLASS?");

                    System.out.println("YES");

                    System.out

                            .println("Yes, 2 Fe + 3 Cl2 yields 2 FeCl3.  Have a seat.");

                    System.out

                            .println("Congratulations, you have passed round 1.");

                } else {

                    loop++;

                    System.out.println("AY NAKO");

                    System.out

                            .println(
                                    "\nFor a helpful tutorial on balancing chemical equations, see http://www.youtube.com/watch?v=RnGu3xO2h74");

                }

                continueCom();

                Scanner doNow = new Scanner(System.in);

                System.out.println("DO NOW");

                System.out

                        .println(
                                "This is a short answer question.  \nYou are to write everything you know about the atom.\n\nWhat is it made of?  \nWhat is its significance?\n\nYou will be given a score out of 100 based on your short answer response:");

                String dn = doNow.nextLine();

                dn = dn.toLowerCase();

                dn = dn.trim();

                int score = 0;

                String reason = "";

                if (dn.length() >= 1) {

                    score += 50;

                } else {

                    reason += "\nYou wrote nothing";

                }

                if (dn.indexOf("neutron") != -1 && dn.indexOf("proton") != -1

                        && dn.indexOf("electron") != -1) {

                    score += 40;

                } else {

                    reason += "\n-You did not mention ALL THREE sub-atomic particles";

                }

                if ((dn.indexOf("building") != -1)

                        || (dn.indexOf("block") != -1 || dn.indexOf("make") != -1)

                        || (dn.indexOf("fundamental") != -1)

                        || (dn.indexOf("important") != -1)) {

                    score += 10;

                } else {

                    reason += "\n-You did not say it's the building block of all things";

                }

                System.out.println("\nYour do now score is " + score);

                if (score != 100) {

                    bonus = false;

                    System.out.println("The reason you didn't get 100 is: "

                            + reason);

                }

                continueCom();

                System.out.println("All right class, time for your lesson.");

                System.out.println("Lesson 1:  Introduction to chemistry");

                if (readOn() == true) {

                    System.out

                            .println(
                                    "-Just for the hell of it, I'll spend a day discussing the scientific method and another day discussing how CFC damaged the ozone.");

                    System.out

                            .println(
                                    "\n\n-Chemistry, by defintion, is the study of matter and the changes that it undergoes.");

                    System.out

                            .println(
                                    "\n-In this class, you will learn a variety of subjects.  Unifying concepts will continually repeat.");

                    System.out

                            .println(
                                    "For example, you will continually use the concept of Conservation of Mass.  It will help you balance out chemical equations, for example.");

                    System.out

                            .println(
                                    "\nYou really should read the book, but below are a few concepts that will come up again and again in this course.");

                    System.out

                            .println(
                                    "\n-Quantiative data is data that consists of numerical information.  Qualatative data is based simply on observations.");

                    System.out

                            .println("\n-Percent error is the amount error divided by the accepted value");

                    System.out

                            .println("\n-In this class, you will frequently use scientific notation and SI units.");

                    System.out

                            .println(
                                    "\n-When you round, you keep the same number of SIGNIFICANT FIGURES.  For info on significant figures, go to page 39 in your chemistry textbook."

                                            + "");

                    System.out

                            .println(
                                    "\n-The Law of Conservation of Mass is the most important rule in chemistry.  Mass is neither created nor destroyed in a chemical reaction");

                    System.out

                            .println(
                                    "\n-Matter is affected by physical and chemical changes.  A chmical change actually changes a substance's composition");

                    System.out

                            .println(
                                    "\n-A substance is a form of matter with a uniform and unchanging composition.  A mixture is a blend of two or more pure substances");

                    System.out

                            .println(
                                    "Homogenous mixtures have a constant composition throughout.  In heterogeneous mixtures, individual substances remain distinct");

                    System.out

                            .println("\n-Solutions are mixtures.  Mixtures can be separated by physical means");

                    System.out

                            .println(
                                    "Matter is either a mixture or a substance.  A substance is either an element or a compound.");

                    System.out

                            .println("\n-ELEMENTS are substances that CANNOT BE BROKEN DOWN into simpler substances");

                    System.out

                            .println("\n-(Aside) When doing labs, do not fuck around");

                    // continueCom();

                    System.out

                            .println(
                                    "\nThe first math concept you'll come across in this course is conversion.  It's an extremely straight-forward concept");

                    System.out

                            .println(
                                    "\nSay you want to convert 50 centimeters into meters.  Take the given and multiply it by a conversion factor.");

                    System.out

                            .println(
                                    "For example, in this case, you take 50 centimeters, and multiply it by 1  METER OVER 100 CENTIMETERS.");

                    System.out

                            .println("The fraction, or conversion factor, is equal to one.");

                    System.out

                            .println(
                                    "\nYou probably could have done this calcultaion mentally, but using DIMENSIONAL ANALYSIS, the method involving the fraction, will prove useful in more complicated chemistry equations.");

                }

                continueCom();

                System.out

                        .println("\nThat's all for day one.  Below are a few last tips in the introduction");

                System.out

                        .println(
                                "\n-Unless you really want to, don't bring the chemistry book back and fourth.  It's online, and a PDF version is downloadable.");

                System.out

                        .println(
                                "\n-Of all the resources out there, one of the most valuable is Khan Academy.  He can be found on Youtube");

                System.out

                        .println("\n-Some homework solutions are available on a site called whitechemistry.net");

                System.out

                        .println("\n-When you're really stuck, don't be afraid to Google for help.");

                // System.out.println("\n-That's all for part 1.");

            }

            System.out.println("\n\nWelcome to your second day.");

            loop++;

            continueCom();

            System.out

                    .println("By now, you may have noted the following about Sunga:");

            continueCom();

            System.out

                    .println(
                            "\n-Grades are curved, which is always beneficial.  Tests are curved a little, and everything else is curved even more");

            System.out

                    .println(
                            "\n-You'll waste a lot of time copying down lab procedures.  This doesn't require any thinking, at least.");

            System.out

                    .println("\n-Sunga doesn't like getting questions, for the most part.");

            System.out

                    .println("\n-You may find you'll learn more by reading the book than by listening to Sunga");

            System.out

                    .println("\n-If you can, read your chemistry book one section ahead of the class.");

            continueCom();

            int score2 = 0;

            String reason2 = "";

            System.out.println("DO YOUR DO NOW");

            // continueCom();

            System.out

                    .println("Question 1:  How many significant figures does 4320 have?"); // 3,

            // 6.20

            // also

            // has

            // 3

            Scanner dN1 = new Scanner(System.in);

            String doNow1 = dN1.nextLine();

            doNow1 = doNow1.trim();

            doNow1 = doNow1.replaceAll(" ", "");

            if (doNow1.equals("3") || doNow1.equals("three")) {

                score2 += 25;

            } else {

                reason2 += "\n-Answer 1 was wrong";

            }

            System.out

                    .println("Question 2:  How many significant figures does 6.20 have?");

            Scanner dN2 = new Scanner(System.in);

            String doNow2 = dN2.nextLine();

            doNow2 = doNow2.trim();

            doNow2 = doNow2.replaceAll(" ", "");

            if (doNow2.equals("3") || doNow2.equals("three")) {

                score2 += 25;

            } else {

                reason2 += "\n-Answer 2 was wrong";

            }

            System.out

                    .println("Question 3:  How many centimeters are in 6.2 meters?");

            Scanner dN3 = new Scanner(System.in);

            String doNow3 = dN3.nextLine();

            doNow3 = doNow3.trim();

            doNow3 = doNow3.replaceAll(" ", "");

            if (doNow3.equals("6200") || doNow3.equals("6200 centimeters")) {

                score2 += 50;

            } else {

                reason2 += "\n-Answer 3 was wrong";

            }

            System.out.println("Your score is " + curve(score2));

            if (score2 != 100) {

                bonus = false;

                System.out.println(reason2);

            }

            continueCom();

            System.out

                    .println("Random guy 1:  Ms. Sunga, doesn't 4320 have four significant figures?");

            System.out.println("No, because this is for ROUNDING.  AY NAKO.");

            continueCom();

            System.out

                    .println("Random guy 2:  But that doesn't make any sense. ");

            System.out

                    .println("When rounding, you have to keep the SAME NUMBER OF SIGNIFAICNT FIGURES.  Ay Nako.");

            System.out

                    .println("\n(This is one of those things you just have to get used to)");

            continueCom();

            System.out.println("Quiet, class, time for your lesson.");

            System.out.println("Lesson 2:  The periodic table");

            if (readOn() == true) {

                System.out

                        .println("\n-The atom is the building block of all matter.");

                System.out

                        .println("\n-Atoms are made of protons, neutrons, and electrons.");

                System.out

                        .println(
                                "\n-Protons have a positive charge, neutrons have no charge and electrons have a negative charge");

                System.out

                        .println("\n-Much of an atom's mass is in its nucleus.  The nucleus has protons and neutrons");

                System.out.println("\n-Atoms are mostly made of empty space.");

                System.out

                        .println(
                                "\n-Electrons travel around the nucleus, but not in the way planets revolve around the sun.  There's a probability function.  They're more likely to be at certain places than at others.");

                System.out

                        .println("\n-There's some history to the discovery of atomic structure.  Yeah.");

                System.out

                        .println(
                                "\n-The number of protons (and electrons) is the atomic number.  Atomic mass is...the mass of an atom.");

                System.out

                        .println(
                                "\n-Atoms consist of separate orbitals and levels.  The main thing to take from this is that atoms have a certain number of valence electrons.");

                System.out

                        .println(
                                "\n-Valence electrons are the electrons on an atom's outermost layer.  The determine properties when atoms bond.");

                continueCom();

                System.out

                        .println("\n-The periodic table arranges elements based on atomic number.");

                System.out.println("\n-Each row is a period.");

                System.out

                        .println("\n-Each column is a family.  Families have similar properties.");

                System.out

                        .println(
                                "\n-Look at the period table.  It's divided into four blocks.  The f-block is broken off.  The other three are the s, d, and p blocks");

                System.out

                        .println("\n-The D-block is columns 3-14.  See how it looks like a separate part?");

                System.out

                        .println("\n-The S-block is on the left.  The P-block is on the right.");

                System.out

                        .println("(Once you're allowed to use the periodic table, electron configurations are easy.)");

                System.out

                        .println(
                                "\n-The periodic table is easily the most useful tool you'll use in chemistry.  The atomic numbers, masses, and placement on the table are all vital.");

                continueCom();

                System.out

                        .println(
                                "On the very right of the P-block are noble gases.  They have 8 valence electrons and are extremely stable. This is the rule of eight.");

                System.out

                        .println(
                                "Look at any box.  You'll notice it has the element's name, atomic number, atomic mass, and places the element in a special place.");

                System.out

                        .println(
                                "There are trends in the periodic table.  For example, as you electronegativity, the ability of an atom to attract electrons, generally increases as you move right on the table.");

                continueCom();

                System.out

                        .println("All right, let's do a brief demonstration.  Look at Argon on the periodic table.");

                continueCom();

                System.out

                        .println("Here are things you can figure out from the table alone:");

                System.out.println("\n-Argon is a noble gas.");

                System.out

                        .println("\n-Argon has atomic number 18.  Therefore, argon has 18 electrons and 18 protons.");

                System.out

                        .println("\n-Argon has a lot in common with other noble gases, like neon.");

                System.out.println("\n-Argon has no valence electrons.");

                System.out.println("\n-Argon has an atomic mass of 39.95 AMU");

                System.out.println("\n\nThat's all for day 2.");

            }

            System.out.println("Day 3:  Do your do now:");

            int score3 = 0;

            String reason3 = "";

            System.out.println("Question 1:  What is oxygen's atomic number?");

            Scanner xx1 = new Scanner(System.in);

            String xx2 = xx1.nextLine();

            xx2 = formatBetter(xx2);

            if (xx2.equals("8") || xx2.equals("eight")) {

                score3 += 25;

            } else {

                reason3 += "\n-Number 1 was wrong";

            }

            System.out

                    .println("Question 2:  What is oxygen's atomic mass, as a whole number?");

            Scanner xxx2 = new Scanner(System.in);

            String xxx3 = xxx2.nextLine();

            xxx3 = formatBetter(xxx3);

            if (xxx3.equals("16") || xxx3.equals("sixteen")) {

                score3 += 25;

            } else {

                reason3 += "\n-Number 2 was wrong";

            }

            System.out

                    .println("Question 3:  How many valence electrons does neon have?");

            Scanner neon = new Scanner(System.in);

            String neon1 = neon.nextLine();

            neon1 = formatBetter(neon1);

            if (neon1.equals("8") || neon1.equals("eight")) {

                score3 += 25;

            } else {

                reason3 += "\n-Number 3 was wrong";

            }

            System.out

                    .println("Question 4:  Which block, s, p, d, or f, is cobalt located in?");

            Scanner d = new Scanner(System.in);

            String d1 = d.nextLine();

            d1 = formatBetter(d1);

            if (d1.equals("d")) {

                score3 += 25;

            } else {

                reason3 += "\n-Answer 4 was wrong";

            }

            if (score3 != 100) {

                bonus = false;

            }

            System.out.println("Your score is " + curve(score3) + reason3);

            System.out.println("Day 3:  Chemical bonds");

            if (readOn() == true) {

                System.out

                        .println("\n-Chemical bonds allow thousands of compounds to form.");

                System.out

                        .println("\n-An ion is an atom or molecule with a net charge.");

                System.out

                        .println(
                                "\n-Noble gases have eight valence electrons, which is stable.  Other elements seek this stability.");

                System.out

                        .println(
                                "\n-Consider the creation of NaCl, which is an ionic compound better known as table salt.  Na has one valence electron and Cl has 7.  In\nthis ionic compound, the Na (or sodium) atom loses an electron and, by giving up its \nnegative electron, becomes a positive ion.  The Cl atom takes the valence electron and becomes a \nnegative ion.  Both atoms gain a stable electron configuration.");

                System.out

                        .println(
                                "\n-A monatomic (one-atom) ion has an oxidation number.  An oxidation number is how many");

                System.out

                        .println(
                                "electrons are transferred from an atom to form an ion.  For example, in NaCl, Na has an oxidation");

                System.out

                        .println(
                                "number of 1+ because it loses one electron and becomes positive.  Cl has an oxidation number");

                System.out

                        .println("of 1- because it gains one electron and becomes negative.");

                System.out

                        .println(
                                "\n-Say you want to determine the formula of an ionic compound, like aluminum sulfide.  You");

                System.out

                        .println(
                                "know that aluminum is Al and sulfur is s.  Al has an oxidation number of 3+ and sulfur");

                System.out

                        .println(
                                "has an oxidation number of 2-.  The overall charge must be 0, so we use something I call the");

                System.out

                        .println(
                                "criss-cross method.  Basically, you write in subscripts and then multiply diagonally to");

                System.out

                        .println(
                                "see if the overall charge is 0.  The correct formula is Al2S3 (2 and 3 are subscripts).");

                System.out

                        .println("Note that the positive ion is written before the negative ion.");

                System.out

                        .println(
                                "\n-You can use the periodic table to help you find oxidation numbers.  How did we know Aluminum");

                System.out

                        .println(
                                "had an oxidation number of 3+?  Count on the periodic table.  You can see that it has three");

                System.out

                        .println("valence electrons, so it loses those three and gains a 3+ oxidation number.");

                System.out

                        .println(
                                "\n-Many compounds contain polyatomic ions, or single ions that contain more than one atom.");

                System.out

                        .println(
                                "For example, Nitrate, or NO3, has oxidation number 1-.  I don't expect you to know the polyatomic");

                System.out

                        .println(
                                "charges off the top of your head.  Just refer to page 919 to see common polyatomic ions and their");

                System.out

                        .println(
                                "charges.  When you write formulas, know that polyatomic ions have a COLLECTIVE, SINGLE charge.");

                System.out

                        .println("\n-I never really understood naming, so...uh....go ahead and read page 226.");

                System.out

                        .println("Naming ionic compounds Chemical nomenclature is a systematic way of");

                System.out

                        .println("naming compunds. Now that you are familiar with writing chemical formulas,");

                System.out

                        .println("you will use the following general rules in naming ionic compounds");

                System.out.println("when their formulas are known.");

                System.out

                        .println("\n1. Name the cation first and the anion second. Remember that the cation is");

                System.out

                        .println("always written first in the formula. For example, CsBr is a compound);");

                System.out

                        .println("used in X-ray fluorescent screens. In the formula CsBr, Cs is the);");

                System.out

                        .println("cation and is named first. The anion is Br and is named second.");

                System.out

                        .println("\n2. Monatomic cations use the element name. The name of the cation Cs");

                System.out.println("is cesium, the name of the element.");

                System.out

                        .println("\n3. Monatomic anions take their name from the root of the element name");

                System.out

                        .println("plus the suffix -ide. The compound CsBr contains the bromide anion.");

                System.out

                        .println("\n4. Group 1A and group 2A metals have only one oxidation number.");

                System.out

                        .println("Transition metals and metals on the right side of the periodic table often");

                System.out

                        .println("have more than one oxidation number. To distinguish between multiple");

                System.out

                        .println("oxidation numbers of the same element, the name of the chemical formula");

                System.out

                        .println("must indicate the oxidation number of the cation. The oxidation");

                System.out

                        .println("number is written as a Roman numeral in parentheses after the name of");

                System.out

                        .println("the cation. For example, the compound formed from Fe2 and O2 has");

                System.out

                        .println("the formula FeO and is named iron(II) oxide. The compound formed");

                System.out

                        .println("from Fe3 and O2 has the formula Fe2O3 and is named iron(III) oxide.");

                System.out

                        .println("\n5. If the compound contains a polyatomic ion, simply name the ion. The");

                System.out

                        .println("name of the compound that contains the sodium cation and the polyatomic");

                System.out

                        .println("hydroxide anion, NaOH, is sodium hydroxide. The compound");

                System.out.println("(NH4)2S is ammonium sulfide.)");

                System.out

                        .println(
                                "\n-Metallic bonds have special properties because they are created by a sea of electrons.");

                System.out

                        .println("An alloy is made by more than one element and has metallic properties.");

                continueCom();

                System.out

                        .println("Okay, I just threw a lot of crap at you, but I hope you got it.");

                System.out.println("\nBecause I'm about to throw more");

                continueCom();

                System.out

                        .println("\n-A covalent bond is the result of SHARING valence electrons");

                System.out

                        .println("\n-A molecule is formed when two or more atoms form a covalent bond");

                System.out

                        .println(
                                "\n-IMPORTANT:  Hydrogen (H2), nitrogen (N2), oxygen (O2), fluorine (F2), chlorine (Cl2), bromine (Br2), and iodine (I2) occur in nature as diatomic molecules.");

                System.out

                        .println(
                                "\n-To name a binary molecular compound, first name the first element, then, to name the second");

                System.out

                        .println(
                                "use the root of the element with the suffix -ide.  Prefixes indicate the number of atoms.");

                System.out

                        .println(
                                "When counting prefixes, the order is mono, di, tri, tetra, penta, hexa, hepta, octa, nona, and deca");

                System.out

                        .println(
                                "Confused?  Here's an example:  P2O5 is diphosphorous pentoxide.  We dropped the a so it wouldn't sound awkward");

                System.out

                        .println("Note that these are named differently than ionic compounds.");

                System.out

                        .println("\n-If a compound produces H+ (a hydrogen ion) in a solution, it is an acid");

                System.out

                        .println(
                                "\n-A binary acid contains hydrogen and one other element.  To name, use hydro and add -ic.  For example, HBr is hydrobromic acid ");

                System.out

                        .println("\n-An oxyacid contains an oxyanion, which is a polyatomic ion that contains oxygen");

                System.out

                        .println(
                                "\n-To name an oxyacid, name the anion as a suffix, then change -ate to -ic or -ite to -ous");

                System.out

                        .println(
                                "For example, HNO2 is nitrous acid  (NO2 is nitrogen dioxIDE).  HClO3 is chloric acid.");

                System.out.println("If confused, refer to page 251");

                System.out

                        .println(
                                "\n-This won't come up much after the chapter, but covalent bonds can be represented with Lewis Dot Structures.  Also, molecules have special shapes.");

                System.out

                        .println(
                                "You can see page 260 for a helpful chart on that, but once again, it won't come up that much except in the chapter test");

            }

            continueCom();

            System.out

                    .println("It's day four, and my other classes have been pissing me off.");

            System.out.println("So shut up and do your do now");

            continueCom();

            int score69 = 0;

            String reason69 = "";

            Scanner h69 = new Scanner(System.in);

            System.out

                    .println(
                            "Question 1:  When aluminum and oxygen form an ionic compound, what is that compound's formula?");

            String arb = h69.nextLine();

            arb = formatBetter(arb);

            if (arb.equals("al2o3") || arb.equals("23")) {

                score69 += 25;

            } else {

                reason69 += "\n-Answer 1 was wrong.  The correct answer was Al2 O3";

            }

            Scanner arbx1 = new Scanner(System.in);

            System.out

                    .println("Question 2:  What is Hydrogen's (H) oxidation number?");

            String arbx11 = arbx1.nextLine();

            arbx11 = formatBetter(arbx11);

            if (arbx11.equals("1+")) {

                score69 += 25;

            } else {

                reason69 += "\n-Answer 2 was wrong.  The correct answer was 1+";

            }

            Scanner w69 = new Scanner(System.in);

            System.out

                    .println("Question 3:  What is the name of CsBr?  Hint:  Use the periodic table; This is ionic");

            String w699 = w69.nextLine();

            w699 = formatBetter(w699);

            if (w699.equals("cesiumbromide")) {

                score69 += 25;

            } else {

                reason69 += "\n-Answer 3 was wrong.  The correct answer was cesium bromide";

            }

            Scanner xx69 = new Scanner(System.in);

            System.out

                    .println("Question 4:  What is the molecular compound name of H2O? Hint:  The answer is NOT water");

            String xx69a = xx69.nextLine();

            xx69a = formatBetter(xx69a);

            if (xx69a.equals("dihydrogenmonoxide")) {

                score69 += 25;

            } else {

                reason69 += "\nAnswer 4 was wrong.  The correct answer was dihydrogen monoxide";

            }

            score69 = curve(score69);

            System.out.println("Your do now score is " + score69 + ".");

            if (score69 != 100) {

                bonus = false;

                System.out.println("The reason you didn't get 100 is:"

                        + reason69);

            }

            if (readOn() == true) {

                System.out.println("Lesson 4:  Chemical reactions");

                System.out

                        .println("\n-A chemical reaction is a term for any chemical change");

                System.out

                        .println(
                                "\n-There are a ton of examples, but here's my favorite:  Say you have blood stains on clothing...");

                System.out

                        .println(
                                "To get out the stains, pour some hydrogen peroxide (H2O2) on it.  The blood will bubble and disappear");

                System.out

                        .println("Why?  A key enzyme in blood will turn the hydrogen peroxide into water and oxygen.");

                System.out.println("2H2O2 --> 2H2O + O2");

                System.out

                        .println(
                                "\n-To balance a chemical reaction, first write the skeleton equation of the reaction.");

                System.out

                        .println(
                                "Hydrogen and chlorine yields hydrogen chloride.  H and Cl are diatomic.  A plus connects products.");

                System.out

                        .println(
                                "The skeleton equation is H2(g) +  Cl2(g) ---> HCl(g).  In this class, we can leave out (g), which shows that it's a gas.");

                System.out

                        .println(
                                "The arrow means yields.  On the left are reactants, and on the right are products, or, in this case, the product.");

                System.out

                        .println(
                                "\n-Here comes the tedious, trial and error process.  Make up coefficients until you have something that balances properly.");

                System.out

                        .println(
                                "\n-The correct chemical formula is H2 + Cl2 ---> 2 HCl.  In this case, it wasn't that bad. ");

                System.out

                        .println(
                                "\n-Make sure your answer checks out.  On the left, there are two hydrogen atoms and two chlorine atoms.");

                System.out

                        .println(
                                "On the right, you distribute the coefficient to all atoms in the compound.  Therefore, there are two hydrogen and two chlorine atoms.");

                System.out

                        .println("Conservation of mass is respected.  The equation is correct.");

                System.out

                        .println(
                                "When you do this, make sure your coefficients are in the lowest possible ratio.  Don't change subscripts unless you're determining the products (ie you don't already know the reactant)");

                System.out

                        .println(
                                "\n-There are several types of chemical reactions.  There are four names, and they're all self-explanatory");

                System.out

                        .println(
                                "\n-Except for a combustion reaction.  In a combustion reaction, hydrogen and oxygen are reactants.  Water is a product.");

                System.out

                        .println(
                                "\n-In a single-replacement reaction, something cannot replace something more reactive than itself.  The only way to know is by checking page 288 (This doens't come up much after the chapter)");

            }

            continueCom();

            System.out.println("Do your do now");

            System.out

                    .println("\nAluminum and oxygen yield aluminum oxide.  Write the chemical equation");

            continueCom();

            System.out

                    .println("\nRandom person 3: Is the skeleton equation Al + O ---> AlO?  ");

            System.out

                    .println(
                            "\nIt's O2.  Even in skeleton equations, you have to use the correct chemical formulas.  Oxygen is diatomic.  AY NAKO");

            System.out

                    .println("\nRandom person 3:  So the skeleton equation is Al + O2 ---> AlO?");

            System.out

                    .println(
                            "\nNo, it's Al2O3.  Again, you need correct chemical formulas.  You know it's Al2O3 because of oxidation numbers and the criss-cross method ");

            System.out

                    .println("\nRandom person 2:  So the skeleton equation is Al + O2 ---> Al2O3?");

            System.out

                    .println("\nTHAT'S IT, NO MORE QUESTIONS.  DO YOUR DO NOW");

            Scanner random2 = new Scanner(System.in);

            int curScore1 = 0;

            System.out.println("Write the balanced chemical equation:");

            String random2a = random2.nextLine();

            random2a = formatBetter(random2a);

            if (random2a.equals("432") || random2a.equals("4al+3o2--->2al2o3")

                    || random2a.equals("4al+3o2yields2al2o3")) {

                curScore1 = 100;

            } else if (random2a.length() == 0) {

                curScore1 = 0;

            } else {

                curScore1 = 60;

            }

            System.out.println("Your do now score is " + curScore1);

            if (curScore1 != 100) {

                bonus = false;

                System.out

                        .println(
                                "The correct equation was 4 Al + 3 O2 ---> 2 Al2O3.  Just writing 432 was also acceptable to this program");

            }

            continueCom();

            if (readOn() == true) {

                System.out.println("Lesson 5:  Stoichiometry");

                System.out

                        .println("This chapter is, in essence, multiplication of fractions.");

                System.out

                        .println("\n-A mole, or mol, is equal to 6.02 x 10^23 atoms, or particles.  ");

                System.out

                        .println("\n-An element's atomic mass is the number of GRAMS PER MOLE");

                System.out

                        .println(
                                "\n-To find molar mass, break a compound down.  For example, AgNO3 is 1 Ag, 1 N and three O");

                System.out

                        .println(
                                "Multiply 1 by Ag's grams per mole (or atomic mass), do the same for N, and multiply O by 3 and then by the atomic mass.  Add them up");

                System.out

                        .println("You should get 170.  The unit for molar mass is g/mo, or grams per mole");

                System.out

                        .println(
                                "\n-In stoichiometry, you take a reaction, write the balanced chemical equation, determine a mole ratio, and convert.");

                System.out

                        .println(
                                "\n-What confuses people about stoichiometry is dimensional analysis.  If you remember that you're");

                System.out

                        .println(
                                "you're basically just multiplying by fractions that equal one, if you label your units, and if you");

                System.out

                        .println("remember to cancel out units diagonally, you should be fine.");

                continueCom();

                System.out.println("Okay, follow this closely");

                continueCom();

                System.out

                        .println(
                                "Potassium and water yield hydrogen and potassium hydroxide.  0.04 moles of potassium are used.  How many moles or hydrogen are produced?");

                continueCom();

                System.out

                        .println(
                                "If you balance correctly, the chemical formula you find will be 2 K + 2 H2O ---> KOH + H2");

                continueCom();

                System.out

                        .println("So you have 0.04 moles K.  Always put your given first when doing this.");

                continueCom();

                System.out

                        .println("Multiply by the mole ratio.  Multiply by the fraction 1 mol H2 over 2 mol K");

                System.out

                        .println(
                                "This is because, if you look at the chemical equation, there is one mole of H2 for every 2 moles of potassium");

                continueCom();

                System.out

                        .println(
                                "Now cancel diagonally.  See how mol K and mol K are diagonal?  Using simple algebra, you can cancel the units.");

                continueCom();

                System.out

                        .println(
                                "So, now that you've crossed out both instanes of mol K, you can multiply and divide to get 0.02.  See how mol H2 is left over?  That's your answer");

                System.out.println("Your final answer is 0.02 moles H2");

                System.out

                        .println(
                                "Was that simple?  That was relatively simple, but all stoichiometry is an extension of that simple concept.");

                System.out

                        .println(
                                "Just take your given, use fractions to carry out some dimensional analysis, cancel units, and get your answer.");

                System.out

                        .println(
                                "\n-When dealing with mass to mass conversions, you must find the molar mass of both elements/compounds before carrying out dimensional analysis.");

                System.out

                        .println(
                                "\n-When dealing with mass to mole conversions, only find the molar mass of the unknown");

            }

            continueCom();

            boolean epicness = false;

            System.out.println("This is the last phase of Ay Nako");

            System.out.println("Do your last do now");

            Scanner epic = new Scanner(System.in);

            System.out

                    .println(
                            "AgNO3 + NaCl ---> AgCl + AgNO3.  17 g of AgNO3 are used.  How many grams of AgCl are produced?  Provide your answer:");

            String epicAnswer = epic.nextLine();

            epicAnswer = formatBetter(epicAnswer);

            if (epicAnswer.equals("14.3") || epicAnswer.equals("14.3g")

                    || epicAnswer.equals("14.3grams")) {

                System.out.println("100%.  Awesome.");

                epicness = true;

            } else {

                bonus = false;

                System.out.println("Wrong");

            }

            if (epicness == false) {

                System.out.println("Let's walk through this");

                System.out.println("First of all, you have 17 g AgNO3");

                continueCom();

                System.out

                        .println(
                                "Its molar mass is 170 grams over moles, or grams per mole.  So multiply your given by 1 mole AgNO3 over 170 g AgNO3.");

                continueCom();

                System.out

                        .println(
                                "The mole ration is 1 over 1, one mole AgCl for every 1 mole AgNO3.  See that in the formula?");

                continueCom();

                System.out

                        .println(
                                "The molar mass of AgCl is 143 grams/mole.  We multiply by 143 g AgCl over 1 mol AgCl.  Remember, 143g/1 mol and 1 mol/143 g are both 1 in this case.");

                continueCom();

                System.out

                        .println(
                                "See how we've arranged the fractions?  THE STARS ARE ALIGNED.  Do some cancelling and get your answer.");

                continueCom();

                System.out.println("You should end up with 14.3 g AgCl");

            }

            if (readOn() == true) {

                System.out

                        .println("\n-If you've made it this far, you've touched on most of the curriculum.");

                System.out

                        .println("\n-The next two chapters, gases and solutions, are basically just subsitution.");

                System.out

                        .println(
                                "All you have to do is memorize a lot of formulas, know some random numbers, and know how to plug and chug");

                System.out

                        .println(
                                "\n-P1V1/T1 = P2V2 / T2.  That's the combined gas law, and it has three gas laws in it.  Confused?  Don't be.  It will be easy.");

                System.out

                        .println("\n-One mole of gas occupies 22.4 L, or liters");

                System.out

                        .println(
                                "\n-Here are some random numbers that will be significant in due time:  1 atm, 0 C, 0.0821, and 62.4");

                System.out

                        .println("\n- PV = NRT.  When it comes, memorize it.  You can rearrange it and do a lot");

                System.out

                        .println(
                                "\n-As for solutions, just remember that molarity is moles of solute divided by liters of solution.  Molality is moles of solute divided by kilograms of solvent.");

                System.out

                        .println(
                                "\n-How do you know which is which?  Here's how I remember it - water is the universal SOLVENT.");

                System.out

                        .println(
                                "\n-And, when you do boiling point/freezing point equations, just use the chart.  And it's freezing point depression.  Substract, don't add.");

                System.out.println("Aside from that, good luck.");

                System.out

                        .println(
                                "You're not done with this class, but by the time you've covered gas/solutions, you're almost there.");

            }

            if (bonus == true) {

                System.out

                        .println(
                                "\nBONUS\n\nBecause you've scored all do nows correctly, this program will provide part of a chemistry rap.");

                System.out.println("Ionic compounds, by kai");

                System.out

                        .println(
                                "Yo I’m gonna spit some rhymes/Bout ionic compounds/They’re microscopic/So they can’t be found ");

                System.out

                        .println("\nSo you ready?/  Aight, here we go./  1 2 3 4 AY NA KO");

                System.out

                        .println("Now before you learn/ about ionic compounds/ ya gotta know/ about chemical bonds");

                System.out

                        .println("They form/ by the attraction/ of a positive /and negative ion");

                System.out

                        .println("A monatomic ion shock is the number of oxidation");

                System.out

                        .println("If they match in two elements it will end their stagnation...");

            }

            if (bonus1 == true) {

                System.out

                        .println("\nBONUS\n-Didn't you wonder why this program was so big?");

                System.out

                        .println("\n-I have bundled minesweeper into it.  Our version.  For memories");

                GameController gc1 = new GameController();

                gc1.getDifficulty();

            }

        }

    }

    private static String getCommand() {

        Scanner x11 = new Scanner(System.in);

        return x11.nextLine();

    }

    private static void continueCom() {

        Scanner x = new Scanner(System.in);

        System.out.println("\nHit enter to continue");

        String y = x.nextLine();

    }

    private static int curve(int x) {

        if (x == 0) {

            return 0;

        } else if (x == 25) {

            return 60;

        } else if (x == 50) {

            return 70;

        } else if (x == 75) {

            return 90;

        } else {

            return 100;

        }

    }

    private static String formatBetter(String x) {

        x = x.trim();

        x = x.replaceAll(" ", "");

        x = x.toLowerCase();

        return x;

    }

    private static boolean readOn() {

        Scanner x = new Scanner(System.in);

        System.out

                .println("Hit enter to read lots of text or hit S to skip this");

        String stopOrDont = x.nextLine();

        stopOrDont = formatBetter(stopOrDont);

        if (stopOrDont.equals("s")) {

            return false;

        } else {

            return true;

        }

    }

}