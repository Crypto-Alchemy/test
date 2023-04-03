package p000;

import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.IOException;

/* renamed from: lg2 */
/* compiled from: GifDrawableEncoder */
public class lg2 implements jf5<jg2> {
    /* renamed from: b */
    public EncodeStrategy mo11956b(xi4 xi4) {
        return EncodeStrategy.SOURCE;
    }

    /* renamed from: c */
    public boolean mo11955a(bf5<jg2> bf5, File file, xi4 xi4) {
        try {
            s60.m26658f(bf5.get().mo21826c(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
