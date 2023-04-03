package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

public class OSTrigger {

    /* renamed from: a */
    public String f25985a;

    /* renamed from: b */
    public OSTriggerKind f25986b;

    /* renamed from: c */
    public String f25987c;

    /* renamed from: d */
    public OSTriggerOperator f25988d;

    /* renamed from: e */
    public Object f25989e;

    public enum OSTriggerKind {
        TIME_SINCE_LAST_IN_APP("min_time_since"),
        SESSION_TIME("session_time"),
        CUSTOM("custom"),
        UNKNOWN("unknown");
        
        private String value;

        /* access modifiers changed from: public */
        OSTriggerKind(String str) {
            this.value = str;
        }

        public static OSTriggerKind fromString(String str) {
            for (OSTriggerKind oSTriggerKind : values()) {
                if (oSTriggerKind.value.equalsIgnoreCase(str)) {
                    return oSTriggerKind;
                }
            }
            return UNKNOWN;
        }

        public String toString() {
            return this.value;
        }
    }

    public enum OSTriggerOperator {
        GREATER_THAN("greater"),
        LESS_THAN("less"),
        EQUAL_TO("equal"),
        NOT_EQUAL_TO("not_equal"),
        LESS_THAN_OR_EQUAL_TO("less_or_equal"),
        GREATER_THAN_OR_EQUAL_TO("greater_or_equal"),
        EXISTS("exists"),
        NOT_EXISTS("not_exists"),
        CONTAINS("in");
        
        private String text;

        /* access modifiers changed from: public */
        OSTriggerOperator(String str) {
            this.text = str;
        }

        public static OSTriggerOperator fromString(String str) {
            for (OSTriggerOperator oSTriggerOperator : values()) {
                if (oSTriggerOperator.text.equalsIgnoreCase(str)) {
                    return oSTriggerOperator;
                }
            }
            return EQUAL_TO;
        }

        public boolean checksEquality() {
            if (this == EQUAL_TO || this == NOT_EQUAL_TO) {
                return true;
            }
            return false;
        }

        public String toString() {
            return this.text;
        }
    }

    public OSTrigger(JSONObject jSONObject) throws JSONException {
        this.f25985a = jSONObject.getString("id");
        this.f25986b = OSTriggerKind.fromString(jSONObject.getString("kind"));
        this.f25987c = jSONObject.optString("property", (String) null);
        this.f25988d = OSTriggerOperator.fromString(jSONObject.getString("operator"));
        this.f25989e = jSONObject.opt("value");
    }

    public String toString() {
        return "OSTrigger{triggerId='" + this.f25985a + '\'' + ", kind=" + this.f25986b + ", property='" + this.f25987c + '\'' + ", operatorType=" + this.f25988d + ", value=" + this.f25989e + '}';
    }
}
