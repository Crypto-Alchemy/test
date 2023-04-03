package net.safemoon.androidwallet.utils.svg;

import android.content.Context;
import android.graphics.drawable.PictureDrawable;
import com.bumptech.glide.C1710a;
import com.bumptech.glide.Registry;
import com.caverock.androidsvg.SVG;
import java.io.InputStream;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000e"}, mo44877d2 = {"Lnet/safemoon/androidwallet/utils/svg/SvgModule;", "Lxn;", "Landroid/content/Context;", "context", "Lcom/bumptech/glide/a;", "glide", "Lcom/bumptech/glide/Registry;", "registry", "Lr37;", "b", "", "c", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SvgModule.kt */
public final class SvgModule extends C3632xn {
    /* renamed from: b */
    public void mo11483b(Context context, C1710a aVar, Registry registry) {
        Class<SVG> cls = SVG.class;
        vx2.m53591g(context, "context");
        vx2.m53591g(aVar, "glide");
        vx2.m53591g(registry, "registry");
        registry.mo12354q(cls, PictureDrawable.class, new oe6()).mo12341d(InputStream.class, cls, new ne6());
    }

    /* renamed from: c */
    public boolean mo12335c() {
        return false;
    }
}
