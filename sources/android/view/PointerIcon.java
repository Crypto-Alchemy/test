package android.view;

import android.annotation.NonNull;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Parcelable;

public final /* synthetic */ class PointerIcon implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public static native /* synthetic */ PointerIcon create(@NonNull Bitmap bitmap, float f, float f2);

    @NonNull
    public static native /* synthetic */ PointerIcon getSystemIcon(@NonNull Context context, int i);

    @NonNull
    public static native /* synthetic */ PointerIcon load(@NonNull Resources resources, int i);
}
