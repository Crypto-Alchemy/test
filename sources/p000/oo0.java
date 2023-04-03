package p000;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/* renamed from: oo0 */
/* compiled from: ConfigOverride */
public abstract class oo0 {
    public JsonFormat.Value _format;
    public JsonIgnoreProperties.Value _ignorals;
    public JsonInclude.Value _include;
    public JsonInclude.Value _includeAsProperty;
    public Boolean _isIgnoredType;
    public Boolean _mergeable;
    public JsonSetter.Value _setterInfo;
    public JsonAutoDetect.Value _visibility;

    /* renamed from: oo0$a */
    /* compiled from: ConfigOverride */
    public static final class C2974a extends oo0 {

        /* renamed from: a */
        public static final C2974a f15959a = new C2974a();
    }

    public oo0() {
    }

    public oo0(oo0 oo0) {
        this._format = oo0._format;
        this._include = oo0._include;
        this._includeAsProperty = oo0._includeAsProperty;
        this._ignorals = oo0._ignorals;
        this._setterInfo = oo0._setterInfo;
        this._visibility = oo0._visibility;
        this._isIgnoredType = oo0._isIgnoredType;
        this._mergeable = oo0._mergeable;
    }

    public static oo0 empty() {
        return C2974a.f15959a;
    }

    public JsonFormat.Value getFormat() {
        return this._format;
    }

    public JsonIgnoreProperties.Value getIgnorals() {
        return this._ignorals;
    }

    public JsonInclude.Value getInclude() {
        return this._include;
    }

    public JsonInclude.Value getIncludeAsProperty() {
        return this._includeAsProperty;
    }

    public Boolean getIsIgnoredType() {
        return this._isIgnoredType;
    }

    public Boolean getMergeable() {
        return this._mergeable;
    }

    public JsonSetter.Value getSetterInfo() {
        return this._setterInfo;
    }

    public JsonAutoDetect.Value getVisibility() {
        return this._visibility;
    }
}
