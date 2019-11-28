package kr.hs.emirim.sugyeong.thanksdiary;

import com.google.firebase.database.DatabaseReference;

import java.util.HashMap;
import java.util.Map;

public class DiaryInfo {
    public String Title;
    public String Contents;
    public String WriteDate;

    public DiaryInfo(){

    }

    public DiaryInfo(String Title, String Contents, String WriteDate){
        this.Contents=Contents;
        this.Title=Title;
        this.WriteDate = WriteDate;
    }

    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("제목", Title);
        result.put("내용", Contents);
        result.put("날짜", WriteDate);
        return result;
    }


    DatabaseReference mDBReference = null;
    HashMap<String, Object> childUpdates = null;
    Map<String, Object> userValue = null;
    DiaryInfo userInfo = null;
}
