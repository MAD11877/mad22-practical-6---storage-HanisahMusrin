package sg.edu.np.mad.hanisah.listactivity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class userViewHolder extends RecyclerView.ViewHolder {
    TextView name;
    TextView desc;
    ImageView img;

    public userViewHolder(View itemView, userAdapter.OnItemClickListener listener) {
        super(itemView);
        name = itemView.findViewById(R.id.textView3);
        desc = itemView.findViewById(R.id.textView5);
        img = itemView.findViewById(R.id.imageView3);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listener != null)
                {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION)
                    {
                        listener.onItemClick(position);
                    }
                }
            }
        });
    }
}