package p000;

import java.io.Closeable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: kh0 */
/* compiled from: CloseableImage */
public abstract class kh0 implements Closeable, vq2 {

    /* renamed from: d */
    public static final Set<String> f14071d = new HashSet(Arrays.asList(new String[]{"encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded"}));

    /* renamed from: a */
    public Map<String, Object> f14072a = new HashMap();

    /* renamed from: a */
    public qz4 mo22289a() {
        return ns2.f15676d;
    }

    /* renamed from: b */
    public abstract int mo21175b();

    /* renamed from: c */
    public boolean mo21176c() {
        return false;
    }

    public abstract void close();

    /* renamed from: d */
    public void mo22290d(String str, Object obj) {
        if (f14071d.contains(str)) {
            this.f14072a.put(str, obj);
        }
    }

    /* renamed from: e */
    public void mo22291e(Map<String, Object> map) {
        if (map != null) {
            for (String next : f14071d) {
                Object obj = map.get(next);
                if (obj != null) {
                    this.f14072a.put(next, obj);
                }
            }
        }
    }

    public void finalize() throws Throwable {
        if (!isClosed()) {
            oy1.m24437x("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public Map<String, Object> getExtras() {
        return this.f14072a;
    }

    public abstract boolean isClosed();
}
