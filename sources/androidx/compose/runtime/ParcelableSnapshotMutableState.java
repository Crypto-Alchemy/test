package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SuppressLint({"BanParcelableUsage"})
@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0011B\u001d\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u0012"}, mo44877d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Lf56;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lr37;", "writeToParcel", "describeContents", "value", "Lh56;", "policy", "<init>", "(Ljava/lang/Object;Lh56;)V", "e", "b", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ParcelableSnapshotMutableState.kt */
public final class ParcelableSnapshotMutableState<T> extends f56<T> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new C0341a();

    /* renamed from: e */
    public static final C0342b f1519e = new C0342b((DefaultConstructorMarker) null);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J'\u0010\r\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo44877d2 = {"androidx/compose/runtime/ParcelableSnapshotMutableState$a", "Landroid/os/Parcelable$ClassLoaderCreator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "", "Landroid/os/Parcel;", "parcel", "Ljava/lang/ClassLoader;", "loader", "b", "a", "", "size", "", "c", "(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableState$a */
    /* compiled from: ParcelableSnapshotMutableState.kt */
    public static final class C0341a implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
        /* renamed from: a */
        public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel) {
            vx2.m53591g(parcel, "parcel");
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            h56 h56;
            vx2.m53591g(parcel, "parcel");
            if (classLoader == null) {
                classLoader = C0341a.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                h56 = i56.m19414c();
            } else if (readInt == 1) {
                h56 = i56.m19417f();
            } else if (readInt == 2) {
                h56 = i56.m19416e();
            } else {
                throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            return new ParcelableSnapshotMutableState<>(readValue, h56);
        }

        /* renamed from: c */
        public ParcelableSnapshotMutableState<Object>[] newArray(int i) {
            return new ParcelableSnapshotMutableState[i];
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u0007R(\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState$b;", "", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "getCREATOR$annotations", "()V", "", "PolicyNeverEquals", "I", "PolicyReferentialEquality", "PolicyStructuralEquality", "<init>", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableState$b */
    /* compiled from: ParcelableSnapshotMutableState.kt */
    public static final class C0342b {
        public C0342b() {
        }

        public /* synthetic */ C0342b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParcelableSnapshotMutableState(T t, h56<T> h56) {
        super(t, h56);
        vx2.m53591g(h56, "policy");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        vx2.m53591g(parcel, "parcel");
        parcel.writeValue(getValue());
        h56 a = mo19124a();
        if (vx2.m53586b(a, i56.m19414c())) {
            i2 = 0;
        } else if (vx2.m53586b(a, i56.m19417f())) {
            i2 = 1;
        } else if (vx2.m53586b(a, i56.m19416e())) {
            i2 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i2);
    }
}
