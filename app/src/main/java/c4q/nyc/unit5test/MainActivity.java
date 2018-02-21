package c4q.nyc.unit5test;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import c4q.nyc.unit5test.model.User;

public class MainActivity extends AppCompatActivity {

    // fields for main activity:
    private MyOnClickListener myOnClickListener;
    private RecyclerView recyclerView; // holds the recycler view
    List<User> usersList;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;

    private RecyclerViewAdapter recyclerViewAdapter;
    Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the application context:
        mContext = getApplicationContext();


        myOnClickListener = new MyOnClickListener();

        // get a reference to your reycler view:
        // set the recyclerView's setHasFizedSize() method to true,
        // this increases performance because the recycler view will know
        // in advance that it can't change the size of the recyvlew view,
        // even if teh size of the adapter changes:
        recyclerView = findViewById(R.id.user_recyclerview);
        recyclerView.setHasFixedSize(true);

        // define a layout for RecyclerView:
        mLayoutManager = new GridLayoutManager(mContext, 2 );
        recyclerView.setLayoutManager(mLayoutManager);

        // initialize a new instance of ReyclerView Adapter instance:
        recyclerViewAdapter = new RecyclerViewAdapter(this, usersList);
        recyclerView.setAdapter(recyclerViewAdapter);


    }

    /**
     * here ive definer MyOnClickListener as an inner class in the
     * MainActivity, it implements the View.OnClickListener class.
     * - I'll use the listener to monitor when the user clicks on an image.
     * - I'll attach the listner to the image once I've created the view holder.
     *
     * - clicking an image triggers my on click listener's onClick():
     * - and this will open up the detail activity:
     */
    public class MyOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
         //   String selectedUserPhoto = getSelectedPhoto(v);
            // showSelectedUserData(selectedUserPhoto);
        }

        //public String getSelectedPhoto(View view){
          //  int selectedItemPosition = recyclerView
        //}
    }

} // ends main activity:
