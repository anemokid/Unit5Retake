package c4q.nyc.unit5test;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import c4q.nyc.unit5test.backend.PicassoClient;
import c4q.nyc.unit5test.model.User;

/**
 * Created by c4q on 2/18/18.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.UserViewHolder> {

    // private fields of the adapter class:
    private Context mContext; // this will hold the context of the screen
    private List<User> usersList; // this is a list of Users

    // constructor that sets the recycler view adapter:

    public RecyclerViewAdapter(Context mContext, List<User> usersList) {
        this.mContext = mContext;
        this.usersList = usersList;
    }

    /* these are the overrided methods :
     *
      * - onBindViewHolder():
      * - getItemCount():
      * - onCreateViewHolder()
      * */

    /**
     * onCreateViewHolder():
     * - this creates a new ViewHolder containing our images
     */
    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // instantiate a view:
        View view;

        // create an inflater:
        LayoutInflater inflater = LayoutInflater.from(mContext);

        // inflate the card view layout and pass it into the view you created above:
        view = inflater.inflate(R.layout.cardview_user_item, parent, false);

        // instantiate a new UserViewHolder and return it;
        UserViewHolder newView = new UserViewHolder(view);

        return newView;
    }

    /**
     * onBindViewHolder():
     * this is where you will set all your images + textviews depending on the data
     */
    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {

        holder.tv_user_name.setText((CharSequence) usersList.get(position).getUserName());

        //holder.img_user_thumbnail.setImageResource(usersList.get(position).getPicture().getThumbnailPic());

        PicassoClient.downloadImage(mContext, usersList.get(position).getPicture().getThumbnailPic(), holder.img_user_thumbnail);


    }

    /**
     * this gets the number of items in the adapter
     */
    @Override
    public int getItemCount() {
        return usersList.size();
    }


    // this is my inner class : View Holder that I will pass into my RecyclerView.Adapter<>
    public static class UserViewHolder extends RecyclerView.ViewHolder {

        // instantiate your private fields: aka views:
        private ImageView img_user_thumbnail;
        private TextView tv_user_name;

        // this is the constructor for my view holder:
        // the itemView is passed to the constructor:
        public UserViewHolder(View itemView) {
            super(itemView);

            // declare ur item views and find them:
            img_user_thumbnail = (ImageView)itemView.findViewById(R.id.user_thumbnail_imageview);
            tv_user_name = (TextView)itemView.findViewById(R.id.user_name_textview);

            //itemView.setOnClickListener(MainActivity.my);

        }
    }


}
