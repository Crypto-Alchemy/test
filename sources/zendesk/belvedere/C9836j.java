package zendesk.belvedere;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: zendesk.belvedere.j */
/* compiled from: PermissionManager */
public class C9836j {

    /* renamed from: a */
    public C9839c f46763a = null;

    /* renamed from: zendesk.belvedere.j$a */
    /* compiled from: PermissionManager */
    public class C9837a implements C9839c {

        /* renamed from: a */
        public final /* synthetic */ Context f46764a;

        /* renamed from: b */
        public final /* synthetic */ List f46765b;

        /* renamed from: c */
        public final /* synthetic */ C9840d f46766c;

        public C9837a(Context context, List list, C9840d dVar) {
            this.f46764a = context;
            this.f46765b = list;
            this.f46766c = dVar;
        }

        /* renamed from: a */
        public void mo73814a(Map<String, Boolean> map) {
            List a = C9836j.this.mo73807f(this.f46764a, this.f46765b);
            if (C9836j.this.mo73806e(this.f46764a)) {
                this.f46766c.mo73636a(a);
            } else {
                this.f46766c.mo73637b();
            }
        }
    }

    /* renamed from: zendesk.belvedere.j$b */
    /* compiled from: PermissionManager */
    public class C9838b implements C9839c {

        /* renamed from: a */
        public final /* synthetic */ C9839c f46768a;

        public C9838b(C9839c cVar) {
            this.f46768a = cVar;
        }

        /* renamed from: a */
        public void mo73814a(Map<String, Boolean> map) {
            this.f46768a.mo73814a(map);
            C9836j.this.mo73813l((C9839c) null);
        }
    }

    /* renamed from: zendesk.belvedere.j$c */
    /* compiled from: PermissionManager */
    public interface C9839c {
        /* renamed from: a */
        void mo73814a(Map<String, Boolean> map);
    }

    /* renamed from: zendesk.belvedere.j$d */
    /* compiled from: PermissionManager */
    public interface C9840d {
        /* renamed from: a */
        void mo73636a(List<MediaIntent> list);

        /* renamed from: b */
        void mo73637b();
    }

    /* renamed from: d */
    public final void mo73805d(Fragment fragment, List<String> list, C9839c cVar) {
        mo73813l(new C9838b(cVar));
        fragment.requestPermissions((String[]) list.toArray(new String[list.size()]), 9842);
    }

    /* renamed from: e */
    public final boolean mo73806e(Context context) {
        if (mo73811j(context, "android.permission.READ_EXTERNAL_STORAGE")) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final List<MediaIntent> mo73807f(Context context, List<MediaIntent> list) {
        ArrayList arrayList = new ArrayList();
        for (MediaIntent next : list) {
            if (next.mo73681d()) {
                if (TextUtils.isEmpty(next.mo73679b())) {
                    arrayList.add(next);
                } else if (mo73811j(context, next.mo73679b())) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public final List<String> mo73808g(Context context) {
        ArrayList arrayList = new ArrayList();
        if (!mo73806e(context)) {
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
        }
        return arrayList;
    }

    /* renamed from: h */
    public final List<String> mo73809h(List<MediaIntent> list) {
        ArrayList arrayList = new ArrayList();
        for (MediaIntent next : list) {
            if (!TextUtils.isEmpty(next.mo73679b()) && next.mo73681d()) {
                arrayList.add(next.mo73679b());
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public void mo73810i(Fragment fragment, List<MediaIntent> list, C9840d dVar) {
        Context context = fragment.getContext();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(mo73808g(context));
        arrayList.addAll(mo73809h(list));
        if (mo73806e(context) && arrayList.isEmpty()) {
            dVar.mo73636a(mo73807f(context, list));
        } else if (mo73806e(context) || !arrayList.isEmpty()) {
            mo73805d(fragment, arrayList, new C9837a(context, list, dVar));
        } else {
            dVar.mo73637b();
        }
    }

    /* renamed from: j */
    public final boolean mo73811j(Context context, String str) {
        return ln4.m75283b(context, str);
    }

    /* renamed from: k */
    public boolean mo73812k(int i, String[] strArr, int[] iArr) {
        if (i != 9842) {
            return false;
        }
        HashMap hashMap = new HashMap();
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                hashMap.put(strArr[i2], Boolean.TRUE);
            } else if (i3 == -1) {
                hashMap.put(strArr[i2], Boolean.FALSE);
            }
        }
        C9839c cVar = this.f46763a;
        if (cVar == null) {
            return true;
        }
        cVar.mo73814a(hashMap);
        return true;
    }

    /* renamed from: l */
    public final void mo73813l(C9839c cVar) {
        this.f46763a = cVar;
    }
}
