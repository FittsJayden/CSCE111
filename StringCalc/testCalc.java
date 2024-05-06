public class testCalc {
    public static void main(String[] args) {
        if (reverseTest() == false) {
            System.out.println("Reverse is failing");
        }
        else {
            System.out.println("Reverse works");
        }
    }
    /**
     * Tests the reverse method.
     * @return boolean where false is a fail.
     */
    private static boolean reverseTest() {
        boolean test = true;
        if (Calc.reverse("hello!") == "!olleh" || Calc.reverse("UCONN HUSKIES") == "SEIKSUH NNOCU" || Calc.reverse("n n o c u") == "u c o n n" || Calc.reverse("ssssssy") == "yssssss") {
            test = false;
        }
        return test;
    }
}
