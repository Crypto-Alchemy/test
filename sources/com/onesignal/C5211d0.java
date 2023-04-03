package com.onesignal;

import com.onesignal.OneSignal;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.f94;

/* renamed from: com.onesignal.d0 */
/* compiled from: OSNotification */
public class C5211d0 {

    /* renamed from: A */
    public int f26224A;

    /* renamed from: a */
    public f94.C2278f f26225a;

    /* renamed from: b */
    public List<C5211d0> f26226b;

    /* renamed from: c */
    public int f26227c;

    /* renamed from: d */
    public String f26228d;

    /* renamed from: e */
    public String f26229e;

    /* renamed from: f */
    public String f26230f;

    /* renamed from: g */
    public String f26231g;

    /* renamed from: h */
    public String f26232h;

    /* renamed from: i */
    public JSONObject f26233i;

    /* renamed from: j */
    public String f26234j;

    /* renamed from: k */
    public String f26235k;

    /* renamed from: l */
    public String f26236l;

    /* renamed from: m */
    public String f26237m;

    /* renamed from: n */
    public String f26238n;

    /* renamed from: o */
    public String f26239o;

    /* renamed from: p */
    public String f26240p;

    /* renamed from: q */
    public int f26241q;

    /* renamed from: r */
    public String f26242r;

    /* renamed from: s */
    public String f26243s;

    /* renamed from: t */
    public List<C5212a> f26244t;

    /* renamed from: u */
    public String f26245u;

    /* renamed from: v */
    public C5213b f26246v;

    /* renamed from: w */
    public String f26247w;

    /* renamed from: x */
    public int f26248x;

    /* renamed from: y */
    public String f26249y;

    /* renamed from: z */
    public long f26250z;

    /* renamed from: com.onesignal.d0$a */
    /* compiled from: OSNotification */
    public static class C5212a {

        /* renamed from: a */
        public String f26251a;

        /* renamed from: b */
        public String f26252b;

        /* renamed from: c */
        public String f26253c;
    }

    /* renamed from: com.onesignal.d0$b */
    /* compiled from: OSNotification */
    public static class C5213b {

        /* renamed from: a */
        public String f26254a;

        /* renamed from: b */
        public String f26255b;

        /* renamed from: c */
        public String f26256c;
    }

    /* renamed from: com.onesignal.d0$c */
    /* compiled from: OSNotification */
    public static class C5214c {

        /* renamed from: A */
        public int f26257A;

        /* renamed from: a */
        public f94.C2278f f26258a;

        /* renamed from: b */
        public List<C5211d0> f26259b;

        /* renamed from: c */
        public int f26260c;

        /* renamed from: d */
        public String f26261d;

        /* renamed from: e */
        public String f26262e;

        /* renamed from: f */
        public String f26263f;

        /* renamed from: g */
        public String f26264g;

        /* renamed from: h */
        public String f26265h;

        /* renamed from: i */
        public JSONObject f26266i;

        /* renamed from: j */
        public String f26267j;

        /* renamed from: k */
        public String f26268k;

        /* renamed from: l */
        public String f26269l;

        /* renamed from: m */
        public String f26270m;

        /* renamed from: n */
        public String f26271n;

        /* renamed from: o */
        public String f26272o;

        /* renamed from: p */
        public String f26273p;

        /* renamed from: q */
        public int f26274q = 1;

        /* renamed from: r */
        public String f26275r;

        /* renamed from: s */
        public String f26276s;

        /* renamed from: t */
        public List<C5212a> f26277t;

        /* renamed from: u */
        public String f26278u;

        /* renamed from: v */
        public C5213b f26279v;

        /* renamed from: w */
        public String f26280w;

        /* renamed from: x */
        public int f26281x;

        /* renamed from: y */
        public String f26282y;

        /* renamed from: z */
        public long f26283z;

        /* renamed from: A */
        public C5214c mo38767A(String str) {
            this.f26262e = str;
            return this;
        }

        /* renamed from: B */
        public C5214c mo38768B(String str) {
            this.f26264g = str;
            return this;
        }

