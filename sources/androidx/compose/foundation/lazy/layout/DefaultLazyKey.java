package androidx.compose.foundation.lazy.layout;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, mo44877d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lr37;", "writeToParcel", "describeContents", "", "toString", "hashCode", "", "other", "", "equals", "a", "I", "index", "<init>", "(I)V", "d", "b", "foundation_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@SuppressLint({"BanParcelableUsage"})
/* compiled from: Lazy.android.kt */
final class DefaultLazyKey implements Parcelable {
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new C0333a();

    /* renamed from: d */
    public static final C0334b f1421d = new C0334b((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final int f1422a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, mo44877d2 = {"androidx/compose/foundation/lazy/layout/DefaultLazyKey$a", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "foundation_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.foundation.lazy.layout.DefaultLazyKey$a */
    /* compiled from: Lazy.android.kt */
    public static final class C0333a implements Parcelable.Creator<DefaultLazyKey> {
        /* renamed from: a */
        public DefaultLazyKey createFromParcel(Parcel parcel) {
            vx2.m53591g(parcel, "parcel");
            return new DefaultLazyKey(parcel.readInt());
        }

        /* renamed from: b */
        public DefaultLazyKey[] newArray(int i) {
            return new DefaultLazyKey[i];
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007¨\u0006\t"}, mo44877d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$b;", "", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "CREATOR", "Landroid/os/Parcelable$Creator;", "getCREATOR$annotations", "()V", "<init>", "foundation_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.foundation.lazy.layout.DefaultLazyKey$b */
    /* compiled from: Lazy.android.kt */
    public static final class C0334b {
        public C0334b() {
        }

        public /* synthetic */ C0334b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultLazyKey(int i) {
        this.f1422a = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.f1422a == ((DefaultLazyKey) obj).f1422a;
    }

    public int hashCode() {
        return this.f1422a;
    }

    public String toString() {
        return "DefaultLazyKey(index=" + this.f1422a + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        vx2.m53591g(parcel, "parcel");
        parcel.writeInt(this.f1422a);
    }
}
