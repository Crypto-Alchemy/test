package net.safemoon.androidwallet.model.common;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/common/LanguageItem;", "", "languageCode", "", "titleResId", "", "regionResId", "(Ljava/lang/String;II)V", "getLanguageCode", "()Ljava/lang/String;", "getRegionResId", "()I", "getTitleResId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: LanguageItem.kt */
public final class LanguageItem {
    private final String languageCode;
    private final int regionResId;
    private final int titleResId;

    public LanguageItem(String str, int i, int i2) {
        vx2.m53591g(str, "languageCode");
        this.languageCode = str;
        this.titleResId = i;
        this.regionResId = i2;
    }

    public static /* synthetic */ LanguageItem copy$default(LanguageItem languageItem, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = languageItem.languageCode;
        }
        if ((i3 & 2) != 0) {
            i = languageItem.titleResId;
        }
        if ((i3 & 4) != 0) {
            i2 = languageItem.regionResId;
        }
        return languageItem.copy(str, i, i2);
    }

    public final String component1() {
        return this.languageCode;
    }

    public final int component2() {
        return this.titleResId;
    }

    public final int component3() {
        return this.regionResId;
    }

    public final LanguageItem copy(String str, int i, int i2) {
        vx2.m53591g(str, "languageCode");
        return new LanguageItem(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageItem)) {
            return false;
        }
        LanguageItem languageItem = (LanguageItem) obj;
        return vx2.m53586b(this.languageCode, languageItem.languageCode) && this.titleResId == languageItem.titleResId && this.regionResId == languageItem.regionResId;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final int getRegionResId() {
        return this.regionResId;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    public int hashCode() {
        return (((this.languageCode.hashCode() * 31) + this.titleResId) * 31) + this.regionResId;
    }

    public String toString() {
        String str = this.languageCode;
        int i = this.titleResId;
        int i2 = this.regionResId;
        return "LanguageItem(languageCode=" + str + ", titleResId=" + i + ", regionResId=" + i2 + ")";
    }
}
