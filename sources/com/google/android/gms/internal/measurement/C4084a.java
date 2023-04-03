package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.measurement.a */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class C4084a {
    /* renamed from: a */
    public static <T> qy8<T> m34123a(qy8<T> qy8) {
        if ((qy8 instanceof uy8) || (qy8 instanceof zzic)) {
            return qy8;
        }
        if (qy8 instanceof Serializable) {
            return new zzic(qy8);
        }
        return new uy8(qy8);
    }

    /* renamed from: b */
    public static <T> qy8<T> m34124b(@NullableDecl T t) {
        return new zzie(t);
    }
}
