package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 +2\u00020\u0001:\u0001\u0016B\u0011\b\u0016\u0012\u0006\u0010&\u001a\u00020\n¢\u0006\u0004\b'\u0010(B\u0011\b\u0016\u0012\u0006\u0010)\u001a\u00020\u000e¢\u0006\u0004\b'\u0010*J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001bR\u0019\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010%\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!¨\u0006,"}, mo44877d2 = {"Landroidx/navigation/NavBackStackEntryState;", "Landroid/os/Parcelable;", "Landroid/content/Context;", "context", "Landroidx/navigation/NavDestination;", "destination", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Lg44;", "viewModel", "Landroidx/navigation/NavBackStackEntry;", "c", "", "describeContents", "Landroid/os/Parcel;", "parcel", "i", "Lr37;", "writeToParcel", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "id", "d", "I", "()I", "destinationId", "Landroid/os/Bundle;", "e", "Landroid/os/Bundle;", "getArgs", "()Landroid/os/Bundle;", "args", "g", "getSavedState", "savedState", "entry", "<init>", "(Landroidx/navigation/NavBackStackEntry;)V", "inParcel", "(Landroid/os/Parcel;)V", "k", "navigation-runtime_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
@SuppressLint({"BanParcelableUsage"})
/* compiled from: NavBackStackEntryState.kt */
public final class NavBackStackEntryState implements Parcelable {
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new C1112a();

    /* renamed from: k */
    public static final C1113b f5987k = new C1113b((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final String f5988a;

    /* renamed from: d */
    public final int f5989d;

    /* renamed from: e */
    public final Bundle f5990e;

    /* renamed from: g */
    public final Bundle f5991g;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, mo44877d2 = {"androidx/navigation/NavBackStackEntryState$a", "Landroid/os/Parcelable$Creator;", "Landroidx/navigation/NavBackStackEntryState;", "Landroid/os/Parcel;", "inParcel", "a", "", "size", "", "b", "(I)[Landroidx/navigation/NavBackStackEntryState;", "navigation-runtime_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.navigation.NavBackStackEntryState$a */
    /* compiled from: NavBackStackEntryState.kt */
    public static final class C1112a implements Parcelable.Creator<NavBackStackEntryState> {
        /* renamed from: a */
        public NavBackStackEntryState createFromParcel(Parcel parcel) {
            vx2.m53591g(parcel, "inParcel");
            return new NavBackStackEntryState(parcel);
        }

        /* renamed from: b */
        public NavBackStackEntryState[] newArray(int i) {
            return new NavBackStackEntryState[i];
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, mo44877d2 = {"Landroidx/navigation/NavBackStackEntryState$b;", "", "Landroid/os/Parcelable$Creator;", "Landroidx/navigation/NavBackStackEntryState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "<init>", "()V", "navigation-runtime_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.navigation.NavBackStackEntryState$b */
    /* compiled from: NavBackStackEntryState.kt */
    public static final class C1113b {
        public C1113b() {
        }

        public /* synthetic */ C1113b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public NavBackStackEntryState(NavBackStackEntry navBackStackEntry) {
        vx2.m53591g(navBackStackEntry, "entry");
        this.f5988a = navBackStackEntry.mo8425g();
        this.f5989d = navBackStackEntry.mo8424f().mo8563w();
        this.f5990e = navBackStackEntry.mo8421d();
        Bundle bundle = new Bundle();
        this.f5991g = bundle;
        navBackStackEntry.mo8430k(bundle);
    }

    /* renamed from: a */
    public final int mo8436a() {
        return this.f5989d;
    }

    /* renamed from: b */
    public final String mo8437b() {
        return this.f5988a;
    }

    /* renamed from: c */
    public final NavBackStackEntry mo8438c(Context context, NavDestination navDestination, Lifecycle.State state, g44 g44) {
        vx2.m53591g(context, "context");
        vx2.m53591g(navDestination, "destination");
        vx2.m53591g(state, "hostLifecycleState");
        Bundle bundle = this.f5990e;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return NavBackStackEntry.f5972I.mo8434a(context, navDestination, bundle, state, g44, this.f5988a, this.f5991g);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        vx2.m53591g(parcel, "parcel");
        parcel.writeString(this.f5988a);
        parcel.writeInt(this.f5989d);
        parcel.writeBundle(this.f5990e);
        parcel.writeBundle(this.f5991g);
    }

    public NavBackStackEntryState(Parcel parcel) {
        vx2.m53591g(parcel, "inParcel");
        String readString = parcel.readString();
        vx2.m53588d(readString);
        this.f5988a = readString;
        this.f5989d = parcel.readInt();
        this.f5990e = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        vx2.m53588d(readBundle);
        this.f5991g = readBundle;
    }
}
