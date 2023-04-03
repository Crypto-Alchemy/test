package zendesk.core;

import android.content.Context;

public final class ZendeskStorageModule_ProvideMachineIdStorageFactory implements ry1<MachineIdStorage> {
    private final ky4<Context> contextProvider;

    public ZendeskStorageModule_ProvideMachineIdStorageFactory(ky4<Context> ky4) {
        this.contextProvider = ky4;
    }

    public static ZendeskStorageModule_ProvideMachineIdStorageFactory create(ky4<Context> ky4) {
        return new ZendeskStorageModule_ProvideMachineIdStorageFactory(ky4);
    }

    public static MachineIdStorage provideMachineIdStorage(Context context) {
        return (MachineIdStorage) fu4.m44415f(ZendeskStorageModule.provideMachineIdStorage(context));
    }

    public MachineIdStorage get() {
        return provideMachineIdStorage(this.contextProvider.get());
    }
}
