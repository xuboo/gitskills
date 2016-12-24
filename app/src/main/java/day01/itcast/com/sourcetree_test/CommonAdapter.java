package day01.itcast.com.sourcetree_test;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by me2 on 2016/12/24.
 */

public class CommonAdapter extends BaseAdapter {
    private static final String TAG = "CommonAdapter";
    @Override
    public int getCount() {

        Log.e(TAG, "本地第一次修改CommonAdapter");

                Log.e(TAG, "远程第一次修改CommonAdapter");


        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
