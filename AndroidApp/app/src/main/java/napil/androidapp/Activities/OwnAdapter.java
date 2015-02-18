package napil.androidapp.Activities;

/**
 * Created by Napil on 2/12/2015.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import napil.androidapp.R;


public class OwnAdapter extends ArrayAdapter<String> {
    public final Context context;
    public final String[] val;
    public final String[] mgs;

    public OwnAdapter(Context context, String[] val, String[] mgs){
        super(context, R.layout.home_page, val);
        this.context = context;
        this.val = val;
        this.mgs=mgs;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        LayoutInflater inflate = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View listv2 = inflate.inflate(R.layout.list, parent, false);
        TextView uName = (TextView) listv2.findViewById(R.id.movie);
        TextView post = (TextView) listv2.findViewById(R.id.genre);
        ImageView imgView = (ImageView) listv2.findViewById(R.id.pp);
        uName.setText(val[position]);
        post.setText(mgs[position]);

        String s  = val[position];
        imgView.setImageResource(R.drawable.poster);




        return listv2	;
    }


}
