package p000;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: d11 */
/* compiled from: DashManifest */
public class d11 implements r12<d11> {

    /* renamed from: a */
    public final long f10419a;

    /* renamed from: b */
    public final long f10420b;

    /* renamed from: c */
    public final long f10421c;

    /* renamed from: d */
    public final boolean f10422d;

    /* renamed from: e */
    public final long f10423e;

    /* renamed from: f */
    public final long f10424f;

    /* renamed from: g */
    public final long f10425g;

    /* renamed from: h */
    public final long f10426h;

    /* renamed from: i */
    public final e67 f10427i;

    /* renamed from: j */
    public final hx5 f10428j;

    /* renamed from: k */
    public final Uri f10429k;

    /* renamed from: l */
    public final lw4 f10430l;

    /* renamed from: m */
    public final List<jn4> f10431m;

    public d11(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, lw4 lw4, e67 e67, hx5 hx5, Uri uri, List<jn4> list) {
        List<jn4> list2;
        this.f10419a = j;
        this.f10420b = j2;
        this.f10421c = j3;
        this.f10422d = z;
        this.f10423e = j4;
        this.f10424f = j5;
        this.f10425g = j6;
        this.f10426h = j7;
        this.f10430l = lw4;
        this.f10427i = e67;
        this.f10429k = uri;
        this.f10428j = hx5;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = list;
        }
        this.f10431m = list2;
    }

    /* renamed from: c */
    public static ArrayList<C2751lb> m14624c(List<C2751lb> list, LinkedList<StreamKey> linkedList) {
        StreamKey poll = linkedList.poll();
        int i = poll.f4121a;
        ArrayList<C2751lb> arrayList = new ArrayList<>();
        do {
            int i2 = poll.f4122d;
            C2751lb lbVar = list.get(i2);
            List<xd5> list2 = lbVar.f14465c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll.f4123e));
                poll = linkedList.poll();
                if (!(poll.f4121a == i && poll.f4122d == i2)) {
                    arrayList.add(new C2751lb(lbVar.f14463a, lbVar.f14464b, arrayList2, lbVar.f14466d, lbVar.f14467e, lbVar.f14468f));
                }
                arrayList2.add(list2.get(poll.f4123e));
                poll = linkedList.poll();
                break;
            } while (poll.f4122d == i2);
            arrayList.add(new C2751lb(lbVar.f14463a, lbVar.f14464b, arrayList2, lbVar.f14466d, lbVar.f14467e, lbVar.f14468f));
        } while (poll.f4121a == i);
        linkedList.addFirst(poll);
        return arrayList;
    }

    /* renamed from: b */
    public final d11 mo18390a(List<StreamKey> list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            int e = mo18393e();
            j = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            if (i >= e) {
                break;
            }
            if (((StreamKey) linkedList.peek()).f4121a != i) {
                long f = mo18394f(i);
                if (f != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    j2 += f;
                }
            } else {
                jn4 d = mo18392d(i);
                arrayList.add(new jn4(d.f13722a, d.f13723b - j2, m14624c(d.f13724c, linkedList), d.f13725d));
            }
            i++;
        }
        long j3 = this.f10420b;
        if (j3 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            j = j3 - j2;
        }
        return new d11(this.f10419a, j, this.f10421c, this.f10422d, this.f10423e, this.f10424f, this.f10425g, this.f10426h, this.f10430l, this.f10427i, this.f10428j, this.f10429k, arrayList);
    }

    /* renamed from: d */
    public final jn4 mo18392d(int i) {
        return this.f10431m.get(i);
    }

    /* renamed from: e */
    public final int mo18393e() {
        return this.f10431m.size();
    }

    /* renamed from: f */
    public final long mo18394f(int i) {
        if (i != this.f10431m.size() - 1) {
            return this.f10431m.get(i + 1).f13723b - this.f10431m.get(i).f13723b;
        }
        long j = this.f10420b;
        if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        return j - this.f10431m.get(i).f13723b;
    }

    /* renamed from: g */
    public final long mo18395g(int i) {
        return w67.m29391y0(mo18394f(i));
    }
}
