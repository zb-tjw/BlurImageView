package bzu.zb_tjw.blurimageview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.io.IOException;
import java.net.URL;

import static bzu.zb_tjw.blurimageview.BlurImageView.BoxBlurFilter;

/**
 * Created by:zb_tjw on 2019/4/27 9:36 PM
 * Author:zb_tjw
 * Email:1549790231@qq.com
 * QQ:1549790231
 * be Used:
 */
public class AsyncloadImage extends AsyncTask<Object,Void,Drawable> {

    ImageView imageView;

    @Override
    protected Drawable doInBackground(Object... objects) {
        String url = (String) objects[0];
        imageView = (ImageView) objects[1];
        Drawable drawable = null;
        try {
            URL picUrl = new URL(url);
            Bitmap bitmap = BitmapFactory.decodeStream(picUrl.openStream());
            drawable = BoxBlurFilter(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return drawable;
    }

    @Override
    protected void onPostExecute(Drawable drawable) {
        super.onPostExecute(drawable);
        imageView.setBackground(drawable);
    }
}
