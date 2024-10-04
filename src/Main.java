//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
var box =5;
System.out.println(box);
box = box + 2;
System.out.println(box);
box =box - 3;
System.out.println(box);
box =box * 3;
System.out.println(box);
box= box / 4;
System.out.println(box);

var liftingCapacity= 50;
var stuffWeight =20 ;
var capacityLeft = liftingCapacity -stuffWeight;
System.out.println("еще можно положить"+ capacityLeft +"кг вещей");
var appeleWeight = 2;
 var orangesWeight = 3;
 var fruitWeight= appeleWeight+ orangesWeight;
 System.out.println("общий вес фруктов"+ fruitWeight );
 var meatWeight = 4;
 var weterWeight = 5;
 var tomatoesWeight =2;
 var cucumberWeight = 2;
var peppersWeight = 2;
 var zucchiniWeight=2;
 var vegetablesWeight = tomatoesWeight+cucumberWeight+peppersWeight + zucchiniWeight;
 var productsWeight = fruitWeight + vegetablesWeight +meatWeight +weterWeight;
 System.out.println("общий вес продуктов"+productsWeight+ "кг!");
 var liftWeight = liftingCapacity - stuffWeight - productsWeight;
 System.out.println("места осталось" + liftWeight + "кг!");
productsWeight=productsWeight *2 ;
System.out.println("туперь вес продуктов"+ productsWeight);
liftWeight= liftingCapacity - stuffWeight - productsWeight;
System.out.println("теперь места осталось"+ liftWeight + "кг!");
var overload = (stuffWeight + productsWeight) % liftingCapacity;
System.out.println("перегруз на" + overload + "кг!");
var productsInOneCar = productsWeight / 2;
System.out.println("продуктов в одной машине теперь"+ productsInOneCar);
//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        }
    }
