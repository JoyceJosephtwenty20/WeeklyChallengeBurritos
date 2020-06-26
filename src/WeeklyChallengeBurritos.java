import java.util.ArrayList;

import java.util.Random;


class WeeklyChallengeBurritos {
    public static void main(String[] args) {

        Random rand = new Random();

        String[] table = new String[9];

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

        beans.add("pinto");
        beans.add("black");
        beans.add("none");
        beans.add("all");

        ArrayList<String> salsa = new ArrayList<String>();

        salsa.add("mild");
        salsa.add("medium");
        salsa.add("hot");
        salsa.add("none");
        salsa.add("all");

        ArrayList<String> veggies = new ArrayList<String>();

        veggies.add("lettuce");
        veggies.add("fajita veggies");
        veggies.add("none");
        veggies.add("all");

        ArrayList<String> cheese = new ArrayList<String>();

        cheese.add("yes");
        cheese.add("no");

        ArrayList<String> guac = new ArrayList<String>();

        guac.add("yes");
        guac.add("no");

        ArrayList<String> queso = new ArrayList<String>();

        queso.add("yes");
        queso.add("no");

        ArrayList<String> sourCream = new ArrayList<String>();

        sourCream.add("yes");
        sourCream.add("no");

        double ricePrice;

        String randRice;
        String randMeat;
        String randBean;
        String randSalsa;
        String randVegge;
        String randCheese;
        String randGuac;
        String randQueso;
        String randSourCream;

        // prints 10 burritios
        for (int i = 1; i < 26; i++) {
            double total = 3.00;
            randRice = rice.get(rand.nextInt(rice.size()));
            randMeat = meat.get(rand.nextInt(meat.size()));
            randBean = beans.get(rand.nextInt(beans.size()));
            randSalsa = salsa.get(rand.nextInt(salsa.size()));
            randVegge = veggies.get(rand.nextInt(veggies.size()));
            randCheese = cheese.get(rand.nextInt(cheese.size()));
            randGuac = guac.get(rand.nextInt(guac.size()));
            randQueso = queso.get(rand.nextInt(queso.size()));
            randSourCream = sourCream.get(rand.nextInt(sourCream.size()));

            // if none
            if (randRice.equalsIgnoreCase("none")){
                randRice = "no rice,";
            }else if (randRice.equalsIgnoreCase("all")){
                randRice = "brown rice, white rice,";
                total += 1.00;
            }else{
                randRice = randRice;
                total +=0.50;
            }
            if (randMeat.equalsIgnoreCase("none")){
                randRice = "no meat,";
            }else if (randMeat.equalsIgnoreCase("all")) {
                randMeat = "chicken, steak, carnidas,";
                total += 1.50;
            }else {
                randMeat = randMeat;
                total += 0.50;
            }
            if (randBean.equalsIgnoreCase("none")){
                randRice = "no bean,";
            }else if (randBean.equalsIgnoreCase("all")) {
                randBean = "pinto, black,";
                total += 1.00;
            }else{
                randBean = randBean;
                total +=0.5;
            }
            if (randSalsa.equalsIgnoreCase("none")) {
                randRice = "no salsa,";
            }else if (randSalsa.equalsIgnoreCase("all")) {
                randSalsa = "mild, medium, hot";
                total += 1.50;
            }else {
                randSalsa = randVegge;
                total +=0.50;

            }
            if (randVegge.equalsIgnoreCase("none")){
                randVegge = "no veggies,";
            }else if (randVegge.equalsIgnoreCase("all")) {
                randVegge = "lettuce, fajita veggies";
                total += 1.00;
            } else {
                randVegge = randVegge;
                total += 0.50;
            }
            if (randCheese.equalsIgnoreCase("no")) {
                randCheese = "no cheese";
            }else {
                randCheese = "cheese";
                total += 0.50;
            }
            if(randGuac.equalsIgnoreCase("no")) {
                randGuac = "no guac";
            }else {
                randGuac = "guac";
                total += 0.50;
            }
            if (randQueso.equalsIgnoreCase("no")) {
                randQueso = "no queso";
            }else {
                randQueso = "queso";
                total += 0.50;
            }
            if (randSourCream.equalsIgnoreCase("no")){
                randSourCream = "no sour cream";
            }else {
                randSourCream = "sour cream";
                total += 0.50;
            }

            System.out.println("Burrito " + i + " " + randRice + " " + randMeat +
                    ", " + randBean + ", " + randSalsa + " " + randVegge + " "+ randCheese + " " + randGuac + " " + randQueso +
                    " " + randSourCream+ " $" + total);

        }

    }
}
