package p000;

import android.os.Build;

/* renamed from: zt */
/* compiled from: AutoSizeableTextView */
public interface C3759zt {
    @Deprecated

    /* renamed from: c */
    public static final boolean f20681c;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 27) {
            z = true;
        } else {
            z = false;
        }
        f20681c = z;
    }
}
