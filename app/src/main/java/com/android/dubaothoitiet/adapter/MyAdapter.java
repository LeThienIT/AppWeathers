package com.android.dubaothoitiet.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.dubaothoitiet.R;
import com.android.dubaothoitiet.model.Item;
import com.android.dubaothoitiet.model.Item_View1;
import com.android.dubaothoitiet.model.Item_View2;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private List<Item> itemList;

    public MyAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == 0){
            return new MyViewHolderItem1(LayoutInflater.from(parent.getContext()).inflate(
                    R.layout.item_container_view_1,
                    parent, false));
        }
        else {
            return new MyViewHolderItem2(LayoutInflater.from(parent.getContext()).inflate(
                    R.layout.item_container_view_2,
                    parent, false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(getItemViewType(position) == 0){
            Item_View1 item_view1 = (Item_View1) itemList.get(position).getObject();
            ((MyViewHolderItem1) holder).setItem1(item_view1);
        }else {
            Item_View2 item_view2 = (Item_View2) itemList.get(position).getObject();
            ((MyViewHolderItem2) holder).setItem2(item_view2);
        }
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return itemList.get(position).getType();
    }

    static class MyViewHolderItem1 extends RecyclerView.ViewHolder{

        ImageView img1;
        TextView txtDay1,txtTempBig1, txtTempSmaill1, txtCity, txtStatus1;

        public MyViewHolderItem1(View itemView){
            super(itemView);

            img1 = itemView.findViewById(R.id.img1);
            txtDay1 = itemView.findViewById(R.id.txtDay1);
            txtTempBig1 = itemView.findViewById(R.id.txtTempBig1);
            txtTempSmaill1 = itemView.findViewById(R.id.txtTempSmaill1);
            txtCity = itemView.findViewById(R.id.txtCity);
            txtStatus1 = itemView.findViewById(R.id.txtStatus1);
        }

        void setItem1(Item_View1 item1){
            img1.setImageResource(item1.getImgAva());
            txtDay1.setText(item1.getDay1());
            txtTempBig1.setText(item1.getTempBig());
            txtCity.setText(item1.getCity());
            txtTempSmaill1.setText(item1.getTempSmall());
            txtStatus1.setText(item1.getStatus());
        }
    }

    static class MyViewHolderItem2 extends RecyclerView.ViewHolder{

        ImageView imageView2;
        TextView txtDay2, txtStatus2, txtTempBig2, txtTempSmaill2;

        public MyViewHolderItem2(View itemView){
            super(itemView);

            imageView2 = itemView.findViewById(R.id.imageView2);
            txtDay2 =  itemView.findViewById(R.id.txtDay2);
            txtStatus2 = itemView.findViewById(R.id.txtStatus2);
            txtTempBig2 = itemView.findViewById(R.id.txtTempBig2);
            txtTempSmaill2 = itemView.findViewById(R.id.txtTempSmaill2);
        }

        void setItem2(Item_View2 item2){
            imageView2.setImageResource(item2.getImgAva2());
            txtDay2.setText(item2.getDay2());
            txtStatus2.setText(item2.getStatus2());
            txtTempBig2.setText(item2.getTempBig2());
            txtTempSmaill2.setText(item2.getTempSmall2());
        }
    }
}
