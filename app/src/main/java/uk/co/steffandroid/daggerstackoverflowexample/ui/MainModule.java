package uk.co.steffandroid.daggerstackoverflowexample.ui;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MainComponent.class)
public abstract class MainModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindActivityInjectorFactory(MainComponent.Builder builder);
}
