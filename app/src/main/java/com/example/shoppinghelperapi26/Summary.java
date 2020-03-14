package com.example.shoppinghelperapi26;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class Summary extends AppCompatActivity {

    public static String stringOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        //array lists to prepare a full order list
        ArrayList<Integer> order = new ArrayList<>(); //list of qty's
        ArrayList<String> orderName = new ArrayList<>(); //list of names
        ArrayList<String> totalOrder = new ArrayList<>(); //list of both qty's + names

        //called qty data from another class
        int iTomato = VegetablesActivity.getTomatoQty();
        int iOnion = VegetablesActivity.getOnionQty();
        int iCucumber = VegetablesActivity.getCucumberQty();
        int iPotato = VegetablesActivity.getPotatoQty();
        int iPaprika = VegetablesActivity.getPaprikaQty();
        int iChive = VegetablesActivity.getChiveQty();
        int iParsley = VegetablesActivity.getParsleyQty();
        int iIceberg = VegetablesActivity.getIcebergQty();
        int iGarlic = VegetablesActivity.getGarlicQty();

        int iApple = FruitsActivity.getAppleQty();
        int iBanana = FruitsActivity.getBananaQty();
        int iLemon = FruitsActivity.getLemonQty();
        int iMandarin = FruitsActivity.getMandarinQty();
        int iOrange = FruitsActivity.getOrangeQty();
        int iPeach = FruitsActivity.getPeachQty();
        int iNectarine = FruitsActivity.getNectarineQty();
        int iPear = FruitsActivity.getPearQty();
        int iGrape = FruitsActivity.getGrapeQty();
        int iWatermelon = FruitsActivity.getWatermelonQty();
        int iCherry = FruitsActivity.getCherryQty();
        int iSweetCherry = FruitsActivity.getSweetCherryQty();
        int iKiwi = FruitsActivity.getKiwiQty();

		int iWater = DrinksActivity.getWaterQty();
		int iSparklingWater = DrinksActivity.getSparklingWaterQty();
		int iFizzyDrink = DrinksActivity.getFizzyDrinkQty();
		int iCola = DrinksActivity.getColaQty();
		int iJuice = DrinksActivity.getJuiceQty();
		int iBeer = DrinksActivity.getBeerQty();
		int iVodka = DrinksActivity.getVodkaQty();

		int iSlicedBread = BakeryActivity.getSlicedBreadQty();
		int iWholeBread = BakeryActivity.getWholeBreadQty();
		int iRolls = BakeryActivity.getRollsQty();
		int iSweetRolls = BakeryActivity.getSweetRollsQty();
		int iDonuts = BakeryActivity.getDonutsQty();
		int iPita = BakeryActivity.getPitaQty();

		int iToothpaste = OtherActivity.getToothpasteQty();
		int iDishSoap = OtherActivity.getDishSoapQty();
		int iToiletPaper = OtherActivity.getToiletPaperQty();
		int iPaperTowels = OtherActivity.getPaperTowelsQty();
		int iDiapers = OtherActivity.getDiapersQty();
		int iShavingMachines = OtherActivity.getShavingMachinesQty();
		int iShavingFoam = OtherActivity.getShavingFoamQty();
		int iShampoo = OtherActivity.getShampooQty();
		int iBubbleBath = OtherActivity.getBubbleBathQty();

        //lots of if's will check is each item ordered
        if (iTomato > 0) {
            order.add(iTomato);
            orderName.add(getString(R.string.tomato));
        }
        if (iOnion > 0) {
            order.add(iOnion);
            orderName.add(getString(R.string.onion));
        }
        if (iCucumber > 0) {
            order.add(iCucumber);
            orderName.add(getString(R.string.cucumber));
        }
        if (iPotato > 0) {
            order.add(iPotato);
            orderName.add(getString(R.string.potato));
        }
        if (iPaprika > 0) {
            order.add(iPaprika);
            orderName.add(getString(R.string.paprika));
        }
        if (iChive > 0) {
            order.add(iChive);
            orderName.add(getString(R.string.chive));
        }
        if (iParsley > 0) {
            order.add(iParsley);
            orderName.add(getString(R.string.parsley));
        }
        if (iIceberg > 0) {
            order.add(iIceberg);
            orderName.add(getString(R.string.iceberg));
        }
        if (iGarlic > 0) {
            order.add(iGarlic);
            orderName.add(getString(R.string.garlic));
        }
        if (iApple > 0) {
            order.add(iApple);
            orderName.add(getString(R.string.apple));
        }
        if (iBanana > 0) {
            order.add(iBanana);
            orderName.add(getString(R.string.banana));
        }
        if (iLemon > 0) {
            order.add(iLemon);
            orderName.add(getString(R.string.lemon));
        }
        if (iMandarin > 0) {
            order.add(iMandarin);
            orderName.add(getString(R.string.mandarin));
        }
        if (iOrange > 0) {
            order.add(iOrange);
            orderName.add(getString(R.string.orange));
        }
        if (iPeach > 0) {
            order.add(iPeach);
            orderName.add(getString(R.string.peach));
        }
        if (iNectarine > 0) {
            order.add(iNectarine);
            orderName.add(getString(R.string.nectarine));
        }
        if (iPear > 0) {
            order.add(iPear);
            orderName.add(getString(R.string.pear));
        }
        if (iGrape > 0) {
            order.add(iGrape);
            orderName.add(getString(R.string.grape));
        }
        if (iWatermelon > 0) {
            order.add(iWatermelon);
            orderName.add(getString(R.string.watermelon));
        }
        if (iCherry > 0) {
            order.add(iCherry);
            orderName.add(getString(R.string.cherry));
        }
        if (iSweetCherry > 0) {
            order.add(iSweetCherry);
            orderName.add(getString(R.string.sweetCherry));
        }
        if (iKiwi > 0) {
            order.add(iKiwi);
            orderName.add(getString(R.string.kiwi));
        }
		if (iWater > 0) {
            order.add(iWater);
            orderName.add(getString(R.string.water));
        }
        if (iSparklingWater > 0) {
            order.add(iSparklingWater);
            orderName.add(getString(R.string.sparklingWater));
        }
        if (iFizzyDrink > 0) {
            order.add(iFizzyDrink);
            orderName.add(getString(R.string.fizzyDrink));
        }
        if (iCola > 0) {
            order.add(iCola);
            orderName.add(getString(R.string.cola));
        }
        if (iJuice > 0) {
            order.add(iJuice);
            orderName.add(getString(R.string.juice));
        }if (iBeer > 0) {
            order.add(iBeer);
            orderName.add(getString(R.string.beer));
        }
        if (iVodka > 0) {
            order.add(iVodka);
            orderName.add(getString(R.string.vodka));
        }
        if (iSlicedBread > 0) {
            order.add(iSlicedBread);
            orderName.add(getString(R.string.slicedBread));
        }
        if (iWholeBread > 0) {
            order.add(iWholeBread);
            orderName.add(getString(R.string.wholeBread));
        }
        if (iRolls > 0) {
            order.add(iRolls);
            orderName.add(getString(R.string.rolls));
        }
        if (iSweetRolls > 0) {
            order.add(iSweetRolls);
            orderName.add(getString(R.string.sweetRolls));
        }
        if (iDonuts > 0) {
            order.add(iDonuts);
            orderName.add(getString(R.string.donuts));
        }
        if (iPita > 0) {
            order.add(iPita);
            orderName.add(getString(R.string.pita));
        }
        if (iToothpaste > 0) {
            order.add(iToothpaste);
            orderName.add(getString(R.string.toothpaste));
        }
        if (iDishSoap > 0) {
            order.add(iDishSoap);
            orderName.add(getString(R.string.dishSoap));
        }
        if (iToiletPaper > 0) {
            order.add(iToiletPaper);
            orderName.add(getString(R.string.toiletPaper));
        }
        if (iPaperTowels > 0) {
            order.add(iPaperTowels);
            orderName.add(getString(R.string.paperTowels));
        }
        if (iDiapers > 0) {
            order.add(iDiapers);
            orderName.add(getString(R.string.diapers));
        }
        if (iShavingMachines > 0) {
            order.add(iShavingMachines);
            orderName.add(getString(R.string.shavingMachines));
        }
        if (iShavingFoam > 0) {
            order.add(iShavingFoam);
            orderName.add(getString(R.string.shavingFoam));
        }
        if (iShampoo > 0) {
            order.add(iShampoo);
            orderName.add(getString(R.string.shampoo));
        }

        //this function will add two arrays into one
        for (int i = 0; i < order.size(); i++) {
            totalOrder.add(orderName.get(i) + ": " + order.get(i));
        }

        /**function that display order on the screen and on the beginning it checks is there less than 30 items in order*/
        int a = 1;
        if (totalOrder.size() >= 30) {
            Toast.makeText(this, R.string.toManyItems, Toast.LENGTH_SHORT).show();
            TextView wrongQty = findViewById(R.id.order1);
            wrongQty.setText(R.string.toManyItems);
        } else for (int i = 0; i < totalOrder.size(); i++) {
            String orderViewNumber = "order" + a;
            int ID = getResources().getIdentifier(orderViewNumber, "id", getPackageName());
            TextView qtyView = findViewById(ID);
            qtyView.setText("" + totalOrder.get(i));
            a++;
        }

        //function that takes whole order from array list and cast it to string which can be send via email/sms intent
       final String stringOrder = String.join("; ", totalOrder);

        //function that will take care of sendOrder button
        Button sendOrder = findViewById(R.id.sendOrder);
        sendOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", getString(R.string.email), null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.emailSubject));
                emailIntent.putExtra(Intent.EXTRA_TEXT, stringOrder);
                startActivity(Intent.createChooser(emailIntent, getString(R.string.chooserMessage)));
            }
        });

    }
}