        /* renamed from: a */
        public C5211d0 mo38769a() {
            C5211d0 d0Var = new C5211d0();
            d0Var.mo38730F(this.f26258a);
            d0Var.mo38725A(this.f26259b);
            d0Var.mo38757r(this.f26260c);
            d0Var.mo38731G(this.f26261d);
            d0Var.mo38739O(this.f26262e);
            d0Var.mo38738N(this.f26263f);
            d0Var.mo38740P(this.f26264g);
            d0Var.mo38762v(this.f26265h);
            d0Var.mo38756q(this.f26266i);
            d0Var.mo38735K(this.f26267j);
            d0Var.mo38726B(this.f26268k);
            d0Var.mo38761u(this.f26269l);
            d0Var.mo38736L(this.f26270m);
            d0Var.mo38727C(this.f26271n);
            d0Var.mo38737M(this.f26272o);
            d0Var.mo38728D(this.f26273p);
            d0Var.mo38729E(this.f26274q);
            d0Var.mo38765y(this.f26275r);
            d0Var.mo38766z(this.f26276s);
            d0Var.mo38755p(this.f26277t);
            d0Var.mo38764x(this.f26278u);
            d0Var.mo38758s(this.f26279v);
            d0Var.mo38763w(this.f26280w);
            d0Var.mo38732H(this.f26281x);
            d0Var.mo38733I(this.f26282y);
            d0Var.mo38734J(this.f26283z);
            d0Var.mo38741Q(this.f26257A);
            return d0Var;
        }

        /* renamed from: b */
        public C5214c mo38770b(List<C5212a> list) {
            this.f26277t = list;
            return this;
        }

        /* renamed from: c */
        public C5214c mo38771c(JSONObject jSONObject) {
            this.f26266i = jSONObject;
            return this;
        }

        /* renamed from: d */
        public C5214c mo38772d(int i) {
            this.f26260c = i;
            return this;
        }

        /* renamed from: e */
        public C5214c mo38773e(C5213b bVar) {
            this.f26279v = bVar;
            return this;
        }

        /* renamed from: f */
        public C5214c mo38774f(String str) {
            this.f26269l = str;
            return this;
        }

        /* renamed from: g */
        public C5214c mo38775g(String str) {
            this.f26265h = str;
            return this;
        }

        /* renamed from: h */
        public C5214c mo38776h(String str) {
            this.f26280w = str;
            return this;
        }

        /* renamed from: i */
        public C5214c mo38777i(String str) {
            this.f26278u = str;
            return this;
        }

        /* renamed from: j */
        public C5214c mo38778j(String str) {
            this.f26275r = str;
            return this;
        }

        /* renamed from: k */
        public C5214c mo38779k(String str) {
            this.f26276s = str;
            return this;
        }

        /* renamed from: l */
        public C5214c mo38780l(List<C5211d0> list) {
            this.f26259b = list;
            return this;
        }

        /* renamed from: m */
        public C5214c mo38781m(String str) {
            this.f26268k = str;
            return this;
        }

        /* renamed from: n */
        public C5214c mo38782n(String str) {
            this.f26271n = str;
            return this;
        }

        /* renamed from: o */
        public C5214c mo38783o(String str) {
            this.f26273p = str;
            return this;
        }

        /* renamed from: p */
        public C5214c mo38784p(int i) {
            this.f26274q = i;
            return this;
        }

        /* renamed from: q */
        public C5214c mo38785q(f94.C2278f fVar) {
            this.f26258a = fVar;
            return this;
        }

        /* renamed from: r */
        public C5214c mo38786r(String str) {
            this.f26261d = str;
            return this;
        }

        /* renamed from: s */
        public C5214c mo38787s(int i) {
            this.f26281x = i;
            return this;
        }

        /* renamed from: t */
        public C5214c mo38788t(String str) {
            this.f26282y = str;
            return this;
        }

        /* renamed from: u */
        public C5214c mo38789u(long j) {
            this.f26283z = j;
            return this;
        }

        /* renamed from: v */
        public C5214c mo38790v(String str) {
            this.f26267j = str;
            return this;
        }

        /* renamed from: w */
        public C5214c mo38791w(String str) {
            this.f26270m = str;
            return this;
        }

        /* renamed from: x */
        public C5214c mo38792x(String str) {
            this.f26272o = str;
            return this;
        }

        /* renamed from: y */
        public C5214c mo38793y(int i) {
            this.f26257A = i;
            return this;
        }

        /* renamed from: z */
        public C5214c mo38794z(String str) {
            this.f26263f = str;
            return this;
        }
    }

    public C5211d0() {
        this.f26241q = 1;
    }

    /* renamed from: A */
    public void mo38725A(List<C5211d0> list) {
        this.f26226b = list;
    }

    /* renamed from: B */
    public void mo38726B(String str) {
        this.f26235k = str;
    }

    /* renamed from: C */
    public void mo38727C(String str) {
        this.f26238n = str;
    }

    /* renamed from: D */
    public void mo38728D(String str) {
        this.f26240p = str;
    }

    /* renamed from: E */
    public void mo38729E(int i) {
        this.f26241q = i;
    }

    /* renamed from: F */
    public void mo38730F(f94.C2278f fVar) {
        this.f26225a = fVar;
    }

    /* renamed from: G */
    public void mo38731G(String str) {
        this.f26228d = str;
    }

