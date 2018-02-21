package c4q.nyc.unit5test.backend;

/**
 * Created by c4q on 2/18/18.
 */

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import c4q.nyc.unit5test.R;

/**
 * this class will hold my picasso client to help
 * me load the images faster:
 *
 */
public class PicassoClient {

    public static void downloadImage(Context context, String url, ImageView imageView){

        if( url != null && url.length()>0){
            Picasso.with(context).load(url).into(imageView);
        } else {
            Picasso.with(context).load(url).placeholder(R.drawable.ic_launcher_background).into(imageView);
        }
    }
}
