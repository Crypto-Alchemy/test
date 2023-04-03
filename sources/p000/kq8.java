package p000;

import java.util.List;

/* renamed from: kq8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class kq8 implements zh9 {

    /* renamed from: a */
    public final /* synthetic */ qq8 f31009a;

    public kq8(qq8 qq8) {
        this.f31009a = qq8;
    }

    /* renamed from: a */
    public final void mo45236a(int i, String str, List<String> list, boolean z, boolean z2) {
        vm8 vm8;
        int i2 = i - 1;
        if (i2 == 0) {
            vm8 = this.f31009a.f34342a.mo45237A().mo29677u();
        } else if (i2 != 1) {
            if (i2 == 3) {
                vm8 = this.f31009a.f34342a.mo45237A().mo29678v();
            } else if (i2 != 4) {
                vm8 = this.f31009a.f34342a.mo45237A().mo29676t();
            } else if (z) {
                vm8 = this.f31009a.f34342a.mo45237A().mo29674p();
            } else if (!z2) {
                vm8 = this.f31009a.f34342a.mo45237A().mo29675r();
            } else {
                vm8 = this.f31009a.f34342a.mo45237A().mo29673o();
            }
        } else if (z) {
            vm8 = this.f31009a.f34342a.mo45237A().mo29671m();
        } else if (!z2) {
            vm8 = this.f31009a.f34342a.mo45237A().mo29672n();
        } else {
            vm8 = this.f31009a.f34342a.mo45237A().mo29670l();
        }
        int size = list.size();
        if (size == 1) {
            vm8.mo48770b(str, list.get(0));
        } else if (size == 2) {
            vm8.mo48771c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            vm8.mo48769a(str);
        } else {
            vm8.mo48772d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
