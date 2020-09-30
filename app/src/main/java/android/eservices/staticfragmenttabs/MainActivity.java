package android.eservices.staticfragmenttabs;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private int currentCounter;
    private TextView counterTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViewPagerAndTabs();
    }

    private void setupViewPagerAndTabs() {

        final FragmentOne fragmentOne = FragmentOne.newInstance();
        final FragmentTwo fragmentTwo = FragmentTwo.newInstance();

        viewPager = (ViewPager) findViewById(R.id.tab_viewpager);
        viewPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                if (position == 0) {
                    return fragmentOne;
                } else {
                    return fragmentTwo;
                }

            }

            @Override
            public int getCount() {
                return 2;
            }
        });

    }

    //TODO : increment and decrement counter, use the already provided String ressource (see strings.xml)
}
