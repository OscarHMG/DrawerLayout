package oscarhmg.com.navigationview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by user on 07/06/2017.
 */
public class CustomAdapter extends ArrayAdapter<Row>{
    Context context;
    int layoutResourceId;
    Row data[] = null;


    public CustomAdapter(Context context, int layoutResourceId, Row[] data){
        super(context, layoutResourceId, data);
        this.context = context;
        this.data = data;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;

        LayoutInflater inflater = ((Activity)(context)).getLayoutInflater();

        if(position<=3) {
            listItem = inflater.inflate(R.layout.list_item_row_2,parent,false);
            View divider =(View) listItem.findViewById(R.id.divider);
            if(position !=3 ){
                divider.setVisibility(View.GONE);
            }
        }else
            listItem = inflater.inflate(R.layout.list_view_item_row, parent, false);



        ImageView icon = (ImageView) listItem.findViewById(R.id.imageViewIcon);
        TextView titulo = (TextView) listItem.findViewById(R.id.textViewName);

        Row folder = data[position];

        icon.setImageResource(folder.getIcon());
        titulo.setText(folder.getName());

        return listItem;

    }
}
