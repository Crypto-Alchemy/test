package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

@Navigator.C1127b("fragment")
/* renamed from: androidx.navigation.fragment.a */
/* compiled from: FragmentNavigator */
public class C1131a extends Navigator<C1132a> {

    /* renamed from: c */
    public final Context f6091c;

    /* renamed from: d */
    public final FragmentManager f6092d;

    /* renamed from: e */
    public final int f6093e;

    /* renamed from: f */
    public ArrayDeque<Integer> f6094f = new ArrayDeque<>();

    /* renamed from: androidx.navigation.fragment.a$a */
    /* compiled from: FragmentNavigator */
    public static class C1132a extends NavDestination {

        /* renamed from: C */
        public String f6095C;

        public C1132a(Navigator<? extends C1132a> navigator) {
            super((Navigator<? extends NavDestination>) navigator);
        }

        /* renamed from: H */
        public void mo8404H(Context context, AttributeSet attributeSet) {
            super.mo8404H(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, j55.FragmentNavigator);
            String string = obtainAttributes.getString(j55.FragmentNavigator_android_name);
            if (string != null) {
                mo8623R(string);
            }
            obtainAttributes.recycle();
        }

        /* renamed from: Q */
        public final String mo8622Q() {
            String str = this.f6095C;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Fragment class was not set");
        }

        /* renamed from: R */
        public final C1132a mo8623R(String str) {
            this.f6095C = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.f6095C;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            return sb.toString();
        }
    }

    /* renamed from: androidx.navigation.fragment.a$b */
    /* compiled from: FragmentNavigator */
    public static final class C1133b implements Navigator.C1126a {

        /* renamed from: a */
        public final LinkedHashMap<View, String> f6096a;

        /* renamed from: a */
        public Map<View, String> mo8624a() {
            return Collections.unmodifiableMap(this.f6096a);
        }
    }

    public C1131a(Context context, FragmentManager fragmentManager, int i) {
        this.f6091c = context;
        this.f6092d = fragmentManager;
        this.f6093e = i;
    }

    /* renamed from: h */
    public void mo8601h(Bundle bundle) {
        int[] intArray;
        if (bundle != null && (intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds")) != null) {
            this.f6094f.clear();
            for (int valueOf : intArray) {
                this.f6094f.add(Integer.valueOf(valueOf));
            }
        }
    }

    /* renamed from: i */
    public Bundle mo8602i() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.f6094f.size()];
        Iterator<Integer> it = this.f6094f.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    /* renamed from: k */
    public boolean mo8401k() {
        if (this.f6094f.isEmpty() || this.f6092d.mo5947R0()) {
            return false;
        }
        this.f6092d.mo5971g1(mo8619m(this.f6094f.size(), this.f6094f.peekLast().intValue()), 1);
        this.f6094f.removeLast();
        return true;
    }

    /* renamed from: l */
    public C1132a mo8399a() {
        return new C1132a(this);
    }

    /* renamed from: m */
    public final String mo8619m(int i, int i2) {
        return i + "-" + i2;
    }

