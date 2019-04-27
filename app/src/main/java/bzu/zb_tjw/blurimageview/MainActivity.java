package bzu.zb_tjw.blurimageview;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import static bzu.zb_tjw.blurimageview.BlurImageView.BoxBlurFilter;

public class MainActivity extends AppCompatActivity {

    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        image = findViewById(R.id.image);

        //方式一:直接传递一个现有的bitmap
//        Bitmap bmp= BitmapFactory.decodeResource(MainActivity.this.getResources(), R.mipmap.zb_tjw);
//        image.setBackground(BoxBlurFilter(bmp));

        //方式二：通过资源文件夹下的图片
//        image.setBackground(BoxBlurFilter(MainActivity.this,R.mipmap.zb_tjw));

        //方式三：通过网络加载图片
//        String url = "https://img-blog.csdnimg.cn/20190425223315408.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzMyMjM5NzY3,size_16,color_FFFFFF,t_70";
//        AsyncloadImage asyncloadImage = new AsyncloadImage();
//        asyncloadImage.execute(url,image);

        //方式四：通过drawable方式设置
        Drawable drawable = getResources().getDrawable(R.mipmap.zb_tjw);
        image.setBackground(BoxBlurFilter(drawable));

    }
}
