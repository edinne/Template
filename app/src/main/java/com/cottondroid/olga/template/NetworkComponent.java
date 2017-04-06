package com.cottondroid.olga.template;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, NetworkModule.class})
public interface NetworkComponent {
    void inject(TemplateActivity activity);

}
