import greenfoot.*;

/**
 * Write a description of class Road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Road extends World
{
        public Road()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(945, 640, 1);
        setPaintOrder(moto1.class,Moto2.class,FinishLine1.class,TestProblem.class,TestProblem1.class,TestProblem2.class,TestProblem3.class,Equation.class,grass.class,grass1.class,Border.class,Border1.class,Road_2Player.class);
        prepare();
       
    }
    

    private void prepare()
    {
        addObject ( new Road_2Player(), 474, 318 );
        addObject ( new moto1(), 216, 528);
        addObject ( new Moto2(), 732, 526);
        Border border = new Border();
        addObject(border, 38, 383);
        border.setLocation(38, 394);
        Border border2 = new Border();
        addObject(border2, 413, 398);
        border2.setLocation(411, 393);
        Border border3 = new Border();
        addObject(border3, 911, 393);
        border3.setLocation(906, 393);
        Border border4 = new Border();
        addObject(border4, 540, 397);
        border4.setLocation(536, 390);
        border4.setLocation(533, 393);
        grass grass = new grass();
        addObject(grass, 17, 431);
        grass.setLocation(8, 425);
        grass1 grass1 = new grass1();
        addObject(grass1, 944, 425);
        grass1.setLocation(936, 424);
        grass1 grass12 = new grass1();
        addObject(grass12, 452, 432);
        grass12.setLocation(442, 426);
        grass grass2 = new grass();
        addObject(grass2, 508, 427);
        grass2.setLocation(502, 424);
        TestProblem2 testproblem2 = new TestProblem2();
        addObject(testproblem2, 230, 168);
        testproblem2.setLocation(224, 163);
        TestProblem1 testproblem1 = new TestProblem1();
        addObject(testproblem1, 310, 176);
        testproblem1.setLocation(320, 164);
        TestProblem3 testproblem3 = new TestProblem3();
        addObject(testproblem3, 137, 165);
        testproblem3.setLocation(127, 162);
        testproblem3.setLocation(131, 165);
        TestProblem1 testproblem12 = new TestProblem1();
        addObject(testproblem12, 718, 160);
        testproblem12.setLocation(707, 159);
        TestProblem2 testproblem22 = new TestProblem2();
        addObject(testproblem22, 624, 170);
        testproblem22.setLocation(627, 162);
        TestProblem3 testproblem32 = new TestProblem3();
        addObject(testproblem32, 813, 165);
        testproblem32.setLocation(810, 160);
        testproblem12.setLocation(716, 158);
        testproblem22.setLocation(628, 159);
        Equation equation = new Equation();
        addObject(equation, 264, 74);
        equation.setLocation(221, 77);
        Equation equation2 = new Equation();
        addObject(equation2, 723, 96);
        equation2.setLocation(707, 90);
        equation2.setLocation(710, 84);
    }
}
