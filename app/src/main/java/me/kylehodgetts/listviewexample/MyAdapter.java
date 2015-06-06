package me.kylehodgetts.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by kylehodgetts on 06/06/15.
 */
public class MyAdapter extends ArrayAdapter<String> {

    public MyAdapter(Context context, String[] values){
        super(context, R.layout.row_layout, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        /*
            The LayoutInflator puts a layout into the right View
            Get the view from the instance field stored in the super class. (getContext())

            This context is passed into this constructor and then into the super
            constructor
         */
        LayoutInflater inflater = LayoutInflater.from(super.getContext());

        // inflate takes the resource to load, the parent that the resource may be
        // loaded into and true or false if we are loading into a parent view.
        View myView = inflater.inflate(R.layout.row_layout, parent, false);

        // We retrieve the text from the array
        String tvShow = getItem(position);

        // Get the TextView we want to edit
        TextView theTextView = (TextView) myView.findViewById(R.id.text_view_1);

        // Put the next TV Show into the TextView
        theTextView.setText(tvShow);

        /**
         * The image icon can also be set here using
         *
         */

        return myView;
    }
}
