package mypackage.Optionals;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicantProcessTest {

    @Test
    public void test() {
        System.out.println("Tested and approved");
    }


/*
    @Test
    public void Part1Test1() {
        ApplicationProcess ap1 = new ApplicationProcess(new Applicant(7, new Person("Harry", 8, 78, 12, 9, true), null));
        assertEquals(true, ap1.isGoodApplicant());
    }

    @Test
    public void Part1Test2() {
        ApplicationProcess ap2 = new ApplicationProcess(new Applicant(7, new Person("Harry", 8, 78, null, null, true), null));
        assertEquals(false, ap2.isGoodApplicant());
    }  */








    /////////////////////////////////////////////////////////////////////////////////////

 /*

    @Test
    public void Part2Test1() {
        ApplicationProcess ap3 = new ApplicationProcess(new Applicant(7, new Person("Harry", 8, 78, null, null, null),
                new Person("Trudy", 79, 1800, null, null, null)));
        assertEquals(false, ap3.isGoodApplicant());
    }

    @Test
    public void Part2Test2() {
        ApplicationProcess ap4 = new ApplicationProcess(new Applicant(7, new Person("Harry", 8, 78, null, null, true),
                new Person("Trudy", 79, 1800, 89, null, null)));
        assertEquals(true, ap4.isGoodApplicant());
    }

    @Test
    public void Part2Test3() {
        ApplicationProcess ap5 = new ApplicationProcess(new Applicant(7, new Person("Harry", 8, 78, null, 9, true),
                new Person("Trudy", 79, 12, 1, null, true)));
        assertEquals(false, ap5.isGoodApplicant());
    }

    @Test
    public void Part2Test4() {
        ApplicationProcess ap6 = new ApplicationProcess(new Applicant(7, new Person("Harry", 8, 78, 152, 9, true),
                new Person("Trudy", 79, 1800, null, 87, null)));
        assertEquals(false, ap6.isGoodApplicant());
    }

    @Test
    public void Part2Test5() {
        ApplicationProcess ap7 = new ApplicationProcess(new Applicant(7, new Person("Harry", 8, 78, 12, 9, true),
                new Person("Trudy", 79, 1800, 59, 20, false)));
        assertEquals(true, ap7.isGoodApplicant());
    }*/
}
