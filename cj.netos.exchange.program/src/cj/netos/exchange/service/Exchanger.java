package cj.netos.exchange.service;

import cj.netos.exchange.ExchangeEventloop;
import cj.netos.exchange.IExchanger;
import cj.studio.ecm.IServiceProvider;
import cj.studio.ecm.IServiceSite;
import cj.studio.ecm.ServiceCollection;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.annotation.CjServiceSite;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@CjService(name = "exchanger")
public class Exchanger implements IExchanger ,IServiceProvider {
    ExecutorService executorService;
    @CjServiceSite
    IServiceSite site;

    @Override
    public <T> ServiceCollection<T> getServices(Class<T> serviceClazz) {
        return site.getServices(serviceClazz);
    }

    @Override
    public Object getService(String serviceId) {
        if ("@.site".equals(serviceId)) {
            return site;
        }
        return site.getService(serviceId);
    }

    @Override
    public void start() {
        String threads = site.getProperty("workTheadCount");
        int nthread = Integer.valueOf(threads);
        executorService = Executors.newFixedThreadPool(nthread);
        for (int i = 0; i < nthread; i++) {
            ExchangeEventloop eventloop = new ExchangeEventloop(this);
            executorService.execute(eventloop);
        }
    }

    @Override
    public void stop() {
        executorService.shutdownNow();
    }
}
