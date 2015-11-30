package net.gfdz.com.imooc_baseadapter;

import android.content.Context;
import android.widget.CheckBox;

import net.gfdz.com.utils.ViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2015/11/30.
 */
public class CommonAdapter extends net.gfdz.com.utils.CommonAdapter<Bean> {


    public CommonAdapter(Context context, List<Bean> datas, int layoutId) {
        super(context, datas, layoutId);
    }

    @Override
    public void conver(ViewHolder holder, Bean bean) {

        holder.setText(R.id.id_title, bean.getTitle())
                .setText(R.id.id_desc, bean.getDesc())
                .setText(R.id.id_time, bean.getTime())
                .setText(R.id.id_phone, bean.getPhone());
        CheckBox cb=holder.getView(R.id.id_cb);

       /* TextView mTitle=holder.getView(R.id.id_title);
        mTitle.setText(bean.getTitle());

        TextView mDesc=holder.getView(R.id.id_desc);
        mDesc.setText(bean.getDesc());

        TextView mTime=holder.getView(R.id.id_time);
        mTime.setText(bean.getTime());

        TextView mPhone=holder.getView(R.id.id_phone);
        mPhone.setText(bean.getPhone());*/

    }


}
