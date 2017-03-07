package uk.co.steffandroid.daggerstackoverflowexample;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import uk.co.steffandroid.daggerstackoverflowexample.ui.MainModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class, MainModule.class})
public interface AppComponent {
    void inject(App app);
}
