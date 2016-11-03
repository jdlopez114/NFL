package com.example.jello.rv_example;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.jello.rv_example.teamFrag.Bears;
import com.example.jello.rv_example.teamFrag.Bengals;
import com.example.jello.rv_example.teamFrag.Bills;
import com.example.jello.rv_example.teamFrag.Broncos;
import com.example.jello.rv_example.teamFrag.Browns;
import com.example.jello.rv_example.teamFrag.Bucs;
import com.example.jello.rv_example.teamFrag.Cards;
import com.example.jello.rv_example.teamFrag.Chargers;
import com.example.jello.rv_example.teamFrag.Chiefs;
import com.example.jello.rv_example.teamFrag.Colts;
import com.example.jello.rv_example.teamFrag.Cowboys;
import com.example.jello.rv_example.teamFrag.Dolphins;
import com.example.jello.rv_example.teamFrag.Eagles;
import com.example.jello.rv_example.teamFrag.Falcons;
import com.example.jello.rv_example.teamFrag.Giants;
import com.example.jello.rv_example.teamFrag.Jags;
import com.example.jello.rv_example.teamFrag.Jets;
import com.example.jello.rv_example.teamFrag.Lions;
import com.example.jello.rv_example.teamFrag.Niners;
import com.example.jello.rv_example.teamFrag.Packers;
import com.example.jello.rv_example.teamFrag.Panthers;
import com.example.jello.rv_example.teamFrag.Pats;
import com.example.jello.rv_example.teamFrag.Raiders;
import com.example.jello.rv_example.teamFrag.Rams;
import com.example.jello.rv_example.teamFrag.Ravens;
import com.example.jello.rv_example.teamFrag.Redskins;
import com.example.jello.rv_example.teamFrag.Saints;
import com.example.jello.rv_example.teamFrag.Seahawks;
import com.example.jello.rv_example.teamFrag.Steelers;
import com.example.jello.rv_example.teamFrag.Texans;
import com.example.jello.rv_example.teamFrag.Vikings;

public class TeamView extends AppCompatActivity {

    public static final String TEAM_NAME = "extra.team.name";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_profile);
        String team = getIntent().getStringExtra(TEAM_NAME);
        if (team != null) {
            switch (team) {
                case "49ers":
                    show49ers();
                    break;
                case "Bears":
                    showBears();
                    break;
                case "Bengals":
                    showBengals();
                    break;
                case "Bills":
                    showBills();
                    break;
                case "Broncos":
                    showBroncos();
                    break;
                case "Browns":
                    showBrowns();
                    break;
                case "Buccaneers":
                    showBucs();
                    break;
                case "Cardinals":
                    showCards();
                    break;
                case "Chargers":
                    showChargers();
                    break;
                case "Chiefs":
                    showChiefs();
                    break;
                case "Colts":
                    showColts();
                    break;
                case "Cowboys":
                    showCowboys();
                    break;
                case "Dolphins":
                    showDolphins();
                    break;
                case "Eagles":
                    showEagles();
                    break;
                case "Falcons":
                    showFalcons();
                    break;
                case "Giants":
                    showGiants();
                    break;
                case "Jaguars":
                    showJags();
                    break;
                case "Jets":
                    showJets();
                    break;
                case "Lions":
                    showLions();
                    break;
                case "Packers":
                    showPackers();
                    break;
                case "Panthers":
                    showPanthers();
                    break;
                case "Patriots":
                    showPats();
                    break;
                case "Raiders":
                    showRaiders();
                    break;
                case "Rams":
                    showRams();
                    break;
                case "Ravens":
                    showRavens();
                    break;
                case "Redskins":
                    showRedskins();
                    break;
                case "Saints":
                    showSaints();
                    break;
                case "Seahawks":
                    showSeahawks();
                    break;
                case "Steelers":
                    showSteelers();
                    break;
                case "Texans":
                    showTexans();
                    break;
                case "Vikings":
                    showVikings();
                    break;
            }
        }
    }

    private void showVikings() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Vikings());
        fragmentTransaction.commit();
    }

    private void showSeahawks() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Seahawks());
        fragmentTransaction.commit();
    }

    private void showTexans() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Texans());
        fragmentTransaction.commit();
    }

    private void showSteelers() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Steelers());
        fragmentTransaction.commit();

    }

    private void showSaints() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Saints());
        fragmentTransaction.commit();

    }

    private void showRedskins() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Redskins());
        fragmentTransaction.commit();

    }

    private void showRavens() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Ravens());
        fragmentTransaction.commit();

    }

    private void showRams() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Rams());
        fragmentTransaction.commit();

    }

    private void showRaiders() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Raiders());
        fragmentTransaction.commit();

    }


    private void showPats() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Pats());
        fragmentTransaction.commit();

    }

    private void showPanthers() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Panthers());
        fragmentTransaction.commit();

    }

    private void showPackers() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Packers());
        fragmentTransaction.commit();

    }

    private void showLions() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Lions());
        fragmentTransaction.commit();

    }

    private void showJets() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Jets());
        fragmentTransaction.commit();
    }

    private void showJags() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Jags());
        fragmentTransaction.commit();
    }

    private void showGiants() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Giants());
        fragmentTransaction.commit();
    }

    private void showFalcons() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Falcons());
        fragmentTransaction.commit();
    }

    private void showEagles() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Eagles());
        fragmentTransaction.commit();
    }

    private void showDolphins() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Dolphins());
        fragmentTransaction.commit();
    }

    private void showCowboys() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Cowboys());
        fragmentTransaction.commit();
    }

    private void showColts() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Colts());
        fragmentTransaction.commit();
    }

    private void showChiefs() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Chiefs());
        fragmentTransaction.commit();
    }

    private void showChargers() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Chargers());
        fragmentTransaction.commit();
    }

    private void showCards() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Cards());
        fragmentTransaction.commit();
    }

    private void showBucs() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Bucs());
        fragmentTransaction.commit();
    }

    private void showBrowns() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Browns());
        fragmentTransaction.commit();
    }

    private void showBroncos() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Broncos());
        fragmentTransaction.commit();
    }

    private void showBills() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Bills());
        fragmentTransaction.commit();
    }

    private void showBengals() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Bengals());
        fragmentTransaction.commit();
    }

    private void showBears() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Bears());
        fragmentTransaction.commit();
    }

    private void show49ers(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.team_pro, new Niners());
        fragmentTransaction.commit();
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds teams to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
