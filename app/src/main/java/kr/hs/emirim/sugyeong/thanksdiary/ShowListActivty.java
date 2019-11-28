package kr.hs.emirim.sugyeong.thanksdiary;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ShowListActivty extends AppCompatActivity {
    private ListView m_oListView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showlist);
        String[] strDate = {"2017-01-03", "1965-02-23", "2016-04-13", "2010-01-01", "2017-06-20",
                "2012-07-08", "1980-04-14", "2016-09-26", "2014-10-11", "2010-12-24"};
        int nDatCnt=0;
        ArrayList<itemData> oData = new ArrayList<>();
        for (int i=0; i<1000; ++i)
        {
            itemData oItem = new itemData();
            oItem.strTitle = (i+1)+"번째 일기";
            oItem.strDate = strDate[nDatCnt++];
            oData.add(oItem);
            if (nDatCnt >= strDate.length) nDatCnt = 0;
        }
        // ListView, Adapter 생성 및 연결 ------------------------
        m_oListView = (ListView)findViewById(R.id.listView);
        ListAdapter oAdapter = new ListAdapter(oData);
        m_oListView.setAdapter(oAdapter);
    }
}
