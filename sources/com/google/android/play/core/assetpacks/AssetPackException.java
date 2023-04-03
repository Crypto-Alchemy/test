package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.C4496j;

public class AssetPackException extends C4496j {

    /* renamed from: a */
    private final int f24695a;

    public AssetPackException(int i) {
        super(String.format("Asset Pack Download Error(%d): %s", new Object[]{Integer.valueOf(i), bq7.m32685a(i)}));
        if (i != 0) {
            this.f24695a = i;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }

    public int getErrorCode() {
        return this.f24695a;
    }
}
