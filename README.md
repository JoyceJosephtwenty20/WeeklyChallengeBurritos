
Write a program that will allow a robot to assemble 25 burritos. Use a random generator for each burrito option and build a list of 25 burrito customization:

Rice: white, brown, none, all
Meat: chicken, steak, carnidas, chorizo, sofritas, veggie meat, none, all
Beans: pinto, black, none, all
Salsa: mild, medium, hot, none, all
Veggies: lettuce, fajita veggies, none, all
Cheese: yes/no
Guac: yes/no
Queso: yes/no
Sour cream: yes/no

Randomly generate a number of ingredients per burrito. Each burrito should have a minimum of 5 ingredients and a maximum of 9 ingredients. 
Save the finished burritos and display the contents.

Calculate and display a price for each burrito. 
Pricing will be $3.00 plus 0.50 for each additional ingredient. So a burrito without any ingredients will be $3.00. Also, add $0.50 for "all" but for "none" or "no" add $0 .  


Process:
first create an array list for each type of ingredents;

use the if,else if and else statement to sort the list. Then use the randongenerator function on each type of ingredeents.


loop the random generation 25 times to get 25 burritos with diffrent ingreedents. 


