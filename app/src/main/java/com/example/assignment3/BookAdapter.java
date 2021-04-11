package com.example.assignment3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {
    private Context context;
    private ArrayList<BookModel> bookModels;

    public BookAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<BookModel> getBookModels() {
        return bookModels;
    }

    public void setBookModels(ArrayList<BookModel> bookModels) {
        this.bookModels = bookModels;
    }


    @NonNull
    @Override
    public BookAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_book,viewGroup,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull BookAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getBookModels().get(i).getIV()).into(viewHolder.IV);
        viewHolder.TV.setText(getBookModels().get(i).getTV());
        viewHolder.Author.setText(getBookModels().get(i).getAuthor());
        viewHolder.btnDetail.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("bookTitle", getBookModels().get(i).getTV());
                intent.putExtra("bookCover", getBookModels().get(i).getIV());
                intent.putExtra("bookAuthor", getBookModels().get(i).getAuthor());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return getBookModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView IV;
        private TextView TV;
        private TextView Author;
        private Button btnDetail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            IV = itemView.findViewById(R.id.book1);
            TV = itemView.findViewById(R.id.title);
            Author = itemView.findViewById(R.id.author);
            btnDetail = itemView.findViewById(R.id.btnDetail);

        }
    }
}
