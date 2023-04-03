package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    /* renamed from: B */
    public static final C4029a f22247B = new C4030a(new String[0], (String) null);
    public static final Parcelable.Creator<DataHolder> CREATOR = new y18();

    /* renamed from: A */
    public boolean f22248A = true;

    /* renamed from: a */
    public final int f22249a;

    /* renamed from: d */
    public final String[] f22250d;

    /* renamed from: e */
    public Bundle f22251e;

    /* renamed from: g */
    public final CursorWindow[] f22252g;

    /* renamed from: k */
    public final int f22253k;

    /* renamed from: r */
    public final Bundle f22254r;

    /* renamed from: s */
    public int[] f22255s;

    /* renamed from: x */
    public int f22256x;

    /* renamed from: y */
    public boolean f22257y = false;

    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class C4029a {

        /* renamed from: a */
        public final String[] f22258a;

        /* renamed from: b */
        public final ArrayList f22259b = new ArrayList();

        /* renamed from: c */
        public final HashMap f22260c = new HashMap();

        public /* synthetic */ C4029a(String[] strArr, String str, e08 e08) {
            this.f22258a = (String[]) cu4.m43221k(strArr);
        }
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f22249a = i;
        this.f22250d = strArr;
        this.f22252g = cursorWindowArr;
        this.f22253k = i2;
        this.f22254r = bundle;
    }

    public void close() {
        synchronized (this) {
            if (!this.f22257y) {
                this.f22257y = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f22252g;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            if (this.f22248A && this.f22252g.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder();
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
            }
        } finally {
            super.finalize();
        }
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.f22257y;
        }
        return z;
    }

    /* renamed from: r1 */
    public Bundle mo30622r1() {
        return this.f22254r;
    }

    /* renamed from: s1 */
    public int mo30623s1() {
        return this.f22253k;
    }

    /* renamed from: t1 */
    public final void mo30624t1() {
        this.f22251e = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f22250d;
            if (i2 >= strArr.length) {
                break;
            }
            this.f22251e.putInt(strArr[i2], i2);
            i2++;
        }
        this.f22255s = new int[this.f22252g.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f22252g;
            if (i < cursorWindowArr.length) {
                this.f22255s[i] = i3;
                i3 += this.f22252g[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.f22256x = i3;
                return;
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51144t(parcel, 1, this.f22250d, false);
        rk5.m51146v(parcel, 2, this.f22252g, i, false);
        rk5.m51137m(parcel, 3, mo30623s1());
        rk5.m51129e(parcel, 4, mo30622r1(), false);
        rk5.m51137m(parcel, 1000, this.f22249a);
        rk5.m51126b(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }
}
