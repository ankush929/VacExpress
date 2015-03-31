package app.vacs.com.vacexpress; /**
 * Created by Rakesh on 31-Mar-15.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.vacs.com.vacexpress.R;

public class Vaccine_NotDone_Fragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.notdone_frag, container, false);

        return v;

    }
}
