package com.fm.primerparcial;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;

public class DetailActivity extends AppCompatActivity
{
    public Toolbar toolbar2;
    public ViewPager viewPager;
    public TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String modelo = intent.getExtras().getString("MODELO");

        toolbar2 = findViewById(R.id.appbar);
        setSupportActionBar(toolbar2);
        getSupportActionBar().setTitle(modelo);

        viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager, modelo);

        tabLayout = findViewById(R.id.appbartabs);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setupWithViewPager(viewPager);
    }
    private void setupViewPager(ViewPager viewPager, String modelo)
    {
        Bundle bundle = new Bundle();
        bundle.putString("MODELO", modelo);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        LayoutInflater inflator = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        DescriptionFragment fragment1 = new DescriptionFragment();
        fragment1.setArguments(bundle);
        adapter.addFrag(fragment1, "Descripción");

        TechSpecsFragment fragment2 = new TechSpecsFragment();
        fragment2.setArguments(bundle);
        adapter.addFrag(fragment2, "Especificaciones técnicas");

        viewPager.setAdapter(adapter);
    }
}
