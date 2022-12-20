package com.example.cas_app;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;
public class PersonListAdapterr extends ArrayAdapter<Personn> {

    private static final String TAG = "PersonListAdapterr";

    private Context mContext;
    private int mResource;
    private int lastPosition = -1;

    /**
     * Holds variables in a View
     */
    private static class ViewHolder {
        TextView namee;
        TextView timeinout;
        TextView time;
        TextView datee;
    }

    /**
     * Default constructor for the PersonListAdapter
     * @param context
     * @param resource
     * @param objects
     */
    public PersonListAdapterr(Context context, int resource, ArrayList<Personn> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //get the persons information
        String namee = getItem(position).getNamee();
        String timeinout = getItem(position).getTimeinout();
        String time = getItem(position).getTime();
        String datee = getItem(position).getDatee();
        //Create the person object with the information
        Personn personn = new Personn(namee,timeinout,time,datee);

        //create the view result for showing the animation
        final View result;

        //ViewHolder object
        ViewHolder holder;


        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
            holder= new ViewHolder();
            holder.namee = (TextView) convertView.findViewById(R.id.namee);
            holder.timeinout = (TextView) convertView.findViewById(R.id.timeinout);
            holder.time = (TextView) convertView.findViewById(R.id.time);
            holder.datee = (TextView) convertView.findViewById(R.id.datee);
            result = convertView;

            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }


        Animation animation = AnimationUtils.loadAnimation(mContext,
                (position > lastPosition) ? R.anim.load_down_anim : R.anim.load_up_anim);
        result.startAnimation(animation);
        lastPosition = position;

        holder.namee.setText(personn.getNamee());
        holder.timeinout.setText(personn.getTimeinout());
        holder.time.setText(personn.getTime());
        holder.datee.setText(personn.getDatee());

        return convertView;
    }
}