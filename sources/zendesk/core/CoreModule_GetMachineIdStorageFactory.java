package zendesk.core;

public final class CoreModule_GetMachineIdStorageFactory implements ry1<MachineIdStorage> {
    private final CoreModule module;

    public CoreModule_GetMachineIdStorageFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetMachineIdStorageFactory create(CoreModule coreModule) {
        return new CoreModule_GetMachineIdStorageFactory(coreModule);
    }

    public static MachineIdStorage getMachineIdStorage(CoreModule coreModule) {
        return (MachineIdStorage) fu4.m44415f(coreModule.getMachineIdStorage());
    }

    public MachineIdStorage get() {
        return getMachineIdStorage(this.module);
    }
}
