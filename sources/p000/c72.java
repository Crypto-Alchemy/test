package p000;

import android.content.Context;
import androidx.compose.p004ui.text.font.AndroidFontLoader;
import androidx.compose.p004ui.text.font.FontFamilyResolverImpl;
import androidx.compose.p004ui.text.font.FontListFontFamilyTypefaceAdapter;
import androidx.compose.p004ui.text.font.TypefaceRequestCache;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.z62;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, mo44877d2 = {"Landroid/content/Context;", "context", "Lz62$b;", "a", "ui-text_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: c72 */
/* compiled from: FontFamilyResolver.android.kt */
public final class c72 {
    /* renamed from: a */
    public static final z62.C3714b m11743a(Context context) {
        vx2.m53591g(context, "context");
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), C2760li.m21456a(context), (TypefaceRequestCache) null, (FontListFontFamilyTypefaceAdapter) null, (ep4) null, 28, (DefaultConstructorMarker) null);
    }
}
