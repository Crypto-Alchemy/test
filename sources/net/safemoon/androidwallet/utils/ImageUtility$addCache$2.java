package net.safemoon.androidwallet.utils;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.utils.ImageUtility", mo48632f = "ImageUtility.kt", mo48633l = {50}, mo48634m = "addCache")
/* compiled from: ImageUtility.kt */
public final class ImageUtility$addCache$2 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ImageUtility this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageUtility$addCache$2(ImageUtility imageUtility, ns0<? super ImageUtility$addCache$2> ns0) {
        super(ns0);
        this.this$0 = imageUtility;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo60920a((Bitmap) null, (String) null, this);
    }
}
