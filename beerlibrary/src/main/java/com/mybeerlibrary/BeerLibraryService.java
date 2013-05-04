
package com.mybeerlibrary;

import com.mybeerlibrary.resources.HelloWorldResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class BeerLibraryService extends Service<Config> {
    public static void main(String[] args) throws Exception {
        new BeerLibraryService().run(args);
    }

    public BeerLibraryService() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void initialize(Bootstrap<Config> bootstrap) {
        // TODO Auto-generated method stub

    }

    @Override
    public void run(Config config, Environment env) throws Exception {
        final String template = config.getTemplate();
        final String defaultName = config.getDefaultName();
        env.addResource(new HelloWorldResource(template, defaultName));
    }

}
