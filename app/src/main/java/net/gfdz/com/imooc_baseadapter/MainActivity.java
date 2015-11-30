package net.gfdz.com.imooc_baseadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private List<Bean> mDatas;
    private MyAdapter adapter;
    private CommonAdapter commonAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDatas();
        initViews();
    }

    private void initDatas() {
        mDatas = new ArrayList<Bean>();
        Bean bean1 = new Bean("Android新技能Get1", "hkjda的说法就是发布时间不断开发", "2015-11-30", "10086");
        mDatas.add(bean1);

        Bean bean2 = new Bean("Android新技能Get2", "hkjda的说法就是发布时间不断开发", "2015-11-30", "10086");
        mDatas.add(bean2);

        Bean bean3 = new Bean("Android新技能Get3", "hkjda的说法就是发布时间不断开发", "2015-11-30", "10086");
        mDatas.add(bean3);

        Bean bean4 = new Bean("Android新技能Get4", "hkjda的说法就是发布时间不断开发", "2015-11-30", "10086");
        mDatas.add(bean4);

        Bean bean5 = new Bean("Android新技能Get5", "hkjda的说法就是发布时间不断开发", "2015-11-30", "10086");
        mDatas.add(bean5);

        Bean bean6 = new Bean("Android新技能Get6", "hkjda的说法就是发布时间不断开发", "2015-11-30", "10086");
        mDatas.add(bean6);

        Bean bean7 = new Bean("Android新技能Get7", "hkjda的说法就是发布时间不断开发", "2015-11-30", "10086");
        mDatas.add(bean7);
       // adapter=new MyAdapter(this,mDatas);
        commonAdapter=new CommonAdapter(this,mDatas);

    }

    private void initViews() {
        mListView = (ListView) findViewById(R.id.id_listview);

        mListView.setAdapter(commonAdapter);


    }
}
