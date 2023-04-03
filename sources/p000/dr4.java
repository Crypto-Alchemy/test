package p000;

import androidx.media3.common.C0831s;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: dr4 */
/* compiled from: PlaylistTimeline */
public final class dr4 extends C3568x5 {

    /* renamed from: A */
    public final C0831s[] f10825A;

    /* renamed from: B */
    public final Object[] f10826B;

    /* renamed from: C */
    public final HashMap<Object, Integer> f10827C = new HashMap<>();

    /* renamed from: r */
    public final int f10828r;

    /* renamed from: s */
    public final int f10829s;

    /* renamed from: x */
    public final int[] f10830x;

    /* renamed from: y */
    public final int[] f10831y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dr4(Collection<? extends ds3> collection, x06 x06) {
        super(false, x06);
        int i = 0;
        int size = collection.size();
        this.f10830x = new int[size];
        this.f10831y = new int[size];
        this.f10825A = new C0831s[size];
        this.f10826B = new Object[size];
        int i2 = 0;
        int i3 = 0;
        for (ds3 ds3 : collection) {
            this.f10825A[i3] = ds3.mo18925b();
            this.f10831y[i3] = i;
            this.f10830x[i3] = i2;
            i += this.f10825A[i3].mo6882t();
            i2 += this.f10825A[i3].mo6875m();
            this.f10826B[i3] = ds3.mo18924a();
            this.f10827C.put(this.f10826B[i3], Integer.valueOf(i3));
            i3++;
        }
        this.f10828r = i;
        this.f10829s = i2;
    }

    /* renamed from: A */
    public int mo18902A(int i) {
        return w67.m29356h(this.f10831y, i + 1, false, false);
    }

    /* renamed from: D */
    public Object mo18903D(int i) {
        return this.f10826B[i];
    }

    /* renamed from: F */
    public int mo18904F(int i) {
        return this.f10830x[i];
    }

    /* renamed from: G */
    public int mo18905G(int i) {
        return this.f10831y[i];
    }

    /* renamed from: J */
    public C0831s mo18906J(int i) {
        return this.f10825A[i];
    }

    /* renamed from: K */
    public List<C0831s> mo18907K() {
        return Arrays.asList(this.f10825A);
    }

    /* renamed from: m */
    public int mo6875m() {
        return this.f10829s;
    }

    /* renamed from: t */
    public int mo6882t() {
        return this.f10828r;
    }

    /* renamed from: y */
    public int mo18908y(Object obj) {
        Integer num = this.f10827C.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* renamed from: z */
    public int mo18909z(int i) {
        return w67.m29356h(this.f10830x, i + 1, false, false);
    }
}