    /* renamed from: H */
    public void mo38732H(int i) {
        this.f26248x = i;
    }

    /* renamed from: I */
    public void mo38733I(String str) {
        this.f26249y = str;
    }

    /* renamed from: J */
    public final void mo38734J(long j) {
        this.f26250z = j;
    }

    /* renamed from: K */
    public void mo38735K(String str) {
        this.f26234j = str;
    }

    /* renamed from: L */
    public void mo38736L(String str) {
        this.f26237m = str;
    }

    /* renamed from: M */
    public void mo38737M(String str) {
        this.f26239o = str;
    }

    /* renamed from: N */
    public void mo38738N(String str) {
        this.f26230f = str;
    }

    /* renamed from: O */
    public void mo38739O(String str) {
        this.f26229e = str;
    }

    /* renamed from: P */
    public void mo38740P(String str) {
        this.f26231g = str;
    }

    /* renamed from: Q */
    public final void mo38741Q(int i) {
        this.f26224A = i;
    }

    /* renamed from: c */
    public C5211d0 mo38742c() {
        return new C5214c().mo38785q(this.f26225a).mo38780l(this.f26226b).mo38772d(this.f26227c).mo38786r(this.f26228d).mo38767A(this.f26229e).mo38794z(this.f26230f).mo38768B(this.f26231g).mo38775g(this.f26232h).mo38771c(this.f26233i).mo38790v(this.f26234j).mo38781m(this.f26235k).mo38774f(this.f26236l).mo38791w(this.f26237m).mo38782n(this.f26238n).mo38792x(this.f26239o).mo38783o(this.f26240p).mo38784p(this.f26241q).mo38778j(this.f26242r).mo38779k(this.f26243s).mo38770b(this.f26244t).mo38777i(this.f26245u).mo38773e(this.f26246v).mo38776h(this.f26247w).mo38787s(this.f26248x).mo38788t(this.f26249y).mo38789u(this.f26250z).mo38793y(this.f26224A).mo38769a();
    }

    /* renamed from: d */
    public int mo38743d() {
        return this.f26227c;
    }

    /* renamed from: e */
    public String mo38744e() {
        return this.f26232h;
    }

    /* renamed from: f */
    public f94.C2278f mo38745f() {
        return this.f26225a;
    }

    /* renamed from: g */
    public String mo38746g() {
        return this.f26228d;
    }

    /* renamed from: h */
    public long mo38747h() {
        return this.f26250z;
    }

    /* renamed from: i */
    public String mo38748i() {
        return this.f26230f;
    }

    /* renamed from: j */
    public String mo38749j() {
        return this.f26229e;
    }

    /* renamed from: k */
    public String mo38750k() {
        return this.f26231g;
    }

    /* renamed from: l */
    public int mo38751l() {
        return this.f26224A;
    }

