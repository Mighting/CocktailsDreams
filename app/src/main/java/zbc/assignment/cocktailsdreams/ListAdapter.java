package zbc.assignment.cocktailsdreams;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {

    private Context context;
    private String drinkName[];
    private int drinks[];
    private LayoutInflater inflter;

    public ListAdapter(Context applicationContext, String[] drinknames, int[] drinks) {
        this.context = context;
        this.drinkName = drinknames;
        this.drinks = drinks;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return drinkName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_listview, null);
        TextView drink = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        drink.setText(drinkName[i]);
        icon.setImageResource(drinks[i]);
        return view;
    }
}
