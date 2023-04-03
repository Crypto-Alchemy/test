package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: bm0 */
/* compiled from: Compatibility */
public class bm0 {
    /* renamed from: a */
    public static Drawable m11446a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: b */
    public static int m11447b(TypedArray typedArray) {
        return typedArray.getChangingConfigurations();
    }

    /* renamed from: c */
    public static void m11448c(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }
}
