package zendesk.support;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.C5453l;
import com.squareup.picasso.Picasso;

public class ZendeskAvatarView extends FrameLayout {
    private static final int[] AVATAR_COLORS = {y15.zs_avatar_view_color_01, y15.zs_avatar_view_color_02, y15.zs_avatar_view_color_03, y15.zs_avatar_view_color_04, y15.zs_avatar_view_color_05, y15.zs_avatar_view_color_06, y15.zs_avatar_view_color_07, y15.zs_avatar_view_color_08, y15.zs_avatar_view_color_09, y15.zs_avatar_view_color_10, y15.zs_avatar_view_color_11, y15.zs_avatar_view_color_12, y15.zs_avatar_view_color_13, y15.zs_avatar_view_color_14, y15.zs_avatar_view_color_15, y15.zs_avatar_view_color_16, y15.zs_avatar_view_color_17, y15.zs_avatar_view_color_18, y15.zs_avatar_view_color_19};
    private boolean enableOutline;
    private ImageView imageView;
    private int strokeColor;
    private int strokeWidth;
    private TextView textView;

    public ZendeskAvatarView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    private Drawable getBackgroundShape(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(zr0.m31440c(getContext(), i));
        if (!this.enableOutline) {
            return shapeDrawable;
        }
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable2.getPaint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(this.strokeColor);
        paint.setStrokeWidth((float) this.strokeWidth);
        return new LayerDrawable(new Drawable[]{shapeDrawable, new InsetDrawable(shapeDrawable2, this.strokeWidth / 2)});
    }

    private int getColorId(Object obj) {
        int[] iArr = AVATAR_COLORS;
        return iArr[Math.abs(obj.hashCode() % iArr.length)];
    }

    private void initViews() {
        TextView textView2 = new TextView(getContext());
        this.textView = textView2;
        textView2.setId(l35.zs_avatar_view_text_view);
        this.textView.setTextColor(zr0.m31440c(getContext(), y15.zs_avatar_text_color));
        this.textView.setGravity(17);
        this.textView.setTextSize(2, 16.0f);
        ImageView imageView2 = new ImageView(getContext());
        this.imageView = imageView2;
        imageView2.setId(l35.zs_avatar_view_image_view);
        addView(this.textView);
        addView(this.imageView);
    }

    private void setTextView(String str) {
        setBackground(getBackgroundShape(getColorId(str)));
        this.textView.setText(String.valueOf(Character.toUpperCase(str.charAt(0))));
    }

    public void setStroke(int i, int i2) {
        this.strokeColor = i;
        this.strokeWidth = i2;
        this.enableOutline = true;
    }

    public void showUserWithAvatarImage(Picasso picasso, String str, String str2, int i) {
        this.imageView.setVisibility(0);
        this.imageView.setImageResource(y15.zs_color_transparent);
        if (kb6.m46949b(str2)) {
            this.textView.setVisibility(0);
            setTextView(str2);
        }
        this.imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        C5453l l = picasso.mo39469l(str);
        int i2 = i * 2;
        l.mo39590k(i2, i2).mo39580a().mo39589j().mo39591l(PicassoTransformations.getRoundWithBorderTransformation(i, this.strokeColor, this.strokeWidth)).mo39585f(this.imageView);
    }

    public void showUserWithIdentifier(Object obj) {
        if (obj != null) {
            setBackground(getBackgroundShape(getColorId(obj)));
            this.imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.imageView.setImageResource(u25.zs_request_list_account_icon);
            this.textView.setVisibility(4);
            this.imageView.setVisibility(0);
        }
    }

    public void showUserWithName(String str) {
        if (kb6.m46949b(str)) {
            setTextView(str);
            this.textView.setVisibility(0);
            this.imageView.setVisibility(4);
        }
    }

    public ZendeskAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ZendeskAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.enableOutline = false;
        this.strokeColor = 0;
        this.strokeWidth = 0;
        initViews();
    }
}
