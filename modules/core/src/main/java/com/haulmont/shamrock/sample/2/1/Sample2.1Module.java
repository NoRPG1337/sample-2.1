package com.haulmont.shamrock.sample.2.1;

import com.haulmont.monaco.annotations.AfterStart;
import com.haulmont.monaco.annotations.Module;
import com.haulmont.monaco.container.ModuleLoader;

@Module(name = "sample-2.1-module", depends = {"monaco-core", "monaco-graylog-reporter", "monaco-sentry-reporter"})
public class Sample2.1Module extends ModuleLoader {
    public Sample2.1Module () {
        super();
        packages("com.haulmont.shamrock.sample.2.1");
    }

    @AfterStart
    public void postInit() {
        //Implement or remove if not needed
    }
}