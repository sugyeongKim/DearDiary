package kr.hs.emirim.sugyeong.thanksdiary;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    LayoutInflater inflater = null;
    private ArrayList<itemData> m_oData = null;
    private int nListCnt = 0;

    public ListAdapter(ArrayList<itemData> _oData)
    {
        m_oData = _oData;
        nListCnt = m_oData.size();
    }

    @Override
    public int getCount() {
        Log.i("TAG", "getCount");
        return nListCnt;
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
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null)
        {
            final Context context = parent.getContext();
            if (inflater == null)
            {
                inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            }
            convertView = inflater.inflate(R.layout.itemlayout, parent, false);
        }
        TextView oTextTitle = (TextView) convertView.findViewById(R.id.textTitle);
        TextView oTextDate = (TextView) convertView.findViewById(R.id.textDate);

        oTextTitle.setText(m_oData.get(position).strTitle);
        oTextDate.setText(m_oData.get(position).strDate);
        return convertView;

    }
}
