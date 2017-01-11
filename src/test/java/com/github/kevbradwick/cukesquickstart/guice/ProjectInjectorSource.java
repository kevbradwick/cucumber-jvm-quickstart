package com.github.kevbradwick.cukesquickstart.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import cucumber.api.guice.CucumberModules;
import cucumber.runtime.java.guice.InjectorSource;

public class ProjectInjectorSource implements InjectorSource {
    public Injector getInjector() {
        return Guice.createInjector(CucumberModules.SCENARIO, new ProjectModule());
    }
}
