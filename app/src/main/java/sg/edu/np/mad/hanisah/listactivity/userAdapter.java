package sg.edu.np.mad.hanisah.listactivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class userAdapter extends RecyclerView.Adapter<userViewHolder>{
    ArrayList<User> data;
    private OnItemClickListener mListener;

    public interface OnItemClickListener
    {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;
    }

    public userAdapter(ArrayList<User> input) {
        data = input;
    }

    public userViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_view, parent, false);

        /*when username has 7 at the back
        String string = args[0];

        if (string.substring(string.length() - 1) == "7")
        {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            Group2 group2 = new Group2();
            ft.add(R.id.placeholder2, group2);
            ft.commit();
        }
        */

        return new userViewHolder(item, mListener);
    }
    public void onBindViewHolder(userViewHolder holder, int position) {
        String namevar = data.get(position).name;
        holder.name.setText(namevar);

        String descvar = data.get(position).description;
        holder.desc.setText(descvar);
    }
    public int getItemCount()
    {
        return data.size();
    }
}