    @Deprecated
    /* renamed from: n */
    public Fragment mo8620n(Context context, FragmentManager fragmentManager, String str, Bundle bundle) {
        return fragmentManager.mo6012v0().mo6039a(context.getClassLoader(), str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012d A[RETURN] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.navigation.NavDestination mo8400d(androidx.navigation.fragment.C1131a.C1132a r9, android.os.Bundle r10, p000.m44 r11, androidx.navigation.Navigator.C1126a r12) {
        /*
            r8 = this;
            androidx.fragment.app.FragmentManager r0 = r8.f6092d
            boolean r0 = r0.mo5947R0()
            r1 = 0
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            java.lang.String r0 = r9.mo8622Q()
            r2 = 0
            char r3 = r0.charAt(r2)
            r4 = 46
            if (r3 != r4) goto L_0x002c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.Context r4 = r8.f6091c
            java.lang.String r4 = r4.getPackageName()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x002c:
            android.content.Context r3 = r8.f6091c
            androidx.fragment.app.FragmentManager r4 = r8.f6092d
            androidx.fragment.app.Fragment r0 = r8.mo8620n(r3, r4, r0, r10)
            r0.setArguments(r10)
            androidx.fragment.app.FragmentManager r10 = r8.f6092d
            androidx.fragment.app.j r10 = r10.mo5996q()
            r3 = -1
            if (r11 == 0) goto L_0x0045
            int r4 = r11.mo23023a()
            goto L_0x0046
        L_0x0045:
            r4 = r3
        L_0x0046:
            if (r11 == 0) goto L_0x004d
            int r5 = r11.mo23024b()
            goto L_0x004e
        L_0x004d:
            r5 = r3
        L_0x004e:
            if (r11 == 0) goto L_0x0055
            int r6 = r11.mo23025c()
            goto L_0x0056
        L_0x0055:
            r6 = r3
        L_0x0056:
            if (r11 == 0) goto L_0x005d
            int r7 = r11.mo23026d()
            goto L_0x005e
        L_0x005d:
            r7 = r3
        L_0x005e:
            if (r4 != r3) goto L_0x0066
            if (r5 != r3) goto L_0x0066
            if (r6 != r3) goto L_0x0066
            if (r7 == r3) goto L_0x0079
        L_0x0066:
            if (r4 == r3) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r4 = r2
        L_0x006a:
            if (r5 == r3) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r5 = r2
        L_0x006e:
            if (r6 == r3) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r6 = r2
        L_0x0072:
            if (r7 == r3) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r7 = r2
        L_0x0076:
            r10.mo6272u(r4, r5, r6, r7)
        L_0x0079:
            int r3 = r8.f6093e
            r10.mo6270s(r3, r0)
            r10.mo6148v(r0)
            int r0 = r9.mo8563w()
            java.util.ArrayDeque<java.lang.Integer> r3 = r8.f6094f
            boolean r3 = r3.isEmpty()
            r4 = 1
            if (r11 == 0) goto L_0x00a6
            if (r3 != 0) goto L_0x00a6
            boolean r11 = r11.mo23030g()
            if (r11 == 0) goto L_0x00a6
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f6094f
            java.lang.Object r11 = r11.peekLast()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r11 != r0) goto L_0x00a6
            r11 = r4
            goto L_0x00a7
        L_0x00a6:
            r11 = r2
        L_0x00a7:
            if (r3 == 0) goto L_0x00ab
        L_0x00a9:
            r2 = r4
            goto L_0x00ed
        L_0x00ab:
            if (r11 == 0) goto L_0x00de
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f6094f
            int r11 = r11.size()
            if (r11 <= r4) goto L_0x00ed
            androidx.fragment.app.FragmentManager r11 = r8.f6092d
            java.util.ArrayDeque<java.lang.Integer> r3 = r8.f6094f
            int r3 = r3.size()
            java.util.ArrayDeque<java.lang.Integer> r5 = r8.f6094f
            java.lang.Object r5 = r5.peekLast()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.String r3 = r8.mo8619m(r3, r5)
            r11.mo5971g1(r3, r4)
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f6094f
            int r11 = r11.size()
            java.lang.String r11 = r8.mo8619m(r11, r0)
            r10.mo6267h(r11)
            goto L_0x00ed
        L_0x00de:
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f6094f
            int r11 = r11.size()
            int r11 = r11 + r4
            java.lang.String r11 = r8.mo8619m(r11, r0)
            r10.mo6267h(r11)
            goto L_0x00a9
        L_0x00ed:
            boolean r11 = r12 instanceof androidx.navigation.fragment.C1131a.C1133b
            if (r11 == 0) goto L_0x011b
            androidx.navigation.fragment.a$b r12 = (androidx.navigation.fragment.C1131a.C1133b) r12
            java.util.Map r11 = r12.mo8624a()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x00ff:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x011b
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r3 = r12.getKey()
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            r10.mo6266g(r3, r12)
            goto L_0x00ff
        L_0x011b:
            r10.mo6273w(r4)
            r10.mo6139j()
            if (r2 == 0) goto L_0x012d
            java.util.ArrayDeque<java.lang.Integer> r10 = r8.f6094f
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r10.add(r11)
            return r9
        L_0x012d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.C1131a.mo8400d(androidx.navigation.fragment.a$a, android.os.Bundle, m44, androidx.navigation.Navigator$a):androidx.navigation.NavDestination");
    }
}
