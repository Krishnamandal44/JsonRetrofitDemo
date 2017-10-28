package com.example.krishna.jsonretrofitdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.krishna.jsonretrofitdemo.GlideConnector;
import com.example.krishna.jsonretrofitdemo.R;
import com.example.krishna.jsonretrofitdemo.RetrofitSdk.Model.Emarket;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc41 on 28-10-2017.
 */

public class EMarketAdapter extends RecyclerView.Adapter<EMarketAdapter.ViewHolder> {

    private List<Emarket> emarkets = new ArrayList<>();
    Context context;

    public EMarketAdapter(List<Emarket> emarkets, Context context) {
        this.emarkets = emarkets;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.service_recycler_child_view,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Emarket emarket = emarkets.get(position);
        holder.tvTitle.setText(emarket.getTitle());
        //   holder.imageView.setImageResource(Integer.parseInt(dashboardItem.getImageUrl()));
        String icon = emarket.getImageUrl();
        GlideConnector.getInstance().loadImageDirectly(context, icon, holder.imageView);
    }

    @Override
    public int getItemCount() {
        return emarkets.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
//            tvTitle = (TextView) itemView.findViewById(R.id.prakalpa_name);
//            imageView = (ImageView) itemView.findViewById(R.id.image_prakalpa);
        }
    }
}