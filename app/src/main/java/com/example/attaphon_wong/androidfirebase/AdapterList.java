package com.example.attaphon_wong.androidfirebase;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by attaphon_wong on 11/12/2560.
 */

public class AdapterList extends BaseAdapter {
    private Context mContext;
    private List<User> mUserList;


    //constructor

    public AdapterList(Context mContext, List<User> mUserList) {
        this.mContext = mContext;
        this.mUserList = mUserList;
    }

    @Override
    public int getCount() {
        return mUserList.size();
    }

    @Override
    public Object getItem(int position) {
        return mUserList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View v = View.inflate(mContext,R.layout.data,null);
        TextView tvname = (TextView) v.findViewById(R.id.tv_name);
        TextView tvquote = (TextView) v.findViewById(R.id.tv_quote);

        //set text

        tvname.setText(mUserList.get(position).getName_());
        tvquote.setText(mUserList.get(position).getQuote_());

        return v;
    }
}
