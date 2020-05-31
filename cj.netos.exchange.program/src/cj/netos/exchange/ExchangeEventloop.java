package cj.netos.exchange;

import cj.netos.exchange.bo.SelectKey;
import cj.studio.ecm.CJSystem;
import cj.studio.ecm.IServiceProvider;
import cj.studio.ecm.IServiceSite;

public class ExchangeEventloop implements Runnable {
    IServiceProvider parent;
    IPriceBoard priceBoard;
    IExchangeService exchangeService;
    long if_selectKey_null_interval = 15000;

    public ExchangeEventloop(IServiceProvider parent) {
        this.parent = parent;
        IServiceSite site = (IServiceSite) parent.getService("@.site");
        if_selectKey_null_interval = Long.valueOf(site.getProperty("if_selectKey_null_interval"));
        priceBoard = (IPriceBoard) parent.getService("priceBoard");
        exchangeService = (IExchangeService) parent.getService("exchangeService");
    }

    @Override
    public void run() {
        //复用行号+用户名
        while (!Thread.interrupted()) {
            try {
                _loop();
            } catch (Exception e) {
                CJSystem.logging().error(getClass(), e);
            }
        }
    }

    private void _loop() throws InterruptedException {
        SelectKey key = exchangeService.selectKey();
        if (key == null) {
            Thread.sleep(if_selectKey_null_interval);
            return;
        }
        synchronized (key) {
            IExchangeJob job = exchangeService.getJob(key);
            job.exchange(key, priceBoard);
        }
    }
}
