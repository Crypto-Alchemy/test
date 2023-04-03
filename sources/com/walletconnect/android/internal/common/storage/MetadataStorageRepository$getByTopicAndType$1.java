package com.walletconnect.android.internal.common.storage;

import com.walletconnect.android.internal.common.model.AppMetaData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: MetadataStorageRepository.kt */
public /* synthetic */ class MetadataStorageRepository$getByTopicAndType$1 extends FunctionReferenceImpl implements md2<String, String, String, List<? extends String>, String, AppMetaData> {
    public MetadataStorageRepository$getByTopicAndType$1(Object obj) {
        super(5, obj, MetadataStorageRepository.class, "toMetadata", "toMetadata(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/walletconnect/android/internal/common/model/AppMetaData;", 0);
    }

    public final AppMetaData invoke(String str, String str2, String str3, List<String> list, String str4) {
        vx2.m53591g(str, "p0");
        vx2.m53591g(str2, "p1");
        vx2.m53591g(str3, "p2");
        vx2.m53591g(list, "p3");
        return ((MetadataStorageRepository) this.receiver).mo40440g(str, str2, str3, list, str4);
    }
}
