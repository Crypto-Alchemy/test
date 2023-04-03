package zendesk.belvedere;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;
import zendesk.belvedere.C9836j;

public class BelvedereUi {

    /* renamed from: zendesk.belvedere.BelvedereUi$b */
    public static class C9779b {

        /* renamed from: a */
        public final Context f46603a;

        /* renamed from: b */
        public final boolean f46604b;

        /* renamed from: c */
        public final List<MediaIntent> f46605c;

        /* renamed from: d */
        public List<MediaResult> f46606d;

        /* renamed from: e */
        public List<MediaResult> f46607e;

        /* renamed from: f */
        public List<Integer> f46608f;

        /* renamed from: g */
        public long f46609g;

        /* renamed from: h */
        public boolean f46610h;

        /* renamed from: zendesk.belvedere.BelvedereUi$b$a */
        public class C9780a implements C9836j.C9840d {

            /* renamed from: a */
            public final /* synthetic */ C9802b f46611a;

            /* renamed from: zendesk.belvedere.BelvedereUi$b$a$a */
            public class C9781a implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ List f46613a;

                /* renamed from: d */
                public final /* synthetic */ Activity f46614d;

                /* renamed from: e */
                public final /* synthetic */ ViewGroup f46615e;

                public C9781a(List list, Activity activity, ViewGroup viewGroup) {
                    this.f46613a = list;
                    this.f46614d = activity;
                    this.f46615e = viewGroup;
                }

                public void run() {
                    UiConfig uiConfig = new UiConfig(this.f46613a, C9779b.this.f46606d, C9779b.this.f46607e, true, C9779b.this.f46608f, C9779b.this.f46609g, C9779b.this.f46610h);
                    C9780a.this.f46611a.mo73743u(C9825h.m75530v(this.f46614d, this.f46615e, C9780a.this.f46611a, uiConfig), uiConfig);
                }
            }

            /* renamed from: zendesk.belvedere.BelvedereUi$b$a$b */
            public class C9782b implements View.OnClickListener {

                /* renamed from: a */
                public final /* synthetic */ Activity f46617a;

                public C9782b(Activity activity) {
                    this.f46617a = activity;
                }

                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", this.f46617a.getPackageName(), (String) null));
                    this.f46617a.startActivity(intent);
                }
            }

            public C9780a(C9802b bVar) {
                this.f46611a = bVar;
            }

            /* renamed from: a */
            public void mo73636a(List<MediaIntent> list) {
                FragmentActivity activity = this.f46611a.getActivity();
                if (activity != null && !activity.isChangingConfigurations()) {
                    ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
                    viewGroup.post(new C9781a(list, activity, viewGroup));
                }
            }

