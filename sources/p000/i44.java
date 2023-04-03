package p000;

import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B'\b\u0017\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0014"}, mo44877d2 = {"Li44;", "", "", "toString", "Landroid/net/Uri;", "a", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "uri", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "action", "mimeType", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "(Landroid/content/Intent;)V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: i44 */
/* compiled from: NavDeepLinkRequest.kt */
public class i44 {

    /* renamed from: a */
    public final Uri f13150a;

    /* renamed from: b */
    public final String f13151b;

    /* renamed from: c */
    public final String f13152c;

    public i44(Uri uri, String str, String str2) {
        this.f13150a = uri;
        this.f13151b = str;
        this.f13152c = str2;
    }

    /* renamed from: a */
    public String mo21449a() {
        return this.f13151b;
    }

    /* renamed from: b */
    public String mo21450b() {
        return this.f13152c;
    }

    /* renamed from: c */
    public Uri mo21451c() {
        return this.f13150a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (mo21451c() != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(mo21451c()));
        }
        if (mo21449a() != null) {
            sb.append(" action=");
            sb.append(mo21449a());
        }
        if (mo21450b() != null) {
            sb.append(" mimetype=");
            sb.append(mo21450b());
        }
        sb.append(" }");
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i44(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        vx2.m53591g(intent, "intent");
    }
}
