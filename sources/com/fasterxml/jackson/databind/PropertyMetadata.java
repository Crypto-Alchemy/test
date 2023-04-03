package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.Serializable;

public class PropertyMetadata implements Serializable {
    public static final PropertyMetadata STD_OPTIONAL = new PropertyMetadata(Boolean.FALSE, (String) null, (Integer) null, (String) null, (C1987a) null, (Nulls) null, (Nulls) null);
    public static final PropertyMetadata STD_REQUIRED = new PropertyMetadata(Boolean.TRUE, (String) null, (Integer) null, (String) null, (C1987a) null, (Nulls) null, (Nulls) null);
    public static final PropertyMetadata STD_REQUIRED_OR_OPTIONAL = new PropertyMetadata((Boolean) null, (String) null, (Integer) null, (String) null, (C1987a) null, (Nulls) null, (Nulls) null);
    private static final long serialVersionUID = -1;
    public Nulls _contentNulls;
    public final String _defaultValue;
    public final String _description;
    public final Integer _index;
    public final transient C1987a _mergeInfo;
    public final Boolean _required;
    public Nulls _valueNulls;

    /* renamed from: com.fasterxml.jackson.databind.PropertyMetadata$a */
    public static final class C1987a {

        /* renamed from: a */
        public final AnnotatedMember f9881a;

        /* renamed from: b */
        public final boolean f9882b;

        public C1987a(AnnotatedMember annotatedMember, boolean z) {
            this.f9881a = annotatedMember;
            this.f9882b = z;
        }

        /* renamed from: a */
        public static C1987a m14004a(AnnotatedMember annotatedMember) {
            return new C1987a(annotatedMember, true);
        }

        /* renamed from: b */
        public static C1987a m14005b(AnnotatedMember annotatedMember) {
            return new C1987a(annotatedMember, false);
        }

        /* renamed from: c */
        public static C1987a m14006c(AnnotatedMember annotatedMember) {
            return new C1987a(annotatedMember, false);
        }
    }

    public PropertyMetadata(Boolean bool, String str, Integer num, String str2, C1987a aVar, Nulls nulls, Nulls nulls2) {
        this._required = bool;
        this._description = str;
        this._index = num;
        this._defaultValue = (str2 == null || str2.isEmpty()) ? null : str2;
        this._mergeInfo = aVar;
        this._valueNulls = nulls;
        this._contentNulls = nulls2;
    }

    public static PropertyMetadata construct(Boolean bool, String str, Integer num, String str2) {
        if (str != null || num != null || str2 != null) {
            return new PropertyMetadata(bool, str, num, str2, (C1987a) null, (Nulls) null, (Nulls) null);
        }
        if (bool == null) {
            return STD_REQUIRED_OR_OPTIONAL;
        }
        return bool.booleanValue() ? STD_REQUIRED : STD_OPTIONAL;
    }

    public Nulls getContentNulls() {
        return this._contentNulls;
    }

    public String getDefaultValue() {
        return this._defaultValue;
    }

    public String getDescription() {
        return this._description;
    }

    public Integer getIndex() {
        return this._index;
    }

    public C1987a getMergeInfo() {
        return this._mergeInfo;
    }

    public Boolean getRequired() {
        return this._required;
    }

    public Nulls getValueNulls() {
        return this._valueNulls;
    }

    public boolean hasDefaultValue() {
        if (this._defaultValue != null) {
            return true;
        }
        return false;
    }

    public boolean hasIndex() {
        if (this._index != null) {
            return true;
        }
        return false;
    }

    public boolean isRequired() {
        Boolean bool = this._required;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public Object readResolve() {
        if (this._description != null || this._index != null || this._defaultValue != null || this._mergeInfo != null || this._valueNulls != null || this._contentNulls != null) {
            return this;
        }
        Boolean bool = this._required;
        if (bool == null) {
            return STD_REQUIRED_OR_OPTIONAL;
        }
        if (bool.booleanValue()) {
            return STD_REQUIRED;
        }
        return STD_OPTIONAL;
    }

    public PropertyMetadata withDefaultValue(String str) {
        if (str == null || str.isEmpty()) {
            if (this._defaultValue == null) {
                return this;
            }
            str = null;
        } else if (str.equals(this._defaultValue)) {
            return this;
        }
        return new PropertyMetadata(this._required, this._description, this._index, str, this._mergeInfo, this._valueNulls, this._contentNulls);
    }

    public PropertyMetadata withDescription(String str) {
        return new PropertyMetadata(this._required, str, this._index, this._defaultValue, this._mergeInfo, this._valueNulls, this._contentNulls);
    }

    public PropertyMetadata withIndex(Integer num) {
        return new PropertyMetadata(this._required, this._description, num, this._defaultValue, this._mergeInfo, this._valueNulls, this._contentNulls);
    }

    public PropertyMetadata withMergeInfo(C1987a aVar) {
        return new PropertyMetadata(this._required, this._description, this._index, this._defaultValue, aVar, this._valueNulls, this._contentNulls);
    }

    public PropertyMetadata withNulls(Nulls nulls, Nulls nulls2) {
        return new PropertyMetadata(this._required, this._description, this._index, this._defaultValue, this._mergeInfo, nulls, nulls2);
    }

    public PropertyMetadata withRequired(Boolean bool) {
        if (bool == null) {
            if (this._required == null) {
                return this;
            }
        } else if (bool.equals(this._required)) {
            return this;
        }
        return new PropertyMetadata(bool, this._description, this._index, this._defaultValue, this._mergeInfo, this._valueNulls, this._contentNulls);
    }

    @Deprecated
    public static PropertyMetadata construct(boolean z, String str, Integer num, String str2) {
        if (str == null && num == null && str2 == null) {
            return z ? STD_REQUIRED : STD_OPTIONAL;
        }
        return new PropertyMetadata(Boolean.valueOf(z), str, num, str2, (C1987a) null, (Nulls) null, (Nulls) null);
    }
}
