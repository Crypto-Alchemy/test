package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

public class DependencyCycleException extends DependencyException {
    private final List<sm0<?>> componentsInCycle;

    public DependencyCycleException(List<sm0<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.componentsInCycle = list;
    }

    public List<sm0<?>> getComponentsInCycle() {
        return this.componentsInCycle;
    }
}
