package app.vacs.com.vacexpress;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;


public class Main_Nav extends FragmentActivity {

    ViewPager pager= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pager);
        pager= (ViewPager) findViewById(R.id.pager);
        FragmentManager fm= getSupportFragmentManager();

        pager.setAdapter(new MyAdapter(fm));



    }

}

class MyAdapter extends FragmentPagerAdapter
{

    public MyAdapter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }
    Fragment fragment;
    @Override
    public Fragment getItem(int j) {


        if(j==0)
        {
            fragment = new Vaccine_Done_Fragment();
        }
        if(j==1)
        {
            fragment= new Vaccine_NotDone_Fragment();
        }
		if(j==2)
		{
			fragment= new Maps_Fragment();
		}

        return fragment;

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        // TODO Auto-generated method stub
        String str= new String();
        if (position==0)
        {

            str="Done";
            return str;
        }
        if(position==1)
        {
            return "Not Done";
        }
	 if(position==2) {
         return "Maps";
     }

        return null;
    }

}
