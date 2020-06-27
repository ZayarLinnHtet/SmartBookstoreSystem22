package com.zayar.smartbookstoresystem.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.zayar.smartbookstoresystem.R;
import com.zayar.smartbookstoresystem.data.PopularBookData;

import java.util.List;

public class PopularBookAdapter extends RecyclerView.Adapter<PopularBookAdapter.PopularBookViewHolder>{

    private List<PopularBookData> popularBookDataList;

    public PopularBookAdapter(List<PopularBookData> popularBookDataList) {
        this.popularBookDataList = popularBookDataList;
    }

    @NonNull
    @Override
    public PopularBookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_popular, parent, false);

        return new PopularBookViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularBookViewHolder holder, int position) {
        PopularBookData bookData = popularBookDataList.get(position);
        holder.bookImage.setImageResource(bookData.getBookImage());
        holder.bookName.setText(bookData.getBookName());
        holder.authorName.setText(bookData.getAuthorName());
        holder.publishYear.setText(bookData.getPublishYear());
        holder.categories.setText(bookData.getCategories());
    }

    @Override
    public int getItemCount() {
        return popularBookDataList.size();
    }

    public class PopularBookViewHolder extends RecyclerView.ViewHolder {
        public TextView bookName, authorName, publishYear, categories;
        public ImageView bookImage;

        public PopularBookViewHolder(@NonNull View itemView) {
            super(itemView);
            bookImage = itemView.findViewById(R.id.ivPopularBook);
            bookName = itemView.findViewById(R.id.tvPopularBookName);
            authorName = itemView.findViewById(R.id.tvPopularAuthorName);
            publishYear = itemView.findViewById(R.id.tvBookPublishYear);
            categories = itemView.findViewById(R.id.tvBookCategories);

        }


    }
}