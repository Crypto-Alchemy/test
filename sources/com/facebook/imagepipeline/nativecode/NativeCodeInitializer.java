package com.facebook.imagepipeline.nativecode;

import android.content.Context;
import com.facebook.soloader.SoLoader;
import java.io.IOException;

@ii1
public class NativeCodeInitializer {
    @ii1
    public static void init(Context context) throws IOException {
        SoLoader.init(context, 0);
    }
}
