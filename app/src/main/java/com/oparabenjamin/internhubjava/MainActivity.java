package com.oparabenjamin.internhubjava;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.oparabenjamin.internhubjava.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

    }

    public void moveToJavaIO(View view) {startActivity(new Intent(this, JavaIOActivity.class));
    }

    public void moveToClassObj(View view) {startActivity(new Intent(this, ClassObjActivity.class));
    }

    public void moveToCtrl(View view) {startActivity(new Intent(this, CtrlActivity.class));
    }

    public void moveToInheritance(View view) {startActivity(new Intent(this, InheritanceActivity.class));
    }

    public void moveToExcept(View view) {startActivity(new Intent(this, ExceptActivity.class));
    }

    public void moveToPoly(View view) {startActivity(new Intent(this, PolyActivity.class));
    }

    public void moveToArrays(View view) {startActivity(new Intent(this, ArraysActivity.class));
    }




    public void moveToJavaIOE(View view) {startActivity(new Intent(this, JavaIOEActivity.class));
    }

    public void moveToClassObjE(View view) {startActivity(new Intent(this, ClassObjEActivity.class));
    }

    public void moveToCtrlE(View view) {startActivity(new Intent(this, CtrlEActivity.class));
    }

    public void moveToInheritanceE(View view) {startActivity(new Intent(this, InheritanceEActivity.class));
    }

    public void moveToExceptE(View view) {startActivity(new Intent(this, ExceptEActivity.class));
    }

    public void moveToPolyE(View view) {startActivity(new Intent(this, PolyEActivity.class));
    }

    public void moveToArraysE(View view) {startActivity(new Intent(this, ArraysEActivity.class));
    }

}