    /* renamed from: m */
    public boolean mo38752m() {
        if (this.f26227c != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final void mo38753n(JSONObject jSONObject) {
        try {
            JSONObject b = C5270k.m40995b(jSONObject);
            long a = OneSignal.m40443w0().mo46064a();
            if (jSONObject.has("google.ttl")) {
                this.f26250z = jSONObject.optLong("google.sent_time", a) / 1000;
                this.f26224A = jSONObject.optInt("google.ttl", 259200);
            } else if (jSONObject.has("hms.ttl")) {
                this.f26250z = jSONObject.optLong("hms.sent_time", a) / 1000;
                this.f26224A = jSONObject.optInt("hms.ttl", 259200);
            } else {
                this.f26250z = a / 1000;
                this.f26224A = 259200;
            }
            this.f26228d = b.optString("i");
            this.f26230f = b.optString("ti");
            this.f26229e = b.optString("tn");
            this.f26249y = jSONObject.toString();
            this.f26233i = b.optJSONObject("a");
            this.f26238n = b.optString("u", (String) null);
            this.f26232h = jSONObject.optString("alert", (String) null);
            this.f26231g = jSONObject.optString("title", (String) null);
            this.f26234j = jSONObject.optString("sicon", (String) null);
            this.f26236l = jSONObject.optString("bicon", (String) null);
            this.f26235k = jSONObject.optString("licon", (String) null);
            this.f26239o = jSONObject.optString("sound", (String) null);
            this.f26242r = jSONObject.optString("grp", (String) null);
            this.f26243s = jSONObject.optString("grp_msg", (String) null);
            this.f26237m = jSONObject.optString("bgac", (String) null);
            this.f26240p = jSONObject.optString("ledc", (String) null);
            String optString = jSONObject.optString("vis", (String) null);
            if (optString != null) {
                this.f26241q = Integer.parseInt(optString);
            }
            this.f26245u = jSONObject.optString("from", (String) null);
            this.f26248x = jSONObject.optInt("pri", 0);
            String optString2 = jSONObject.optString("collapse_key", (String) null);
            if (!"do_not_collapse".equals(optString2)) {
                this.f26247w = optString2;
            }
            try {
                mo38754o();
            } catch (Throwable th) {
                OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, "Error assigning OSNotificationReceivedEvent.actionButtons values!", th);
            }
            try {
                mo38759t(jSONObject);
            } catch (Throwable th2) {
                OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, "Error assigning OSNotificationReceivedEvent.backgroundImageLayout values!", th2);
            }
        } catch (Throwable th3) {
            OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, "Error assigning OSNotificationReceivedEvent payload values!", th3);
        }
    }

    /* renamed from: o */
    public final void mo38754o() throws Throwable {
        JSONObject jSONObject = this.f26233i;
        if (jSONObject != null && jSONObject.has("actionButtons")) {
            JSONArray jSONArray = this.f26233i.getJSONArray("actionButtons");
            this.f26244t = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                C5212a aVar = new C5212a();
                String unused = aVar.f26251a = jSONObject2.optString("id", (String) null);
                String unused2 = aVar.f26252b = jSONObject2.optString(PublicResolver.FUNC_TEXT, (String) null);
                String unused3 = aVar.f26253c = jSONObject2.optString("icon", (String) null);
                this.f26244t.add(aVar);
            }
            this.f26233i.remove("actionId");
            this.f26233i.remove("actionButtons");
        }
    }

    /* renamed from: p */
    public void mo38755p(List<C5212a> list) {
        this.f26244t = list;
    }

    /* renamed from: q */
    public void mo38756q(JSONObject jSONObject) {
        this.f26233i = jSONObject;
    }

    /* renamed from: r */
    public void mo38757r(int i) {
        this.f26227c = i;
    }

    /* renamed from: s */
    public void mo38758s(C5213b bVar) {
        this.f26246v = bVar;
    }

    /* renamed from: t */
    public final void mo38759t(JSONObject jSONObject) throws Throwable {
        String optString = jSONObject.optString("bg_img", (String) null);
        if (optString != null) {
            JSONObject jSONObject2 = new JSONObject(optString);
            C5213b bVar = new C5213b();
            this.f26246v = bVar;
            String unused = bVar.f26254a = jSONObject2.optString("img");
            String unused2 = this.f26246v.f26255b = jSONObject2.optString("tc");
            String unused3 = this.f26246v.f26256c = jSONObject2.optString("bc");
        }
    }

    public String toString() {
        return "OSNotification{notificationExtender=" + this.f26225a + ", groupedNotifications=" + this.f26226b + ", androidNotificationId=" + this.f26227c + ", notificationId='" + this.f26228d + '\'' + ", templateName='" + this.f26229e + '\'' + ", templateId='" + this.f26230f + '\'' + ", title='" + this.f26231g + '\'' + ", body='" + this.f26232h + '\'' + ", additionalData=" + this.f26233i + ", smallIcon='" + this.f26234j + '\'' + ", largeIcon='" + this.f26235k + '\'' + ", bigPicture='" + this.f26236l + '\'' + ", smallIconAccentColor='" + this.f26237m + '\'' + ", launchURL='" + this.f26238n + '\'' + ", sound='" + this.f26239o + '\'' + ", ledColor='" + this.f26240p + '\'' + ", lockScreenVisibility=" + this.f26241q + ", groupKey='" + this.f26242r + '\'' + ", groupMessage='" + this.f26243s + '\'' + ", actionButtons=" + this.f26244t + ", fromProjectNumber='" + this.f26245u + '\'' + ", backgroundImageLayout=" + this.f26246v + ", collapseId='" + this.f26247w + '\'' + ", priority=" + this.f26248x + ", rawPayload='" + this.f26249y + '\'' + '}';
    }

    /* renamed from: u */
    public void mo38761u(String str) {
        this.f26236l = str;
    }

    /* renamed from: v */
    public void mo38762v(String str) {
        this.f26232h = str;
    }

    /* renamed from: w */
    public void mo38763w(String str) {
        this.f26247w = str;
    }

    /* renamed from: x */
    public void mo38764x(String str) {
        this.f26245u = str;
    }

    /* renamed from: y */
    public void mo38765y(String str) {
        this.f26242r = str;
    }

    /* renamed from: z */
    public void mo38766z(String str) {
        this.f26243s = str;
    }

    public C5211d0(JSONObject jSONObject) {
        this((List<C5211d0>) null, jSONObject, 0);
    }

    public C5211d0(List<C5211d0> list, JSONObject jSONObject, int i) {
        this.f26241q = 1;
        mo38753n(jSONObject);
        this.f26226b = list;
        this.f26227c = i;
    }
}
