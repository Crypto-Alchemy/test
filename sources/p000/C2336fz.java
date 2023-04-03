package p000;

import com.facebook.common.internal.ImmutableSet;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.image.EncodedImageOrigin;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: fz */
/* compiled from: BaseProducerContext */
public class C2336fz implements wv4 {

    /* renamed from: o */
    public static final Set<String> f12115o = ImmutableSet.m13307of("id", "uri_source");

    /* renamed from: a */
    public final ImageRequest f12116a;

    /* renamed from: b */
    public final String f12117b;

    /* renamed from: c */
    public final String f12118c;

    /* renamed from: d */
    public final aw4 f12119d;

    /* renamed from: e */
    public final Object f12120e;

    /* renamed from: f */
    public final ImageRequest.RequestLevel f12121f;

    /* renamed from: g */
    public final Map<String, Object> f12122g;

    /* renamed from: h */
    public boolean f12123h;

    /* renamed from: i */
    public Priority f12124i;

    /* renamed from: j */
    public boolean f12125j;

    /* renamed from: k */
    public boolean f12126k;

    /* renamed from: l */
    public final List<xv4> f12127l;

    /* renamed from: m */
    public final nr2 f12128m;

    /* renamed from: n */
    public EncodedImageOrigin f12129n;

    public C2336fz(ImageRequest imageRequest, String str, aw4 aw4, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority, nr2 nr2) {
        this(imageRequest, str, (String) null, aw4, obj, requestLevel, z, z2, priority, nr2);
    }

    /* renamed from: p */
    public static void m17490p(List<xv4> list) {
        if (list != null) {
            for (xv4 b : list) {
                b.mo13412b();
            }
        }
    }

    /* renamed from: q */
    public static void m17491q(List<xv4> list) {
        if (list != null) {
            for (xv4 a : list) {
                a.mo13429a();
            }
        }
    }

    /* renamed from: r */
    public static void m17492r(List<xv4> list) {
        if (list != null) {
            for (xv4 d : list) {
                d.mo20326d();
            }
        }
    }

    /* renamed from: s */
    public static void m17493s(List<xv4> list) {
        if (list != null) {
            for (xv4 c : list) {
                c.mo20325c();
            }
        }
    }

    /* renamed from: a */
    public Object mo20275a() {
        return this.f12120e;
    }

    /* renamed from: b */
    public void mo20276b(String str, Object obj) {
        if (!f12115o.contains(str)) {
            this.f12122g.put(str, obj);
        }
    }

    /* renamed from: c */
    public nr2 mo20277c() {
        return this.f12128m;
    }

    /* renamed from: d */
    public void mo20278d(String str, String str2) {
        this.f12122g.put("origin", str);
        this.f12122g.put("origin_sub", str2);
    }

    /* renamed from: e */
    public String mo20279e() {
        return this.f12118c;
    }

    /* renamed from: f */
    public void mo20280f(String str) {
        mo20278d(str, "default");
    }

    /* renamed from: g */
    public aw4 mo20281g() {
        return this.f12119d;
    }

    public Map<String, Object> getExtras() {
        return this.f12122g;
    }

    public String getId() {
        return this.f12117b;
    }

    public synchronized Priority getPriority() {
        return this.f12124i;
    }

    /* renamed from: h */
    public synchronized boolean mo20285h() {
        return this.f12125j;
    }

    /* renamed from: i */
    public ImageRequest mo20286i() {
        return this.f12116a;
    }

    /* renamed from: j */
    public void mo20287j(EncodedImageOrigin encodedImageOrigin) {
        this.f12129n = encodedImageOrigin;
    }

    /* renamed from: k */
    public void mo20288k(Map<String, ?> map) {
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                mo20276b((String) next.getKey(), next.getValue());
            }
        }
    }

    /* renamed from: l */
    public synchronized boolean mo20289l() {
        return this.f12123h;
    }

    /* renamed from: m */
    public <T> T mo20290m(String str) {
        return this.f12122g.get(str);
    }

    /* renamed from: n */
    public ImageRequest.RequestLevel mo20291n() {
        return this.f12121f;
    }

    /* renamed from: o */
    public void mo20292o(xv4 xv4) {
        boolean z;
        synchronized (this) {
            this.f12127l.add(xv4);
            z = this.f12126k;
        }
        if (z) {
            xv4.mo13412b();
        }
    }

    /* renamed from: t */
    public void mo20293t() {
        m17490p(mo20294u());
    }

    /* renamed from: u */
    public synchronized List<xv4> mo20294u() {
        if (this.f12126k) {
            return null;
        }
        this.f12126k = true;
        return new ArrayList(this.f12127l);
    }

    /* renamed from: v */
    public synchronized List<xv4> mo20295v(boolean z) {
        if (z == this.f12125j) {
            return null;
        }
        this.f12125j = z;
        return new ArrayList(this.f12127l);
    }

    /* renamed from: w */
    public synchronized List<xv4> mo20296w(boolean z) {
        if (z == this.f12123h) {
            return null;
        }
        this.f12123h = z;
        return new ArrayList(this.f12127l);
    }

    /* renamed from: x */
    public synchronized List<xv4> mo20297x(Priority priority) {
        if (priority == this.f12124i) {
            return null;
        }
        this.f12124i = priority;
        return new ArrayList(this.f12127l);
    }

    public C2336fz(ImageRequest imageRequest, String str, String str2, aw4 aw4, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority, nr2 nr2) {
        Object obj2;
        this.f12129n = EncodedImageOrigin.NOT_SET;
        this.f12116a = imageRequest;
        this.f12117b = str;
        HashMap hashMap = new HashMap();
        this.f12122g = hashMap;
        hashMap.put("id", str);
        if (imageRequest == null) {
            obj2 = "null-request";
        } else {
            obj2 = imageRequest.mo13458u();
        }
        hashMap.put("uri_source", obj2);
        this.f12118c = str2;
        this.f12119d = aw4;
        this.f12120e = obj;
        this.f12121f = requestLevel;
        this.f12123h = z;
        this.f12124i = priority;
        this.f12125j = z2;
        this.f12126k = false;
        this.f12127l = new ArrayList();
        this.f12128m = nr2;
    }
}
