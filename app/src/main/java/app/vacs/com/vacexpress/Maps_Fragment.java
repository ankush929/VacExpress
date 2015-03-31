package app.vacs.com.vacexpress;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.vacs.com.vacexpress.R;


/**
 * Created by Rakesh on 31-Mar-15.
 */
public class Maps_Fragment extends Fragment{
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View v=inflater.inflate(R.layout.maps_frag, container, false);

            return v;

        }
}
