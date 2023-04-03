package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import com.squareup.picasso.C5459q;

/* renamed from: bm3 */
/* compiled from: LruCache */
public final class bm3 implements c80 {

    /* renamed from: a */
    public final LruCache<String, C3899b> f21361a;

    /* renamed from: bm3$a */
    /* compiled from: LruCache */
    public class C3898a extends LruCache<String, C3899b> {
        public C3898a(int i) {
            super(i);
        }

        /* renamed from: a */
        public int sizeOf(String str, C3899b bVar) {
            return bVar.f21364b;
        }
    }

    /* renamed from: bm3$b */
    /* compiled from: LruCache */
    public static final class C3899b {

        /* renamed from: a */
        public final Bitmap f21363a;

        /* renamed from: b */
        public final int f21364b;

        public C3899b(Bitmap bitmap, int i) {
            this.f21363a = bitmap;
            this.f21364b = i;
        }
    }

    public bm3(Context context) {
        this(C5459q.m41874b(context));
    }

    /* renamed from: a */
    public int mo29630a() {
        return this.f21361a.maxSize();
    }

    /* renamed from: b */
    public void mo29631b(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int i = C5459q.m41881i(bitmap);
        if (i > mo29630a()) {
            this.f21361a.remove(str);
        } else {
            this.f21361a.put(str, new C3899b(bitmap, i));
        }
    }

    public Bitmap get(String str) {
        C3899b bVar = this.f21361a.get(str);
        if (bVar != null) {
            return bVar.f21363a;
        }
        return null;
    }

    public int size() {
        return this.f21361a.size();
    }

    public bm3(int i) {
        this.f21361a = new C3898a(i);
    }
}
