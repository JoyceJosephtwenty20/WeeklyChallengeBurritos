import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

import java.util.Random;


public class WeeklyChallengeBurritos {
    public static void main(String[] args) {

        Random rand = new Random();

        ArrayList<String> rice = new ArrayList<String>();

        rice.add("white rice");
        rice.add("brown rice");
        rice.add("none");
        rice.add("all");

        ArrayList<String> meat = new ArrayList<String>();

        meat.add("chicken");
        meat.add("steak");
        meat.add("carnidas");
        meat.add("chorizo");
        meat.add("sofritas");
        meat.add("veggie meat");
        meat.add("none");
        meat.add("all");

        ArrayList<String> beans = new ArrayList<String>();
        beans.add("pinto beans");
        beans.add("black beans");
        beans.add("none");
        beans.add("all");

        ArrayList<String> salsa = new ArrayList<String>();
        salsa.add("mild salsa");
        salsa.add("medium salsa");
        salsa.add("hot salsa");
        salsa.add("none");
        salsa.add("all");

        ArrayList<String> veggies = new ArrayList<String>();
        veggies.add("lettuce");
        veggies.add("fajita veggies");
        veggies.add("none");
        veggies.add("all");

        ArrayList<String> sourCream = new ArrayList<String>();
        sourCream.add("yes");
        sourCream.add("no");

        ArrayList<String> guac = new ArrayList<String>();
        guac.add("yes");
        guac.add("no");

        ArrayList<String> cheese = new ArrayList<String>();
        cheese.add("yes");
        cheese.add("no");

        ArrayList<String> queso = new ArrayList<String>();
        queso.add("yes");
        queso.add("no");

        // to get double precision

        DecimalFormat dec = new DecimalFormat("#0.00");

        String randRice;
        String randMeat;
        String randBean;
        String randSalsa;
        String randVegge;
        String randSourCream;
        String randGuac;
        String randCheese;
        String randQueso;

        for (int i = 1; i <= 25; i++) {
            double total = 3.00;
            randRice = rice.get(rand.nextInt(rice.size()));
            randMeat = meat.get(rand.nextInt(meat.size()));
            randBean = beans.get(rand.nextInt(beans.size()));
            randSalsa = salsa.get(rand.nextInt(salsa.size()));
            randVegge = veggies.get(rand.nextInt(veggies.size()));
            randSourCream = sourCream.get(rand.nextInt(sourCream.size()));
            randGuac = guac.get(rand.nextInt(guac.size()));
            randCheese = cheese.get(rand.nextInt(cheese.size()));
            randQueso = queso.get(rand.nextInt(queso.size()));

            // if none
            if (randRice.equalsIgnoreCase("none")){
                randRice = "no rice";
                total += 0;
            } else {
                total += .50;
            }
            if (randMeat.equalsIgnoreCase("none")){
                randMeat = "no meat";
                total += 0;
            }else {
                total += .50;
            }
            if (randBean.equalsIgnoreCase("none")){
                randBean = "no bean";
                total += 0;
            } else {
                total += .50;
            }
            if (randSalsa.equalsIgnoreCase("none")){
                randSalsa = "no salsa";
                total += 0;
            } else {
                total += .50;
            }
            if (randVegge.equalsIgnoreCase("none")){
                randVegge = "no veggies";
                total += 0;
            } else {
                total += .50;
            }
            if (randSourCream.equalsIgnoreCase("no")){
                randSourCream = "";
                total += 0;
            }
            if (randGuac.equalsIgnoreCase("no")){
                randGuac = "";
                total += 0;
            }
            if (randCheese.equalsIgnoreCase("no")){
                randCheese = "";
                total += 0;
            }
            if (randQueso.equalsIgnoreCase("no")){
                randQueso = "";
                total += 0;
            }

            // if all
            if (randRice.equalsIgnoreCase("all")){
                randRice = "all rice";
            }
            if (randMeat.equalsIgnoreCase("all")){
                randMeat = "all meats";
            }
            if (randBean.equalsIgnoreCase("all")){
                randBean = "all beans";
            }
            if (randSalsa.equalsIgnoreCase("all")){
                randSalsa = "all salsas";
            }
            if (randVegge.equalsIgnoreCase("all")){
                randVegge = "all veggies";
            }
            if (randSourCream.equalsIgnoreCase("yes")){
                randSourCream = ", sour cream";
                total += .50;
            }
            if (randGuac.equalsIgnoreCase("yes")){
                randGuac = ", guacamole";
                total += .50;
            }
            if (randCheese.equalsIgnoreCase("yes")){
                randCheese = ", cheese";
                total += .50;
            }
            if (randQueso.equalsIgnoreCase("yes")){
                randQueso = ", queso";
                total += .50;
            }

            // output
            System.out.println("Burrito " + i + ": " + randRice + ", " + randMeat +
                    ", " + randBean + ", " + randSalsa + ", " + randVegge
                    + randSourCream + randGuac + randCheese + randQueso + "\t$"
                    + dec.format(total));
        }
    }
}
