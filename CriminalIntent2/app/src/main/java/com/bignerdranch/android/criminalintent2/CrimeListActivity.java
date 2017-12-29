package com.bignerdranch.android.criminalintent2;

import android.support.v4.app.Fragment;

/**
 * Created by alanzhangg on 27/12/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
