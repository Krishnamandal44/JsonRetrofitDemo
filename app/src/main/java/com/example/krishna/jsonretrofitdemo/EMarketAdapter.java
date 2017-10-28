package com.example.krishna.jsonretrofitdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;



import java.util.List;

/**
 * Created by Admin on 04-09-2017.
 */

//public class EMarketAdapter extends RecyclerView.Adapter<EMarketAdapter.ViewHolder>{
//
//    private List<EMarketPojo> eMarketPojos;
//    private Context context;
//    private int child;
//
//    public EMarketAdapter(List<EMarketPojo> itemList, Context context) {
//        this.eMarketPojos = itemList;
//        this.context = context;
//    }
//
//    public EMarketAdapter(List<EMarketPojo> itemList, int child, Context context) {
//        this.eMarketPojos = itemList;
//        this.context = context;
//        this.child = child;
//    }
//
//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(child,parent, false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(ViewHolder holder, final int position) {
//        EMarketPojo eMarketPojo = eMarketPojos.get(position);
//        holder.textView.setText(eMarketPojo.getText());
////        holder.imageView.setImageResource(topRecyclerPojo.getImageUrl());
////        IonConnector.getInstance().loadImageDirectly(topRecyclerPojo.getImageUrl(), holder.imageView);
////        PicassoConnector.getInstance().loadImageDirectly(context, eMarketPojo.getImageUrl(), holder.imageView);
////        GlideConnector.getInstance().loadImageDirectly(context, eMarketPojo.getImageUrl(), holder.imageView);
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return eMarketPojos.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//        TextView textView;
//        ImageView imageView;
//        LinearLayout view;
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//            textView = (TextView) itemView.findViewById(R.id.top_rcv_child_text);
//            imageView = (ImageView) itemView.findViewById(R.id.top_rcv_child_icon);
//            view = (LinearLayout) itemView;
//        }
//    }
//}
