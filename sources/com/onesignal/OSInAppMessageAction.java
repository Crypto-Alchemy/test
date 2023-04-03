package com.onesignal;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.web3j.ens.contracts.generated.PublicResolver;

public class OSInAppMessageAction {

    /* renamed from: a */
    public String f25904a;

    /* renamed from: b */
    public String f25905b;

    /* renamed from: c */
    public OSInAppMessageActionUrlType f25906c;

    /* renamed from: d */
    public String f25907d;

    /* renamed from: e */
    public String f25908e;

    /* renamed from: f */
    public List<cd4> f25909f = new ArrayList();

    /* renamed from: g */
    public List<C5345y> f25910g = new ArrayList();

    /* renamed from: h */
    public gd4 f25911h;

    /* renamed from: i */
    public boolean f25912i;

    /* renamed from: j */
    public boolean f25913j;

    public enum OSInAppMessageActionUrlType {
        IN_APP_WEBVIEW("webview"),
        BROWSER("browser"),
        REPLACE_CONTENT("replacement");
        
        private String text;

        /* access modifiers changed from: public */
        OSInAppMessageActionUrlType(String str) {
            this.text = str;
        }

        public static OSInAppMessageActionUrlType fromString(String str) {
            for (OSInAppMessageActionUrlType oSInAppMessageActionUrlType : values()) {
                if (oSInAppMessageActionUrlType.text.equalsIgnoreCase(str)) {
                    return oSInAppMessageActionUrlType;
                }
            }
            return null;
        }

        public JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url_type", this.text);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        public String toString() {
            return this.text;
        }
    }

    public OSInAppMessageAction(JSONObject jSONObject) throws JSONException {
        this.f25904a = jSONObject.optString("id", (String) null);
        this.f25905b = jSONObject.optString(PublicResolver.FUNC_NAME, (String) null);
        this.f25907d = jSONObject.optString("url", (String) null);
        this.f25908e = jSONObject.optString("pageId", (String) null);
        OSInAppMessageActionUrlType fromString = OSInAppMessageActionUrlType.fromString(jSONObject.optString("url_target", (String) null));
        this.f25906c = fromString;
        if (fromString == null) {
            this.f25906c = OSInAppMessageActionUrlType.IN_APP_WEBVIEW;
        }
        this.f25913j = jSONObject.optBoolean("close", true);
        if (jSONObject.has("outcomes")) {
            mo38468h(jSONObject);
        }
        if (jSONObject.has("tags")) {
            this.f25911h = new gd4(jSONObject.getJSONObject("tags"));
        }
        if (jSONObject.has("prompts")) {
            mo38469i(jSONObject);
        }
    }

    /* renamed from: a */
    public String mo38461a() {
        return this.f25904a;
    }

    /* renamed from: b */
    public String mo38462b() {
        return this.f25907d;
    }

    /* renamed from: c */
    public List<cd4> mo38463c() {
        return this.f25909f;
    }

    /* renamed from: d */
    public List<C5345y> mo38464d() {
        return this.f25910g;
    }

    /* renamed from: e */
    public gd4 mo38465e() {
        return this.f25911h;
    }

    /* renamed from: f */
    public OSInAppMessageActionUrlType mo38466f() {
        return this.f25906c;
    }

    /* renamed from: g */
    public boolean mo38467g() {
        return this.f25912i;
    }

    /* renamed from: h */
    public final void mo38468h(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("outcomes");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f25909f.add(new cd4((JSONObject) jSONArray.get(i)));
        }
    }

    /* renamed from: i */
    public final void mo38469i(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("prompts");
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            string.hashCode();
            if (string.equals("push")) {
                this.f25910g.add(new C5354z());
            } else if (string.equals("location")) {
                this.f25910g.add(new C5341x());
            }
        }
    }

    /* renamed from: j */
    public void mo38470j(boolean z) {
        this.f25912i = z;
    }
}