            /* renamed from: b */
            public void mo73637b() {
                FragmentActivity activity = this.f46611a.getActivity();
                if (activity != null) {
                    n77.m75288e((ViewGroup) activity.findViewById(16908290), activity.getString(q45.belvedere_permissions_rationale), 5000, activity.getString(q45.belvedere_navigate_to_settings), new C9782b(activity));
                }
            }
        }

        /* renamed from: f */
        public void mo73628f(AppCompatActivity appCompatActivity) {
            C9802b b = BelvedereUi.m75343b(appCompatActivity);
            b.mo73735m(this.f46605c, new C9780a(b));
        }

        /* renamed from: g */
        public C9779b mo73629g() {
            this.f46605c.add(C9800a.m75438c(this.f46603a).mo73723a().mo73689a());
            return this;
        }

        /* renamed from: h */
        public C9779b mo73630h(String str, boolean z) {
            this.f46605c.add(C9800a.m75438c(this.f46603a).mo73724b().mo73690a(z).mo73692c(str).mo73691b());
            return this;
        }

        /* renamed from: i */
        public C9779b mo73631i(List<MediaResult> list) {
            this.f46607e = new ArrayList(list);
            return this;
        }

        /* renamed from: j */
        public C9779b mo73632j(boolean z) {
            this.f46610h = z;
            return this;
        }

        /* renamed from: k */
        public C9779b mo73633k(long j) {
            this.f46609g = j;
            return this;
        }

        /* renamed from: l */
        public C9779b mo73634l(List<MediaResult> list) {
            this.f46606d = new ArrayList(list);
            return this;
        }

        /* renamed from: m */
        public C9779b mo73635m(int... iArr) {
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int valueOf : iArr) {
                arrayList.add(Integer.valueOf(valueOf));
            }
            this.f46608f = arrayList;
            return this;
        }

        public C9779b(Context context) {
            this.f46604b = true;
            this.f46605c = new ArrayList();
            this.f46606d = new ArrayList();
            this.f46607e = new ArrayList();
            this.f46608f = new ArrayList();
            this.f46609g = -1;
            this.f46610h = false;
            this.f46603a = context;
        }
    }

    /* renamed from: a */
    public static C9779b m75342a(Context context) {
        return new C9779b(context);
    }

    /* renamed from: b */
    public static C9802b m75343b(AppCompatActivity appCompatActivity) {
        C9802b bVar;
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        Fragment l0 = supportFragmentManager.mo5984l0("belvedere_image_stream");
        if (l0 instanceof C9802b) {
            bVar = (C9802b) l0;
        } else {
            bVar = new C9802b();
            supportFragmentManager.mo5996q().mo6264e(bVar, "belvedere_image_stream").mo6141l();
        }
        bVar.mo73744v(KeyboardHelper.m75399l(appCompatActivity));
        return bVar;
    }

    public static class UiConfig implements Parcelable {
        public static final Parcelable.Creator<UiConfig> CREATOR = new C9777a();

        /* renamed from: a */
        public final List<MediaIntent> f46596a;

        /* renamed from: d */
        public final List<MediaResult> f46597d;

        /* renamed from: e */
        public final List<MediaResult> f46598e;

        /* renamed from: g */
        public final List<Integer> f46599g;

        /* renamed from: k */
        public final boolean f46600k;

        /* renamed from: r */
        public final long f46601r;

        /* renamed from: s */
        public final boolean f46602s;

        /* renamed from: zendesk.belvedere.BelvedereUi$UiConfig$a */
        public static class C9777a implements Parcelable.Creator<UiConfig> {
            /* renamed from: a */
            public UiConfig createFromParcel(Parcel parcel) {
                return new UiConfig(parcel);
            }

            /* renamed from: b */
            public UiConfig[] newArray(int i) {
                return new UiConfig[i];
            }
        }

        public UiConfig() {
            this.f46596a = new ArrayList();
            this.f46597d = new ArrayList();
            this.f46598e = new ArrayList();
            this.f46599g = new ArrayList();
            this.f46600k = true;
            this.f46601r = -1;
            this.f46602s = false;
        }

        /* renamed from: a */
        public List<MediaResult> mo73616a() {
            return this.f46598e;
        }

        /* renamed from: b */
        public List<MediaIntent> mo73617b() {
            return this.f46596a;
        }

        /* renamed from: c */
        public long mo73618c() {
            return this.f46601r;
        }

        /* renamed from: d */
        public List<MediaResult> mo73619d() {
            return this.f46597d;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public List<Integer> mo73621e() {
            return this.f46599g;
        }

        /* renamed from: f */
        public boolean mo73622f() {
            return this.f46602s;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.f46596a);
            parcel.writeTypedList(this.f46597d);
            parcel.writeTypedList(this.f46598e);
            parcel.writeList(this.f46599g);
            parcel.writeInt(this.f46600k ? 1 : 0);
            parcel.writeLong(this.f46601r);
            parcel.writeInt(this.f46602s ? 1 : 0);
        }

        public UiConfig(List<MediaIntent> list, List<MediaResult> list2, List<MediaResult> list3, boolean z, List<Integer> list4, long j, boolean z2) {
            this.f46596a = list;
            this.f46597d = list2;
            this.f46598e = list3;
            this.f46600k = z;
            this.f46599g = list4;
            this.f46601r = j;
            this.f46602s = z2;
        }

        public UiConfig(Parcel parcel) {
            this.f46596a = parcel.createTypedArrayList(MediaIntent.CREATOR);
            Parcelable.Creator<MediaResult> creator = MediaResult.CREATOR;
            this.f46597d = parcel.createTypedArrayList(creator);
            this.f46598e = parcel.createTypedArrayList(creator);
            ArrayList arrayList = new ArrayList();
            this.f46599g = arrayList;
            parcel.readList(arrayList, Integer.class.getClassLoader());
            boolean z = false;
            this.f46600k = parcel.readInt() == 1;
            this.f46601r = parcel.readLong();
            this.f46602s = parcel.readInt() == 1 ? true : z;
        }
    }
}
