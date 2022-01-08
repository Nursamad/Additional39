package com.example.additional.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.additional.R;
import com.example.additional.databinding.ItemPhotoBinding;

import java.util.ArrayList;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {

    private  ArrayList<Integer> images = new ArrayList<>();
    private ItemPhotoBinding binding;

    public void setImages(ArrayList<Integer> images) {
        this.images = images;
    }

    @NonNull
    @Override
    public ImageAdapter.ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemPhotoBinding
                .inflate(LayoutInflater
                        .from(parent.getContext()), parent, false);
        return new ImageViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageAdapter.ImageViewHolder holder, int position) {
        holder.onBind(images.get(position));
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder {
        public ImageViewHolder(ItemPhotoBinding binding) {
            super(binding.getRoot());
        }

        public void onBind(Integer integer) {
            Glide
                    .with(binding.getRoot())
                    .load(integer)
                    .into(binding.itemIv);
        }
    }
}
