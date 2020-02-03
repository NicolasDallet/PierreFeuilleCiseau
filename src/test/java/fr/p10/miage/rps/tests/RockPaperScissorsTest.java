package fr.p10.miage.rps.tests;

import fr.p10.miage.rps.model.RPSEnum;
import fr.p10.miage.rps.model.Result;
import fr.p10.miage.rps.model.RockPaperScissors;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class RockPaperScissorsTest {

    private RockPaperScissors rps;

    @BeforeClass
    public void setUpClass(){
    }

    @BeforeMethod
    public void setUp() {
        rps=new RockPaperScissors();
    }

    @AfterMethod
    public void tearDown(){
        rps=null;
    }

    @AfterClass
    public void tearDownClass(){

    }

    @DataProvider(name = "winData")
    public Object[][] createData1() {
        return new Object[][] {

        };
    }


    @Parameters({"paper","rock"})
    @Test
    public void testWINPlay(String p1, String p2){
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.WIN);
    }

    @Parameters({"paper","paper"})
    @Test
    public void testTIEPlay(String p1, String p2){
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.TIE);
    }

    @Parameters({"paper","scissors"})
    @Test
    public void testLOSTPlay(String p1, String p2){
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.LOST);
    }

    @Test ( dataProvider = "winData ")
    void testWinPlay ( RPSEnum p1 , RPSEnum p2 ){

    }
}
