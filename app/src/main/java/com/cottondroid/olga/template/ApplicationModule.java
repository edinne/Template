package com.cottondroid.olga.template;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private TemplateApplication application;

    public ApplicationModule(TemplateApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    TemplateApplication provideApplication() {
        return application;
    }
}
