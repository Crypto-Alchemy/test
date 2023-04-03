package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: androidx.emoji2.text.f */
/* compiled from: MetadataRepo */
public final class C0610f {

    /* renamed from: a */
    public final gv3 f3586a;

    /* renamed from: b */
    public final char[] f3587b;

    /* renamed from: c */
    public final C0611a f3588c = new C0611a(RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE);

    /* renamed from: d */
    public final Typeface f3589d;

    /* renamed from: androidx.emoji2.text.f$a */
    /* compiled from: MetadataRepo */
    public static class C0611a {

        /* renamed from: a */
        public final SparseArray<C0611a> f3590a;

        /* renamed from: b */
        public ho1 f3591b;

        public C0611a() {
            this(1);
        }

        /* renamed from: a */
        public C0611a mo5667a(int i) {
            SparseArray<C0611a> sparseArray = this.f3590a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        /* renamed from: b */
        public final ho1 mo5668b() {
            return this.f3591b;
        }

        /* renamed from: c */
        public void mo5669c(ho1 ho1, int i, int i2) {
            C0611a a = mo5667a(ho1.mo21317b(i));
            if (a == null) {
                a = new C0611a();
                this.f3590a.put(ho1.mo21317b(i), a);
            }
            if (i2 > i) {
                a.mo5669c(ho1, i + 1, i2);
            } else {
                a.f3591b = ho1;
            }
        }

        public C0611a(int i) {
            this.f3590a = new SparseArray<>(i);
        }
    }

    public C0610f(Typeface typeface, gv3 gv3) {
        this.f3589d = typeface;
        this.f3586a = gv3;
        this.f3587b = new char[(gv3.mo20851k() * 2)];
        mo5660a(gv3);
    }

    /* renamed from: b */
    public static C0610f m4583b(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        try {
            os6.m24033a("EmojiCompat.MetadataRepo.create");
            return new C0610f(typeface, hv3.m19270b(byteBuffer));
        } finally {
            os6.m24034b();
        }
    }

    /* renamed from: a */
    public final void mo5660a(gv3 gv3) {
        int k = gv3.mo20851k();
        for (int i = 0; i < k; i++) {
            ho1 ho1 = new ho1(this, i);
            Character.toChars(ho1.mo21321f(), this.f3587b, i * 2);
            mo5666h(ho1);
        }
    }

    /* renamed from: c */
    public char[] mo5661c() {
        return this.f3587b;
    }

    /* renamed from: d */
    public gv3 mo5662d() {
        return this.f3586a;
    }

    /* renamed from: e */
    public int mo5663e() {
        return this.f3586a.mo20852l();
    }

    /* renamed from: f */
    public C0611a mo5664f() {
        return this.f3588c;
    }

    /* renamed from: g */
    public Typeface mo5665g() {
        return this.f3589d;
    }

    /* renamed from: h */
    public void mo5666h(ho1 ho1) {
        boolean z;
        gu4.m18429g(ho1, "emoji metadata cannot be null");
        if (ho1.mo21318c() > 0) {
            z = true;
        } else {
            z = false;
        }
        gu4.m18423a(z, "invalid metadata codepoint length");
        this.f3588c.mo5669c(ho1, 0, ho1.mo21318c() - 1);
    }
}
