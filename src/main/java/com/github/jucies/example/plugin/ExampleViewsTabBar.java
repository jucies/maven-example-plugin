package com.github.jucies.example.plugin;

import hudson.Extension;
import hudson.views.ViewsTabBar;
import hudson.views.ViewsTabBarDescriptor;
import net.sf.json.JSONObject;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.StaplerRequest;

public class ExampleViewsTabBar extends ViewsTabBar {

    @DataBoundConstructor
    public ExampleViewsTabBar() {
        super();
    }

    @Extension
    public static final class ExampleViewsTabBarDescriptor extends ViewsTabBarDescriptor {

        public ExampleViewsTabBarDescriptor() {
            load();
        }

        @Override
        public String getDisplayName() {
            return "Jucies example Views TabBar";
        }

        @Override
        public boolean configure(StaplerRequest req, JSONObject formData) throws FormException {
            save();
            return false;
        }
    }
}
