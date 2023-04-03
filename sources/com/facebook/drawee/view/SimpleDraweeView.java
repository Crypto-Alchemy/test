package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;

public class SimpleDraweeView extends GenericDraweeView {

    /* renamed from: x */
    public static td6<? extends AbstractDraweeControllerBuilder> f9581x;

    /* renamed from: s */
    public AbstractDraweeControllerBuilder f9582s;

    public SimpleDraweeView(Context context) {
        super(context);
        mo13299h(context, (AttributeSet) null);
    }

    /* renamed from: i */
    public static void m13425i(td6<? extends AbstractDraweeControllerBuilder> td6) {
        f9581x = td6;
    }

    public AbstractDraweeControllerBuilder getControllerBuilder() {
        return this.f9582s;
    }

    /* renamed from: h */
    public final void mo13299h(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        int resourceId;
        try {
            if (lc2.m21369d()) {
                lc2.m21366a("SimpleDraweeView#init");
            }
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                au4.m10793h(f9581x, "SimpleDraweeView was not initialized!");
                this.f9582s = (AbstractDraweeControllerBuilder) f9581x.get();
            }
            if (attributeSet != null) {
                obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q55.SimpleDraweeView);
                int i = q55.SimpleDraweeView_actualImageUri;
                if (obtainStyledAttributes.hasValue(i)) {
                    setImageURI(Uri.parse(obtainStyledAttributes.getString(i)), (Object) null);
                } else {
                    int i2 = q55.SimpleDraweeView_actualImageResource;
                    if (obtainStyledAttributes.hasValue(i2) && (resourceId = obtainStyledAttributes.getResourceId(i2, -1)) != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                }
                obtainStyledAttributes.recycle();
            }
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        } catch (Throwable th) {
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
            throw th;
        }
    }

    public void setActualImageResource(int i) {
        setActualImageResource(i, (Object) null);
    }

    public void setImageRequest(ImageRequest imageRequest) {
        setController(this.f9582s.mo13219B(imageRequest).mo13222b(getController()).build());
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    public void setImageURI(Uri uri) {
        setImageURI(uri, (Object) null);
    }

    public void setActualImageResource(int i, Object obj) {
        setImageURI(i57.m19421d(i), obj);
    }

    public void setImageURI(String str) {
        setImageURI(str, (Object) null);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo13299h(context, attributeSet);
    }

    public void setImageURI(Uri uri, Object obj) {
        setController(this.f9582s.mo13246z(obj).mo20334a(uri).mo13222b(getController()).build());
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo13299h(context, attributeSet);
    }

    public void setImageURI(String str, Object obj) {
        setImageURI(str != null ? Uri.parse(str) : null, obj);
    }
}
