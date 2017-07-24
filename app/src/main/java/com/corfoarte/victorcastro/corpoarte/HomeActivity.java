package com.corfoarte.victorcastro.corpoarte;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import butterknife.BindView;


public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.ToolbarR)
    Toolbar ToolbarR;

    @BindView(R.id.appbar)
    AppBarLayout appbar;
    @BindView(R.id.viewPager)
    ViewPager viewPager;

    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        tabLayout = (android.support.design.widget.TabLayout) findViewById(R.id.TabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setUpViewPager();

    }


    private ArrayList<Fragment> agregarFragments() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        // fragments.add(new ReclyclerViewFragment());
        fragments.add(new NoticiasFragment());
        fragments.add(new NoticiasFragment());

        return fragments;
    }

    private void setUpViewPager() {
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Del Evento");//setIcon(R.drawable.gt);
        tabLayout.getTabAt(1).setText("Del Municipio");//.setIcon(R.drawable.gt);
        //tabLayout.getTabAt(1).setIcon(R.drawable.ic_pet);
    }


}
