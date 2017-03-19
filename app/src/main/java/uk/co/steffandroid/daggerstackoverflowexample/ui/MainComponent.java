package uk.co.steffandroid.daggerstackoverflowexample.ui;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface MainComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }
}
