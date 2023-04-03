package p000;

import android.content.Context;
import android.net.Uri;
import com.onesignal.C5211d0;
import com.onesignal.OneSignal;
import java.security.SecureRandom;
import org.json.JSONObject;

/* renamed from: md4 */
/* compiled from: OSNotificationGenerationJob */
public class md4 {

    /* renamed from: a */
    public C5211d0 f31659a;

    /* renamed from: b */
    public Context f31660b;

    /* renamed from: c */
    public JSONObject f31661c;

    /* renamed from: d */
    public boolean f31662d;

    /* renamed from: e */
    public boolean f31663e;

    /* renamed from: f */
    public Long f31664f;

    /* renamed from: g */
    public CharSequence f31665g;

    /* renamed from: h */
    public CharSequence f31666h;

    /* renamed from: i */
    public Uri f31667i;

    /* renamed from: j */
    public Integer f31668j;

    /* renamed from: k */
    public Integer f31669k;

    /* renamed from: l */
    public Uri f31670l;

    public md4(Context context) {
        this.f31660b = context;
    }

    /* renamed from: a */
    public Integer mo45743a() {
        return Integer.valueOf(this.f31659a.mo38743d());
    }

    /* renamed from: b */
    public String mo45744b() {
        return OneSignal.m40392f0(this.f31661c);
    }

    /* renamed from: c */
    public CharSequence mo45745c() {
        CharSequence charSequence = this.f31665g;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f31659a.mo38744e();
    }

    /* renamed from: d */
    public Context mo45746d() {
        return this.f31660b;
    }

    /* renamed from: e */
    public JSONObject mo45747e() {
        return this.f31661c;
    }

    /* renamed from: f */
    public C5211d0 mo45748f() {
        return this.f31659a;
    }

    /* renamed from: g */
    public Uri mo45749g() {
        return this.f31670l;
    }

    /* renamed from: h */
    public Integer mo45750h() {
        return this.f31668j;
    }

    /* renamed from: i */
    public Uri mo45751i() {
        return this.f31667i;
    }

    /* renamed from: j */
    public Long mo45752j() {
        return this.f31664f;
    }

    /* renamed from: k */
    public CharSequence mo45753k() {
        CharSequence charSequence = this.f31666h;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f31659a.mo38750k();
    }

    /* renamed from: l */
    public boolean mo45754l() {
        if (this.f31659a.mo38745f() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean mo45755m() {
        return this.f31663e;
    }

    /* renamed from: n */
    public boolean mo45756n() {
        return this.f31662d;
    }

    /* renamed from: o */
    public void mo45757o(Context context) {
        this.f31660b = context;
    }

    /* renamed from: p */
    public void mo45758p(boolean z) {
        this.f31663e = z;
    }

    /* renamed from: q */
    public void mo45759q(JSONObject jSONObject) {
        this.f31661c = jSONObject;
    }

    /* renamed from: r */
    public void mo45760r(C5211d0 d0Var) {
        if (d0Var != null && !d0Var.mo38752m()) {
            C5211d0 d0Var2 = this.f31659a;
            if (d0Var2 == null || !d0Var2.mo38752m()) {
                d0Var.mo38757r(new SecureRandom().nextInt());
            } else {
                d0Var.mo38757r(this.f31659a.mo38743d());
            }
        }
        this.f31659a = d0Var;
    }

    /* renamed from: s */
    public void mo45761s(Integer num) {
        this.f31669k = num;
    }

    /* renamed from: t */
    public void mo45762t(Uri uri) {
        this.f31670l = uri;
    }

    public String toString() {
        return "OSNotificationGenerationJob{jsonPayload=" + this.f31661c + ", isRestoring=" + this.f31662d + ", isNotificationToDisplay=" + this.f31663e + ", shownTimeStamp=" + this.f31664f + ", overriddenBodyFromExtender=" + this.f31665g + ", overriddenTitleFromExtender=" + this.f31666h + ", overriddenSound=" + this.f31667i + ", overriddenFlags=" + this.f31668j + ", orgFlags=" + this.f31669k + ", orgSound=" + this.f31670l + ", notification=" + this.f31659a + '}';
    }

    /* renamed from: u */
    public void mo45764u(CharSequence charSequence) {
        this.f31665g = charSequence;
    }

    /* renamed from: v */
    public void mo45765v(Integer num) {
        this.f31668j = num;
    }

    /* renamed from: w */
    public void mo45766w(Uri uri) {
        this.f31667i = uri;
    }

    /* renamed from: x */
    public void mo45767x(CharSequence charSequence) {
        this.f31666h = charSequence;
    }

    /* renamed from: y */
    public void mo45768y(boolean z) {
        this.f31662d = z;
    }

    /* renamed from: z */
    public void mo45769z(Long l) {
        this.f31664f = l;
    }

    public md4(Context context, JSONObject jSONObject) {
        this(context, new C5211d0(jSONObject), jSONObject);
    }

    public md4(Context context, C5211d0 d0Var, JSONObject jSONObject) {
        this.f31660b = context;
        this.f31661c = jSONObject;
        mo45760r(d0Var);
    }
}
