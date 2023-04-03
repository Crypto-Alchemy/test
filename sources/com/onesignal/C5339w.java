package com.onesignal;

import com.onesignal.WebViewManager;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR$\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u0011\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010 \u001a\u0004\b\n\u0010!\"\u0004\b\"\u0010#R\"\u0010*\u001a\u00020%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010&\u001a\u0004\b\u0015\u0010'\"\u0004\b(\u0010)¨\u0006/"}, mo44877d2 = {"Lcom/onesignal/w;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "h", "(Ljava/lang/String;)V", "contentHtml", "", "b", "Z", "e", "()Z", "setUseHeightMargin", "(Z)V", "useHeightMargin", "c", "f", "setUseWidthMargin", "useWidthMargin", "d", "g", "setFullBleed", "isFullBleed", "Lcom/onesignal/WebViewManager$Position;", "Lcom/onesignal/WebViewManager$Position;", "()Lcom/onesignal/WebViewManager$Position;", "i", "(Lcom/onesignal/WebViewManager$Position;)V", "displayLocation", "", "Ljava/lang/Double;", "()Ljava/lang/Double;", "setDisplayDuration", "(Ljava/lang/Double;)V", "displayDuration", "", "I", "()I", "j", "(I)V", "pageHeight", "Lorg/json/JSONObject;", "jsonObject", "<init>", "(Lorg/json/JSONObject;)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: com.onesignal.w */
/* compiled from: OSInAppMessageContent.kt */
public class C5339w {

    /* renamed from: a */
    public String f26559a;

    /* renamed from: b */
    public boolean f26560b = true;

    /* renamed from: c */
    public boolean f26561c = true;

    /* renamed from: d */
    public boolean f26562d;

    /* renamed from: e */
    public WebViewManager.Position f26563e;

    /* renamed from: f */
    public Double f26564f;

    /* renamed from: g */
    public int f26565g;

    public C5339w(JSONObject jSONObject) {
        boolean z;
        vx2.m53591g(jSONObject, "jsonObject");
        this.f26559a = jSONObject.optString("html");
        this.f26564f = Double.valueOf(jSONObject.optDouble("display_duration"));
        JSONObject optJSONObject = jSONObject.optJSONObject("styles");
        boolean z2 = false;
        if (optJSONObject != null) {
            z = optJSONObject.optBoolean("remove_height_margin", false);
        } else {
            z = false;
        }
        this.f26560b = !z;
        this.f26561c = !(optJSONObject != null ? optJSONObject.optBoolean("remove_width_margin", false) : z2);
        this.f26562d = !this.f26560b;
    }

    /* renamed from: a */
    public final String mo39134a() {
        return this.f26559a;
    }

    /* renamed from: b */
    public final Double mo39135b() {
        return this.f26564f;
    }

    /* renamed from: c */
    public final WebViewManager.Position mo39136c() {
        return this.f26563e;
    }

    /* renamed from: d */
    public final int mo39137d() {
        return this.f26565g;
    }

    /* renamed from: e */
    public final boolean mo39138e() {
        return this.f26560b;
    }

    /* renamed from: f */
    public final boolean mo39139f() {
        return this.f26561c;
    }

    /* renamed from: g */
    public final boolean mo39140g() {
        return this.f26562d;
    }

    /* renamed from: h */
    public final void mo39141h(String str) {
        this.f26559a = str;
    }

    /* renamed from: i */
    public final void mo39142i(WebViewManager.Position position) {
        this.f26563e = position;
    }

    /* renamed from: j */
    public final void mo39143j(int i) {
        this.f26565g = i;
    }
}
