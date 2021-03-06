package com.xdroid.demo.adapter;

import android.content.Context;

import java.util.List;

import com.xdroid.demo.R;
import com.xdroid.demo.model.MeiTuanBean;
import com.xdroid.demo.utils.CommonAdapter;
import com.xdroid.demo.utils.ViewHolder;

/**
 * Created by zhangxutong .
 * Date: 16/08/28
 */

public class MeituanAdapter extends CommonAdapter<MeiTuanBean> {
    public MeituanAdapter(Context context, int layoutId, List<MeiTuanBean> datas) {
        super(context, layoutId, datas);
    }

    @Override
    public void convert(ViewHolder holder, final MeiTuanBean cityBean) {
        holder.setText(R.id.tvCity, cityBean.getCity());
    }
}